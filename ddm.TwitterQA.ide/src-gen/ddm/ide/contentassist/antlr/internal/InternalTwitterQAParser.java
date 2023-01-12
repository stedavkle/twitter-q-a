package ddm.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ddm.services.TwitterQAGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTwitterQAParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'TwitterQA'", "'{'", "'consumer_key'", "'is'", "'consumer_secret'", "'access_token'", "'access_token_secret'", "'welcome_msg'", "'games'", "'are'", "'['", "']'", "'locations'", "'}'", "','", "'Game'", "'description'", "'city'", "'initial_test'", "'tests'", "'Location'", "'latitude'", "'longitude'", "'Test'", "'question'", "'order'", "'answers'", "'timelimit'", "'attempts'", "'reward'", "'location'", "'hints'", "'on_correct'", "'on_timeout'", "'on_fail'", "'-'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalTwitterQAParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTwitterQAParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTwitterQAParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTwitterQA.g"; }


    	private TwitterQAGrammarAccess grammarAccess;

    	public void setGrammarAccess(TwitterQAGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTwitterQA"
    // InternalTwitterQA.g:53:1: entryRuleTwitterQA : ruleTwitterQA EOF ;
    public final void entryRuleTwitterQA() throws RecognitionException {
        try {
            // InternalTwitterQA.g:54:1: ( ruleTwitterQA EOF )
            // InternalTwitterQA.g:55:1: ruleTwitterQA EOF
            {
             before(grammarAccess.getTwitterQARule()); 
            pushFollow(FOLLOW_1);
            ruleTwitterQA();

            state._fsp--;

             after(grammarAccess.getTwitterQARule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTwitterQA"


    // $ANTLR start "ruleTwitterQA"
    // InternalTwitterQA.g:62:1: ruleTwitterQA : ( ( rule__TwitterQA__Group__0 ) ) ;
    public final void ruleTwitterQA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:66:2: ( ( ( rule__TwitterQA__Group__0 ) ) )
            // InternalTwitterQA.g:67:2: ( ( rule__TwitterQA__Group__0 ) )
            {
            // InternalTwitterQA.g:67:2: ( ( rule__TwitterQA__Group__0 ) )
            // InternalTwitterQA.g:68:3: ( rule__TwitterQA__Group__0 )
            {
             before(grammarAccess.getTwitterQAAccess().getGroup()); 
            // InternalTwitterQA.g:69:3: ( rule__TwitterQA__Group__0 )
            // InternalTwitterQA.g:69:4: rule__TwitterQA__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTwitterQAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTwitterQA"


    // $ANTLR start "entryRuleEString"
    // InternalTwitterQA.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTwitterQA.g:79:1: ( ruleEString EOF )
            // InternalTwitterQA.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTwitterQA.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTwitterQA.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTwitterQA.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalTwitterQA.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTwitterQA.g:94:3: ( rule__EString__Alternatives )
            // InternalTwitterQA.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleGame"
    // InternalTwitterQA.g:103:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // InternalTwitterQA.g:104:1: ( ruleGame EOF )
            // InternalTwitterQA.g:105:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalTwitterQA.g:112:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:116:2: ( ( ( rule__Game__Group__0 ) ) )
            // InternalTwitterQA.g:117:2: ( ( rule__Game__Group__0 ) )
            {
            // InternalTwitterQA.g:117:2: ( ( rule__Game__Group__0 ) )
            // InternalTwitterQA.g:118:3: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // InternalTwitterQA.g:119:3: ( rule__Game__Group__0 )
            // InternalTwitterQA.g:119:4: rule__Game__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleLocation"
    // InternalTwitterQA.g:128:1: entryRuleLocation : ruleLocation EOF ;
    public final void entryRuleLocation() throws RecognitionException {
        try {
            // InternalTwitterQA.g:129:1: ( ruleLocation EOF )
            // InternalTwitterQA.g:130:1: ruleLocation EOF
            {
             before(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getLocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalTwitterQA.g:137:1: ruleLocation : ( ( rule__Location__Group__0 ) ) ;
    public final void ruleLocation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:141:2: ( ( ( rule__Location__Group__0 ) ) )
            // InternalTwitterQA.g:142:2: ( ( rule__Location__Group__0 ) )
            {
            // InternalTwitterQA.g:142:2: ( ( rule__Location__Group__0 ) )
            // InternalTwitterQA.g:143:3: ( rule__Location__Group__0 )
            {
             before(grammarAccess.getLocationAccess().getGroup()); 
            // InternalTwitterQA.g:144:3: ( rule__Location__Group__0 )
            // InternalTwitterQA.g:144:4: rule__Location__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleTest"
    // InternalTwitterQA.g:153:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalTwitterQA.g:154:1: ( ruleTest EOF )
            // InternalTwitterQA.g:155:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalTwitterQA.g:162:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:166:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalTwitterQA.g:167:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalTwitterQA.g:167:2: ( ( rule__Test__Group__0 ) )
            // InternalTwitterQA.g:168:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalTwitterQA.g:169:3: ( rule__Test__Group__0 )
            // InternalTwitterQA.g:169:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleEInt"
    // InternalTwitterQA.g:178:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTwitterQA.g:179:1: ( ruleEInt EOF )
            // InternalTwitterQA.g:180:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTwitterQA.g:187:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:191:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTwitterQA.g:192:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTwitterQA.g:192:2: ( ( rule__EInt__Group__0 ) )
            // InternalTwitterQA.g:193:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTwitterQA.g:194:3: ( rule__EInt__Group__0 )
            // InternalTwitterQA.g:194:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEDouble"
    // InternalTwitterQA.g:203:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalTwitterQA.g:204:1: ( ruleEDouble EOF )
            // InternalTwitterQA.g:205:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalTwitterQA.g:212:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:216:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalTwitterQA.g:217:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalTwitterQA.g:217:2: ( ( rule__EDouble__Group__0 ) )
            // InternalTwitterQA.g:218:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalTwitterQA.g:219:3: ( rule__EDouble__Group__0 )
            // InternalTwitterQA.g:219:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTwitterQA.g:227:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:231:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTwitterQA.g:232:2: ( RULE_STRING )
                    {
                    // InternalTwitterQA.g:232:2: ( RULE_STRING )
                    // InternalTwitterQA.g:233:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTwitterQA.g:238:2: ( RULE_ID )
                    {
                    // InternalTwitterQA.g:238:2: ( RULE_ID )
                    // InternalTwitterQA.g:239:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalTwitterQA.g:248:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:252:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTwitterQA.g:253:2: ( 'E' )
                    {
                    // InternalTwitterQA.g:253:2: ( 'E' )
                    // InternalTwitterQA.g:254:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTwitterQA.g:259:2: ( 'e' )
                    {
                    // InternalTwitterQA.g:259:2: ( 'e' )
                    // InternalTwitterQA.g:260:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__TwitterQA__Group__0"
    // InternalTwitterQA.g:269:1: rule__TwitterQA__Group__0 : rule__TwitterQA__Group__0__Impl rule__TwitterQA__Group__1 ;
    public final void rule__TwitterQA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:273:1: ( rule__TwitterQA__Group__0__Impl rule__TwitterQA__Group__1 )
            // InternalTwitterQA.g:274:2: rule__TwitterQA__Group__0__Impl rule__TwitterQA__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TwitterQA__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__0"


    // $ANTLR start "rule__TwitterQA__Group__0__Impl"
    // InternalTwitterQA.g:281:1: rule__TwitterQA__Group__0__Impl : ( 'TwitterQA' ) ;
    public final void rule__TwitterQA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:285:1: ( ( 'TwitterQA' ) )
            // InternalTwitterQA.g:286:1: ( 'TwitterQA' )
            {
            // InternalTwitterQA.g:286:1: ( 'TwitterQA' )
            // InternalTwitterQA.g:287:2: 'TwitterQA'
            {
             before(grammarAccess.getTwitterQAAccess().getTwitterQAKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getTwitterQAKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__0__Impl"


    // $ANTLR start "rule__TwitterQA__Group__1"
    // InternalTwitterQA.g:296:1: rule__TwitterQA__Group__1 : rule__TwitterQA__Group__1__Impl rule__TwitterQA__Group__2 ;
    public final void rule__TwitterQA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:300:1: ( rule__TwitterQA__Group__1__Impl rule__TwitterQA__Group__2 )
            // InternalTwitterQA.g:301:2: rule__TwitterQA__Group__1__Impl rule__TwitterQA__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TwitterQA__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__1"


    // $ANTLR start "rule__TwitterQA__Group__1__Impl"
    // InternalTwitterQA.g:308:1: rule__TwitterQA__Group__1__Impl : ( '{' ) ;
    public final void rule__TwitterQA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:312:1: ( ( '{' ) )
            // InternalTwitterQA.g:313:1: ( '{' )
            {
            // InternalTwitterQA.g:313:1: ( '{' )
            // InternalTwitterQA.g:314:2: '{'
            {
             before(grammarAccess.getTwitterQAAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__1__Impl"


    // $ANTLR start "rule__TwitterQA__Group__2"
    // InternalTwitterQA.g:323:1: rule__TwitterQA__Group__2 : rule__TwitterQA__Group__2__Impl rule__TwitterQA__Group__3 ;
    public final void rule__TwitterQA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:327:1: ( rule__TwitterQA__Group__2__Impl rule__TwitterQA__Group__3 )
            // InternalTwitterQA.g:328:2: rule__TwitterQA__Group__2__Impl rule__TwitterQA__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TwitterQA__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__2"


    // $ANTLR start "rule__TwitterQA__Group__2__Impl"
    // InternalTwitterQA.g:335:1: rule__TwitterQA__Group__2__Impl : ( 'consumer_key' ) ;
    public final void rule__TwitterQA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:339:1: ( ( 'consumer_key' ) )
            // InternalTwitterQA.g:340:1: ( 'consumer_key' )
            {
            // InternalTwitterQA.g:340:1: ( 'consumer_key' )
            // InternalTwitterQA.g:341:2: 'consumer_key'
            {
             before(grammarAccess.getTwitterQAAccess().getConsumer_keyKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getConsumer_keyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__2__Impl"


    // $ANTLR start "rule__TwitterQA__Group__3"
    // InternalTwitterQA.g:350:1: rule__TwitterQA__Group__3 : rule__TwitterQA__Group__3__Impl rule__TwitterQA__Group__4 ;
    public final void rule__TwitterQA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:354:1: ( rule__TwitterQA__Group__3__Impl rule__TwitterQA__Group__4 )
            // InternalTwitterQA.g:355:2: rule__TwitterQA__Group__3__Impl rule__TwitterQA__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__TwitterQA__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__3"


    // $ANTLR start "rule__TwitterQA__Group__3__Impl"
    // InternalTwitterQA.g:362:1: rule__TwitterQA__Group__3__Impl : ( 'is' ) ;
    public final void rule__TwitterQA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:366:1: ( ( 'is' ) )
            // InternalTwitterQA.g:367:1: ( 'is' )
            {
            // InternalTwitterQA.g:367:1: ( 'is' )
            // InternalTwitterQA.g:368:2: 'is'
            {
             before(grammarAccess.getTwitterQAAccess().getIsKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getIsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__3__Impl"


    // $ANTLR start "rule__TwitterQA__Group__4"
    // InternalTwitterQA.g:377:1: rule__TwitterQA__Group__4 : rule__TwitterQA__Group__4__Impl rule__TwitterQA__Group__5 ;
    public final void rule__TwitterQA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:381:1: ( rule__TwitterQA__Group__4__Impl rule__TwitterQA__Group__5 )
            // InternalTwitterQA.g:382:2: rule__TwitterQA__Group__4__Impl rule__TwitterQA__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__TwitterQA__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__4"


    // $ANTLR start "rule__TwitterQA__Group__4__Impl"
    // InternalTwitterQA.g:389:1: rule__TwitterQA__Group__4__Impl : ( ( rule__TwitterQA__Consumer_keyAssignment_4 ) ) ;
    public final void rule__TwitterQA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:393:1: ( ( ( rule__TwitterQA__Consumer_keyAssignment_4 ) ) )
            // InternalTwitterQA.g:394:1: ( ( rule__TwitterQA__Consumer_keyAssignment_4 ) )
            {
            // InternalTwitterQA.g:394:1: ( ( rule__TwitterQA__Consumer_keyAssignment_4 ) )
            // InternalTwitterQA.g:395:2: ( rule__TwitterQA__Consumer_keyAssignment_4 )
            {
             before(grammarAccess.getTwitterQAAccess().getConsumer_keyAssignment_4()); 
            // InternalTwitterQA.g:396:2: ( rule__TwitterQA__Consumer_keyAssignment_4 )
            // InternalTwitterQA.g:396:3: rule__TwitterQA__Consumer_keyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__Consumer_keyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTwitterQAAccess().getConsumer_keyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__4__Impl"


    // $ANTLR start "rule__TwitterQA__Group__5"
    // InternalTwitterQA.g:404:1: rule__TwitterQA__Group__5 : rule__TwitterQA__Group__5__Impl rule__TwitterQA__Group__6 ;
    public final void rule__TwitterQA__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:408:1: ( rule__TwitterQA__Group__5__Impl rule__TwitterQA__Group__6 )
            // InternalTwitterQA.g:409:2: rule__TwitterQA__Group__5__Impl rule__TwitterQA__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__TwitterQA__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__5"


    // $ANTLR start "rule__TwitterQA__Group__5__Impl"
    // InternalTwitterQA.g:416:1: rule__TwitterQA__Group__5__Impl : ( 'consumer_secret' ) ;
    public final void rule__TwitterQA__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:420:1: ( ( 'consumer_secret' ) )
            // InternalTwitterQA.g:421:1: ( 'consumer_secret' )
            {
            // InternalTwitterQA.g:421:1: ( 'consumer_secret' )
            // InternalTwitterQA.g:422:2: 'consumer_secret'
            {
             before(grammarAccess.getTwitterQAAccess().getConsumer_secretKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getConsumer_secretKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__5__Impl"


    // $ANTLR start "rule__TwitterQA__Group__6"
    // InternalTwitterQA.g:431:1: rule__TwitterQA__Group__6 : rule__TwitterQA__Group__6__Impl rule__TwitterQA__Group__7 ;
    public final void rule__TwitterQA__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:435:1: ( rule__TwitterQA__Group__6__Impl rule__TwitterQA__Group__7 )
            // InternalTwitterQA.g:436:2: rule__TwitterQA__Group__6__Impl rule__TwitterQA__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__TwitterQA__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__6"


    // $ANTLR start "rule__TwitterQA__Group__6__Impl"
    // InternalTwitterQA.g:443:1: rule__TwitterQA__Group__6__Impl : ( 'is' ) ;
    public final void rule__TwitterQA__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:447:1: ( ( 'is' ) )
            // InternalTwitterQA.g:448:1: ( 'is' )
            {
            // InternalTwitterQA.g:448:1: ( 'is' )
            // InternalTwitterQA.g:449:2: 'is'
            {
             before(grammarAccess.getTwitterQAAccess().getIsKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getIsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__6__Impl"


    // $ANTLR start "rule__TwitterQA__Group__7"
    // InternalTwitterQA.g:458:1: rule__TwitterQA__Group__7 : rule__TwitterQA__Group__7__Impl rule__TwitterQA__Group__8 ;
    public final void rule__TwitterQA__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:462:1: ( rule__TwitterQA__Group__7__Impl rule__TwitterQA__Group__8 )
            // InternalTwitterQA.g:463:2: rule__TwitterQA__Group__7__Impl rule__TwitterQA__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__TwitterQA__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__7"


    // $ANTLR start "rule__TwitterQA__Group__7__Impl"
    // InternalTwitterQA.g:470:1: rule__TwitterQA__Group__7__Impl : ( ( rule__TwitterQA__Consumer_secretAssignment_7 ) ) ;
    public final void rule__TwitterQA__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:474:1: ( ( ( rule__TwitterQA__Consumer_secretAssignment_7 ) ) )
            // InternalTwitterQA.g:475:1: ( ( rule__TwitterQA__Consumer_secretAssignment_7 ) )
            {
            // InternalTwitterQA.g:475:1: ( ( rule__TwitterQA__Consumer_secretAssignment_7 ) )
            // InternalTwitterQA.g:476:2: ( rule__TwitterQA__Consumer_secretAssignment_7 )
            {
             before(grammarAccess.getTwitterQAAccess().getConsumer_secretAssignment_7()); 
            // InternalTwitterQA.g:477:2: ( rule__TwitterQA__Consumer_secretAssignment_7 )
            // InternalTwitterQA.g:477:3: rule__TwitterQA__Consumer_secretAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__Consumer_secretAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTwitterQAAccess().getConsumer_secretAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__7__Impl"


    // $ANTLR start "rule__TwitterQA__Group__8"
    // InternalTwitterQA.g:485:1: rule__TwitterQA__Group__8 : rule__TwitterQA__Group__8__Impl rule__TwitterQA__Group__9 ;
    public final void rule__TwitterQA__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:489:1: ( rule__TwitterQA__Group__8__Impl rule__TwitterQA__Group__9 )
            // InternalTwitterQA.g:490:2: rule__TwitterQA__Group__8__Impl rule__TwitterQA__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__TwitterQA__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__8"


    // $ANTLR start "rule__TwitterQA__Group__8__Impl"
    // InternalTwitterQA.g:497:1: rule__TwitterQA__Group__8__Impl : ( 'access_token' ) ;
    public final void rule__TwitterQA__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:501:1: ( ( 'access_token' ) )
            // InternalTwitterQA.g:502:1: ( 'access_token' )
            {
            // InternalTwitterQA.g:502:1: ( 'access_token' )
            // InternalTwitterQA.g:503:2: 'access_token'
            {
             before(grammarAccess.getTwitterQAAccess().getAccess_tokenKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getAccess_tokenKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__8__Impl"


    // $ANTLR start "rule__TwitterQA__Group__9"
    // InternalTwitterQA.g:512:1: rule__TwitterQA__Group__9 : rule__TwitterQA__Group__9__Impl rule__TwitterQA__Group__10 ;
    public final void rule__TwitterQA__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:516:1: ( rule__TwitterQA__Group__9__Impl rule__TwitterQA__Group__10 )
            // InternalTwitterQA.g:517:2: rule__TwitterQA__Group__9__Impl rule__TwitterQA__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__TwitterQA__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__9"


    // $ANTLR start "rule__TwitterQA__Group__9__Impl"
    // InternalTwitterQA.g:524:1: rule__TwitterQA__Group__9__Impl : ( 'is' ) ;
    public final void rule__TwitterQA__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:528:1: ( ( 'is' ) )
            // InternalTwitterQA.g:529:1: ( 'is' )
            {
            // InternalTwitterQA.g:529:1: ( 'is' )
            // InternalTwitterQA.g:530:2: 'is'
            {
             before(grammarAccess.getTwitterQAAccess().getIsKeyword_9()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getIsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__9__Impl"


    // $ANTLR start "rule__TwitterQA__Group__10"
    // InternalTwitterQA.g:539:1: rule__TwitterQA__Group__10 : rule__TwitterQA__Group__10__Impl rule__TwitterQA__Group__11 ;
    public final void rule__TwitterQA__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:543:1: ( rule__TwitterQA__Group__10__Impl rule__TwitterQA__Group__11 )
            // InternalTwitterQA.g:544:2: rule__TwitterQA__Group__10__Impl rule__TwitterQA__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__TwitterQA__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__10"


    // $ANTLR start "rule__TwitterQA__Group__10__Impl"
    // InternalTwitterQA.g:551:1: rule__TwitterQA__Group__10__Impl : ( ( rule__TwitterQA__Access_tokenAssignment_10 ) ) ;
    public final void rule__TwitterQA__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:555:1: ( ( ( rule__TwitterQA__Access_tokenAssignment_10 ) ) )
            // InternalTwitterQA.g:556:1: ( ( rule__TwitterQA__Access_tokenAssignment_10 ) )
            {
            // InternalTwitterQA.g:556:1: ( ( rule__TwitterQA__Access_tokenAssignment_10 ) )
            // InternalTwitterQA.g:557:2: ( rule__TwitterQA__Access_tokenAssignment_10 )
            {
             before(grammarAccess.getTwitterQAAccess().getAccess_tokenAssignment_10()); 
            // InternalTwitterQA.g:558:2: ( rule__TwitterQA__Access_tokenAssignment_10 )
            // InternalTwitterQA.g:558:3: rule__TwitterQA__Access_tokenAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__Access_tokenAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTwitterQAAccess().getAccess_tokenAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__10__Impl"


    // $ANTLR start "rule__TwitterQA__Group__11"
    // InternalTwitterQA.g:566:1: rule__TwitterQA__Group__11 : rule__TwitterQA__Group__11__Impl rule__TwitterQA__Group__12 ;
    public final void rule__TwitterQA__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:570:1: ( rule__TwitterQA__Group__11__Impl rule__TwitterQA__Group__12 )
            // InternalTwitterQA.g:571:2: rule__TwitterQA__Group__11__Impl rule__TwitterQA__Group__12
            {
            pushFollow(FOLLOW_5);
            rule__TwitterQA__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__11"


    // $ANTLR start "rule__TwitterQA__Group__11__Impl"
    // InternalTwitterQA.g:578:1: rule__TwitterQA__Group__11__Impl : ( 'access_token_secret' ) ;
    public final void rule__TwitterQA__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:582:1: ( ( 'access_token_secret' ) )
            // InternalTwitterQA.g:583:1: ( 'access_token_secret' )
            {
            // InternalTwitterQA.g:583:1: ( 'access_token_secret' )
            // InternalTwitterQA.g:584:2: 'access_token_secret'
            {
             before(grammarAccess.getTwitterQAAccess().getAccess_token_secretKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getAccess_token_secretKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__11__Impl"


    // $ANTLR start "rule__TwitterQA__Group__12"
    // InternalTwitterQA.g:593:1: rule__TwitterQA__Group__12 : rule__TwitterQA__Group__12__Impl rule__TwitterQA__Group__13 ;
    public final void rule__TwitterQA__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:597:1: ( rule__TwitterQA__Group__12__Impl rule__TwitterQA__Group__13 )
            // InternalTwitterQA.g:598:2: rule__TwitterQA__Group__12__Impl rule__TwitterQA__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__TwitterQA__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__12"


    // $ANTLR start "rule__TwitterQA__Group__12__Impl"
    // InternalTwitterQA.g:605:1: rule__TwitterQA__Group__12__Impl : ( 'is' ) ;
    public final void rule__TwitterQA__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:609:1: ( ( 'is' ) )
            // InternalTwitterQA.g:610:1: ( 'is' )
            {
            // InternalTwitterQA.g:610:1: ( 'is' )
            // InternalTwitterQA.g:611:2: 'is'
            {
             before(grammarAccess.getTwitterQAAccess().getIsKeyword_12()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getIsKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__12__Impl"


    // $ANTLR start "rule__TwitterQA__Group__13"
    // InternalTwitterQA.g:620:1: rule__TwitterQA__Group__13 : rule__TwitterQA__Group__13__Impl rule__TwitterQA__Group__14 ;
    public final void rule__TwitterQA__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:624:1: ( rule__TwitterQA__Group__13__Impl rule__TwitterQA__Group__14 )
            // InternalTwitterQA.g:625:2: rule__TwitterQA__Group__13__Impl rule__TwitterQA__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__TwitterQA__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__13"


    // $ANTLR start "rule__TwitterQA__Group__13__Impl"
    // InternalTwitterQA.g:632:1: rule__TwitterQA__Group__13__Impl : ( ( rule__TwitterQA__Access_token_secretAssignment_13 ) ) ;
    public final void rule__TwitterQA__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:636:1: ( ( ( rule__TwitterQA__Access_token_secretAssignment_13 ) ) )
            // InternalTwitterQA.g:637:1: ( ( rule__TwitterQA__Access_token_secretAssignment_13 ) )
            {
            // InternalTwitterQA.g:637:1: ( ( rule__TwitterQA__Access_token_secretAssignment_13 ) )
            // InternalTwitterQA.g:638:2: ( rule__TwitterQA__Access_token_secretAssignment_13 )
            {
             before(grammarAccess.getTwitterQAAccess().getAccess_token_secretAssignment_13()); 
            // InternalTwitterQA.g:639:2: ( rule__TwitterQA__Access_token_secretAssignment_13 )
            // InternalTwitterQA.g:639:3: rule__TwitterQA__Access_token_secretAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__Access_token_secretAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getTwitterQAAccess().getAccess_token_secretAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__13__Impl"


    // $ANTLR start "rule__TwitterQA__Group__14"
    // InternalTwitterQA.g:647:1: rule__TwitterQA__Group__14 : rule__TwitterQA__Group__14__Impl rule__TwitterQA__Group__15 ;
    public final void rule__TwitterQA__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:651:1: ( rule__TwitterQA__Group__14__Impl rule__TwitterQA__Group__15 )
            // InternalTwitterQA.g:652:2: rule__TwitterQA__Group__14__Impl rule__TwitterQA__Group__15
            {
            pushFollow(FOLLOW_5);
            rule__TwitterQA__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__14"


    // $ANTLR start "rule__TwitterQA__Group__14__Impl"
    // InternalTwitterQA.g:659:1: rule__TwitterQA__Group__14__Impl : ( 'welcome_msg' ) ;
    public final void rule__TwitterQA__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:663:1: ( ( 'welcome_msg' ) )
            // InternalTwitterQA.g:664:1: ( 'welcome_msg' )
            {
            // InternalTwitterQA.g:664:1: ( 'welcome_msg' )
            // InternalTwitterQA.g:665:2: 'welcome_msg'
            {
             before(grammarAccess.getTwitterQAAccess().getWelcome_msgKeyword_14()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getWelcome_msgKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__14__Impl"


    // $ANTLR start "rule__TwitterQA__Group__15"
    // InternalTwitterQA.g:674:1: rule__TwitterQA__Group__15 : rule__TwitterQA__Group__15__Impl rule__TwitterQA__Group__16 ;
    public final void rule__TwitterQA__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:678:1: ( rule__TwitterQA__Group__15__Impl rule__TwitterQA__Group__16 )
            // InternalTwitterQA.g:679:2: rule__TwitterQA__Group__15__Impl rule__TwitterQA__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__TwitterQA__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__15"


    // $ANTLR start "rule__TwitterQA__Group__15__Impl"
    // InternalTwitterQA.g:686:1: rule__TwitterQA__Group__15__Impl : ( 'is' ) ;
    public final void rule__TwitterQA__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:690:1: ( ( 'is' ) )
            // InternalTwitterQA.g:691:1: ( 'is' )
            {
            // InternalTwitterQA.g:691:1: ( 'is' )
            // InternalTwitterQA.g:692:2: 'is'
            {
             before(grammarAccess.getTwitterQAAccess().getIsKeyword_15()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getIsKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__15__Impl"


    // $ANTLR start "rule__TwitterQA__Group__16"
    // InternalTwitterQA.g:701:1: rule__TwitterQA__Group__16 : rule__TwitterQA__Group__16__Impl rule__TwitterQA__Group__17 ;
    public final void rule__TwitterQA__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:705:1: ( rule__TwitterQA__Group__16__Impl rule__TwitterQA__Group__17 )
            // InternalTwitterQA.g:706:2: rule__TwitterQA__Group__16__Impl rule__TwitterQA__Group__17
            {
            pushFollow(FOLLOW_11);
            rule__TwitterQA__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__16"


    // $ANTLR start "rule__TwitterQA__Group__16__Impl"
    // InternalTwitterQA.g:713:1: rule__TwitterQA__Group__16__Impl : ( ( rule__TwitterQA__Welcome_msgAssignment_16 ) ) ;
    public final void rule__TwitterQA__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:717:1: ( ( ( rule__TwitterQA__Welcome_msgAssignment_16 ) ) )
            // InternalTwitterQA.g:718:1: ( ( rule__TwitterQA__Welcome_msgAssignment_16 ) )
            {
            // InternalTwitterQA.g:718:1: ( ( rule__TwitterQA__Welcome_msgAssignment_16 ) )
            // InternalTwitterQA.g:719:2: ( rule__TwitterQA__Welcome_msgAssignment_16 )
            {
             before(grammarAccess.getTwitterQAAccess().getWelcome_msgAssignment_16()); 
            // InternalTwitterQA.g:720:2: ( rule__TwitterQA__Welcome_msgAssignment_16 )
            // InternalTwitterQA.g:720:3: rule__TwitterQA__Welcome_msgAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__Welcome_msgAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getTwitterQAAccess().getWelcome_msgAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__16__Impl"


    // $ANTLR start "rule__TwitterQA__Group__17"
    // InternalTwitterQA.g:728:1: rule__TwitterQA__Group__17 : rule__TwitterQA__Group__17__Impl rule__TwitterQA__Group__18 ;
    public final void rule__TwitterQA__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:732:1: ( rule__TwitterQA__Group__17__Impl rule__TwitterQA__Group__18 )
            // InternalTwitterQA.g:733:2: rule__TwitterQA__Group__17__Impl rule__TwitterQA__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__TwitterQA__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__17"


    // $ANTLR start "rule__TwitterQA__Group__17__Impl"
    // InternalTwitterQA.g:740:1: rule__TwitterQA__Group__17__Impl : ( 'games' ) ;
    public final void rule__TwitterQA__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:744:1: ( ( 'games' ) )
            // InternalTwitterQA.g:745:1: ( 'games' )
            {
            // InternalTwitterQA.g:745:1: ( 'games' )
            // InternalTwitterQA.g:746:2: 'games'
            {
             before(grammarAccess.getTwitterQAAccess().getGamesKeyword_17()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getGamesKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__17__Impl"


    // $ANTLR start "rule__TwitterQA__Group__18"
    // InternalTwitterQA.g:755:1: rule__TwitterQA__Group__18 : rule__TwitterQA__Group__18__Impl rule__TwitterQA__Group__19 ;
    public final void rule__TwitterQA__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:759:1: ( rule__TwitterQA__Group__18__Impl rule__TwitterQA__Group__19 )
            // InternalTwitterQA.g:760:2: rule__TwitterQA__Group__18__Impl rule__TwitterQA__Group__19
            {
            pushFollow(FOLLOW_13);
            rule__TwitterQA__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__18"


    // $ANTLR start "rule__TwitterQA__Group__18__Impl"
    // InternalTwitterQA.g:767:1: rule__TwitterQA__Group__18__Impl : ( 'are' ) ;
    public final void rule__TwitterQA__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:771:1: ( ( 'are' ) )
            // InternalTwitterQA.g:772:1: ( 'are' )
            {
            // InternalTwitterQA.g:772:1: ( 'are' )
            // InternalTwitterQA.g:773:2: 'are'
            {
             before(grammarAccess.getTwitterQAAccess().getAreKeyword_18()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getAreKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__18__Impl"


    // $ANTLR start "rule__TwitterQA__Group__19"
    // InternalTwitterQA.g:782:1: rule__TwitterQA__Group__19 : rule__TwitterQA__Group__19__Impl rule__TwitterQA__Group__20 ;
    public final void rule__TwitterQA__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:786:1: ( rule__TwitterQA__Group__19__Impl rule__TwitterQA__Group__20 )
            // InternalTwitterQA.g:787:2: rule__TwitterQA__Group__19__Impl rule__TwitterQA__Group__20
            {
            pushFollow(FOLLOW_14);
            rule__TwitterQA__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__19"


    // $ANTLR start "rule__TwitterQA__Group__19__Impl"
    // InternalTwitterQA.g:794:1: rule__TwitterQA__Group__19__Impl : ( '[' ) ;
    public final void rule__TwitterQA__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:798:1: ( ( '[' ) )
            // InternalTwitterQA.g:799:1: ( '[' )
            {
            // InternalTwitterQA.g:799:1: ( '[' )
            // InternalTwitterQA.g:800:2: '['
            {
             before(grammarAccess.getTwitterQAAccess().getLeftSquareBracketKeyword_19()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getLeftSquareBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__19__Impl"


    // $ANTLR start "rule__TwitterQA__Group__20"
    // InternalTwitterQA.g:809:1: rule__TwitterQA__Group__20 : rule__TwitterQA__Group__20__Impl rule__TwitterQA__Group__21 ;
    public final void rule__TwitterQA__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:813:1: ( rule__TwitterQA__Group__20__Impl rule__TwitterQA__Group__21 )
            // InternalTwitterQA.g:814:2: rule__TwitterQA__Group__20__Impl rule__TwitterQA__Group__21
            {
            pushFollow(FOLLOW_15);
            rule__TwitterQA__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__20"


    // $ANTLR start "rule__TwitterQA__Group__20__Impl"
    // InternalTwitterQA.g:821:1: rule__TwitterQA__Group__20__Impl : ( ( rule__TwitterQA__GamesAssignment_20 ) ) ;
    public final void rule__TwitterQA__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:825:1: ( ( ( rule__TwitterQA__GamesAssignment_20 ) ) )
            // InternalTwitterQA.g:826:1: ( ( rule__TwitterQA__GamesAssignment_20 ) )
            {
            // InternalTwitterQA.g:826:1: ( ( rule__TwitterQA__GamesAssignment_20 ) )
            // InternalTwitterQA.g:827:2: ( rule__TwitterQA__GamesAssignment_20 )
            {
             before(grammarAccess.getTwitterQAAccess().getGamesAssignment_20()); 
            // InternalTwitterQA.g:828:2: ( rule__TwitterQA__GamesAssignment_20 )
            // InternalTwitterQA.g:828:3: rule__TwitterQA__GamesAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__GamesAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getTwitterQAAccess().getGamesAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__20__Impl"


    // $ANTLR start "rule__TwitterQA__Group__21"
    // InternalTwitterQA.g:836:1: rule__TwitterQA__Group__21 : rule__TwitterQA__Group__21__Impl rule__TwitterQA__Group__22 ;
    public final void rule__TwitterQA__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:840:1: ( rule__TwitterQA__Group__21__Impl rule__TwitterQA__Group__22 )
            // InternalTwitterQA.g:841:2: rule__TwitterQA__Group__21__Impl rule__TwitterQA__Group__22
            {
            pushFollow(FOLLOW_15);
            rule__TwitterQA__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__21"


    // $ANTLR start "rule__TwitterQA__Group__21__Impl"
    // InternalTwitterQA.g:848:1: rule__TwitterQA__Group__21__Impl : ( ( rule__TwitterQA__Group_21__0 )* ) ;
    public final void rule__TwitterQA__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:852:1: ( ( ( rule__TwitterQA__Group_21__0 )* ) )
            // InternalTwitterQA.g:853:1: ( ( rule__TwitterQA__Group_21__0 )* )
            {
            // InternalTwitterQA.g:853:1: ( ( rule__TwitterQA__Group_21__0 )* )
            // InternalTwitterQA.g:854:2: ( rule__TwitterQA__Group_21__0 )*
            {
             before(grammarAccess.getTwitterQAAccess().getGroup_21()); 
            // InternalTwitterQA.g:855:2: ( rule__TwitterQA__Group_21__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTwitterQA.g:855:3: rule__TwitterQA__Group_21__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TwitterQA__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTwitterQAAccess().getGroup_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__21__Impl"


    // $ANTLR start "rule__TwitterQA__Group__22"
    // InternalTwitterQA.g:863:1: rule__TwitterQA__Group__22 : rule__TwitterQA__Group__22__Impl rule__TwitterQA__Group__23 ;
    public final void rule__TwitterQA__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:867:1: ( rule__TwitterQA__Group__22__Impl rule__TwitterQA__Group__23 )
            // InternalTwitterQA.g:868:2: rule__TwitterQA__Group__22__Impl rule__TwitterQA__Group__23
            {
            pushFollow(FOLLOW_17);
            rule__TwitterQA__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__22"


    // $ANTLR start "rule__TwitterQA__Group__22__Impl"
    // InternalTwitterQA.g:875:1: rule__TwitterQA__Group__22__Impl : ( ']' ) ;
    public final void rule__TwitterQA__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:879:1: ( ( ']' ) )
            // InternalTwitterQA.g:880:1: ( ']' )
            {
            // InternalTwitterQA.g:880:1: ( ']' )
            // InternalTwitterQA.g:881:2: ']'
            {
             before(grammarAccess.getTwitterQAAccess().getRightSquareBracketKeyword_22()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getRightSquareBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__22__Impl"


    // $ANTLR start "rule__TwitterQA__Group__23"
    // InternalTwitterQA.g:890:1: rule__TwitterQA__Group__23 : rule__TwitterQA__Group__23__Impl rule__TwitterQA__Group__24 ;
    public final void rule__TwitterQA__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:894:1: ( rule__TwitterQA__Group__23__Impl rule__TwitterQA__Group__24 )
            // InternalTwitterQA.g:895:2: rule__TwitterQA__Group__23__Impl rule__TwitterQA__Group__24
            {
            pushFollow(FOLLOW_12);
            rule__TwitterQA__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__23"


    // $ANTLR start "rule__TwitterQA__Group__23__Impl"
    // InternalTwitterQA.g:902:1: rule__TwitterQA__Group__23__Impl : ( 'locations' ) ;
    public final void rule__TwitterQA__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:906:1: ( ( 'locations' ) )
            // InternalTwitterQA.g:907:1: ( 'locations' )
            {
            // InternalTwitterQA.g:907:1: ( 'locations' )
            // InternalTwitterQA.g:908:2: 'locations'
            {
             before(grammarAccess.getTwitterQAAccess().getLocationsKeyword_23()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getLocationsKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__23__Impl"


    // $ANTLR start "rule__TwitterQA__Group__24"
    // InternalTwitterQA.g:917:1: rule__TwitterQA__Group__24 : rule__TwitterQA__Group__24__Impl rule__TwitterQA__Group__25 ;
    public final void rule__TwitterQA__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:921:1: ( rule__TwitterQA__Group__24__Impl rule__TwitterQA__Group__25 )
            // InternalTwitterQA.g:922:2: rule__TwitterQA__Group__24__Impl rule__TwitterQA__Group__25
            {
            pushFollow(FOLLOW_13);
            rule__TwitterQA__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__24"


    // $ANTLR start "rule__TwitterQA__Group__24__Impl"
    // InternalTwitterQA.g:929:1: rule__TwitterQA__Group__24__Impl : ( 'are' ) ;
    public final void rule__TwitterQA__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:933:1: ( ( 'are' ) )
            // InternalTwitterQA.g:934:1: ( 'are' )
            {
            // InternalTwitterQA.g:934:1: ( 'are' )
            // InternalTwitterQA.g:935:2: 'are'
            {
             before(grammarAccess.getTwitterQAAccess().getAreKeyword_24()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getAreKeyword_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__24__Impl"


    // $ANTLR start "rule__TwitterQA__Group__25"
    // InternalTwitterQA.g:944:1: rule__TwitterQA__Group__25 : rule__TwitterQA__Group__25__Impl rule__TwitterQA__Group__26 ;
    public final void rule__TwitterQA__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:948:1: ( rule__TwitterQA__Group__25__Impl rule__TwitterQA__Group__26 )
            // InternalTwitterQA.g:949:2: rule__TwitterQA__Group__25__Impl rule__TwitterQA__Group__26
            {
            pushFollow(FOLLOW_18);
            rule__TwitterQA__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__25"


    // $ANTLR start "rule__TwitterQA__Group__25__Impl"
    // InternalTwitterQA.g:956:1: rule__TwitterQA__Group__25__Impl : ( '[' ) ;
    public final void rule__TwitterQA__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:960:1: ( ( '[' ) )
            // InternalTwitterQA.g:961:1: ( '[' )
            {
            // InternalTwitterQA.g:961:1: ( '[' )
            // InternalTwitterQA.g:962:2: '['
            {
             before(grammarAccess.getTwitterQAAccess().getLeftSquareBracketKeyword_25()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getLeftSquareBracketKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__25__Impl"


    // $ANTLR start "rule__TwitterQA__Group__26"
    // InternalTwitterQA.g:971:1: rule__TwitterQA__Group__26 : rule__TwitterQA__Group__26__Impl rule__TwitterQA__Group__27 ;
    public final void rule__TwitterQA__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:975:1: ( rule__TwitterQA__Group__26__Impl rule__TwitterQA__Group__27 )
            // InternalTwitterQA.g:976:2: rule__TwitterQA__Group__26__Impl rule__TwitterQA__Group__27
            {
            pushFollow(FOLLOW_15);
            rule__TwitterQA__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__26"


    // $ANTLR start "rule__TwitterQA__Group__26__Impl"
    // InternalTwitterQA.g:983:1: rule__TwitterQA__Group__26__Impl : ( ( rule__TwitterQA__LocationsAssignment_26 ) ) ;
    public final void rule__TwitterQA__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:987:1: ( ( ( rule__TwitterQA__LocationsAssignment_26 ) ) )
            // InternalTwitterQA.g:988:1: ( ( rule__TwitterQA__LocationsAssignment_26 ) )
            {
            // InternalTwitterQA.g:988:1: ( ( rule__TwitterQA__LocationsAssignment_26 ) )
            // InternalTwitterQA.g:989:2: ( rule__TwitterQA__LocationsAssignment_26 )
            {
             before(grammarAccess.getTwitterQAAccess().getLocationsAssignment_26()); 
            // InternalTwitterQA.g:990:2: ( rule__TwitterQA__LocationsAssignment_26 )
            // InternalTwitterQA.g:990:3: rule__TwitterQA__LocationsAssignment_26
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__LocationsAssignment_26();

            state._fsp--;


            }

             after(grammarAccess.getTwitterQAAccess().getLocationsAssignment_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__26__Impl"


    // $ANTLR start "rule__TwitterQA__Group__27"
    // InternalTwitterQA.g:998:1: rule__TwitterQA__Group__27 : rule__TwitterQA__Group__27__Impl rule__TwitterQA__Group__28 ;
    public final void rule__TwitterQA__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1002:1: ( rule__TwitterQA__Group__27__Impl rule__TwitterQA__Group__28 )
            // InternalTwitterQA.g:1003:2: rule__TwitterQA__Group__27__Impl rule__TwitterQA__Group__28
            {
            pushFollow(FOLLOW_15);
            rule__TwitterQA__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__27"


    // $ANTLR start "rule__TwitterQA__Group__27__Impl"
    // InternalTwitterQA.g:1010:1: rule__TwitterQA__Group__27__Impl : ( ( rule__TwitterQA__Group_27__0 )* ) ;
    public final void rule__TwitterQA__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1014:1: ( ( ( rule__TwitterQA__Group_27__0 )* ) )
            // InternalTwitterQA.g:1015:1: ( ( rule__TwitterQA__Group_27__0 )* )
            {
            // InternalTwitterQA.g:1015:1: ( ( rule__TwitterQA__Group_27__0 )* )
            // InternalTwitterQA.g:1016:2: ( rule__TwitterQA__Group_27__0 )*
            {
             before(grammarAccess.getTwitterQAAccess().getGroup_27()); 
            // InternalTwitterQA.g:1017:2: ( rule__TwitterQA__Group_27__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTwitterQA.g:1017:3: rule__TwitterQA__Group_27__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TwitterQA__Group_27__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getTwitterQAAccess().getGroup_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__27__Impl"


    // $ANTLR start "rule__TwitterQA__Group__28"
    // InternalTwitterQA.g:1025:1: rule__TwitterQA__Group__28 : rule__TwitterQA__Group__28__Impl rule__TwitterQA__Group__29 ;
    public final void rule__TwitterQA__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1029:1: ( rule__TwitterQA__Group__28__Impl rule__TwitterQA__Group__29 )
            // InternalTwitterQA.g:1030:2: rule__TwitterQA__Group__28__Impl rule__TwitterQA__Group__29
            {
            pushFollow(FOLLOW_19);
            rule__TwitterQA__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__28"


    // $ANTLR start "rule__TwitterQA__Group__28__Impl"
    // InternalTwitterQA.g:1037:1: rule__TwitterQA__Group__28__Impl : ( ']' ) ;
    public final void rule__TwitterQA__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1041:1: ( ( ']' ) )
            // InternalTwitterQA.g:1042:1: ( ']' )
            {
            // InternalTwitterQA.g:1042:1: ( ']' )
            // InternalTwitterQA.g:1043:2: ']'
            {
             before(grammarAccess.getTwitterQAAccess().getRightSquareBracketKeyword_28()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getRightSquareBracketKeyword_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__28__Impl"


    // $ANTLR start "rule__TwitterQA__Group__29"
    // InternalTwitterQA.g:1052:1: rule__TwitterQA__Group__29 : rule__TwitterQA__Group__29__Impl ;
    public final void rule__TwitterQA__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1056:1: ( rule__TwitterQA__Group__29__Impl )
            // InternalTwitterQA.g:1057:2: rule__TwitterQA__Group__29__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group__29__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__29"


    // $ANTLR start "rule__TwitterQA__Group__29__Impl"
    // InternalTwitterQA.g:1063:1: rule__TwitterQA__Group__29__Impl : ( '}' ) ;
    public final void rule__TwitterQA__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1067:1: ( ( '}' ) )
            // InternalTwitterQA.g:1068:1: ( '}' )
            {
            // InternalTwitterQA.g:1068:1: ( '}' )
            // InternalTwitterQA.g:1069:2: '}'
            {
             before(grammarAccess.getTwitterQAAccess().getRightCurlyBracketKeyword_29()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getRightCurlyBracketKeyword_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group__29__Impl"


    // $ANTLR start "rule__TwitterQA__Group_21__0"
    // InternalTwitterQA.g:1079:1: rule__TwitterQA__Group_21__0 : rule__TwitterQA__Group_21__0__Impl rule__TwitterQA__Group_21__1 ;
    public final void rule__TwitterQA__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1083:1: ( rule__TwitterQA__Group_21__0__Impl rule__TwitterQA__Group_21__1 )
            // InternalTwitterQA.g:1084:2: rule__TwitterQA__Group_21__0__Impl rule__TwitterQA__Group_21__1
            {
            pushFollow(FOLLOW_14);
            rule__TwitterQA__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group_21__0"


    // $ANTLR start "rule__TwitterQA__Group_21__0__Impl"
    // InternalTwitterQA.g:1091:1: rule__TwitterQA__Group_21__0__Impl : ( ',' ) ;
    public final void rule__TwitterQA__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1095:1: ( ( ',' ) )
            // InternalTwitterQA.g:1096:1: ( ',' )
            {
            // InternalTwitterQA.g:1096:1: ( ',' )
            // InternalTwitterQA.g:1097:2: ','
            {
             before(grammarAccess.getTwitterQAAccess().getCommaKeyword_21_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getCommaKeyword_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group_21__0__Impl"


    // $ANTLR start "rule__TwitterQA__Group_21__1"
    // InternalTwitterQA.g:1106:1: rule__TwitterQA__Group_21__1 : rule__TwitterQA__Group_21__1__Impl ;
    public final void rule__TwitterQA__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1110:1: ( rule__TwitterQA__Group_21__1__Impl )
            // InternalTwitterQA.g:1111:2: rule__TwitterQA__Group_21__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group_21__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group_21__1"


    // $ANTLR start "rule__TwitterQA__Group_21__1__Impl"
    // InternalTwitterQA.g:1117:1: rule__TwitterQA__Group_21__1__Impl : ( ( rule__TwitterQA__GamesAssignment_21_1 ) ) ;
    public final void rule__TwitterQA__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1121:1: ( ( ( rule__TwitterQA__GamesAssignment_21_1 ) ) )
            // InternalTwitterQA.g:1122:1: ( ( rule__TwitterQA__GamesAssignment_21_1 ) )
            {
            // InternalTwitterQA.g:1122:1: ( ( rule__TwitterQA__GamesAssignment_21_1 ) )
            // InternalTwitterQA.g:1123:2: ( rule__TwitterQA__GamesAssignment_21_1 )
            {
             before(grammarAccess.getTwitterQAAccess().getGamesAssignment_21_1()); 
            // InternalTwitterQA.g:1124:2: ( rule__TwitterQA__GamesAssignment_21_1 )
            // InternalTwitterQA.g:1124:3: rule__TwitterQA__GamesAssignment_21_1
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__GamesAssignment_21_1();

            state._fsp--;


            }

             after(grammarAccess.getTwitterQAAccess().getGamesAssignment_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group_21__1__Impl"


    // $ANTLR start "rule__TwitterQA__Group_27__0"
    // InternalTwitterQA.g:1133:1: rule__TwitterQA__Group_27__0 : rule__TwitterQA__Group_27__0__Impl rule__TwitterQA__Group_27__1 ;
    public final void rule__TwitterQA__Group_27__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1137:1: ( rule__TwitterQA__Group_27__0__Impl rule__TwitterQA__Group_27__1 )
            // InternalTwitterQA.g:1138:2: rule__TwitterQA__Group_27__0__Impl rule__TwitterQA__Group_27__1
            {
            pushFollow(FOLLOW_18);
            rule__TwitterQA__Group_27__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group_27__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group_27__0"


    // $ANTLR start "rule__TwitterQA__Group_27__0__Impl"
    // InternalTwitterQA.g:1145:1: rule__TwitterQA__Group_27__0__Impl : ( ',' ) ;
    public final void rule__TwitterQA__Group_27__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1149:1: ( ( ',' ) )
            // InternalTwitterQA.g:1150:1: ( ',' )
            {
            // InternalTwitterQA.g:1150:1: ( ',' )
            // InternalTwitterQA.g:1151:2: ','
            {
             before(grammarAccess.getTwitterQAAccess().getCommaKeyword_27_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTwitterQAAccess().getCommaKeyword_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group_27__0__Impl"


    // $ANTLR start "rule__TwitterQA__Group_27__1"
    // InternalTwitterQA.g:1160:1: rule__TwitterQA__Group_27__1 : rule__TwitterQA__Group_27__1__Impl ;
    public final void rule__TwitterQA__Group_27__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1164:1: ( rule__TwitterQA__Group_27__1__Impl )
            // InternalTwitterQA.g:1165:2: rule__TwitterQA__Group_27__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__Group_27__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group_27__1"


    // $ANTLR start "rule__TwitterQA__Group_27__1__Impl"
    // InternalTwitterQA.g:1171:1: rule__TwitterQA__Group_27__1__Impl : ( ( rule__TwitterQA__LocationsAssignment_27_1 ) ) ;
    public final void rule__TwitterQA__Group_27__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1175:1: ( ( ( rule__TwitterQA__LocationsAssignment_27_1 ) ) )
            // InternalTwitterQA.g:1176:1: ( ( rule__TwitterQA__LocationsAssignment_27_1 ) )
            {
            // InternalTwitterQA.g:1176:1: ( ( rule__TwitterQA__LocationsAssignment_27_1 ) )
            // InternalTwitterQA.g:1177:2: ( rule__TwitterQA__LocationsAssignment_27_1 )
            {
             before(grammarAccess.getTwitterQAAccess().getLocationsAssignment_27_1()); 
            // InternalTwitterQA.g:1178:2: ( rule__TwitterQA__LocationsAssignment_27_1 )
            // InternalTwitterQA.g:1178:3: rule__TwitterQA__LocationsAssignment_27_1
            {
            pushFollow(FOLLOW_2);
            rule__TwitterQA__LocationsAssignment_27_1();

            state._fsp--;


            }

             after(grammarAccess.getTwitterQAAccess().getLocationsAssignment_27_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Group_27__1__Impl"


    // $ANTLR start "rule__Game__Group__0"
    // InternalTwitterQA.g:1187:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1191:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // InternalTwitterQA.g:1192:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // InternalTwitterQA.g:1199:1: rule__Game__Group__0__Impl : ( 'Game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1203:1: ( ( 'Game' ) )
            // InternalTwitterQA.g:1204:1: ( 'Game' )
            {
            // InternalTwitterQA.g:1204:1: ( 'Game' )
            // InternalTwitterQA.g:1205:2: 'Game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // InternalTwitterQA.g:1214:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1218:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // InternalTwitterQA.g:1219:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // InternalTwitterQA.g:1226:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1230:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // InternalTwitterQA.g:1231:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // InternalTwitterQA.g:1231:1: ( ( rule__Game__NameAssignment_1 ) )
            // InternalTwitterQA.g:1232:2: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // InternalTwitterQA.g:1233:2: ( rule__Game__NameAssignment_1 )
            // InternalTwitterQA.g:1233:3: rule__Game__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // InternalTwitterQA.g:1241:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1245:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // InternalTwitterQA.g:1246:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // InternalTwitterQA.g:1253:1: rule__Game__Group__2__Impl : ( '{' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1257:1: ( ( '{' ) )
            // InternalTwitterQA.g:1258:1: ( '{' )
            {
            // InternalTwitterQA.g:1258:1: ( '{' )
            // InternalTwitterQA.g:1259:2: '{'
            {
             before(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // InternalTwitterQA.g:1268:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1272:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // InternalTwitterQA.g:1273:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // InternalTwitterQA.g:1280:1: rule__Game__Group__3__Impl : ( 'description' ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1284:1: ( ( 'description' ) )
            // InternalTwitterQA.g:1285:1: ( 'description' )
            {
            // InternalTwitterQA.g:1285:1: ( 'description' )
            // InternalTwitterQA.g:1286:2: 'description'
            {
             before(grammarAccess.getGameAccess().getDescriptionKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getDescriptionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // InternalTwitterQA.g:1295:1: rule__Game__Group__4 : rule__Game__Group__4__Impl rule__Game__Group__5 ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1299:1: ( rule__Game__Group__4__Impl rule__Game__Group__5 )
            // InternalTwitterQA.g:1300:2: rule__Game__Group__4__Impl rule__Game__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // InternalTwitterQA.g:1307:1: rule__Game__Group__4__Impl : ( 'is' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1311:1: ( ( 'is' ) )
            // InternalTwitterQA.g:1312:1: ( 'is' )
            {
            // InternalTwitterQA.g:1312:1: ( 'is' )
            // InternalTwitterQA.g:1313:2: 'is'
            {
             before(grammarAccess.getGameAccess().getIsKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getIsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Game__Group__5"
    // InternalTwitterQA.g:1322:1: rule__Game__Group__5 : rule__Game__Group__5__Impl rule__Game__Group__6 ;
    public final void rule__Game__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1326:1: ( rule__Game__Group__5__Impl rule__Game__Group__6 )
            // InternalTwitterQA.g:1327:2: rule__Game__Group__5__Impl rule__Game__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Game__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__5"


    // $ANTLR start "rule__Game__Group__5__Impl"
    // InternalTwitterQA.g:1334:1: rule__Game__Group__5__Impl : ( ( rule__Game__DescriptionAssignment_5 ) ) ;
    public final void rule__Game__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1338:1: ( ( ( rule__Game__DescriptionAssignment_5 ) ) )
            // InternalTwitterQA.g:1339:1: ( ( rule__Game__DescriptionAssignment_5 ) )
            {
            // InternalTwitterQA.g:1339:1: ( ( rule__Game__DescriptionAssignment_5 ) )
            // InternalTwitterQA.g:1340:2: ( rule__Game__DescriptionAssignment_5 )
            {
             before(grammarAccess.getGameAccess().getDescriptionAssignment_5()); 
            // InternalTwitterQA.g:1341:2: ( rule__Game__DescriptionAssignment_5 )
            // InternalTwitterQA.g:1341:3: rule__Game__DescriptionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Game__DescriptionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getDescriptionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__5__Impl"


    // $ANTLR start "rule__Game__Group__6"
    // InternalTwitterQA.g:1349:1: rule__Game__Group__6 : rule__Game__Group__6__Impl rule__Game__Group__7 ;
    public final void rule__Game__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1353:1: ( rule__Game__Group__6__Impl rule__Game__Group__7 )
            // InternalTwitterQA.g:1354:2: rule__Game__Group__6__Impl rule__Game__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__6"


    // $ANTLR start "rule__Game__Group__6__Impl"
    // InternalTwitterQA.g:1361:1: rule__Game__Group__6__Impl : ( 'city' ) ;
    public final void rule__Game__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1365:1: ( ( 'city' ) )
            // InternalTwitterQA.g:1366:1: ( 'city' )
            {
            // InternalTwitterQA.g:1366:1: ( 'city' )
            // InternalTwitterQA.g:1367:2: 'city'
            {
             before(grammarAccess.getGameAccess().getCityKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getCityKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__6__Impl"


    // $ANTLR start "rule__Game__Group__7"
    // InternalTwitterQA.g:1376:1: rule__Game__Group__7 : rule__Game__Group__7__Impl rule__Game__Group__8 ;
    public final void rule__Game__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1380:1: ( rule__Game__Group__7__Impl rule__Game__Group__8 )
            // InternalTwitterQA.g:1381:2: rule__Game__Group__7__Impl rule__Game__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Game__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__7"


    // $ANTLR start "rule__Game__Group__7__Impl"
    // InternalTwitterQA.g:1388:1: rule__Game__Group__7__Impl : ( 'is' ) ;
    public final void rule__Game__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1392:1: ( ( 'is' ) )
            // InternalTwitterQA.g:1393:1: ( 'is' )
            {
            // InternalTwitterQA.g:1393:1: ( 'is' )
            // InternalTwitterQA.g:1394:2: 'is'
            {
             before(grammarAccess.getGameAccess().getIsKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getIsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__7__Impl"


    // $ANTLR start "rule__Game__Group__8"
    // InternalTwitterQA.g:1403:1: rule__Game__Group__8 : rule__Game__Group__8__Impl rule__Game__Group__9 ;
    public final void rule__Game__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1407:1: ( rule__Game__Group__8__Impl rule__Game__Group__9 )
            // InternalTwitterQA.g:1408:2: rule__Game__Group__8__Impl rule__Game__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Game__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__8"


    // $ANTLR start "rule__Game__Group__8__Impl"
    // InternalTwitterQA.g:1415:1: rule__Game__Group__8__Impl : ( ( rule__Game__CityAssignment_8 ) ) ;
    public final void rule__Game__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1419:1: ( ( ( rule__Game__CityAssignment_8 ) ) )
            // InternalTwitterQA.g:1420:1: ( ( rule__Game__CityAssignment_8 ) )
            {
            // InternalTwitterQA.g:1420:1: ( ( rule__Game__CityAssignment_8 ) )
            // InternalTwitterQA.g:1421:2: ( rule__Game__CityAssignment_8 )
            {
             before(grammarAccess.getGameAccess().getCityAssignment_8()); 
            // InternalTwitterQA.g:1422:2: ( rule__Game__CityAssignment_8 )
            // InternalTwitterQA.g:1422:3: rule__Game__CityAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Game__CityAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getCityAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__8__Impl"


    // $ANTLR start "rule__Game__Group__9"
    // InternalTwitterQA.g:1430:1: rule__Game__Group__9 : rule__Game__Group__9__Impl rule__Game__Group__10 ;
    public final void rule__Game__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1434:1: ( rule__Game__Group__9__Impl rule__Game__Group__10 )
            // InternalTwitterQA.g:1435:2: rule__Game__Group__9__Impl rule__Game__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Game__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__9"


    // $ANTLR start "rule__Game__Group__9__Impl"
    // InternalTwitterQA.g:1442:1: rule__Game__Group__9__Impl : ( 'initial_test' ) ;
    public final void rule__Game__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1446:1: ( ( 'initial_test' ) )
            // InternalTwitterQA.g:1447:1: ( 'initial_test' )
            {
            // InternalTwitterQA.g:1447:1: ( 'initial_test' )
            // InternalTwitterQA.g:1448:2: 'initial_test'
            {
             before(grammarAccess.getGameAccess().getInitial_testKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getInitial_testKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__9__Impl"


    // $ANTLR start "rule__Game__Group__10"
    // InternalTwitterQA.g:1457:1: rule__Game__Group__10 : rule__Game__Group__10__Impl rule__Game__Group__11 ;
    public final void rule__Game__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1461:1: ( rule__Game__Group__10__Impl rule__Game__Group__11 )
            // InternalTwitterQA.g:1462:2: rule__Game__Group__10__Impl rule__Game__Group__11
            {
            pushFollow(FOLLOW_23);
            rule__Game__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__10"


    // $ANTLR start "rule__Game__Group__10__Impl"
    // InternalTwitterQA.g:1469:1: rule__Game__Group__10__Impl : ( 'is' ) ;
    public final void rule__Game__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1473:1: ( ( 'is' ) )
            // InternalTwitterQA.g:1474:1: ( 'is' )
            {
            // InternalTwitterQA.g:1474:1: ( 'is' )
            // InternalTwitterQA.g:1475:2: 'is'
            {
             before(grammarAccess.getGameAccess().getIsKeyword_10()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getIsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__10__Impl"


    // $ANTLR start "rule__Game__Group__11"
    // InternalTwitterQA.g:1484:1: rule__Game__Group__11 : rule__Game__Group__11__Impl rule__Game__Group__12 ;
    public final void rule__Game__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1488:1: ( rule__Game__Group__11__Impl rule__Game__Group__12 )
            // InternalTwitterQA.g:1489:2: rule__Game__Group__11__Impl rule__Game__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__Game__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__11"


    // $ANTLR start "rule__Game__Group__11__Impl"
    // InternalTwitterQA.g:1496:1: rule__Game__Group__11__Impl : ( ( rule__Game__Initial_testAssignment_11 ) ) ;
    public final void rule__Game__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1500:1: ( ( ( rule__Game__Initial_testAssignment_11 ) ) )
            // InternalTwitterQA.g:1501:1: ( ( rule__Game__Initial_testAssignment_11 ) )
            {
            // InternalTwitterQA.g:1501:1: ( ( rule__Game__Initial_testAssignment_11 ) )
            // InternalTwitterQA.g:1502:2: ( rule__Game__Initial_testAssignment_11 )
            {
             before(grammarAccess.getGameAccess().getInitial_testAssignment_11()); 
            // InternalTwitterQA.g:1503:2: ( rule__Game__Initial_testAssignment_11 )
            // InternalTwitterQA.g:1503:3: rule__Game__Initial_testAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Game__Initial_testAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getInitial_testAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__11__Impl"


    // $ANTLR start "rule__Game__Group__12"
    // InternalTwitterQA.g:1511:1: rule__Game__Group__12 : rule__Game__Group__12__Impl rule__Game__Group__13 ;
    public final void rule__Game__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1515:1: ( rule__Game__Group__12__Impl rule__Game__Group__13 )
            // InternalTwitterQA.g:1516:2: rule__Game__Group__12__Impl rule__Game__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Game__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__12"


    // $ANTLR start "rule__Game__Group__12__Impl"
    // InternalTwitterQA.g:1523:1: rule__Game__Group__12__Impl : ( 'tests' ) ;
    public final void rule__Game__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1527:1: ( ( 'tests' ) )
            // InternalTwitterQA.g:1528:1: ( 'tests' )
            {
            // InternalTwitterQA.g:1528:1: ( 'tests' )
            // InternalTwitterQA.g:1529:2: 'tests'
            {
             before(grammarAccess.getGameAccess().getTestsKeyword_12()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getTestsKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__12__Impl"


    // $ANTLR start "rule__Game__Group__13"
    // InternalTwitterQA.g:1538:1: rule__Game__Group__13 : rule__Game__Group__13__Impl rule__Game__Group__14 ;
    public final void rule__Game__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1542:1: ( rule__Game__Group__13__Impl rule__Game__Group__14 )
            // InternalTwitterQA.g:1543:2: rule__Game__Group__13__Impl rule__Game__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Game__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__13"


    // $ANTLR start "rule__Game__Group__13__Impl"
    // InternalTwitterQA.g:1550:1: rule__Game__Group__13__Impl : ( 'are' ) ;
    public final void rule__Game__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1554:1: ( ( 'are' ) )
            // InternalTwitterQA.g:1555:1: ( 'are' )
            {
            // InternalTwitterQA.g:1555:1: ( 'are' )
            // InternalTwitterQA.g:1556:2: 'are'
            {
             before(grammarAccess.getGameAccess().getAreKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getAreKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__13__Impl"


    // $ANTLR start "rule__Game__Group__14"
    // InternalTwitterQA.g:1565:1: rule__Game__Group__14 : rule__Game__Group__14__Impl rule__Game__Group__15 ;
    public final void rule__Game__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1569:1: ( rule__Game__Group__14__Impl rule__Game__Group__15 )
            // InternalTwitterQA.g:1570:2: rule__Game__Group__14__Impl rule__Game__Group__15
            {
            pushFollow(FOLLOW_23);
            rule__Game__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__14"


    // $ANTLR start "rule__Game__Group__14__Impl"
    // InternalTwitterQA.g:1577:1: rule__Game__Group__14__Impl : ( '[' ) ;
    public final void rule__Game__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1581:1: ( ( '[' ) )
            // InternalTwitterQA.g:1582:1: ( '[' )
            {
            // InternalTwitterQA.g:1582:1: ( '[' )
            // InternalTwitterQA.g:1583:2: '['
            {
             before(grammarAccess.getGameAccess().getLeftSquareBracketKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getLeftSquareBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__14__Impl"


    // $ANTLR start "rule__Game__Group__15"
    // InternalTwitterQA.g:1592:1: rule__Game__Group__15 : rule__Game__Group__15__Impl rule__Game__Group__16 ;
    public final void rule__Game__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1596:1: ( rule__Game__Group__15__Impl rule__Game__Group__16 )
            // InternalTwitterQA.g:1597:2: rule__Game__Group__15__Impl rule__Game__Group__16
            {
            pushFollow(FOLLOW_15);
            rule__Game__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__15"


    // $ANTLR start "rule__Game__Group__15__Impl"
    // InternalTwitterQA.g:1604:1: rule__Game__Group__15__Impl : ( ( rule__Game__TestsAssignment_15 ) ) ;
    public final void rule__Game__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1608:1: ( ( ( rule__Game__TestsAssignment_15 ) ) )
            // InternalTwitterQA.g:1609:1: ( ( rule__Game__TestsAssignment_15 ) )
            {
            // InternalTwitterQA.g:1609:1: ( ( rule__Game__TestsAssignment_15 ) )
            // InternalTwitterQA.g:1610:2: ( rule__Game__TestsAssignment_15 )
            {
             before(grammarAccess.getGameAccess().getTestsAssignment_15()); 
            // InternalTwitterQA.g:1611:2: ( rule__Game__TestsAssignment_15 )
            // InternalTwitterQA.g:1611:3: rule__Game__TestsAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Game__TestsAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getTestsAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__15__Impl"


    // $ANTLR start "rule__Game__Group__16"
    // InternalTwitterQA.g:1619:1: rule__Game__Group__16 : rule__Game__Group__16__Impl rule__Game__Group__17 ;
    public final void rule__Game__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1623:1: ( rule__Game__Group__16__Impl rule__Game__Group__17 )
            // InternalTwitterQA.g:1624:2: rule__Game__Group__16__Impl rule__Game__Group__17
            {
            pushFollow(FOLLOW_15);
            rule__Game__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__16"


    // $ANTLR start "rule__Game__Group__16__Impl"
    // InternalTwitterQA.g:1631:1: rule__Game__Group__16__Impl : ( ( rule__Game__Group_16__0 )* ) ;
    public final void rule__Game__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1635:1: ( ( ( rule__Game__Group_16__0 )* ) )
            // InternalTwitterQA.g:1636:1: ( ( rule__Game__Group_16__0 )* )
            {
            // InternalTwitterQA.g:1636:1: ( ( rule__Game__Group_16__0 )* )
            // InternalTwitterQA.g:1637:2: ( rule__Game__Group_16__0 )*
            {
             before(grammarAccess.getGameAccess().getGroup_16()); 
            // InternalTwitterQA.g:1638:2: ( rule__Game__Group_16__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTwitterQA.g:1638:3: rule__Game__Group_16__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Game__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getGameAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__16__Impl"


    // $ANTLR start "rule__Game__Group__17"
    // InternalTwitterQA.g:1646:1: rule__Game__Group__17 : rule__Game__Group__17__Impl rule__Game__Group__18 ;
    public final void rule__Game__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1650:1: ( rule__Game__Group__17__Impl rule__Game__Group__18 )
            // InternalTwitterQA.g:1651:2: rule__Game__Group__17__Impl rule__Game__Group__18
            {
            pushFollow(FOLLOW_19);
            rule__Game__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__17"


    // $ANTLR start "rule__Game__Group__17__Impl"
    // InternalTwitterQA.g:1658:1: rule__Game__Group__17__Impl : ( ']' ) ;
    public final void rule__Game__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1662:1: ( ( ']' ) )
            // InternalTwitterQA.g:1663:1: ( ']' )
            {
            // InternalTwitterQA.g:1663:1: ( ']' )
            // InternalTwitterQA.g:1664:2: ']'
            {
             before(grammarAccess.getGameAccess().getRightSquareBracketKeyword_17()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightSquareBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__17__Impl"


    // $ANTLR start "rule__Game__Group__18"
    // InternalTwitterQA.g:1673:1: rule__Game__Group__18 : rule__Game__Group__18__Impl ;
    public final void rule__Game__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1677:1: ( rule__Game__Group__18__Impl )
            // InternalTwitterQA.g:1678:2: rule__Game__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__18"


    // $ANTLR start "rule__Game__Group__18__Impl"
    // InternalTwitterQA.g:1684:1: rule__Game__Group__18__Impl : ( '}' ) ;
    public final void rule__Game__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1688:1: ( ( '}' ) )
            // InternalTwitterQA.g:1689:1: ( '}' )
            {
            // InternalTwitterQA.g:1689:1: ( '}' )
            // InternalTwitterQA.g:1690:2: '}'
            {
             before(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_18()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__18__Impl"


    // $ANTLR start "rule__Game__Group_16__0"
    // InternalTwitterQA.g:1700:1: rule__Game__Group_16__0 : rule__Game__Group_16__0__Impl rule__Game__Group_16__1 ;
    public final void rule__Game__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1704:1: ( rule__Game__Group_16__0__Impl rule__Game__Group_16__1 )
            // InternalTwitterQA.g:1705:2: rule__Game__Group_16__0__Impl rule__Game__Group_16__1
            {
            pushFollow(FOLLOW_23);
            rule__Game__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Game__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_16__0"


    // $ANTLR start "rule__Game__Group_16__0__Impl"
    // InternalTwitterQA.g:1712:1: rule__Game__Group_16__0__Impl : ( ',' ) ;
    public final void rule__Game__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1716:1: ( ( ',' ) )
            // InternalTwitterQA.g:1717:1: ( ',' )
            {
            // InternalTwitterQA.g:1717:1: ( ',' )
            // InternalTwitterQA.g:1718:2: ','
            {
             before(grammarAccess.getGameAccess().getCommaKeyword_16_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getGameAccess().getCommaKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_16__0__Impl"


    // $ANTLR start "rule__Game__Group_16__1"
    // InternalTwitterQA.g:1727:1: rule__Game__Group_16__1 : rule__Game__Group_16__1__Impl ;
    public final void rule__Game__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1731:1: ( rule__Game__Group_16__1__Impl )
            // InternalTwitterQA.g:1732:2: rule__Game__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Game__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_16__1"


    // $ANTLR start "rule__Game__Group_16__1__Impl"
    // InternalTwitterQA.g:1738:1: rule__Game__Group_16__1__Impl : ( ( rule__Game__TestsAssignment_16_1 ) ) ;
    public final void rule__Game__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1742:1: ( ( ( rule__Game__TestsAssignment_16_1 ) ) )
            // InternalTwitterQA.g:1743:1: ( ( rule__Game__TestsAssignment_16_1 ) )
            {
            // InternalTwitterQA.g:1743:1: ( ( rule__Game__TestsAssignment_16_1 ) )
            // InternalTwitterQA.g:1744:2: ( rule__Game__TestsAssignment_16_1 )
            {
             before(grammarAccess.getGameAccess().getTestsAssignment_16_1()); 
            // InternalTwitterQA.g:1745:2: ( rule__Game__TestsAssignment_16_1 )
            // InternalTwitterQA.g:1745:3: rule__Game__TestsAssignment_16_1
            {
            pushFollow(FOLLOW_2);
            rule__Game__TestsAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getTestsAssignment_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group_16__1__Impl"


    // $ANTLR start "rule__Location__Group__0"
    // InternalTwitterQA.g:1754:1: rule__Location__Group__0 : rule__Location__Group__0__Impl rule__Location__Group__1 ;
    public final void rule__Location__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1758:1: ( rule__Location__Group__0__Impl rule__Location__Group__1 )
            // InternalTwitterQA.g:1759:2: rule__Location__Group__0__Impl rule__Location__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Location__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0"


    // $ANTLR start "rule__Location__Group__0__Impl"
    // InternalTwitterQA.g:1766:1: rule__Location__Group__0__Impl : ( 'Location' ) ;
    public final void rule__Location__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1770:1: ( ( 'Location' ) )
            // InternalTwitterQA.g:1771:1: ( 'Location' )
            {
            // InternalTwitterQA.g:1771:1: ( 'Location' )
            // InternalTwitterQA.g:1772:2: 'Location'
            {
             before(grammarAccess.getLocationAccess().getLocationKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLocationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__0__Impl"


    // $ANTLR start "rule__Location__Group__1"
    // InternalTwitterQA.g:1781:1: rule__Location__Group__1 : rule__Location__Group__1__Impl rule__Location__Group__2 ;
    public final void rule__Location__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1785:1: ( rule__Location__Group__1__Impl rule__Location__Group__2 )
            // InternalTwitterQA.g:1786:2: rule__Location__Group__1__Impl rule__Location__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Location__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1"


    // $ANTLR start "rule__Location__Group__1__Impl"
    // InternalTwitterQA.g:1793:1: rule__Location__Group__1__Impl : ( ( rule__Location__NameAssignment_1 ) ) ;
    public final void rule__Location__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1797:1: ( ( ( rule__Location__NameAssignment_1 ) ) )
            // InternalTwitterQA.g:1798:1: ( ( rule__Location__NameAssignment_1 ) )
            {
            // InternalTwitterQA.g:1798:1: ( ( rule__Location__NameAssignment_1 ) )
            // InternalTwitterQA.g:1799:2: ( rule__Location__NameAssignment_1 )
            {
             before(grammarAccess.getLocationAccess().getNameAssignment_1()); 
            // InternalTwitterQA.g:1800:2: ( rule__Location__NameAssignment_1 )
            // InternalTwitterQA.g:1800:3: rule__Location__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Location__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__1__Impl"


    // $ANTLR start "rule__Location__Group__2"
    // InternalTwitterQA.g:1808:1: rule__Location__Group__2 : rule__Location__Group__2__Impl rule__Location__Group__3 ;
    public final void rule__Location__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1812:1: ( rule__Location__Group__2__Impl rule__Location__Group__3 )
            // InternalTwitterQA.g:1813:2: rule__Location__Group__2__Impl rule__Location__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Location__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2"


    // $ANTLR start "rule__Location__Group__2__Impl"
    // InternalTwitterQA.g:1820:1: rule__Location__Group__2__Impl : ( '{' ) ;
    public final void rule__Location__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1824:1: ( ( '{' ) )
            // InternalTwitterQA.g:1825:1: ( '{' )
            {
            // InternalTwitterQA.g:1825:1: ( '{' )
            // InternalTwitterQA.g:1826:2: '{'
            {
             before(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__2__Impl"


    // $ANTLR start "rule__Location__Group__3"
    // InternalTwitterQA.g:1835:1: rule__Location__Group__3 : rule__Location__Group__3__Impl rule__Location__Group__4 ;
    public final void rule__Location__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1839:1: ( rule__Location__Group__3__Impl rule__Location__Group__4 )
            // InternalTwitterQA.g:1840:2: rule__Location__Group__3__Impl rule__Location__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Location__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3"


    // $ANTLR start "rule__Location__Group__3__Impl"
    // InternalTwitterQA.g:1847:1: rule__Location__Group__3__Impl : ( 'latitude' ) ;
    public final void rule__Location__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1851:1: ( ( 'latitude' ) )
            // InternalTwitterQA.g:1852:1: ( 'latitude' )
            {
            // InternalTwitterQA.g:1852:1: ( 'latitude' )
            // InternalTwitterQA.g:1853:2: 'latitude'
            {
             before(grammarAccess.getLocationAccess().getLatitudeKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLatitudeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__3__Impl"


    // $ANTLR start "rule__Location__Group__4"
    // InternalTwitterQA.g:1862:1: rule__Location__Group__4 : rule__Location__Group__4__Impl rule__Location__Group__5 ;
    public final void rule__Location__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1866:1: ( rule__Location__Group__4__Impl rule__Location__Group__5 )
            // InternalTwitterQA.g:1867:2: rule__Location__Group__4__Impl rule__Location__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Location__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4"


    // $ANTLR start "rule__Location__Group__4__Impl"
    // InternalTwitterQA.g:1874:1: rule__Location__Group__4__Impl : ( 'is' ) ;
    public final void rule__Location__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1878:1: ( ( 'is' ) )
            // InternalTwitterQA.g:1879:1: ( 'is' )
            {
            // InternalTwitterQA.g:1879:1: ( 'is' )
            // InternalTwitterQA.g:1880:2: 'is'
            {
             before(grammarAccess.getLocationAccess().getIsKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getIsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__4__Impl"


    // $ANTLR start "rule__Location__Group__5"
    // InternalTwitterQA.g:1889:1: rule__Location__Group__5 : rule__Location__Group__5__Impl rule__Location__Group__6 ;
    public final void rule__Location__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1893:1: ( rule__Location__Group__5__Impl rule__Location__Group__6 )
            // InternalTwitterQA.g:1894:2: rule__Location__Group__5__Impl rule__Location__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Location__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__5"


    // $ANTLR start "rule__Location__Group__5__Impl"
    // InternalTwitterQA.g:1901:1: rule__Location__Group__5__Impl : ( ( rule__Location__LatitudeAssignment_5 ) ) ;
    public final void rule__Location__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1905:1: ( ( ( rule__Location__LatitudeAssignment_5 ) ) )
            // InternalTwitterQA.g:1906:1: ( ( rule__Location__LatitudeAssignment_5 ) )
            {
            // InternalTwitterQA.g:1906:1: ( ( rule__Location__LatitudeAssignment_5 ) )
            // InternalTwitterQA.g:1907:2: ( rule__Location__LatitudeAssignment_5 )
            {
             before(grammarAccess.getLocationAccess().getLatitudeAssignment_5()); 
            // InternalTwitterQA.g:1908:2: ( rule__Location__LatitudeAssignment_5 )
            // InternalTwitterQA.g:1908:3: rule__Location__LatitudeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Location__LatitudeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getLatitudeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__5__Impl"


    // $ANTLR start "rule__Location__Group__6"
    // InternalTwitterQA.g:1916:1: rule__Location__Group__6 : rule__Location__Group__6__Impl rule__Location__Group__7 ;
    public final void rule__Location__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1920:1: ( rule__Location__Group__6__Impl rule__Location__Group__7 )
            // InternalTwitterQA.g:1921:2: rule__Location__Group__6__Impl rule__Location__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Location__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__6"


    // $ANTLR start "rule__Location__Group__6__Impl"
    // InternalTwitterQA.g:1928:1: rule__Location__Group__6__Impl : ( 'longitude' ) ;
    public final void rule__Location__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1932:1: ( ( 'longitude' ) )
            // InternalTwitterQA.g:1933:1: ( 'longitude' )
            {
            // InternalTwitterQA.g:1933:1: ( 'longitude' )
            // InternalTwitterQA.g:1934:2: 'longitude'
            {
             before(grammarAccess.getLocationAccess().getLongitudeKeyword_6()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getLongitudeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__6__Impl"


    // $ANTLR start "rule__Location__Group__7"
    // InternalTwitterQA.g:1943:1: rule__Location__Group__7 : rule__Location__Group__7__Impl rule__Location__Group__8 ;
    public final void rule__Location__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1947:1: ( rule__Location__Group__7__Impl rule__Location__Group__8 )
            // InternalTwitterQA.g:1948:2: rule__Location__Group__7__Impl rule__Location__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Location__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__7"


    // $ANTLR start "rule__Location__Group__7__Impl"
    // InternalTwitterQA.g:1955:1: rule__Location__Group__7__Impl : ( 'is' ) ;
    public final void rule__Location__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1959:1: ( ( 'is' ) )
            // InternalTwitterQA.g:1960:1: ( 'is' )
            {
            // InternalTwitterQA.g:1960:1: ( 'is' )
            // InternalTwitterQA.g:1961:2: 'is'
            {
             before(grammarAccess.getLocationAccess().getIsKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getIsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__7__Impl"


    // $ANTLR start "rule__Location__Group__8"
    // InternalTwitterQA.g:1970:1: rule__Location__Group__8 : rule__Location__Group__8__Impl rule__Location__Group__9 ;
    public final void rule__Location__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1974:1: ( rule__Location__Group__8__Impl rule__Location__Group__9 )
            // InternalTwitterQA.g:1975:2: rule__Location__Group__8__Impl rule__Location__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__Location__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Location__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__8"


    // $ANTLR start "rule__Location__Group__8__Impl"
    // InternalTwitterQA.g:1982:1: rule__Location__Group__8__Impl : ( ( rule__Location__LongitudeAssignment_8 ) ) ;
    public final void rule__Location__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:1986:1: ( ( ( rule__Location__LongitudeAssignment_8 ) ) )
            // InternalTwitterQA.g:1987:1: ( ( rule__Location__LongitudeAssignment_8 ) )
            {
            // InternalTwitterQA.g:1987:1: ( ( rule__Location__LongitudeAssignment_8 ) )
            // InternalTwitterQA.g:1988:2: ( rule__Location__LongitudeAssignment_8 )
            {
             before(grammarAccess.getLocationAccess().getLongitudeAssignment_8()); 
            // InternalTwitterQA.g:1989:2: ( rule__Location__LongitudeAssignment_8 )
            // InternalTwitterQA.g:1989:3: rule__Location__LongitudeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Location__LongitudeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getLocationAccess().getLongitudeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__8__Impl"


    // $ANTLR start "rule__Location__Group__9"
    // InternalTwitterQA.g:1997:1: rule__Location__Group__9 : rule__Location__Group__9__Impl ;
    public final void rule__Location__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2001:1: ( rule__Location__Group__9__Impl )
            // InternalTwitterQA.g:2002:2: rule__Location__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Location__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__9"


    // $ANTLR start "rule__Location__Group__9__Impl"
    // InternalTwitterQA.g:2008:1: rule__Location__Group__9__Impl : ( '}' ) ;
    public final void rule__Location__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2012:1: ( ( '}' ) )
            // InternalTwitterQA.g:2013:1: ( '}' )
            {
            // InternalTwitterQA.g:2013:1: ( '}' )
            // InternalTwitterQA.g:2014:2: '}'
            {
             before(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__Group__9__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // InternalTwitterQA.g:2024:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2028:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalTwitterQA.g:2029:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalTwitterQA.g:2036:1: rule__Test__Group__0__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2040:1: ( ( 'Test' ) )
            // InternalTwitterQA.g:2041:1: ( 'Test' )
            {
            // InternalTwitterQA.g:2041:1: ( 'Test' )
            // InternalTwitterQA.g:2042:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalTwitterQA.g:2051:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2055:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalTwitterQA.g:2056:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalTwitterQA.g:2063:1: rule__Test__Group__1__Impl : ( ( rule__Test__NameAssignment_1 ) ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2067:1: ( ( ( rule__Test__NameAssignment_1 ) ) )
            // InternalTwitterQA.g:2068:1: ( ( rule__Test__NameAssignment_1 ) )
            {
            // InternalTwitterQA.g:2068:1: ( ( rule__Test__NameAssignment_1 ) )
            // InternalTwitterQA.g:2069:2: ( rule__Test__NameAssignment_1 )
            {
             before(grammarAccess.getTestAccess().getNameAssignment_1()); 
            // InternalTwitterQA.g:2070:2: ( rule__Test__NameAssignment_1 )
            // InternalTwitterQA.g:2070:3: rule__Test__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalTwitterQA.g:2078:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2082:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalTwitterQA.g:2083:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalTwitterQA.g:2090:1: rule__Test__Group__2__Impl : ( '{' ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2094:1: ( ( '{' ) )
            // InternalTwitterQA.g:2095:1: ( '{' )
            {
            // InternalTwitterQA.g:2095:1: ( '{' )
            // InternalTwitterQA.g:2096:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalTwitterQA.g:2105:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2109:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalTwitterQA.g:2110:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalTwitterQA.g:2117:1: rule__Test__Group__3__Impl : ( 'question' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2121:1: ( ( 'question' ) )
            // InternalTwitterQA.g:2122:1: ( 'question' )
            {
            // InternalTwitterQA.g:2122:1: ( 'question' )
            // InternalTwitterQA.g:2123:2: 'question'
            {
             before(grammarAccess.getTestAccess().getQuestionKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getQuestionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // InternalTwitterQA.g:2132:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2136:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalTwitterQA.g:2137:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalTwitterQA.g:2144:1: rule__Test__Group__4__Impl : ( 'is' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2148:1: ( ( 'is' ) )
            // InternalTwitterQA.g:2149:1: ( 'is' )
            {
            // InternalTwitterQA.g:2149:1: ( 'is' )
            // InternalTwitterQA.g:2150:2: 'is'
            {
             before(grammarAccess.getTestAccess().getIsKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // InternalTwitterQA.g:2159:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2163:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalTwitterQA.g:2164:2: rule__Test__Group__5__Impl rule__Test__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Test__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // InternalTwitterQA.g:2171:1: rule__Test__Group__5__Impl : ( ( rule__Test__QuestionAssignment_5 ) ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2175:1: ( ( ( rule__Test__QuestionAssignment_5 ) ) )
            // InternalTwitterQA.g:2176:1: ( ( rule__Test__QuestionAssignment_5 ) )
            {
            // InternalTwitterQA.g:2176:1: ( ( rule__Test__QuestionAssignment_5 ) )
            // InternalTwitterQA.g:2177:2: ( rule__Test__QuestionAssignment_5 )
            {
             before(grammarAccess.getTestAccess().getQuestionAssignment_5()); 
            // InternalTwitterQA.g:2178:2: ( rule__Test__QuestionAssignment_5 )
            // InternalTwitterQA.g:2178:3: rule__Test__QuestionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Test__QuestionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getQuestionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__Test__Group__6"
    // InternalTwitterQA.g:2186:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2190:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalTwitterQA.g:2191:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6"


    // $ANTLR start "rule__Test__Group__6__Impl"
    // InternalTwitterQA.g:2198:1: rule__Test__Group__6__Impl : ( 'order' ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2202:1: ( ( 'order' ) )
            // InternalTwitterQA.g:2203:1: ( 'order' )
            {
            // InternalTwitterQA.g:2203:1: ( 'order' )
            // InternalTwitterQA.g:2204:2: 'order'
            {
             before(grammarAccess.getTestAccess().getOrderKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getOrderKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6__Impl"


    // $ANTLR start "rule__Test__Group__7"
    // InternalTwitterQA.g:2213:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2217:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalTwitterQA.g:2218:2: rule__Test__Group__7__Impl rule__Test__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__Test__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7"


    // $ANTLR start "rule__Test__Group__7__Impl"
    // InternalTwitterQA.g:2225:1: rule__Test__Group__7__Impl : ( 'is' ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2229:1: ( ( 'is' ) )
            // InternalTwitterQA.g:2230:1: ( 'is' )
            {
            // InternalTwitterQA.g:2230:1: ( 'is' )
            // InternalTwitterQA.g:2231:2: 'is'
            {
             before(grammarAccess.getTestAccess().getIsKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7__Impl"


    // $ANTLR start "rule__Test__Group__8"
    // InternalTwitterQA.g:2240:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2244:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalTwitterQA.g:2245:2: rule__Test__Group__8__Impl rule__Test__Group__9
            {
            pushFollow(FOLLOW_31);
            rule__Test__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8"


    // $ANTLR start "rule__Test__Group__8__Impl"
    // InternalTwitterQA.g:2252:1: rule__Test__Group__8__Impl : ( ( rule__Test__OrderAssignment_8 ) ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2256:1: ( ( ( rule__Test__OrderAssignment_8 ) ) )
            // InternalTwitterQA.g:2257:1: ( ( rule__Test__OrderAssignment_8 ) )
            {
            // InternalTwitterQA.g:2257:1: ( ( rule__Test__OrderAssignment_8 ) )
            // InternalTwitterQA.g:2258:2: ( rule__Test__OrderAssignment_8 )
            {
             before(grammarAccess.getTestAccess().getOrderAssignment_8()); 
            // InternalTwitterQA.g:2259:2: ( rule__Test__OrderAssignment_8 )
            // InternalTwitterQA.g:2259:3: rule__Test__OrderAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Test__OrderAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getOrderAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8__Impl"


    // $ANTLR start "rule__Test__Group__9"
    // InternalTwitterQA.g:2267:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2271:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalTwitterQA.g:2272:2: rule__Test__Group__9__Impl rule__Test__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Test__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9"


    // $ANTLR start "rule__Test__Group__9__Impl"
    // InternalTwitterQA.g:2279:1: rule__Test__Group__9__Impl : ( 'answers' ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2283:1: ( ( 'answers' ) )
            // InternalTwitterQA.g:2284:1: ( 'answers' )
            {
            // InternalTwitterQA.g:2284:1: ( 'answers' )
            // InternalTwitterQA.g:2285:2: 'answers'
            {
             before(grammarAccess.getTestAccess().getAnswersKeyword_9()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getAnswersKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9__Impl"


    // $ANTLR start "rule__Test__Group__10"
    // InternalTwitterQA.g:2294:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2298:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalTwitterQA.g:2299:2: rule__Test__Group__10__Impl rule__Test__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Test__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__10"


    // $ANTLR start "rule__Test__Group__10__Impl"
    // InternalTwitterQA.g:2306:1: rule__Test__Group__10__Impl : ( 'are' ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2310:1: ( ( 'are' ) )
            // InternalTwitterQA.g:2311:1: ( 'are' )
            {
            // InternalTwitterQA.g:2311:1: ( 'are' )
            // InternalTwitterQA.g:2312:2: 'are'
            {
             before(grammarAccess.getTestAccess().getAreKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getAreKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__10__Impl"


    // $ANTLR start "rule__Test__Group__11"
    // InternalTwitterQA.g:2321:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2325:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalTwitterQA.g:2326:2: rule__Test__Group__11__Impl rule__Test__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__11"


    // $ANTLR start "rule__Test__Group__11__Impl"
    // InternalTwitterQA.g:2333:1: rule__Test__Group__11__Impl : ( '[' ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2337:1: ( ( '[' ) )
            // InternalTwitterQA.g:2338:1: ( '[' )
            {
            // InternalTwitterQA.g:2338:1: ( '[' )
            // InternalTwitterQA.g:2339:2: '['
            {
             before(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_11()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__11__Impl"


    // $ANTLR start "rule__Test__Group__12"
    // InternalTwitterQA.g:2348:1: rule__Test__Group__12 : rule__Test__Group__12__Impl rule__Test__Group__13 ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2352:1: ( rule__Test__Group__12__Impl rule__Test__Group__13 )
            // InternalTwitterQA.g:2353:2: rule__Test__Group__12__Impl rule__Test__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Test__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__12"


    // $ANTLR start "rule__Test__Group__12__Impl"
    // InternalTwitterQA.g:2360:1: rule__Test__Group__12__Impl : ( ( rule__Test__AnswersAssignment_12 ) ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2364:1: ( ( ( rule__Test__AnswersAssignment_12 ) ) )
            // InternalTwitterQA.g:2365:1: ( ( rule__Test__AnswersAssignment_12 ) )
            {
            // InternalTwitterQA.g:2365:1: ( ( rule__Test__AnswersAssignment_12 ) )
            // InternalTwitterQA.g:2366:2: ( rule__Test__AnswersAssignment_12 )
            {
             before(grammarAccess.getTestAccess().getAnswersAssignment_12()); 
            // InternalTwitterQA.g:2367:2: ( rule__Test__AnswersAssignment_12 )
            // InternalTwitterQA.g:2367:3: rule__Test__AnswersAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Test__AnswersAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getAnswersAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__12__Impl"


    // $ANTLR start "rule__Test__Group__13"
    // InternalTwitterQA.g:2375:1: rule__Test__Group__13 : rule__Test__Group__13__Impl rule__Test__Group__14 ;
    public final void rule__Test__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2379:1: ( rule__Test__Group__13__Impl rule__Test__Group__14 )
            // InternalTwitterQA.g:2380:2: rule__Test__Group__13__Impl rule__Test__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Test__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__13"


    // $ANTLR start "rule__Test__Group__13__Impl"
    // InternalTwitterQA.g:2387:1: rule__Test__Group__13__Impl : ( ( rule__Test__Group_13__0 )* ) ;
    public final void rule__Test__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2391:1: ( ( ( rule__Test__Group_13__0 )* ) )
            // InternalTwitterQA.g:2392:1: ( ( rule__Test__Group_13__0 )* )
            {
            // InternalTwitterQA.g:2392:1: ( ( rule__Test__Group_13__0 )* )
            // InternalTwitterQA.g:2393:2: ( rule__Test__Group_13__0 )*
            {
             before(grammarAccess.getTestAccess().getGroup_13()); 
            // InternalTwitterQA.g:2394:2: ( rule__Test__Group_13__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTwitterQA.g:2394:3: rule__Test__Group_13__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Test__Group_13__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__13__Impl"


    // $ANTLR start "rule__Test__Group__14"
    // InternalTwitterQA.g:2402:1: rule__Test__Group__14 : rule__Test__Group__14__Impl rule__Test__Group__15 ;
    public final void rule__Test__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2406:1: ( rule__Test__Group__14__Impl rule__Test__Group__15 )
            // InternalTwitterQA.g:2407:2: rule__Test__Group__14__Impl rule__Test__Group__15
            {
            pushFollow(FOLLOW_32);
            rule__Test__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__14"


    // $ANTLR start "rule__Test__Group__14__Impl"
    // InternalTwitterQA.g:2414:1: rule__Test__Group__14__Impl : ( ']' ) ;
    public final void rule__Test__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2418:1: ( ( ']' ) )
            // InternalTwitterQA.g:2419:1: ( ']' )
            {
            // InternalTwitterQA.g:2419:1: ( ']' )
            // InternalTwitterQA.g:2420:2: ']'
            {
             before(grammarAccess.getTestAccess().getRightSquareBracketKeyword_14()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightSquareBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__14__Impl"


    // $ANTLR start "rule__Test__Group__15"
    // InternalTwitterQA.g:2429:1: rule__Test__Group__15 : rule__Test__Group__15__Impl rule__Test__Group__16 ;
    public final void rule__Test__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2433:1: ( rule__Test__Group__15__Impl rule__Test__Group__16 )
            // InternalTwitterQA.g:2434:2: rule__Test__Group__15__Impl rule__Test__Group__16
            {
            pushFollow(FOLLOW_32);
            rule__Test__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__15"


    // $ANTLR start "rule__Test__Group__15__Impl"
    // InternalTwitterQA.g:2441:1: rule__Test__Group__15__Impl : ( ( rule__Test__Group_15__0 )? ) ;
    public final void rule__Test__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2445:1: ( ( ( rule__Test__Group_15__0 )? ) )
            // InternalTwitterQA.g:2446:1: ( ( rule__Test__Group_15__0 )? )
            {
            // InternalTwitterQA.g:2446:1: ( ( rule__Test__Group_15__0 )? )
            // InternalTwitterQA.g:2447:2: ( rule__Test__Group_15__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_15()); 
            // InternalTwitterQA.g:2448:2: ( rule__Test__Group_15__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==44) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTwitterQA.g:2448:3: rule__Test__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__15__Impl"


    // $ANTLR start "rule__Test__Group__16"
    // InternalTwitterQA.g:2456:1: rule__Test__Group__16 : rule__Test__Group__16__Impl rule__Test__Group__17 ;
    public final void rule__Test__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2460:1: ( rule__Test__Group__16__Impl rule__Test__Group__17 )
            // InternalTwitterQA.g:2461:2: rule__Test__Group__16__Impl rule__Test__Group__17
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__16"


    // $ANTLR start "rule__Test__Group__16__Impl"
    // InternalTwitterQA.g:2468:1: rule__Test__Group__16__Impl : ( 'timelimit' ) ;
    public final void rule__Test__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2472:1: ( ( 'timelimit' ) )
            // InternalTwitterQA.g:2473:1: ( 'timelimit' )
            {
            // InternalTwitterQA.g:2473:1: ( 'timelimit' )
            // InternalTwitterQA.g:2474:2: 'timelimit'
            {
             before(grammarAccess.getTestAccess().getTimelimitKeyword_16()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTimelimitKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__16__Impl"


    // $ANTLR start "rule__Test__Group__17"
    // InternalTwitterQA.g:2483:1: rule__Test__Group__17 : rule__Test__Group__17__Impl rule__Test__Group__18 ;
    public final void rule__Test__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2487:1: ( rule__Test__Group__17__Impl rule__Test__Group__18 )
            // InternalTwitterQA.g:2488:2: rule__Test__Group__17__Impl rule__Test__Group__18
            {
            pushFollow(FOLLOW_30);
            rule__Test__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__17"


    // $ANTLR start "rule__Test__Group__17__Impl"
    // InternalTwitterQA.g:2495:1: rule__Test__Group__17__Impl : ( 'is' ) ;
    public final void rule__Test__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2499:1: ( ( 'is' ) )
            // InternalTwitterQA.g:2500:1: ( 'is' )
            {
            // InternalTwitterQA.g:2500:1: ( 'is' )
            // InternalTwitterQA.g:2501:2: 'is'
            {
             before(grammarAccess.getTestAccess().getIsKeyword_17()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIsKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__17__Impl"


    // $ANTLR start "rule__Test__Group__18"
    // InternalTwitterQA.g:2510:1: rule__Test__Group__18 : rule__Test__Group__18__Impl rule__Test__Group__19 ;
    public final void rule__Test__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2514:1: ( rule__Test__Group__18__Impl rule__Test__Group__19 )
            // InternalTwitterQA.g:2515:2: rule__Test__Group__18__Impl rule__Test__Group__19
            {
            pushFollow(FOLLOW_33);
            rule__Test__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__18"


    // $ANTLR start "rule__Test__Group__18__Impl"
    // InternalTwitterQA.g:2522:1: rule__Test__Group__18__Impl : ( ( rule__Test__TimelimitAssignment_18 ) ) ;
    public final void rule__Test__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2526:1: ( ( ( rule__Test__TimelimitAssignment_18 ) ) )
            // InternalTwitterQA.g:2527:1: ( ( rule__Test__TimelimitAssignment_18 ) )
            {
            // InternalTwitterQA.g:2527:1: ( ( rule__Test__TimelimitAssignment_18 ) )
            // InternalTwitterQA.g:2528:2: ( rule__Test__TimelimitAssignment_18 )
            {
             before(grammarAccess.getTestAccess().getTimelimitAssignment_18()); 
            // InternalTwitterQA.g:2529:2: ( rule__Test__TimelimitAssignment_18 )
            // InternalTwitterQA.g:2529:3: rule__Test__TimelimitAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Test__TimelimitAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getTimelimitAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__18__Impl"


    // $ANTLR start "rule__Test__Group__19"
    // InternalTwitterQA.g:2537:1: rule__Test__Group__19 : rule__Test__Group__19__Impl rule__Test__Group__20 ;
    public final void rule__Test__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2541:1: ( rule__Test__Group__19__Impl rule__Test__Group__20 )
            // InternalTwitterQA.g:2542:2: rule__Test__Group__19__Impl rule__Test__Group__20
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__19"


    // $ANTLR start "rule__Test__Group__19__Impl"
    // InternalTwitterQA.g:2549:1: rule__Test__Group__19__Impl : ( 'attempts' ) ;
    public final void rule__Test__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2553:1: ( ( 'attempts' ) )
            // InternalTwitterQA.g:2554:1: ( 'attempts' )
            {
            // InternalTwitterQA.g:2554:1: ( 'attempts' )
            // InternalTwitterQA.g:2555:2: 'attempts'
            {
             before(grammarAccess.getTestAccess().getAttemptsKeyword_19()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getAttemptsKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__19__Impl"


    // $ANTLR start "rule__Test__Group__20"
    // InternalTwitterQA.g:2564:1: rule__Test__Group__20 : rule__Test__Group__20__Impl rule__Test__Group__21 ;
    public final void rule__Test__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2568:1: ( rule__Test__Group__20__Impl rule__Test__Group__21 )
            // InternalTwitterQA.g:2569:2: rule__Test__Group__20__Impl rule__Test__Group__21
            {
            pushFollow(FOLLOW_30);
            rule__Test__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__20"


    // $ANTLR start "rule__Test__Group__20__Impl"
    // InternalTwitterQA.g:2576:1: rule__Test__Group__20__Impl : ( 'is' ) ;
    public final void rule__Test__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2580:1: ( ( 'is' ) )
            // InternalTwitterQA.g:2581:1: ( 'is' )
            {
            // InternalTwitterQA.g:2581:1: ( 'is' )
            // InternalTwitterQA.g:2582:2: 'is'
            {
             before(grammarAccess.getTestAccess().getIsKeyword_20()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIsKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__20__Impl"


    // $ANTLR start "rule__Test__Group__21"
    // InternalTwitterQA.g:2591:1: rule__Test__Group__21 : rule__Test__Group__21__Impl rule__Test__Group__22 ;
    public final void rule__Test__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2595:1: ( rule__Test__Group__21__Impl rule__Test__Group__22 )
            // InternalTwitterQA.g:2596:2: rule__Test__Group__21__Impl rule__Test__Group__22
            {
            pushFollow(FOLLOW_34);
            rule__Test__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__21"


    // $ANTLR start "rule__Test__Group__21__Impl"
    // InternalTwitterQA.g:2603:1: rule__Test__Group__21__Impl : ( ( rule__Test__AttemptsAssignment_21 ) ) ;
    public final void rule__Test__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2607:1: ( ( ( rule__Test__AttemptsAssignment_21 ) ) )
            // InternalTwitterQA.g:2608:1: ( ( rule__Test__AttemptsAssignment_21 ) )
            {
            // InternalTwitterQA.g:2608:1: ( ( rule__Test__AttemptsAssignment_21 ) )
            // InternalTwitterQA.g:2609:2: ( rule__Test__AttemptsAssignment_21 )
            {
             before(grammarAccess.getTestAccess().getAttemptsAssignment_21()); 
            // InternalTwitterQA.g:2610:2: ( rule__Test__AttemptsAssignment_21 )
            // InternalTwitterQA.g:2610:3: rule__Test__AttemptsAssignment_21
            {
            pushFollow(FOLLOW_2);
            rule__Test__AttemptsAssignment_21();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getAttemptsAssignment_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__21__Impl"


    // $ANTLR start "rule__Test__Group__22"
    // InternalTwitterQA.g:2618:1: rule__Test__Group__22 : rule__Test__Group__22__Impl rule__Test__Group__23 ;
    public final void rule__Test__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2622:1: ( rule__Test__Group__22__Impl rule__Test__Group__23 )
            // InternalTwitterQA.g:2623:2: rule__Test__Group__22__Impl rule__Test__Group__23
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__22"


    // $ANTLR start "rule__Test__Group__22__Impl"
    // InternalTwitterQA.g:2630:1: rule__Test__Group__22__Impl : ( 'reward' ) ;
    public final void rule__Test__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2634:1: ( ( 'reward' ) )
            // InternalTwitterQA.g:2635:1: ( 'reward' )
            {
            // InternalTwitterQA.g:2635:1: ( 'reward' )
            // InternalTwitterQA.g:2636:2: 'reward'
            {
             before(grammarAccess.getTestAccess().getRewardKeyword_22()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRewardKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__22__Impl"


    // $ANTLR start "rule__Test__Group__23"
    // InternalTwitterQA.g:2645:1: rule__Test__Group__23 : rule__Test__Group__23__Impl rule__Test__Group__24 ;
    public final void rule__Test__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2649:1: ( rule__Test__Group__23__Impl rule__Test__Group__24 )
            // InternalTwitterQA.g:2650:2: rule__Test__Group__23__Impl rule__Test__Group__24
            {
            pushFollow(FOLLOW_30);
            rule__Test__Group__23__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__24();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__23"


    // $ANTLR start "rule__Test__Group__23__Impl"
    // InternalTwitterQA.g:2657:1: rule__Test__Group__23__Impl : ( 'is' ) ;
    public final void rule__Test__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2661:1: ( ( 'is' ) )
            // InternalTwitterQA.g:2662:1: ( 'is' )
            {
            // InternalTwitterQA.g:2662:1: ( 'is' )
            // InternalTwitterQA.g:2663:2: 'is'
            {
             before(grammarAccess.getTestAccess().getIsKeyword_23()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIsKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__23__Impl"


    // $ANTLR start "rule__Test__Group__24"
    // InternalTwitterQA.g:2672:1: rule__Test__Group__24 : rule__Test__Group__24__Impl rule__Test__Group__25 ;
    public final void rule__Test__Group__24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2676:1: ( rule__Test__Group__24__Impl rule__Test__Group__25 )
            // InternalTwitterQA.g:2677:2: rule__Test__Group__24__Impl rule__Test__Group__25
            {
            pushFollow(FOLLOW_35);
            rule__Test__Group__24__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__25();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__24"


    // $ANTLR start "rule__Test__Group__24__Impl"
    // InternalTwitterQA.g:2684:1: rule__Test__Group__24__Impl : ( ( rule__Test__RewardAssignment_24 ) ) ;
    public final void rule__Test__Group__24__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2688:1: ( ( ( rule__Test__RewardAssignment_24 ) ) )
            // InternalTwitterQA.g:2689:1: ( ( rule__Test__RewardAssignment_24 ) )
            {
            // InternalTwitterQA.g:2689:1: ( ( rule__Test__RewardAssignment_24 ) )
            // InternalTwitterQA.g:2690:2: ( rule__Test__RewardAssignment_24 )
            {
             before(grammarAccess.getTestAccess().getRewardAssignment_24()); 
            // InternalTwitterQA.g:2691:2: ( rule__Test__RewardAssignment_24 )
            // InternalTwitterQA.g:2691:3: rule__Test__RewardAssignment_24
            {
            pushFollow(FOLLOW_2);
            rule__Test__RewardAssignment_24();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getRewardAssignment_24()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__24__Impl"


    // $ANTLR start "rule__Test__Group__25"
    // InternalTwitterQA.g:2699:1: rule__Test__Group__25 : rule__Test__Group__25__Impl rule__Test__Group__26 ;
    public final void rule__Test__Group__25() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2703:1: ( rule__Test__Group__25__Impl rule__Test__Group__26 )
            // InternalTwitterQA.g:2704:2: rule__Test__Group__25__Impl rule__Test__Group__26
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__25__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__26();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__25"


    // $ANTLR start "rule__Test__Group__25__Impl"
    // InternalTwitterQA.g:2711:1: rule__Test__Group__25__Impl : ( 'location' ) ;
    public final void rule__Test__Group__25__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2715:1: ( ( 'location' ) )
            // InternalTwitterQA.g:2716:1: ( 'location' )
            {
            // InternalTwitterQA.g:2716:1: ( 'location' )
            // InternalTwitterQA.g:2717:2: 'location'
            {
             before(grammarAccess.getTestAccess().getLocationKeyword_25()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLocationKeyword_25()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__25__Impl"


    // $ANTLR start "rule__Test__Group__26"
    // InternalTwitterQA.g:2726:1: rule__Test__Group__26 : rule__Test__Group__26__Impl rule__Test__Group__27 ;
    public final void rule__Test__Group__26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2730:1: ( rule__Test__Group__26__Impl rule__Test__Group__27 )
            // InternalTwitterQA.g:2731:2: rule__Test__Group__26__Impl rule__Test__Group__27
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__26__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__27();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__26"


    // $ANTLR start "rule__Test__Group__26__Impl"
    // InternalTwitterQA.g:2738:1: rule__Test__Group__26__Impl : ( 'is' ) ;
    public final void rule__Test__Group__26__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2742:1: ( ( 'is' ) )
            // InternalTwitterQA.g:2743:1: ( 'is' )
            {
            // InternalTwitterQA.g:2743:1: ( 'is' )
            // InternalTwitterQA.g:2744:2: 'is'
            {
             before(grammarAccess.getTestAccess().getIsKeyword_26()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIsKeyword_26()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__26__Impl"


    // $ANTLR start "rule__Test__Group__27"
    // InternalTwitterQA.g:2753:1: rule__Test__Group__27 : rule__Test__Group__27__Impl rule__Test__Group__28 ;
    public final void rule__Test__Group__27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2757:1: ( rule__Test__Group__27__Impl rule__Test__Group__28 )
            // InternalTwitterQA.g:2758:2: rule__Test__Group__27__Impl rule__Test__Group__28
            {
            pushFollow(FOLLOW_36);
            rule__Test__Group__27__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__28();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__27"


    // $ANTLR start "rule__Test__Group__27__Impl"
    // InternalTwitterQA.g:2765:1: rule__Test__Group__27__Impl : ( ( rule__Test__LocationAssignment_27 ) ) ;
    public final void rule__Test__Group__27__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2769:1: ( ( ( rule__Test__LocationAssignment_27 ) ) )
            // InternalTwitterQA.g:2770:1: ( ( rule__Test__LocationAssignment_27 ) )
            {
            // InternalTwitterQA.g:2770:1: ( ( rule__Test__LocationAssignment_27 ) )
            // InternalTwitterQA.g:2771:2: ( rule__Test__LocationAssignment_27 )
            {
             before(grammarAccess.getTestAccess().getLocationAssignment_27()); 
            // InternalTwitterQA.g:2772:2: ( rule__Test__LocationAssignment_27 )
            // InternalTwitterQA.g:2772:3: rule__Test__LocationAssignment_27
            {
            pushFollow(FOLLOW_2);
            rule__Test__LocationAssignment_27();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getLocationAssignment_27()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__27__Impl"


    // $ANTLR start "rule__Test__Group__28"
    // InternalTwitterQA.g:2780:1: rule__Test__Group__28 : rule__Test__Group__28__Impl rule__Test__Group__29 ;
    public final void rule__Test__Group__28() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2784:1: ( rule__Test__Group__28__Impl rule__Test__Group__29 )
            // InternalTwitterQA.g:2785:2: rule__Test__Group__28__Impl rule__Test__Group__29
            {
            pushFollow(FOLLOW_36);
            rule__Test__Group__28__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__29();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__28"


    // $ANTLR start "rule__Test__Group__28__Impl"
    // InternalTwitterQA.g:2792:1: rule__Test__Group__28__Impl : ( ( rule__Test__Group_28__0 )? ) ;
    public final void rule__Test__Group__28__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2796:1: ( ( ( rule__Test__Group_28__0 )? ) )
            // InternalTwitterQA.g:2797:1: ( ( rule__Test__Group_28__0 )? )
            {
            // InternalTwitterQA.g:2797:1: ( ( rule__Test__Group_28__0 )? )
            // InternalTwitterQA.g:2798:2: ( rule__Test__Group_28__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_28()); 
            // InternalTwitterQA.g:2799:2: ( rule__Test__Group_28__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==45) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTwitterQA.g:2799:3: rule__Test__Group_28__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_28__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_28()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__28__Impl"


    // $ANTLR start "rule__Test__Group__29"
    // InternalTwitterQA.g:2807:1: rule__Test__Group__29 : rule__Test__Group__29__Impl rule__Test__Group__30 ;
    public final void rule__Test__Group__29() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2811:1: ( rule__Test__Group__29__Impl rule__Test__Group__30 )
            // InternalTwitterQA.g:2812:2: rule__Test__Group__29__Impl rule__Test__Group__30
            {
            pushFollow(FOLLOW_36);
            rule__Test__Group__29__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__30();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__29"


    // $ANTLR start "rule__Test__Group__29__Impl"
    // InternalTwitterQA.g:2819:1: rule__Test__Group__29__Impl : ( ( rule__Test__Group_29__0 )? ) ;
    public final void rule__Test__Group__29__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2823:1: ( ( ( rule__Test__Group_29__0 )? ) )
            // InternalTwitterQA.g:2824:1: ( ( rule__Test__Group_29__0 )? )
            {
            // InternalTwitterQA.g:2824:1: ( ( rule__Test__Group_29__0 )? )
            // InternalTwitterQA.g:2825:2: ( rule__Test__Group_29__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_29()); 
            // InternalTwitterQA.g:2826:2: ( rule__Test__Group_29__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==46) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTwitterQA.g:2826:3: rule__Test__Group_29__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_29__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_29()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__29__Impl"


    // $ANTLR start "rule__Test__Group__30"
    // InternalTwitterQA.g:2834:1: rule__Test__Group__30 : rule__Test__Group__30__Impl rule__Test__Group__31 ;
    public final void rule__Test__Group__30() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2838:1: ( rule__Test__Group__30__Impl rule__Test__Group__31 )
            // InternalTwitterQA.g:2839:2: rule__Test__Group__30__Impl rule__Test__Group__31
            {
            pushFollow(FOLLOW_36);
            rule__Test__Group__30__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__31();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__30"


    // $ANTLR start "rule__Test__Group__30__Impl"
    // InternalTwitterQA.g:2846:1: rule__Test__Group__30__Impl : ( ( rule__Test__Group_30__0 )? ) ;
    public final void rule__Test__Group__30__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2850:1: ( ( ( rule__Test__Group_30__0 )? ) )
            // InternalTwitterQA.g:2851:1: ( ( rule__Test__Group_30__0 )? )
            {
            // InternalTwitterQA.g:2851:1: ( ( rule__Test__Group_30__0 )? )
            // InternalTwitterQA.g:2852:2: ( rule__Test__Group_30__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_30()); 
            // InternalTwitterQA.g:2853:2: ( rule__Test__Group_30__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==47) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTwitterQA.g:2853:3: rule__Test__Group_30__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_30__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_30()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__30__Impl"


    // $ANTLR start "rule__Test__Group__31"
    // InternalTwitterQA.g:2861:1: rule__Test__Group__31 : rule__Test__Group__31__Impl ;
    public final void rule__Test__Group__31() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2865:1: ( rule__Test__Group__31__Impl )
            // InternalTwitterQA.g:2866:2: rule__Test__Group__31__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__31__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__31"


    // $ANTLR start "rule__Test__Group__31__Impl"
    // InternalTwitterQA.g:2872:1: rule__Test__Group__31__Impl : ( '}' ) ;
    public final void rule__Test__Group__31__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2876:1: ( ( '}' ) )
            // InternalTwitterQA.g:2877:1: ( '}' )
            {
            // InternalTwitterQA.g:2877:1: ( '}' )
            // InternalTwitterQA.g:2878:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_31()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_31()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__31__Impl"


    // $ANTLR start "rule__Test__Group_13__0"
    // InternalTwitterQA.g:2888:1: rule__Test__Group_13__0 : rule__Test__Group_13__0__Impl rule__Test__Group_13__1 ;
    public final void rule__Test__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2892:1: ( rule__Test__Group_13__0__Impl rule__Test__Group_13__1 )
            // InternalTwitterQA.g:2893:2: rule__Test__Group_13__0__Impl rule__Test__Group_13__1
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_13__0"


    // $ANTLR start "rule__Test__Group_13__0__Impl"
    // InternalTwitterQA.g:2900:1: rule__Test__Group_13__0__Impl : ( ',' ) ;
    public final void rule__Test__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2904:1: ( ( ',' ) )
            // InternalTwitterQA.g:2905:1: ( ',' )
            {
            // InternalTwitterQA.g:2905:1: ( ',' )
            // InternalTwitterQA.g:2906:2: ','
            {
             before(grammarAccess.getTestAccess().getCommaKeyword_13_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getCommaKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_13__0__Impl"


    // $ANTLR start "rule__Test__Group_13__1"
    // InternalTwitterQA.g:2915:1: rule__Test__Group_13__1 : rule__Test__Group_13__1__Impl ;
    public final void rule__Test__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2919:1: ( rule__Test__Group_13__1__Impl )
            // InternalTwitterQA.g:2920:2: rule__Test__Group_13__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_13__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_13__1"


    // $ANTLR start "rule__Test__Group_13__1__Impl"
    // InternalTwitterQA.g:2926:1: rule__Test__Group_13__1__Impl : ( ( rule__Test__AnswersAssignment_13_1 ) ) ;
    public final void rule__Test__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2930:1: ( ( ( rule__Test__AnswersAssignment_13_1 ) ) )
            // InternalTwitterQA.g:2931:1: ( ( rule__Test__AnswersAssignment_13_1 ) )
            {
            // InternalTwitterQA.g:2931:1: ( ( rule__Test__AnswersAssignment_13_1 ) )
            // InternalTwitterQA.g:2932:2: ( rule__Test__AnswersAssignment_13_1 )
            {
             before(grammarAccess.getTestAccess().getAnswersAssignment_13_1()); 
            // InternalTwitterQA.g:2933:2: ( rule__Test__AnswersAssignment_13_1 )
            // InternalTwitterQA.g:2933:3: rule__Test__AnswersAssignment_13_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__AnswersAssignment_13_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getAnswersAssignment_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_13__1__Impl"


    // $ANTLR start "rule__Test__Group_15__0"
    // InternalTwitterQA.g:2942:1: rule__Test__Group_15__0 : rule__Test__Group_15__0__Impl rule__Test__Group_15__1 ;
    public final void rule__Test__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2946:1: ( rule__Test__Group_15__0__Impl rule__Test__Group_15__1 )
            // InternalTwitterQA.g:2947:2: rule__Test__Group_15__0__Impl rule__Test__Group_15__1
            {
            pushFollow(FOLLOW_12);
            rule__Test__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__0"


    // $ANTLR start "rule__Test__Group_15__0__Impl"
    // InternalTwitterQA.g:2954:1: rule__Test__Group_15__0__Impl : ( 'hints' ) ;
    public final void rule__Test__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2958:1: ( ( 'hints' ) )
            // InternalTwitterQA.g:2959:1: ( 'hints' )
            {
            // InternalTwitterQA.g:2959:1: ( 'hints' )
            // InternalTwitterQA.g:2960:2: 'hints'
            {
             before(grammarAccess.getTestAccess().getHintsKeyword_15_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getHintsKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__0__Impl"


    // $ANTLR start "rule__Test__Group_15__1"
    // InternalTwitterQA.g:2969:1: rule__Test__Group_15__1 : rule__Test__Group_15__1__Impl rule__Test__Group_15__2 ;
    public final void rule__Test__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2973:1: ( rule__Test__Group_15__1__Impl rule__Test__Group_15__2 )
            // InternalTwitterQA.g:2974:2: rule__Test__Group_15__1__Impl rule__Test__Group_15__2
            {
            pushFollow(FOLLOW_13);
            rule__Test__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__1"


    // $ANTLR start "rule__Test__Group_15__1__Impl"
    // InternalTwitterQA.g:2981:1: rule__Test__Group_15__1__Impl : ( 'are' ) ;
    public final void rule__Test__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:2985:1: ( ( 'are' ) )
            // InternalTwitterQA.g:2986:1: ( 'are' )
            {
            // InternalTwitterQA.g:2986:1: ( 'are' )
            // InternalTwitterQA.g:2987:2: 'are'
            {
             before(grammarAccess.getTestAccess().getAreKeyword_15_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getAreKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__1__Impl"


    // $ANTLR start "rule__Test__Group_15__2"
    // InternalTwitterQA.g:2996:1: rule__Test__Group_15__2 : rule__Test__Group_15__2__Impl rule__Test__Group_15__3 ;
    public final void rule__Test__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3000:1: ( rule__Test__Group_15__2__Impl rule__Test__Group_15__3 )
            // InternalTwitterQA.g:3001:2: rule__Test__Group_15__2__Impl rule__Test__Group_15__3
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__2"


    // $ANTLR start "rule__Test__Group_15__2__Impl"
    // InternalTwitterQA.g:3008:1: rule__Test__Group_15__2__Impl : ( '[' ) ;
    public final void rule__Test__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3012:1: ( ( '[' ) )
            // InternalTwitterQA.g:3013:1: ( '[' )
            {
            // InternalTwitterQA.g:3013:1: ( '[' )
            // InternalTwitterQA.g:3014:2: '['
            {
             before(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_15_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__2__Impl"


    // $ANTLR start "rule__Test__Group_15__3"
    // InternalTwitterQA.g:3023:1: rule__Test__Group_15__3 : rule__Test__Group_15__3__Impl rule__Test__Group_15__4 ;
    public final void rule__Test__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3027:1: ( rule__Test__Group_15__3__Impl rule__Test__Group_15__4 )
            // InternalTwitterQA.g:3028:2: rule__Test__Group_15__3__Impl rule__Test__Group_15__4
            {
            pushFollow(FOLLOW_15);
            rule__Test__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__3"


    // $ANTLR start "rule__Test__Group_15__3__Impl"
    // InternalTwitterQA.g:3035:1: rule__Test__Group_15__3__Impl : ( ( rule__Test__HintsAssignment_15_3 ) ) ;
    public final void rule__Test__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3039:1: ( ( ( rule__Test__HintsAssignment_15_3 ) ) )
            // InternalTwitterQA.g:3040:1: ( ( rule__Test__HintsAssignment_15_3 ) )
            {
            // InternalTwitterQA.g:3040:1: ( ( rule__Test__HintsAssignment_15_3 ) )
            // InternalTwitterQA.g:3041:2: ( rule__Test__HintsAssignment_15_3 )
            {
             before(grammarAccess.getTestAccess().getHintsAssignment_15_3()); 
            // InternalTwitterQA.g:3042:2: ( rule__Test__HintsAssignment_15_3 )
            // InternalTwitterQA.g:3042:3: rule__Test__HintsAssignment_15_3
            {
            pushFollow(FOLLOW_2);
            rule__Test__HintsAssignment_15_3();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getHintsAssignment_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__3__Impl"


    // $ANTLR start "rule__Test__Group_15__4"
    // InternalTwitterQA.g:3050:1: rule__Test__Group_15__4 : rule__Test__Group_15__4__Impl rule__Test__Group_15__5 ;
    public final void rule__Test__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3054:1: ( rule__Test__Group_15__4__Impl rule__Test__Group_15__5 )
            // InternalTwitterQA.g:3055:2: rule__Test__Group_15__4__Impl rule__Test__Group_15__5
            {
            pushFollow(FOLLOW_15);
            rule__Test__Group_15__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_15__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__4"


    // $ANTLR start "rule__Test__Group_15__4__Impl"
    // InternalTwitterQA.g:3062:1: rule__Test__Group_15__4__Impl : ( ( rule__Test__Group_15_4__0 )* ) ;
    public final void rule__Test__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3066:1: ( ( ( rule__Test__Group_15_4__0 )* ) )
            // InternalTwitterQA.g:3067:1: ( ( rule__Test__Group_15_4__0 )* )
            {
            // InternalTwitterQA.g:3067:1: ( ( rule__Test__Group_15_4__0 )* )
            // InternalTwitterQA.g:3068:2: ( rule__Test__Group_15_4__0 )*
            {
             before(grammarAccess.getTestAccess().getGroup_15_4()); 
            // InternalTwitterQA.g:3069:2: ( rule__Test__Group_15_4__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTwitterQA.g:3069:3: rule__Test__Group_15_4__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Test__Group_15_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getGroup_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__4__Impl"


    // $ANTLR start "rule__Test__Group_15__5"
    // InternalTwitterQA.g:3077:1: rule__Test__Group_15__5 : rule__Test__Group_15__5__Impl ;
    public final void rule__Test__Group_15__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3081:1: ( rule__Test__Group_15__5__Impl )
            // InternalTwitterQA.g:3082:2: rule__Test__Group_15__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_15__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__5"


    // $ANTLR start "rule__Test__Group_15__5__Impl"
    // InternalTwitterQA.g:3088:1: rule__Test__Group_15__5__Impl : ( ']' ) ;
    public final void rule__Test__Group_15__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3092:1: ( ( ']' ) )
            // InternalTwitterQA.g:3093:1: ( ']' )
            {
            // InternalTwitterQA.g:3093:1: ( ']' )
            // InternalTwitterQA.g:3094:2: ']'
            {
             before(grammarAccess.getTestAccess().getRightSquareBracketKeyword_15_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightSquareBracketKeyword_15_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15__5__Impl"


    // $ANTLR start "rule__Test__Group_15_4__0"
    // InternalTwitterQA.g:3104:1: rule__Test__Group_15_4__0 : rule__Test__Group_15_4__0__Impl rule__Test__Group_15_4__1 ;
    public final void rule__Test__Group_15_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3108:1: ( rule__Test__Group_15_4__0__Impl rule__Test__Group_15_4__1 )
            // InternalTwitterQA.g:3109:2: rule__Test__Group_15_4__0__Impl rule__Test__Group_15_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group_15_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_15_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15_4__0"


    // $ANTLR start "rule__Test__Group_15_4__0__Impl"
    // InternalTwitterQA.g:3116:1: rule__Test__Group_15_4__0__Impl : ( ',' ) ;
    public final void rule__Test__Group_15_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3120:1: ( ( ',' ) )
            // InternalTwitterQA.g:3121:1: ( ',' )
            {
            // InternalTwitterQA.g:3121:1: ( ',' )
            // InternalTwitterQA.g:3122:2: ','
            {
             before(grammarAccess.getTestAccess().getCommaKeyword_15_4_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getCommaKeyword_15_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15_4__0__Impl"


    // $ANTLR start "rule__Test__Group_15_4__1"
    // InternalTwitterQA.g:3131:1: rule__Test__Group_15_4__1 : rule__Test__Group_15_4__1__Impl ;
    public final void rule__Test__Group_15_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3135:1: ( rule__Test__Group_15_4__1__Impl )
            // InternalTwitterQA.g:3136:2: rule__Test__Group_15_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_15_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15_4__1"


    // $ANTLR start "rule__Test__Group_15_4__1__Impl"
    // InternalTwitterQA.g:3142:1: rule__Test__Group_15_4__1__Impl : ( ( rule__Test__HintsAssignment_15_4_1 ) ) ;
    public final void rule__Test__Group_15_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3146:1: ( ( ( rule__Test__HintsAssignment_15_4_1 ) ) )
            // InternalTwitterQA.g:3147:1: ( ( rule__Test__HintsAssignment_15_4_1 ) )
            {
            // InternalTwitterQA.g:3147:1: ( ( rule__Test__HintsAssignment_15_4_1 ) )
            // InternalTwitterQA.g:3148:2: ( rule__Test__HintsAssignment_15_4_1 )
            {
             before(grammarAccess.getTestAccess().getHintsAssignment_15_4_1()); 
            // InternalTwitterQA.g:3149:2: ( rule__Test__HintsAssignment_15_4_1 )
            // InternalTwitterQA.g:3149:3: rule__Test__HintsAssignment_15_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Test__HintsAssignment_15_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getHintsAssignment_15_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_15_4__1__Impl"


    // $ANTLR start "rule__Test__Group_28__0"
    // InternalTwitterQA.g:3158:1: rule__Test__Group_28__0 : rule__Test__Group_28__0__Impl rule__Test__Group_28__1 ;
    public final void rule__Test__Group_28__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3162:1: ( rule__Test__Group_28__0__Impl rule__Test__Group_28__1 )
            // InternalTwitterQA.g:3163:2: rule__Test__Group_28__0__Impl rule__Test__Group_28__1
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group_28__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_28__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_28__0"


    // $ANTLR start "rule__Test__Group_28__0__Impl"
    // InternalTwitterQA.g:3170:1: rule__Test__Group_28__0__Impl : ( 'on_correct' ) ;
    public final void rule__Test__Group_28__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3174:1: ( ( 'on_correct' ) )
            // InternalTwitterQA.g:3175:1: ( 'on_correct' )
            {
            // InternalTwitterQA.g:3175:1: ( 'on_correct' )
            // InternalTwitterQA.g:3176:2: 'on_correct'
            {
             before(grammarAccess.getTestAccess().getOn_correctKeyword_28_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getOn_correctKeyword_28_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_28__0__Impl"


    // $ANTLR start "rule__Test__Group_28__1"
    // InternalTwitterQA.g:3185:1: rule__Test__Group_28__1 : rule__Test__Group_28__1__Impl rule__Test__Group_28__2 ;
    public final void rule__Test__Group_28__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3189:1: ( rule__Test__Group_28__1__Impl rule__Test__Group_28__2 )
            // InternalTwitterQA.g:3190:2: rule__Test__Group_28__1__Impl rule__Test__Group_28__2
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group_28__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_28__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_28__1"


    // $ANTLR start "rule__Test__Group_28__1__Impl"
    // InternalTwitterQA.g:3197:1: rule__Test__Group_28__1__Impl : ( 'is' ) ;
    public final void rule__Test__Group_28__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3201:1: ( ( 'is' ) )
            // InternalTwitterQA.g:3202:1: ( 'is' )
            {
            // InternalTwitterQA.g:3202:1: ( 'is' )
            // InternalTwitterQA.g:3203:2: 'is'
            {
             before(grammarAccess.getTestAccess().getIsKeyword_28_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIsKeyword_28_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_28__1__Impl"


    // $ANTLR start "rule__Test__Group_28__2"
    // InternalTwitterQA.g:3212:1: rule__Test__Group_28__2 : rule__Test__Group_28__2__Impl ;
    public final void rule__Test__Group_28__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3216:1: ( rule__Test__Group_28__2__Impl )
            // InternalTwitterQA.g:3217:2: rule__Test__Group_28__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_28__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_28__2"


    // $ANTLR start "rule__Test__Group_28__2__Impl"
    // InternalTwitterQA.g:3223:1: rule__Test__Group_28__2__Impl : ( ( rule__Test__On_correctAssignment_28_2 ) ) ;
    public final void rule__Test__Group_28__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3227:1: ( ( ( rule__Test__On_correctAssignment_28_2 ) ) )
            // InternalTwitterQA.g:3228:1: ( ( rule__Test__On_correctAssignment_28_2 ) )
            {
            // InternalTwitterQA.g:3228:1: ( ( rule__Test__On_correctAssignment_28_2 ) )
            // InternalTwitterQA.g:3229:2: ( rule__Test__On_correctAssignment_28_2 )
            {
             before(grammarAccess.getTestAccess().getOn_correctAssignment_28_2()); 
            // InternalTwitterQA.g:3230:2: ( rule__Test__On_correctAssignment_28_2 )
            // InternalTwitterQA.g:3230:3: rule__Test__On_correctAssignment_28_2
            {
            pushFollow(FOLLOW_2);
            rule__Test__On_correctAssignment_28_2();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getOn_correctAssignment_28_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_28__2__Impl"


    // $ANTLR start "rule__Test__Group_29__0"
    // InternalTwitterQA.g:3239:1: rule__Test__Group_29__0 : rule__Test__Group_29__0__Impl rule__Test__Group_29__1 ;
    public final void rule__Test__Group_29__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3243:1: ( rule__Test__Group_29__0__Impl rule__Test__Group_29__1 )
            // InternalTwitterQA.g:3244:2: rule__Test__Group_29__0__Impl rule__Test__Group_29__1
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group_29__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_29__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_29__0"


    // $ANTLR start "rule__Test__Group_29__0__Impl"
    // InternalTwitterQA.g:3251:1: rule__Test__Group_29__0__Impl : ( 'on_timeout' ) ;
    public final void rule__Test__Group_29__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3255:1: ( ( 'on_timeout' ) )
            // InternalTwitterQA.g:3256:1: ( 'on_timeout' )
            {
            // InternalTwitterQA.g:3256:1: ( 'on_timeout' )
            // InternalTwitterQA.g:3257:2: 'on_timeout'
            {
             before(grammarAccess.getTestAccess().getOn_timeoutKeyword_29_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getOn_timeoutKeyword_29_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_29__0__Impl"


    // $ANTLR start "rule__Test__Group_29__1"
    // InternalTwitterQA.g:3266:1: rule__Test__Group_29__1 : rule__Test__Group_29__1__Impl rule__Test__Group_29__2 ;
    public final void rule__Test__Group_29__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3270:1: ( rule__Test__Group_29__1__Impl rule__Test__Group_29__2 )
            // InternalTwitterQA.g:3271:2: rule__Test__Group_29__1__Impl rule__Test__Group_29__2
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group_29__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_29__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_29__1"


    // $ANTLR start "rule__Test__Group_29__1__Impl"
    // InternalTwitterQA.g:3278:1: rule__Test__Group_29__1__Impl : ( 'is' ) ;
    public final void rule__Test__Group_29__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3282:1: ( ( 'is' ) )
            // InternalTwitterQA.g:3283:1: ( 'is' )
            {
            // InternalTwitterQA.g:3283:1: ( 'is' )
            // InternalTwitterQA.g:3284:2: 'is'
            {
             before(grammarAccess.getTestAccess().getIsKeyword_29_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIsKeyword_29_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_29__1__Impl"


    // $ANTLR start "rule__Test__Group_29__2"
    // InternalTwitterQA.g:3293:1: rule__Test__Group_29__2 : rule__Test__Group_29__2__Impl ;
    public final void rule__Test__Group_29__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3297:1: ( rule__Test__Group_29__2__Impl )
            // InternalTwitterQA.g:3298:2: rule__Test__Group_29__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_29__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_29__2"


    // $ANTLR start "rule__Test__Group_29__2__Impl"
    // InternalTwitterQA.g:3304:1: rule__Test__Group_29__2__Impl : ( ( rule__Test__On_timeoutAssignment_29_2 ) ) ;
    public final void rule__Test__Group_29__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3308:1: ( ( ( rule__Test__On_timeoutAssignment_29_2 ) ) )
            // InternalTwitterQA.g:3309:1: ( ( rule__Test__On_timeoutAssignment_29_2 ) )
            {
            // InternalTwitterQA.g:3309:1: ( ( rule__Test__On_timeoutAssignment_29_2 ) )
            // InternalTwitterQA.g:3310:2: ( rule__Test__On_timeoutAssignment_29_2 )
            {
             before(grammarAccess.getTestAccess().getOn_timeoutAssignment_29_2()); 
            // InternalTwitterQA.g:3311:2: ( rule__Test__On_timeoutAssignment_29_2 )
            // InternalTwitterQA.g:3311:3: rule__Test__On_timeoutAssignment_29_2
            {
            pushFollow(FOLLOW_2);
            rule__Test__On_timeoutAssignment_29_2();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getOn_timeoutAssignment_29_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_29__2__Impl"


    // $ANTLR start "rule__Test__Group_30__0"
    // InternalTwitterQA.g:3320:1: rule__Test__Group_30__0 : rule__Test__Group_30__0__Impl rule__Test__Group_30__1 ;
    public final void rule__Test__Group_30__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3324:1: ( rule__Test__Group_30__0__Impl rule__Test__Group_30__1 )
            // InternalTwitterQA.g:3325:2: rule__Test__Group_30__0__Impl rule__Test__Group_30__1
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group_30__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_30__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_30__0"


    // $ANTLR start "rule__Test__Group_30__0__Impl"
    // InternalTwitterQA.g:3332:1: rule__Test__Group_30__0__Impl : ( 'on_fail' ) ;
    public final void rule__Test__Group_30__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3336:1: ( ( 'on_fail' ) )
            // InternalTwitterQA.g:3337:1: ( 'on_fail' )
            {
            // InternalTwitterQA.g:3337:1: ( 'on_fail' )
            // InternalTwitterQA.g:3338:2: 'on_fail'
            {
             before(grammarAccess.getTestAccess().getOn_failKeyword_30_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getOn_failKeyword_30_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_30__0__Impl"


    // $ANTLR start "rule__Test__Group_30__1"
    // InternalTwitterQA.g:3347:1: rule__Test__Group_30__1 : rule__Test__Group_30__1__Impl rule__Test__Group_30__2 ;
    public final void rule__Test__Group_30__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3351:1: ( rule__Test__Group_30__1__Impl rule__Test__Group_30__2 )
            // InternalTwitterQA.g:3352:2: rule__Test__Group_30__1__Impl rule__Test__Group_30__2
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group_30__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_30__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_30__1"


    // $ANTLR start "rule__Test__Group_30__1__Impl"
    // InternalTwitterQA.g:3359:1: rule__Test__Group_30__1__Impl : ( 'is' ) ;
    public final void rule__Test__Group_30__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3363:1: ( ( 'is' ) )
            // InternalTwitterQA.g:3364:1: ( 'is' )
            {
            // InternalTwitterQA.g:3364:1: ( 'is' )
            // InternalTwitterQA.g:3365:2: 'is'
            {
             before(grammarAccess.getTestAccess().getIsKeyword_30_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIsKeyword_30_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_30__1__Impl"


    // $ANTLR start "rule__Test__Group_30__2"
    // InternalTwitterQA.g:3374:1: rule__Test__Group_30__2 : rule__Test__Group_30__2__Impl ;
    public final void rule__Test__Group_30__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3378:1: ( rule__Test__Group_30__2__Impl )
            // InternalTwitterQA.g:3379:2: rule__Test__Group_30__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_30__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_30__2"


    // $ANTLR start "rule__Test__Group_30__2__Impl"
    // InternalTwitterQA.g:3385:1: rule__Test__Group_30__2__Impl : ( ( rule__Test__On_failAssignment_30_2 ) ) ;
    public final void rule__Test__Group_30__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3389:1: ( ( ( rule__Test__On_failAssignment_30_2 ) ) )
            // InternalTwitterQA.g:3390:1: ( ( rule__Test__On_failAssignment_30_2 ) )
            {
            // InternalTwitterQA.g:3390:1: ( ( rule__Test__On_failAssignment_30_2 ) )
            // InternalTwitterQA.g:3391:2: ( rule__Test__On_failAssignment_30_2 )
            {
             before(grammarAccess.getTestAccess().getOn_failAssignment_30_2()); 
            // InternalTwitterQA.g:3392:2: ( rule__Test__On_failAssignment_30_2 )
            // InternalTwitterQA.g:3392:3: rule__Test__On_failAssignment_30_2
            {
            pushFollow(FOLLOW_2);
            rule__Test__On_failAssignment_30_2();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getOn_failAssignment_30_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_30__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalTwitterQA.g:3401:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3405:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTwitterQA.g:3406:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalTwitterQA.g:3413:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3417:1: ( ( ( '-' )? ) )
            // InternalTwitterQA.g:3418:1: ( ( '-' )? )
            {
            // InternalTwitterQA.g:3418:1: ( ( '-' )? )
            // InternalTwitterQA.g:3419:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTwitterQA.g:3420:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==48) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTwitterQA.g:3420:3: '-'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalTwitterQA.g:3428:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3432:1: ( rule__EInt__Group__1__Impl )
            // InternalTwitterQA.g:3433:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalTwitterQA.g:3439:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3443:1: ( ( RULE_INT ) )
            // InternalTwitterQA.g:3444:1: ( RULE_INT )
            {
            // InternalTwitterQA.g:3444:1: ( RULE_INT )
            // InternalTwitterQA.g:3445:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalTwitterQA.g:3455:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3459:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalTwitterQA.g:3460:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalTwitterQA.g:3467:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3471:1: ( ( ( '-' )? ) )
            // InternalTwitterQA.g:3472:1: ( ( '-' )? )
            {
            // InternalTwitterQA.g:3472:1: ( ( '-' )? )
            // InternalTwitterQA.g:3473:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalTwitterQA.g:3474:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTwitterQA.g:3474:3: '-'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalTwitterQA.g:3482:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3486:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalTwitterQA.g:3487:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalTwitterQA.g:3494:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3498:1: ( ( ( RULE_INT )? ) )
            // InternalTwitterQA.g:3499:1: ( ( RULE_INT )? )
            {
            // InternalTwitterQA.g:3499:1: ( ( RULE_INT )? )
            // InternalTwitterQA.g:3500:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalTwitterQA.g:3501:2: ( RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTwitterQA.g:3501:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalTwitterQA.g:3509:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3513:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalTwitterQA.g:3514:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalTwitterQA.g:3521:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3525:1: ( ( '.' ) )
            // InternalTwitterQA.g:3526:1: ( '.' )
            {
            // InternalTwitterQA.g:3526:1: ( '.' )
            // InternalTwitterQA.g:3527:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalTwitterQA.g:3536:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3540:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalTwitterQA.g:3541:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalTwitterQA.g:3548:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3552:1: ( ( RULE_INT ) )
            // InternalTwitterQA.g:3553:1: ( RULE_INT )
            {
            // InternalTwitterQA.g:3553:1: ( RULE_INT )
            // InternalTwitterQA.g:3554:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalTwitterQA.g:3563:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3567:1: ( rule__EDouble__Group__4__Impl )
            // InternalTwitterQA.g:3568:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalTwitterQA.g:3574:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3578:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalTwitterQA.g:3579:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalTwitterQA.g:3579:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalTwitterQA.g:3580:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalTwitterQA.g:3581:2: ( rule__EDouble__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=11 && LA15_0<=12)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTwitterQA.g:3581:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalTwitterQA.g:3590:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3594:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalTwitterQA.g:3595:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_30);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalTwitterQA.g:3602:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3606:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalTwitterQA.g:3607:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalTwitterQA.g:3607:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalTwitterQA.g:3608:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalTwitterQA.g:3609:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalTwitterQA.g:3609:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalTwitterQA.g:3617:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3621:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalTwitterQA.g:3622:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_30);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalTwitterQA.g:3629:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3633:1: ( ( ( '-' )? ) )
            // InternalTwitterQA.g:3634:1: ( ( '-' )? )
            {
            // InternalTwitterQA.g:3634:1: ( ( '-' )? )
            // InternalTwitterQA.g:3635:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTwitterQA.g:3636:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTwitterQA.g:3636:3: '-'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalTwitterQA.g:3644:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3648:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalTwitterQA.g:3649:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalTwitterQA.g:3655:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3659:1: ( ( RULE_INT ) )
            // InternalTwitterQA.g:3660:1: ( RULE_INT )
            {
            // InternalTwitterQA.g:3660:1: ( RULE_INT )
            // InternalTwitterQA.g:3661:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__TwitterQA__Consumer_keyAssignment_4"
    // InternalTwitterQA.g:3671:1: rule__TwitterQA__Consumer_keyAssignment_4 : ( ruleEString ) ;
    public final void rule__TwitterQA__Consumer_keyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3675:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3676:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3676:2: ( ruleEString )
            // InternalTwitterQA.g:3677:3: ruleEString
            {
             before(grammarAccess.getTwitterQAAccess().getConsumer_keyEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTwitterQAAccess().getConsumer_keyEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Consumer_keyAssignment_4"


    // $ANTLR start "rule__TwitterQA__Consumer_secretAssignment_7"
    // InternalTwitterQA.g:3686:1: rule__TwitterQA__Consumer_secretAssignment_7 : ( ruleEString ) ;
    public final void rule__TwitterQA__Consumer_secretAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3690:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3691:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3691:2: ( ruleEString )
            // InternalTwitterQA.g:3692:3: ruleEString
            {
             before(grammarAccess.getTwitterQAAccess().getConsumer_secretEStringParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTwitterQAAccess().getConsumer_secretEStringParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Consumer_secretAssignment_7"


    // $ANTLR start "rule__TwitterQA__Access_tokenAssignment_10"
    // InternalTwitterQA.g:3701:1: rule__TwitterQA__Access_tokenAssignment_10 : ( ruleEString ) ;
    public final void rule__TwitterQA__Access_tokenAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3705:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3706:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3706:2: ( ruleEString )
            // InternalTwitterQA.g:3707:3: ruleEString
            {
             before(grammarAccess.getTwitterQAAccess().getAccess_tokenEStringParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTwitterQAAccess().getAccess_tokenEStringParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Access_tokenAssignment_10"


    // $ANTLR start "rule__TwitterQA__Access_token_secretAssignment_13"
    // InternalTwitterQA.g:3716:1: rule__TwitterQA__Access_token_secretAssignment_13 : ( ruleEString ) ;
    public final void rule__TwitterQA__Access_token_secretAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3720:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3721:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3721:2: ( ruleEString )
            // InternalTwitterQA.g:3722:3: ruleEString
            {
             before(grammarAccess.getTwitterQAAccess().getAccess_token_secretEStringParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTwitterQAAccess().getAccess_token_secretEStringParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Access_token_secretAssignment_13"


    // $ANTLR start "rule__TwitterQA__Welcome_msgAssignment_16"
    // InternalTwitterQA.g:3731:1: rule__TwitterQA__Welcome_msgAssignment_16 : ( ruleEString ) ;
    public final void rule__TwitterQA__Welcome_msgAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3735:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3736:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3736:2: ( ruleEString )
            // InternalTwitterQA.g:3737:3: ruleEString
            {
             before(grammarAccess.getTwitterQAAccess().getWelcome_msgEStringParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTwitterQAAccess().getWelcome_msgEStringParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__Welcome_msgAssignment_16"


    // $ANTLR start "rule__TwitterQA__GamesAssignment_20"
    // InternalTwitterQA.g:3746:1: rule__TwitterQA__GamesAssignment_20 : ( ruleGame ) ;
    public final void rule__TwitterQA__GamesAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3750:1: ( ( ruleGame ) )
            // InternalTwitterQA.g:3751:2: ( ruleGame )
            {
            // InternalTwitterQA.g:3751:2: ( ruleGame )
            // InternalTwitterQA.g:3752:3: ruleGame
            {
             before(grammarAccess.getTwitterQAAccess().getGamesGameParserRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getTwitterQAAccess().getGamesGameParserRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__GamesAssignment_20"


    // $ANTLR start "rule__TwitterQA__GamesAssignment_21_1"
    // InternalTwitterQA.g:3761:1: rule__TwitterQA__GamesAssignment_21_1 : ( ruleGame ) ;
    public final void rule__TwitterQA__GamesAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3765:1: ( ( ruleGame ) )
            // InternalTwitterQA.g:3766:2: ( ruleGame )
            {
            // InternalTwitterQA.g:3766:2: ( ruleGame )
            // InternalTwitterQA.g:3767:3: ruleGame
            {
             before(grammarAccess.getTwitterQAAccess().getGamesGameParserRuleCall_21_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getTwitterQAAccess().getGamesGameParserRuleCall_21_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__GamesAssignment_21_1"


    // $ANTLR start "rule__TwitterQA__LocationsAssignment_26"
    // InternalTwitterQA.g:3776:1: rule__TwitterQA__LocationsAssignment_26 : ( ruleLocation ) ;
    public final void rule__TwitterQA__LocationsAssignment_26() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3780:1: ( ( ruleLocation ) )
            // InternalTwitterQA.g:3781:2: ( ruleLocation )
            {
            // InternalTwitterQA.g:3781:2: ( ruleLocation )
            // InternalTwitterQA.g:3782:3: ruleLocation
            {
             before(grammarAccess.getTwitterQAAccess().getLocationsLocationParserRuleCall_26_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getTwitterQAAccess().getLocationsLocationParserRuleCall_26_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__LocationsAssignment_26"


    // $ANTLR start "rule__TwitterQA__LocationsAssignment_27_1"
    // InternalTwitterQA.g:3791:1: rule__TwitterQA__LocationsAssignment_27_1 : ( ruleLocation ) ;
    public final void rule__TwitterQA__LocationsAssignment_27_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3795:1: ( ( ruleLocation ) )
            // InternalTwitterQA.g:3796:2: ( ruleLocation )
            {
            // InternalTwitterQA.g:3796:2: ( ruleLocation )
            // InternalTwitterQA.g:3797:3: ruleLocation
            {
             before(grammarAccess.getTwitterQAAccess().getLocationsLocationParserRuleCall_27_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLocation();

            state._fsp--;

             after(grammarAccess.getTwitterQAAccess().getLocationsLocationParserRuleCall_27_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TwitterQA__LocationsAssignment_27_1"


    // $ANTLR start "rule__Game__NameAssignment_1"
    // InternalTwitterQA.g:3806:1: rule__Game__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3810:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3811:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3811:2: ( ruleEString )
            // InternalTwitterQA.g:3812:3: ruleEString
            {
             before(grammarAccess.getGameAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__NameAssignment_1"


    // $ANTLR start "rule__Game__DescriptionAssignment_5"
    // InternalTwitterQA.g:3821:1: rule__Game__DescriptionAssignment_5 : ( ruleEString ) ;
    public final void rule__Game__DescriptionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3825:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3826:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3826:2: ( ruleEString )
            // InternalTwitterQA.g:3827:3: ruleEString
            {
             before(grammarAccess.getGameAccess().getDescriptionEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getDescriptionEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__DescriptionAssignment_5"


    // $ANTLR start "rule__Game__CityAssignment_8"
    // InternalTwitterQA.g:3836:1: rule__Game__CityAssignment_8 : ( ruleEString ) ;
    public final void rule__Game__CityAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3840:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3841:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3841:2: ( ruleEString )
            // InternalTwitterQA.g:3842:3: ruleEString
            {
             before(grammarAccess.getGameAccess().getCityEStringParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGameAccess().getCityEStringParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__CityAssignment_8"


    // $ANTLR start "rule__Game__Initial_testAssignment_11"
    // InternalTwitterQA.g:3851:1: rule__Game__Initial_testAssignment_11 : ( ruleTest ) ;
    public final void rule__Game__Initial_testAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3855:1: ( ( ruleTest ) )
            // InternalTwitterQA.g:3856:2: ( ruleTest )
            {
            // InternalTwitterQA.g:3856:2: ( ruleTest )
            // InternalTwitterQA.g:3857:3: ruleTest
            {
             before(grammarAccess.getGameAccess().getInitial_testTestParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getGameAccess().getInitial_testTestParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Initial_testAssignment_11"


    // $ANTLR start "rule__Game__TestsAssignment_15"
    // InternalTwitterQA.g:3866:1: rule__Game__TestsAssignment_15 : ( ruleTest ) ;
    public final void rule__Game__TestsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3870:1: ( ( ruleTest ) )
            // InternalTwitterQA.g:3871:2: ( ruleTest )
            {
            // InternalTwitterQA.g:3871:2: ( ruleTest )
            // InternalTwitterQA.g:3872:3: ruleTest
            {
             before(grammarAccess.getGameAccess().getTestsTestParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getGameAccess().getTestsTestParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__TestsAssignment_15"


    // $ANTLR start "rule__Game__TestsAssignment_16_1"
    // InternalTwitterQA.g:3881:1: rule__Game__TestsAssignment_16_1 : ( ruleTest ) ;
    public final void rule__Game__TestsAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3885:1: ( ( ruleTest ) )
            // InternalTwitterQA.g:3886:2: ( ruleTest )
            {
            // InternalTwitterQA.g:3886:2: ( ruleTest )
            // InternalTwitterQA.g:3887:3: ruleTest
            {
             before(grammarAccess.getGameAccess().getTestsTestParserRuleCall_16_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getGameAccess().getTestsTestParserRuleCall_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__TestsAssignment_16_1"


    // $ANTLR start "rule__Location__NameAssignment_1"
    // InternalTwitterQA.g:3896:1: rule__Location__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Location__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3900:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3901:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3901:2: ( ruleEString )
            // InternalTwitterQA.g:3902:3: ruleEString
            {
             before(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__NameAssignment_1"


    // $ANTLR start "rule__Location__LatitudeAssignment_5"
    // InternalTwitterQA.g:3911:1: rule__Location__LatitudeAssignment_5 : ( ruleEDouble ) ;
    public final void rule__Location__LatitudeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3915:1: ( ( ruleEDouble ) )
            // InternalTwitterQA.g:3916:2: ( ruleEDouble )
            {
            // InternalTwitterQA.g:3916:2: ( ruleEDouble )
            // InternalTwitterQA.g:3917:3: ruleEDouble
            {
             before(grammarAccess.getLocationAccess().getLatitudeEDoubleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getLatitudeEDoubleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__LatitudeAssignment_5"


    // $ANTLR start "rule__Location__LongitudeAssignment_8"
    // InternalTwitterQA.g:3926:1: rule__Location__LongitudeAssignment_8 : ( ruleEDouble ) ;
    public final void rule__Location__LongitudeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3930:1: ( ( ruleEDouble ) )
            // InternalTwitterQA.g:3931:2: ( ruleEDouble )
            {
            // InternalTwitterQA.g:3931:2: ( ruleEDouble )
            // InternalTwitterQA.g:3932:3: ruleEDouble
            {
             before(grammarAccess.getLocationAccess().getLongitudeEDoubleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getLocationAccess().getLongitudeEDoubleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Location__LongitudeAssignment_8"


    // $ANTLR start "rule__Test__NameAssignment_1"
    // InternalTwitterQA.g:3941:1: rule__Test__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Test__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3945:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3946:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3946:2: ( ruleEString )
            // InternalTwitterQA.g:3947:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__NameAssignment_1"


    // $ANTLR start "rule__Test__QuestionAssignment_5"
    // InternalTwitterQA.g:3956:1: rule__Test__QuestionAssignment_5 : ( ruleEString ) ;
    public final void rule__Test__QuestionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3960:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3961:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3961:2: ( ruleEString )
            // InternalTwitterQA.g:3962:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getQuestionEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getQuestionEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__QuestionAssignment_5"


    // $ANTLR start "rule__Test__OrderAssignment_8"
    // InternalTwitterQA.g:3971:1: rule__Test__OrderAssignment_8 : ( ruleEInt ) ;
    public final void rule__Test__OrderAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3975:1: ( ( ruleEInt ) )
            // InternalTwitterQA.g:3976:2: ( ruleEInt )
            {
            // InternalTwitterQA.g:3976:2: ( ruleEInt )
            // InternalTwitterQA.g:3977:3: ruleEInt
            {
             before(grammarAccess.getTestAccess().getOrderEIntParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTestAccess().getOrderEIntParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__OrderAssignment_8"


    // $ANTLR start "rule__Test__AnswersAssignment_12"
    // InternalTwitterQA.g:3986:1: rule__Test__AnswersAssignment_12 : ( ruleEString ) ;
    public final void rule__Test__AnswersAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:3990:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:3991:2: ( ruleEString )
            {
            // InternalTwitterQA.g:3991:2: ( ruleEString )
            // InternalTwitterQA.g:3992:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getAnswersEStringParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAnswersEStringParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AnswersAssignment_12"


    // $ANTLR start "rule__Test__AnswersAssignment_13_1"
    // InternalTwitterQA.g:4001:1: rule__Test__AnswersAssignment_13_1 : ( ruleEString ) ;
    public final void rule__Test__AnswersAssignment_13_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:4005:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:4006:2: ( ruleEString )
            {
            // InternalTwitterQA.g:4006:2: ( ruleEString )
            // InternalTwitterQA.g:4007:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getAnswersEStringParserRuleCall_13_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAnswersEStringParserRuleCall_13_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AnswersAssignment_13_1"


    // $ANTLR start "rule__Test__HintsAssignment_15_3"
    // InternalTwitterQA.g:4016:1: rule__Test__HintsAssignment_15_3 : ( ruleEString ) ;
    public final void rule__Test__HintsAssignment_15_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:4020:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:4021:2: ( ruleEString )
            {
            // InternalTwitterQA.g:4021:2: ( ruleEString )
            // InternalTwitterQA.g:4022:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getHintsEStringParserRuleCall_15_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getHintsEStringParserRuleCall_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__HintsAssignment_15_3"


    // $ANTLR start "rule__Test__HintsAssignment_15_4_1"
    // InternalTwitterQA.g:4031:1: rule__Test__HintsAssignment_15_4_1 : ( ruleEString ) ;
    public final void rule__Test__HintsAssignment_15_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:4035:1: ( ( ruleEString ) )
            // InternalTwitterQA.g:4036:2: ( ruleEString )
            {
            // InternalTwitterQA.g:4036:2: ( ruleEString )
            // InternalTwitterQA.g:4037:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getHintsEStringParserRuleCall_15_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getHintsEStringParserRuleCall_15_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__HintsAssignment_15_4_1"


    // $ANTLR start "rule__Test__TimelimitAssignment_18"
    // InternalTwitterQA.g:4046:1: rule__Test__TimelimitAssignment_18 : ( ruleEInt ) ;
    public final void rule__Test__TimelimitAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:4050:1: ( ( ruleEInt ) )
            // InternalTwitterQA.g:4051:2: ( ruleEInt )
            {
            // InternalTwitterQA.g:4051:2: ( ruleEInt )
            // InternalTwitterQA.g:4052:3: ruleEInt
            {
             before(grammarAccess.getTestAccess().getTimelimitEIntParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTestAccess().getTimelimitEIntParserRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__TimelimitAssignment_18"


    // $ANTLR start "rule__Test__AttemptsAssignment_21"
    // InternalTwitterQA.g:4061:1: rule__Test__AttemptsAssignment_21 : ( ruleEInt ) ;
    public final void rule__Test__AttemptsAssignment_21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:4065:1: ( ( ruleEInt ) )
            // InternalTwitterQA.g:4066:2: ( ruleEInt )
            {
            // InternalTwitterQA.g:4066:2: ( ruleEInt )
            // InternalTwitterQA.g:4067:3: ruleEInt
            {
             before(grammarAccess.getTestAccess().getAttemptsEIntParserRuleCall_21_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAttemptsEIntParserRuleCall_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AttemptsAssignment_21"


    // $ANTLR start "rule__Test__RewardAssignment_24"
    // InternalTwitterQA.g:4076:1: rule__Test__RewardAssignment_24 : ( ruleEInt ) ;
    public final void rule__Test__RewardAssignment_24() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:4080:1: ( ( ruleEInt ) )
            // InternalTwitterQA.g:4081:2: ( ruleEInt )
            {
            // InternalTwitterQA.g:4081:2: ( ruleEInt )
            // InternalTwitterQA.g:4082:3: ruleEInt
            {
             before(grammarAccess.getTestAccess().getRewardEIntParserRuleCall_24_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTestAccess().getRewardEIntParserRuleCall_24_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__RewardAssignment_24"


    // $ANTLR start "rule__Test__LocationAssignment_27"
    // InternalTwitterQA.g:4091:1: rule__Test__LocationAssignment_27 : ( ( ruleEString ) ) ;
    public final void rule__Test__LocationAssignment_27() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:4095:1: ( ( ( ruleEString ) ) )
            // InternalTwitterQA.g:4096:2: ( ( ruleEString ) )
            {
            // InternalTwitterQA.g:4096:2: ( ( ruleEString ) )
            // InternalTwitterQA.g:4097:3: ( ruleEString )
            {
             before(grammarAccess.getTestAccess().getLocationLocationCrossReference_27_0()); 
            // InternalTwitterQA.g:4098:3: ( ruleEString )
            // InternalTwitterQA.g:4099:4: ruleEString
            {
             before(grammarAccess.getTestAccess().getLocationLocationEStringParserRuleCall_27_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getLocationLocationEStringParserRuleCall_27_0_1()); 

            }

             after(grammarAccess.getTestAccess().getLocationLocationCrossReference_27_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__LocationAssignment_27"


    // $ANTLR start "rule__Test__On_correctAssignment_28_2"
    // InternalTwitterQA.g:4110:1: rule__Test__On_correctAssignment_28_2 : ( ( ruleEString ) ) ;
    public final void rule__Test__On_correctAssignment_28_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:4114:1: ( ( ( ruleEString ) ) )
            // InternalTwitterQA.g:4115:2: ( ( ruleEString ) )
            {
            // InternalTwitterQA.g:4115:2: ( ( ruleEString ) )
            // InternalTwitterQA.g:4116:3: ( ruleEString )
            {
             before(grammarAccess.getTestAccess().getOn_correctTestCrossReference_28_2_0()); 
            // InternalTwitterQA.g:4117:3: ( ruleEString )
            // InternalTwitterQA.g:4118:4: ruleEString
            {
             before(grammarAccess.getTestAccess().getOn_correctTestEStringParserRuleCall_28_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getOn_correctTestEStringParserRuleCall_28_2_0_1()); 

            }

             after(grammarAccess.getTestAccess().getOn_correctTestCrossReference_28_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__On_correctAssignment_28_2"


    // $ANTLR start "rule__Test__On_timeoutAssignment_29_2"
    // InternalTwitterQA.g:4129:1: rule__Test__On_timeoutAssignment_29_2 : ( ( ruleEString ) ) ;
    public final void rule__Test__On_timeoutAssignment_29_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:4133:1: ( ( ( ruleEString ) ) )
            // InternalTwitterQA.g:4134:2: ( ( ruleEString ) )
            {
            // InternalTwitterQA.g:4134:2: ( ( ruleEString ) )
            // InternalTwitterQA.g:4135:3: ( ruleEString )
            {
             before(grammarAccess.getTestAccess().getOn_timeoutTestCrossReference_29_2_0()); 
            // InternalTwitterQA.g:4136:3: ( ruleEString )
            // InternalTwitterQA.g:4137:4: ruleEString
            {
             before(grammarAccess.getTestAccess().getOn_timeoutTestEStringParserRuleCall_29_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getOn_timeoutTestEStringParserRuleCall_29_2_0_1()); 

            }

             after(grammarAccess.getTestAccess().getOn_timeoutTestCrossReference_29_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__On_timeoutAssignment_29_2"


    // $ANTLR start "rule__Test__On_failAssignment_30_2"
    // InternalTwitterQA.g:4148:1: rule__Test__On_failAssignment_30_2 : ( ( ruleEString ) ) ;
    public final void rule__Test__On_failAssignment_30_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTwitterQA.g:4152:1: ( ( ( ruleEString ) ) )
            // InternalTwitterQA.g:4153:2: ( ( ruleEString ) )
            {
            // InternalTwitterQA.g:4153:2: ( ( ruleEString ) )
            // InternalTwitterQA.g:4154:3: ( ruleEString )
            {
             before(grammarAccess.getTestAccess().getOn_failTestCrossReference_30_2_0()); 
            // InternalTwitterQA.g:4155:3: ( ruleEString )
            // InternalTwitterQA.g:4156:4: ruleEString
            {
             before(grammarAccess.getTestAccess().getOn_failTestEStringParserRuleCall_30_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getOn_failTestEStringParserRuleCall_30_2_0_1()); 

            }

             after(grammarAccess.getTestAccess().getOn_failTestCrossReference_30_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__On_failAssignment_30_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000009000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0003000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000110000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000E00004000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000001800L});

}