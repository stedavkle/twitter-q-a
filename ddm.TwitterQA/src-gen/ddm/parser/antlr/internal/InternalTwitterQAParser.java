package ddm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ddm.services.TwitterQAGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTwitterQAParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TwitterQA'", "'{'", "'consumer_key'", "'is'", "'consumer_secret'", "'access_token'", "'access_token_secret'", "'welcome_msg'", "'games'", "'are'", "'['", "','", "']'", "'locations'", "'}'", "'Game'", "'description'", "'city'", "'initial_test'", "'tests'", "'Location'", "'latitude'", "'longitude'", "'Test'", "'question'", "'order'", "'answers'", "'hints'", "'timelimit'", "'attempts'", "'reward'", "'location'", "'on_correct'", "'on_timeout'", "'on_fail'", "'-'", "'.'", "'E'", "'e'"
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

        public InternalTwitterQAParser(TokenStream input, TwitterQAGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TwitterQA";
       	}

       	@Override
       	protected TwitterQAGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTwitterQA"
    // InternalTwitterQA.g:64:1: entryRuleTwitterQA returns [EObject current=null] : iv_ruleTwitterQA= ruleTwitterQA EOF ;
    public final EObject entryRuleTwitterQA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTwitterQA = null;


        try {
            // InternalTwitterQA.g:64:50: (iv_ruleTwitterQA= ruleTwitterQA EOF )
            // InternalTwitterQA.g:65:2: iv_ruleTwitterQA= ruleTwitterQA EOF
            {
             newCompositeNode(grammarAccess.getTwitterQARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTwitterQA=ruleTwitterQA();

            state._fsp--;

             current =iv_ruleTwitterQA; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTwitterQA"


    // $ANTLR start "ruleTwitterQA"
    // InternalTwitterQA.g:71:1: ruleTwitterQA returns [EObject current=null] : (otherlv_0= 'TwitterQA' otherlv_1= '{' otherlv_2= 'consumer_key' otherlv_3= 'is' ( (lv_consumer_key_4_0= ruleEString ) ) otherlv_5= 'consumer_secret' otherlv_6= 'is' ( (lv_consumer_secret_7_0= ruleEString ) ) otherlv_8= 'access_token' otherlv_9= 'is' ( (lv_access_token_10_0= ruleEString ) ) otherlv_11= 'access_token_secret' otherlv_12= 'is' ( (lv_access_token_secret_13_0= ruleEString ) ) otherlv_14= 'welcome_msg' otherlv_15= 'is' ( (lv_welcome_msg_16_0= ruleEString ) ) otherlv_17= 'games' otherlv_18= 'are' otherlv_19= '[' ( (lv_games_20_0= ruleGame ) ) (otherlv_21= ',' ( (lv_games_22_0= ruleGame ) ) )* otherlv_23= ']' otherlv_24= 'locations' otherlv_25= 'are' otherlv_26= '[' ( (lv_locations_27_0= ruleLocation ) ) (otherlv_28= ',' ( (lv_locations_29_0= ruleLocation ) ) )* otherlv_30= ']' otherlv_31= '}' ) ;
    public final EObject ruleTwitterQA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_consumer_key_4_0 = null;

        AntlrDatatypeRuleToken lv_consumer_secret_7_0 = null;

        AntlrDatatypeRuleToken lv_access_token_10_0 = null;

        AntlrDatatypeRuleToken lv_access_token_secret_13_0 = null;

        AntlrDatatypeRuleToken lv_welcome_msg_16_0 = null;

        EObject lv_games_20_0 = null;

        EObject lv_games_22_0 = null;

        EObject lv_locations_27_0 = null;

        EObject lv_locations_29_0 = null;



        	enterRule();

        try {
            // InternalTwitterQA.g:77:2: ( (otherlv_0= 'TwitterQA' otherlv_1= '{' otherlv_2= 'consumer_key' otherlv_3= 'is' ( (lv_consumer_key_4_0= ruleEString ) ) otherlv_5= 'consumer_secret' otherlv_6= 'is' ( (lv_consumer_secret_7_0= ruleEString ) ) otherlv_8= 'access_token' otherlv_9= 'is' ( (lv_access_token_10_0= ruleEString ) ) otherlv_11= 'access_token_secret' otherlv_12= 'is' ( (lv_access_token_secret_13_0= ruleEString ) ) otherlv_14= 'welcome_msg' otherlv_15= 'is' ( (lv_welcome_msg_16_0= ruleEString ) ) otherlv_17= 'games' otherlv_18= 'are' otherlv_19= '[' ( (lv_games_20_0= ruleGame ) ) (otherlv_21= ',' ( (lv_games_22_0= ruleGame ) ) )* otherlv_23= ']' otherlv_24= 'locations' otherlv_25= 'are' otherlv_26= '[' ( (lv_locations_27_0= ruleLocation ) ) (otherlv_28= ',' ( (lv_locations_29_0= ruleLocation ) ) )* otherlv_30= ']' otherlv_31= '}' ) )
            // InternalTwitterQA.g:78:2: (otherlv_0= 'TwitterQA' otherlv_1= '{' otherlv_2= 'consumer_key' otherlv_3= 'is' ( (lv_consumer_key_4_0= ruleEString ) ) otherlv_5= 'consumer_secret' otherlv_6= 'is' ( (lv_consumer_secret_7_0= ruleEString ) ) otherlv_8= 'access_token' otherlv_9= 'is' ( (lv_access_token_10_0= ruleEString ) ) otherlv_11= 'access_token_secret' otherlv_12= 'is' ( (lv_access_token_secret_13_0= ruleEString ) ) otherlv_14= 'welcome_msg' otherlv_15= 'is' ( (lv_welcome_msg_16_0= ruleEString ) ) otherlv_17= 'games' otherlv_18= 'are' otherlv_19= '[' ( (lv_games_20_0= ruleGame ) ) (otherlv_21= ',' ( (lv_games_22_0= ruleGame ) ) )* otherlv_23= ']' otherlv_24= 'locations' otherlv_25= 'are' otherlv_26= '[' ( (lv_locations_27_0= ruleLocation ) ) (otherlv_28= ',' ( (lv_locations_29_0= ruleLocation ) ) )* otherlv_30= ']' otherlv_31= '}' )
            {
            // InternalTwitterQA.g:78:2: (otherlv_0= 'TwitterQA' otherlv_1= '{' otherlv_2= 'consumer_key' otherlv_3= 'is' ( (lv_consumer_key_4_0= ruleEString ) ) otherlv_5= 'consumer_secret' otherlv_6= 'is' ( (lv_consumer_secret_7_0= ruleEString ) ) otherlv_8= 'access_token' otherlv_9= 'is' ( (lv_access_token_10_0= ruleEString ) ) otherlv_11= 'access_token_secret' otherlv_12= 'is' ( (lv_access_token_secret_13_0= ruleEString ) ) otherlv_14= 'welcome_msg' otherlv_15= 'is' ( (lv_welcome_msg_16_0= ruleEString ) ) otherlv_17= 'games' otherlv_18= 'are' otherlv_19= '[' ( (lv_games_20_0= ruleGame ) ) (otherlv_21= ',' ( (lv_games_22_0= ruleGame ) ) )* otherlv_23= ']' otherlv_24= 'locations' otherlv_25= 'are' otherlv_26= '[' ( (lv_locations_27_0= ruleLocation ) ) (otherlv_28= ',' ( (lv_locations_29_0= ruleLocation ) ) )* otherlv_30= ']' otherlv_31= '}' )
            // InternalTwitterQA.g:79:3: otherlv_0= 'TwitterQA' otherlv_1= '{' otherlv_2= 'consumer_key' otherlv_3= 'is' ( (lv_consumer_key_4_0= ruleEString ) ) otherlv_5= 'consumer_secret' otherlv_6= 'is' ( (lv_consumer_secret_7_0= ruleEString ) ) otherlv_8= 'access_token' otherlv_9= 'is' ( (lv_access_token_10_0= ruleEString ) ) otherlv_11= 'access_token_secret' otherlv_12= 'is' ( (lv_access_token_secret_13_0= ruleEString ) ) otherlv_14= 'welcome_msg' otherlv_15= 'is' ( (lv_welcome_msg_16_0= ruleEString ) ) otherlv_17= 'games' otherlv_18= 'are' otherlv_19= '[' ( (lv_games_20_0= ruleGame ) ) (otherlv_21= ',' ( (lv_games_22_0= ruleGame ) ) )* otherlv_23= ']' otherlv_24= 'locations' otherlv_25= 'are' otherlv_26= '[' ( (lv_locations_27_0= ruleLocation ) ) (otherlv_28= ',' ( (lv_locations_29_0= ruleLocation ) ) )* otherlv_30= ']' otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTwitterQAAccess().getTwitterQAKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTwitterQAAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTwitterQAAccess().getConsumer_keyKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getTwitterQAAccess().getIsKeyword_3());
            		
            // InternalTwitterQA.g:95:3: ( (lv_consumer_key_4_0= ruleEString ) )
            // InternalTwitterQA.g:96:4: (lv_consumer_key_4_0= ruleEString )
            {
            // InternalTwitterQA.g:96:4: (lv_consumer_key_4_0= ruleEString )
            // InternalTwitterQA.g:97:5: lv_consumer_key_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getConsumer_keyEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_consumer_key_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					set(
            						current,
            						"consumer_key",
            						lv_consumer_key_4_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getTwitterQAAccess().getConsumer_secretKeyword_5());
            		
            otherlv_6=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getTwitterQAAccess().getIsKeyword_6());
            		
            // InternalTwitterQA.g:122:3: ( (lv_consumer_secret_7_0= ruleEString ) )
            // InternalTwitterQA.g:123:4: (lv_consumer_secret_7_0= ruleEString )
            {
            // InternalTwitterQA.g:123:4: (lv_consumer_secret_7_0= ruleEString )
            // InternalTwitterQA.g:124:5: lv_consumer_secret_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getConsumer_secretEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_consumer_secret_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					set(
            						current,
            						"consumer_secret",
            						lv_consumer_secret_7_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getTwitterQAAccess().getAccess_tokenKeyword_8());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getTwitterQAAccess().getIsKeyword_9());
            		
            // InternalTwitterQA.g:149:3: ( (lv_access_token_10_0= ruleEString ) )
            // InternalTwitterQA.g:150:4: (lv_access_token_10_0= ruleEString )
            {
            // InternalTwitterQA.g:150:4: (lv_access_token_10_0= ruleEString )
            // InternalTwitterQA.g:151:5: lv_access_token_10_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getAccess_tokenEStringParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_access_token_10_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					set(
            						current,
            						"access_token",
            						lv_access_token_10_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getTwitterQAAccess().getAccess_token_secretKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getTwitterQAAccess().getIsKeyword_12());
            		
            // InternalTwitterQA.g:176:3: ( (lv_access_token_secret_13_0= ruleEString ) )
            // InternalTwitterQA.g:177:4: (lv_access_token_secret_13_0= ruleEString )
            {
            // InternalTwitterQA.g:177:4: (lv_access_token_secret_13_0= ruleEString )
            // InternalTwitterQA.g:178:5: lv_access_token_secret_13_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getAccess_token_secretEStringParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_10);
            lv_access_token_secret_13_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					set(
            						current,
            						"access_token_secret",
            						lv_access_token_secret_13_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getTwitterQAAccess().getWelcome_msgKeyword_14());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getTwitterQAAccess().getIsKeyword_15());
            		
            // InternalTwitterQA.g:203:3: ( (lv_welcome_msg_16_0= ruleEString ) )
            // InternalTwitterQA.g:204:4: (lv_welcome_msg_16_0= ruleEString )
            {
            // InternalTwitterQA.g:204:4: (lv_welcome_msg_16_0= ruleEString )
            // InternalTwitterQA.g:205:5: lv_welcome_msg_16_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getWelcome_msgEStringParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_11);
            lv_welcome_msg_16_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					set(
            						current,
            						"welcome_msg",
            						lv_welcome_msg_16_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getTwitterQAAccess().getGamesKeyword_17());
            		
            otherlv_18=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_18, grammarAccess.getTwitterQAAccess().getAreKeyword_18());
            		
            otherlv_19=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_19, grammarAccess.getTwitterQAAccess().getLeftSquareBracketKeyword_19());
            		
            // InternalTwitterQA.g:234:3: ( (lv_games_20_0= ruleGame ) )
            // InternalTwitterQA.g:235:4: (lv_games_20_0= ruleGame )
            {
            // InternalTwitterQA.g:235:4: (lv_games_20_0= ruleGame )
            // InternalTwitterQA.g:236:5: lv_games_20_0= ruleGame
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getGamesGameParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_15);
            lv_games_20_0=ruleGame();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					add(
            						current,
            						"games",
            						lv_games_20_0,
            						"ddm.TwitterQA.Game");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTwitterQA.g:253:3: (otherlv_21= ',' ( (lv_games_22_0= ruleGame ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTwitterQA.g:254:4: otherlv_21= ',' ( (lv_games_22_0= ruleGame ) )
            	    {
            	    otherlv_21=(Token)match(input,22,FOLLOW_14); 

            	    				newLeafNode(otherlv_21, grammarAccess.getTwitterQAAccess().getCommaKeyword_21_0());
            	    			
            	    // InternalTwitterQA.g:258:4: ( (lv_games_22_0= ruleGame ) )
            	    // InternalTwitterQA.g:259:5: (lv_games_22_0= ruleGame )
            	    {
            	    // InternalTwitterQA.g:259:5: (lv_games_22_0= ruleGame )
            	    // InternalTwitterQA.g:260:6: lv_games_22_0= ruleGame
            	    {

            	    						newCompositeNode(grammarAccess.getTwitterQAAccess().getGamesGameParserRuleCall_21_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_games_22_0=ruleGame();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTwitterQARule());
            	    						}
            	    						add(
            	    							current,
            	    							"games",
            	    							lv_games_22_0,
            	    							"ddm.TwitterQA.Game");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_23=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_23, grammarAccess.getTwitterQAAccess().getRightSquareBracketKeyword_22());
            		
            otherlv_24=(Token)match(input,24,FOLLOW_12); 

            			newLeafNode(otherlv_24, grammarAccess.getTwitterQAAccess().getLocationsKeyword_23());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_25, grammarAccess.getTwitterQAAccess().getAreKeyword_24());
            		
            otherlv_26=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_26, grammarAccess.getTwitterQAAccess().getLeftSquareBracketKeyword_25());
            		
            // InternalTwitterQA.g:294:3: ( (lv_locations_27_0= ruleLocation ) )
            // InternalTwitterQA.g:295:4: (lv_locations_27_0= ruleLocation )
            {
            // InternalTwitterQA.g:295:4: (lv_locations_27_0= ruleLocation )
            // InternalTwitterQA.g:296:5: lv_locations_27_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getLocationsLocationParserRuleCall_26_0());
            				
            pushFollow(FOLLOW_15);
            lv_locations_27_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					add(
            						current,
            						"locations",
            						lv_locations_27_0,
            						"ddm.TwitterQA.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTwitterQA.g:313:3: (otherlv_28= ',' ( (lv_locations_29_0= ruleLocation ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTwitterQA.g:314:4: otherlv_28= ',' ( (lv_locations_29_0= ruleLocation ) )
            	    {
            	    otherlv_28=(Token)match(input,22,FOLLOW_17); 

            	    				newLeafNode(otherlv_28, grammarAccess.getTwitterQAAccess().getCommaKeyword_27_0());
            	    			
            	    // InternalTwitterQA.g:318:4: ( (lv_locations_29_0= ruleLocation ) )
            	    // InternalTwitterQA.g:319:5: (lv_locations_29_0= ruleLocation )
            	    {
            	    // InternalTwitterQA.g:319:5: (lv_locations_29_0= ruleLocation )
            	    // InternalTwitterQA.g:320:6: lv_locations_29_0= ruleLocation
            	    {

            	    						newCompositeNode(grammarAccess.getTwitterQAAccess().getLocationsLocationParserRuleCall_27_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_locations_29_0=ruleLocation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTwitterQARule());
            	    						}
            	    						add(
            	    							current,
            	    							"locations",
            	    							lv_locations_29_0,
            	    							"ddm.TwitterQA.Location");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_30=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_30, grammarAccess.getTwitterQAAccess().getRightSquareBracketKeyword_28());
            		
            otherlv_31=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getTwitterQAAccess().getRightCurlyBracketKeyword_29());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTwitterQA"


    // $ANTLR start "entryRuleEString"
    // InternalTwitterQA.g:350:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTwitterQA.g:350:47: (iv_ruleEString= ruleEString EOF )
            // InternalTwitterQA.g:351:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalTwitterQA.g:357:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTwitterQA.g:363:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTwitterQA.g:364:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTwitterQA.g:364:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTwitterQA.g:365:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTwitterQA.g:373:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleGame"
    // InternalTwitterQA.g:384:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalTwitterQA.g:384:45: (iv_ruleGame= ruleGame EOF )
            // InternalTwitterQA.g:385:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalTwitterQA.g:391:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= 'is' ( (lv_description_5_0= ruleEString ) ) otherlv_6= 'city' otherlv_7= 'is' ( (lv_city_8_0= ruleEString ) ) otherlv_9= 'initial_test' otherlv_10= 'is' ( (lv_initial_test_11_0= ruleTest ) ) otherlv_12= 'tests' otherlv_13= 'are' otherlv_14= '[' ( (lv_tests_15_0= ruleTest ) ) (otherlv_16= ',' ( (lv_tests_17_0= ruleTest ) ) )* otherlv_18= ']' otherlv_19= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_city_8_0 = null;

        EObject lv_initial_test_11_0 = null;

        EObject lv_tests_15_0 = null;

        EObject lv_tests_17_0 = null;



        	enterRule();

        try {
            // InternalTwitterQA.g:397:2: ( (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= 'is' ( (lv_description_5_0= ruleEString ) ) otherlv_6= 'city' otherlv_7= 'is' ( (lv_city_8_0= ruleEString ) ) otherlv_9= 'initial_test' otherlv_10= 'is' ( (lv_initial_test_11_0= ruleTest ) ) otherlv_12= 'tests' otherlv_13= 'are' otherlv_14= '[' ( (lv_tests_15_0= ruleTest ) ) (otherlv_16= ',' ( (lv_tests_17_0= ruleTest ) ) )* otherlv_18= ']' otherlv_19= '}' ) )
            // InternalTwitterQA.g:398:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= 'is' ( (lv_description_5_0= ruleEString ) ) otherlv_6= 'city' otherlv_7= 'is' ( (lv_city_8_0= ruleEString ) ) otherlv_9= 'initial_test' otherlv_10= 'is' ( (lv_initial_test_11_0= ruleTest ) ) otherlv_12= 'tests' otherlv_13= 'are' otherlv_14= '[' ( (lv_tests_15_0= ruleTest ) ) (otherlv_16= ',' ( (lv_tests_17_0= ruleTest ) ) )* otherlv_18= ']' otherlv_19= '}' )
            {
            // InternalTwitterQA.g:398:2: (otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= 'is' ( (lv_description_5_0= ruleEString ) ) otherlv_6= 'city' otherlv_7= 'is' ( (lv_city_8_0= ruleEString ) ) otherlv_9= 'initial_test' otherlv_10= 'is' ( (lv_initial_test_11_0= ruleTest ) ) otherlv_12= 'tests' otherlv_13= 'are' otherlv_14= '[' ( (lv_tests_15_0= ruleTest ) ) (otherlv_16= ',' ( (lv_tests_17_0= ruleTest ) ) )* otherlv_18= ']' otherlv_19= '}' )
            // InternalTwitterQA.g:399:3: otherlv_0= 'Game' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'description' otherlv_4= 'is' ( (lv_description_5_0= ruleEString ) ) otherlv_6= 'city' otherlv_7= 'is' ( (lv_city_8_0= ruleEString ) ) otherlv_9= 'initial_test' otherlv_10= 'is' ( (lv_initial_test_11_0= ruleTest ) ) otherlv_12= 'tests' otherlv_13= 'are' otherlv_14= '[' ( (lv_tests_15_0= ruleTest ) ) (otherlv_16= ',' ( (lv_tests_17_0= ruleTest ) ) )* otherlv_18= ']' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            // InternalTwitterQA.g:403:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTwitterQA.g:404:4: (lv_name_1_0= ruleEString )
            {
            // InternalTwitterQA.g:404:4: (lv_name_1_0= ruleEString )
            // InternalTwitterQA.g:405:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getGameAccess().getDescriptionKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getGameAccess().getIsKeyword_4());
            		
            // InternalTwitterQA.g:434:3: ( (lv_description_5_0= ruleEString ) )
            // InternalTwitterQA.g:435:4: (lv_description_5_0= ruleEString )
            {
            // InternalTwitterQA.g:435:4: (lv_description_5_0= ruleEString )
            // InternalTwitterQA.g:436:5: lv_description_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getDescriptionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_description_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_5_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getGameAccess().getCityKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getGameAccess().getIsKeyword_7());
            		
            // InternalTwitterQA.g:461:3: ( (lv_city_8_0= ruleEString ) )
            // InternalTwitterQA.g:462:4: (lv_city_8_0= ruleEString )
            {
            // InternalTwitterQA.g:462:4: (lv_city_8_0= ruleEString )
            // InternalTwitterQA.g:463:5: lv_city_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getCityEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_21);
            lv_city_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"city",
            						lv_city_8_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getGameAccess().getInitial_testKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_22); 

            			newLeafNode(otherlv_10, grammarAccess.getGameAccess().getIsKeyword_10());
            		
            // InternalTwitterQA.g:488:3: ( (lv_initial_test_11_0= ruleTest ) )
            // InternalTwitterQA.g:489:4: (lv_initial_test_11_0= ruleTest )
            {
            // InternalTwitterQA.g:489:4: (lv_initial_test_11_0= ruleTest )
            // InternalTwitterQA.g:490:5: lv_initial_test_11_0= ruleTest
            {

            					newCompositeNode(grammarAccess.getGameAccess().getInitial_testTestParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_23);
            lv_initial_test_11_0=ruleTest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"initial_test",
            						lv_initial_test_11_0,
            						"ddm.TwitterQA.Test");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,30,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getGameAccess().getTestsKeyword_12());
            		
            otherlv_13=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getGameAccess().getAreKeyword_13());
            		
            otherlv_14=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_14, grammarAccess.getGameAccess().getLeftSquareBracketKeyword_14());
            		
            // InternalTwitterQA.g:519:3: ( (lv_tests_15_0= ruleTest ) )
            // InternalTwitterQA.g:520:4: (lv_tests_15_0= ruleTest )
            {
            // InternalTwitterQA.g:520:4: (lv_tests_15_0= ruleTest )
            // InternalTwitterQA.g:521:5: lv_tests_15_0= ruleTest
            {

            					newCompositeNode(grammarAccess.getGameAccess().getTestsTestParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_15);
            lv_tests_15_0=ruleTest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					add(
            						current,
            						"tests",
            						lv_tests_15_0,
            						"ddm.TwitterQA.Test");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTwitterQA.g:538:3: (otherlv_16= ',' ( (lv_tests_17_0= ruleTest ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTwitterQA.g:539:4: otherlv_16= ',' ( (lv_tests_17_0= ruleTest ) )
            	    {
            	    otherlv_16=(Token)match(input,22,FOLLOW_22); 

            	    				newLeafNode(otherlv_16, grammarAccess.getGameAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalTwitterQA.g:543:4: ( (lv_tests_17_0= ruleTest ) )
            	    // InternalTwitterQA.g:544:5: (lv_tests_17_0= ruleTest )
            	    {
            	    // InternalTwitterQA.g:544:5: (lv_tests_17_0= ruleTest )
            	    // InternalTwitterQA.g:545:6: lv_tests_17_0= ruleTest
            	    {

            	    						newCompositeNode(grammarAccess.getGameAccess().getTestsTestParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_tests_17_0=ruleTest();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tests",
            	    							lv_tests_17_0,
            	    							"ddm.TwitterQA.Test");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_18=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_18, grammarAccess.getGameAccess().getRightSquareBracketKeyword_17());
            		
            otherlv_19=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleLocation"
    // InternalTwitterQA.g:575:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalTwitterQA.g:575:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalTwitterQA.g:576:2: iv_ruleLocation= ruleLocation EOF
            {
             newCompositeNode(grammarAccess.getLocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocation=ruleLocation();

            state._fsp--;

             current =iv_ruleLocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // InternalTwitterQA.g:582:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'Location' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'latitude' otherlv_4= 'is' ( (lv_latitude_5_0= ruleEDouble ) ) otherlv_6= 'longitude' otherlv_7= 'is' ( (lv_longitude_8_0= ruleEDouble ) ) otherlv_9= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_latitude_5_0 = null;

        AntlrDatatypeRuleToken lv_longitude_8_0 = null;



        	enterRule();

        try {
            // InternalTwitterQA.g:588:2: ( (otherlv_0= 'Location' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'latitude' otherlv_4= 'is' ( (lv_latitude_5_0= ruleEDouble ) ) otherlv_6= 'longitude' otherlv_7= 'is' ( (lv_longitude_8_0= ruleEDouble ) ) otherlv_9= '}' ) )
            // InternalTwitterQA.g:589:2: (otherlv_0= 'Location' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'latitude' otherlv_4= 'is' ( (lv_latitude_5_0= ruleEDouble ) ) otherlv_6= 'longitude' otherlv_7= 'is' ( (lv_longitude_8_0= ruleEDouble ) ) otherlv_9= '}' )
            {
            // InternalTwitterQA.g:589:2: (otherlv_0= 'Location' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'latitude' otherlv_4= 'is' ( (lv_latitude_5_0= ruleEDouble ) ) otherlv_6= 'longitude' otherlv_7= 'is' ( (lv_longitude_8_0= ruleEDouble ) ) otherlv_9= '}' )
            // InternalTwitterQA.g:590:3: otherlv_0= 'Location' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'latitude' otherlv_4= 'is' ( (lv_latitude_5_0= ruleEDouble ) ) otherlv_6= 'longitude' otherlv_7= 'is' ( (lv_longitude_8_0= ruleEDouble ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
            		
            // InternalTwitterQA.g:594:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTwitterQA.g:595:4: (lv_name_1_0= ruleEString )
            {
            // InternalTwitterQA.g:595:4: (lv_name_1_0= ruleEString )
            // InternalTwitterQA.g:596:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getLatitudeKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getIsKeyword_4());
            		
            // InternalTwitterQA.g:625:3: ( (lv_latitude_5_0= ruleEDouble ) )
            // InternalTwitterQA.g:626:4: (lv_latitude_5_0= ruleEDouble )
            {
            // InternalTwitterQA.g:626:4: (lv_latitude_5_0= ruleEDouble )
            // InternalTwitterQA.g:627:5: lv_latitude_5_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLatitudeEDoubleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_latitude_5_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"latitude",
            						lv_latitude_5_0,
            						"ddm.TwitterQA.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getLocationAccess().getLongitudeKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getLocationAccess().getIsKeyword_7());
            		
            // InternalTwitterQA.g:652:3: ( (lv_longitude_8_0= ruleEDouble ) )
            // InternalTwitterQA.g:653:4: (lv_longitude_8_0= ruleEDouble )
            {
            // InternalTwitterQA.g:653:4: (lv_longitude_8_0= ruleEDouble )
            // InternalTwitterQA.g:654:5: lv_longitude_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLongitudeEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_18);
            lv_longitude_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"longitude",
            						lv_longitude_8_0,
            						"ddm.TwitterQA.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleTest"
    // InternalTwitterQA.g:679:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalTwitterQA.g:679:45: (iv_ruleTest= ruleTest EOF )
            // InternalTwitterQA.g:680:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalTwitterQA.g:686:1: ruleTest returns [EObject current=null] : (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'question' otherlv_4= 'is' ( (lv_question_5_0= ruleEString ) ) otherlv_6= 'order' otherlv_7= 'is' ( (lv_order_8_0= ruleEInt ) ) otherlv_9= 'answers' otherlv_10= 'are' otherlv_11= '[' ( (lv_answers_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleEString ) ) )* otherlv_15= ']' (otherlv_16= 'hints' otherlv_17= 'are' otherlv_18= '[' ( (lv_hints_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_hints_21_0= ruleEString ) ) )* otherlv_22= ']' )? otherlv_23= 'timelimit' otherlv_24= 'is' ( (lv_timelimit_25_0= ruleEInt ) ) otherlv_26= 'attempts' otherlv_27= 'is' ( (lv_attempts_28_0= ruleEInt ) ) otherlv_29= 'reward' otherlv_30= 'is' ( (lv_reward_31_0= ruleEInt ) ) otherlv_32= 'location' otherlv_33= 'is' ( ( ruleEString ) ) (otherlv_35= 'on_correct' otherlv_36= 'is' ( ( ruleEString ) ) )? (otherlv_38= 'on_timeout' otherlv_39= 'is' ( ( ruleEString ) ) )? (otherlv_41= 'on_fail' otherlv_42= 'is' ( ( ruleEString ) ) )? otherlv_44= '}' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_question_5_0 = null;

        AntlrDatatypeRuleToken lv_order_8_0 = null;

        AntlrDatatypeRuleToken lv_answers_12_0 = null;

        AntlrDatatypeRuleToken lv_answers_14_0 = null;

        AntlrDatatypeRuleToken lv_hints_19_0 = null;

        AntlrDatatypeRuleToken lv_hints_21_0 = null;

        AntlrDatatypeRuleToken lv_timelimit_25_0 = null;

        AntlrDatatypeRuleToken lv_attempts_28_0 = null;

        AntlrDatatypeRuleToken lv_reward_31_0 = null;



        	enterRule();

        try {
            // InternalTwitterQA.g:692:2: ( (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'question' otherlv_4= 'is' ( (lv_question_5_0= ruleEString ) ) otherlv_6= 'order' otherlv_7= 'is' ( (lv_order_8_0= ruleEInt ) ) otherlv_9= 'answers' otherlv_10= 'are' otherlv_11= '[' ( (lv_answers_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleEString ) ) )* otherlv_15= ']' (otherlv_16= 'hints' otherlv_17= 'are' otherlv_18= '[' ( (lv_hints_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_hints_21_0= ruleEString ) ) )* otherlv_22= ']' )? otherlv_23= 'timelimit' otherlv_24= 'is' ( (lv_timelimit_25_0= ruleEInt ) ) otherlv_26= 'attempts' otherlv_27= 'is' ( (lv_attempts_28_0= ruleEInt ) ) otherlv_29= 'reward' otherlv_30= 'is' ( (lv_reward_31_0= ruleEInt ) ) otherlv_32= 'location' otherlv_33= 'is' ( ( ruleEString ) ) (otherlv_35= 'on_correct' otherlv_36= 'is' ( ( ruleEString ) ) )? (otherlv_38= 'on_timeout' otherlv_39= 'is' ( ( ruleEString ) ) )? (otherlv_41= 'on_fail' otherlv_42= 'is' ( ( ruleEString ) ) )? otherlv_44= '}' ) )
            // InternalTwitterQA.g:693:2: (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'question' otherlv_4= 'is' ( (lv_question_5_0= ruleEString ) ) otherlv_6= 'order' otherlv_7= 'is' ( (lv_order_8_0= ruleEInt ) ) otherlv_9= 'answers' otherlv_10= 'are' otherlv_11= '[' ( (lv_answers_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleEString ) ) )* otherlv_15= ']' (otherlv_16= 'hints' otherlv_17= 'are' otherlv_18= '[' ( (lv_hints_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_hints_21_0= ruleEString ) ) )* otherlv_22= ']' )? otherlv_23= 'timelimit' otherlv_24= 'is' ( (lv_timelimit_25_0= ruleEInt ) ) otherlv_26= 'attempts' otherlv_27= 'is' ( (lv_attempts_28_0= ruleEInt ) ) otherlv_29= 'reward' otherlv_30= 'is' ( (lv_reward_31_0= ruleEInt ) ) otherlv_32= 'location' otherlv_33= 'is' ( ( ruleEString ) ) (otherlv_35= 'on_correct' otherlv_36= 'is' ( ( ruleEString ) ) )? (otherlv_38= 'on_timeout' otherlv_39= 'is' ( ( ruleEString ) ) )? (otherlv_41= 'on_fail' otherlv_42= 'is' ( ( ruleEString ) ) )? otherlv_44= '}' )
            {
            // InternalTwitterQA.g:693:2: (otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'question' otherlv_4= 'is' ( (lv_question_5_0= ruleEString ) ) otherlv_6= 'order' otherlv_7= 'is' ( (lv_order_8_0= ruleEInt ) ) otherlv_9= 'answers' otherlv_10= 'are' otherlv_11= '[' ( (lv_answers_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleEString ) ) )* otherlv_15= ']' (otherlv_16= 'hints' otherlv_17= 'are' otherlv_18= '[' ( (lv_hints_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_hints_21_0= ruleEString ) ) )* otherlv_22= ']' )? otherlv_23= 'timelimit' otherlv_24= 'is' ( (lv_timelimit_25_0= ruleEInt ) ) otherlv_26= 'attempts' otherlv_27= 'is' ( (lv_attempts_28_0= ruleEInt ) ) otherlv_29= 'reward' otherlv_30= 'is' ( (lv_reward_31_0= ruleEInt ) ) otherlv_32= 'location' otherlv_33= 'is' ( ( ruleEString ) ) (otherlv_35= 'on_correct' otherlv_36= 'is' ( ( ruleEString ) ) )? (otherlv_38= 'on_timeout' otherlv_39= 'is' ( ( ruleEString ) ) )? (otherlv_41= 'on_fail' otherlv_42= 'is' ( ( ruleEString ) ) )? otherlv_44= '}' )
            // InternalTwitterQA.g:694:3: otherlv_0= 'Test' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'question' otherlv_4= 'is' ( (lv_question_5_0= ruleEString ) ) otherlv_6= 'order' otherlv_7= 'is' ( (lv_order_8_0= ruleEInt ) ) otherlv_9= 'answers' otherlv_10= 'are' otherlv_11= '[' ( (lv_answers_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_answers_14_0= ruleEString ) ) )* otherlv_15= ']' (otherlv_16= 'hints' otherlv_17= 'are' otherlv_18= '[' ( (lv_hints_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_hints_21_0= ruleEString ) ) )* otherlv_22= ']' )? otherlv_23= 'timelimit' otherlv_24= 'is' ( (lv_timelimit_25_0= ruleEInt ) ) otherlv_26= 'attempts' otherlv_27= 'is' ( (lv_attempts_28_0= ruleEInt ) ) otherlv_29= 'reward' otherlv_30= 'is' ( (lv_reward_31_0= ruleEInt ) ) otherlv_32= 'location' otherlv_33= 'is' ( ( ruleEString ) ) (otherlv_35= 'on_correct' otherlv_36= 'is' ( ( ruleEString ) ) )? (otherlv_38= 'on_timeout' otherlv_39= 'is' ( ( ruleEString ) ) )? (otherlv_41= 'on_fail' otherlv_42= 'is' ( ( ruleEString ) ) )? otherlv_44= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalTwitterQA.g:698:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTwitterQA.g:699:4: (lv_name_1_0= ruleEString )
            {
            // InternalTwitterQA.g:699:4: (lv_name_1_0= ruleEString )
            // InternalTwitterQA.g:700:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getQuestionKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getTestAccess().getIsKeyword_4());
            		
            // InternalTwitterQA.g:729:3: ( (lv_question_5_0= ruleEString ) )
            // InternalTwitterQA.g:730:4: (lv_question_5_0= ruleEString )
            {
            // InternalTwitterQA.g:730:4: (lv_question_5_0= ruleEString )
            // InternalTwitterQA.g:731:5: lv_question_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestAccess().getQuestionEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_28);
            lv_question_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"question",
            						lv_question_5_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getTestAccess().getOrderKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getTestAccess().getIsKeyword_7());
            		
            // InternalTwitterQA.g:756:3: ( (lv_order_8_0= ruleEInt ) )
            // InternalTwitterQA.g:757:4: (lv_order_8_0= ruleEInt )
            {
            // InternalTwitterQA.g:757:4: (lv_order_8_0= ruleEInt )
            // InternalTwitterQA.g:758:5: lv_order_8_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTestAccess().getOrderEIntParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_30);
            lv_order_8_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"order",
            						lv_order_8_0,
            						"ddm.TwitterQA.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,37,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getTestAccess().getAnswersKeyword_9());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_10, grammarAccess.getTestAccess().getAreKeyword_10());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getTestAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalTwitterQA.g:787:3: ( (lv_answers_12_0= ruleEString ) )
            // InternalTwitterQA.g:788:4: (lv_answers_12_0= ruleEString )
            {
            // InternalTwitterQA.g:788:4: (lv_answers_12_0= ruleEString )
            // InternalTwitterQA.g:789:5: lv_answers_12_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestAccess().getAnswersEStringParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_15);
            lv_answers_12_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					add(
            						current,
            						"answers",
            						lv_answers_12_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTwitterQA.g:806:3: (otherlv_13= ',' ( (lv_answers_14_0= ruleEString ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTwitterQA.g:807:4: otherlv_13= ',' ( (lv_answers_14_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,22,FOLLOW_6); 

            	    				newLeafNode(otherlv_13, grammarAccess.getTestAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalTwitterQA.g:811:4: ( (lv_answers_14_0= ruleEString ) )
            	    // InternalTwitterQA.g:812:5: (lv_answers_14_0= ruleEString )
            	    {
            	    // InternalTwitterQA.g:812:5: (lv_answers_14_0= ruleEString )
            	    // InternalTwitterQA.g:813:6: lv_answers_14_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getTestAccess().getAnswersEStringParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_answers_14_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"answers",
            	    							lv_answers_14_0,
            	    							"ddm.TwitterQA.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_15=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_15, grammarAccess.getTestAccess().getRightSquareBracketKeyword_14());
            		
            // InternalTwitterQA.g:835:3: (otherlv_16= 'hints' otherlv_17= 'are' otherlv_18= '[' ( (lv_hints_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_hints_21_0= ruleEString ) ) )* otherlv_22= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTwitterQA.g:836:4: otherlv_16= 'hints' otherlv_17= 'are' otherlv_18= '[' ( (lv_hints_19_0= ruleEString ) ) (otherlv_20= ',' ( (lv_hints_21_0= ruleEString ) ) )* otherlv_22= ']'
                    {
                    otherlv_16=(Token)match(input,38,FOLLOW_12); 

                    				newLeafNode(otherlv_16, grammarAccess.getTestAccess().getHintsKeyword_15_0());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_17, grammarAccess.getTestAccess().getAreKeyword_15_1());
                    			
                    otherlv_18=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_18, grammarAccess.getTestAccess().getLeftSquareBracketKeyword_15_2());
                    			
                    // InternalTwitterQA.g:848:4: ( (lv_hints_19_0= ruleEString ) )
                    // InternalTwitterQA.g:849:5: (lv_hints_19_0= ruleEString )
                    {
                    // InternalTwitterQA.g:849:5: (lv_hints_19_0= ruleEString )
                    // InternalTwitterQA.g:850:6: lv_hints_19_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTestAccess().getHintsEStringParserRuleCall_15_3_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_hints_19_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestRule());
                    						}
                    						add(
                    							current,
                    							"hints",
                    							lv_hints_19_0,
                    							"ddm.TwitterQA.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTwitterQA.g:867:4: (otherlv_20= ',' ( (lv_hints_21_0= ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==22) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTwitterQA.g:868:5: otherlv_20= ',' ( (lv_hints_21_0= ruleEString ) )
                    	    {
                    	    otherlv_20=(Token)match(input,22,FOLLOW_6); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getTestAccess().getCommaKeyword_15_4_0());
                    	    				
                    	    // InternalTwitterQA.g:872:5: ( (lv_hints_21_0= ruleEString ) )
                    	    // InternalTwitterQA.g:873:6: (lv_hints_21_0= ruleEString )
                    	    {
                    	    // InternalTwitterQA.g:873:6: (lv_hints_21_0= ruleEString )
                    	    // InternalTwitterQA.g:874:7: lv_hints_21_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getTestAccess().getHintsEStringParserRuleCall_15_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_hints_21_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTestRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"hints",
                    	    								lv_hints_21_0,
                    	    								"ddm.TwitterQA.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,23,FOLLOW_32); 

                    				newLeafNode(otherlv_22, grammarAccess.getTestAccess().getRightSquareBracketKeyword_15_5());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_23, grammarAccess.getTestAccess().getTimelimitKeyword_16());
            		
            otherlv_24=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_24, grammarAccess.getTestAccess().getIsKeyword_17());
            		
            // InternalTwitterQA.g:905:3: ( (lv_timelimit_25_0= ruleEInt ) )
            // InternalTwitterQA.g:906:4: (lv_timelimit_25_0= ruleEInt )
            {
            // InternalTwitterQA.g:906:4: (lv_timelimit_25_0= ruleEInt )
            // InternalTwitterQA.g:907:5: lv_timelimit_25_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTestAccess().getTimelimitEIntParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_33);
            lv_timelimit_25_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"timelimit",
            						lv_timelimit_25_0,
            						"ddm.TwitterQA.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_26=(Token)match(input,40,FOLLOW_5); 

            			newLeafNode(otherlv_26, grammarAccess.getTestAccess().getAttemptsKeyword_19());
            		
            otherlv_27=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_27, grammarAccess.getTestAccess().getIsKeyword_20());
            		
            // InternalTwitterQA.g:932:3: ( (lv_attempts_28_0= ruleEInt ) )
            // InternalTwitterQA.g:933:4: (lv_attempts_28_0= ruleEInt )
            {
            // InternalTwitterQA.g:933:4: (lv_attempts_28_0= ruleEInt )
            // InternalTwitterQA.g:934:5: lv_attempts_28_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTestAccess().getAttemptsEIntParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_34);
            lv_attempts_28_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"attempts",
            						lv_attempts_28_0,
            						"ddm.TwitterQA.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_29=(Token)match(input,41,FOLLOW_5); 

            			newLeafNode(otherlv_29, grammarAccess.getTestAccess().getRewardKeyword_22());
            		
            otherlv_30=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_30, grammarAccess.getTestAccess().getIsKeyword_23());
            		
            // InternalTwitterQA.g:959:3: ( (lv_reward_31_0= ruleEInt ) )
            // InternalTwitterQA.g:960:4: (lv_reward_31_0= ruleEInt )
            {
            // InternalTwitterQA.g:960:4: (lv_reward_31_0= ruleEInt )
            // InternalTwitterQA.g:961:5: lv_reward_31_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTestAccess().getRewardEIntParserRuleCall_24_0());
            				
            pushFollow(FOLLOW_35);
            lv_reward_31_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"reward",
            						lv_reward_31_0,
            						"ddm.TwitterQA.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_32=(Token)match(input,42,FOLLOW_5); 

            			newLeafNode(otherlv_32, grammarAccess.getTestAccess().getLocationKeyword_25());
            		
            otherlv_33=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_33, grammarAccess.getTestAccess().getIsKeyword_26());
            		
            // InternalTwitterQA.g:986:3: ( ( ruleEString ) )
            // InternalTwitterQA.g:987:4: ( ruleEString )
            {
            // InternalTwitterQA.g:987:4: ( ruleEString )
            // InternalTwitterQA.g:988:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTestAccess().getLocationLocationCrossReference_27_0());
            				
            pushFollow(FOLLOW_36);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTwitterQA.g:1002:3: (otherlv_35= 'on_correct' otherlv_36= 'is' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==43) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTwitterQA.g:1003:4: otherlv_35= 'on_correct' otherlv_36= 'is' ( ( ruleEString ) )
                    {
                    otherlv_35=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_35, grammarAccess.getTestAccess().getOn_correctKeyword_28_0());
                    			
                    otherlv_36=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_36, grammarAccess.getTestAccess().getIsKeyword_28_1());
                    			
                    // InternalTwitterQA.g:1011:4: ( ( ruleEString ) )
                    // InternalTwitterQA.g:1012:5: ( ruleEString )
                    {
                    // InternalTwitterQA.g:1012:5: ( ruleEString )
                    // InternalTwitterQA.g:1013:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTestAccess().getOn_correctTestCrossReference_28_2_0());
                    					
                    pushFollow(FOLLOW_37);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTwitterQA.g:1028:3: (otherlv_38= 'on_timeout' otherlv_39= 'is' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==44) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTwitterQA.g:1029:4: otherlv_38= 'on_timeout' otherlv_39= 'is' ( ( ruleEString ) )
                    {
                    otherlv_38=(Token)match(input,44,FOLLOW_5); 

                    				newLeafNode(otherlv_38, grammarAccess.getTestAccess().getOn_timeoutKeyword_29_0());
                    			
                    otherlv_39=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_39, grammarAccess.getTestAccess().getIsKeyword_29_1());
                    			
                    // InternalTwitterQA.g:1037:4: ( ( ruleEString ) )
                    // InternalTwitterQA.g:1038:5: ( ruleEString )
                    {
                    // InternalTwitterQA.g:1038:5: ( ruleEString )
                    // InternalTwitterQA.g:1039:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTestAccess().getOn_timeoutTestCrossReference_29_2_0());
                    					
                    pushFollow(FOLLOW_38);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTwitterQA.g:1054:3: (otherlv_41= 'on_fail' otherlv_42= 'is' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTwitterQA.g:1055:4: otherlv_41= 'on_fail' otherlv_42= 'is' ( ( ruleEString ) )
                    {
                    otherlv_41=(Token)match(input,45,FOLLOW_5); 

                    				newLeafNode(otherlv_41, grammarAccess.getTestAccess().getOn_failKeyword_30_0());
                    			
                    otherlv_42=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_42, grammarAccess.getTestAccess().getIsKeyword_30_1());
                    			
                    // InternalTwitterQA.g:1063:4: ( ( ruleEString ) )
                    // InternalTwitterQA.g:1064:5: ( ruleEString )
                    {
                    // InternalTwitterQA.g:1064:5: ( ruleEString )
                    // InternalTwitterQA.g:1065:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTestAccess().getOn_failTestCrossReference_30_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_44=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_44, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_31());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleEInt"
    // InternalTwitterQA.g:1088:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTwitterQA.g:1088:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTwitterQA.g:1089:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalTwitterQA.g:1095:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTwitterQA.g:1101:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTwitterQA.g:1102:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTwitterQA.g:1102:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTwitterQA.g:1103:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTwitterQA.g:1103:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==46) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTwitterQA.g:1104:4: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEDouble"
    // InternalTwitterQA.g:1121:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalTwitterQA.g:1121:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalTwitterQA.g:1122:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalTwitterQA.g:1128:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTwitterQA.g:1134:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTwitterQA.g:1135:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTwitterQA.g:1135:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTwitterQA.g:1136:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTwitterQA.g:1136:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==46) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTwitterQA.g:1137:4: kw= '-'
                    {
                    kw=(Token)match(input,46,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTwitterQA.g:1143:3: (this_INT_1= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTwitterQA.g:1144:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_41); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,47,FOLLOW_39); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_42); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalTwitterQA.g:1164:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=48 && LA16_0<=49)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTwitterQA.g:1165:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTwitterQA.g:1165:4: (kw= 'E' | kw= 'e' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==48) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==49) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalTwitterQA.g:1166:5: kw= 'E'
                            {
                            kw=(Token)match(input,48,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTwitterQA.g:1172:5: kw= 'e'
                            {
                            kw=(Token)match(input,49,FOLLOW_29); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTwitterQA.g:1178:4: (kw= '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==46) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalTwitterQA.g:1179:5: kw= '-'
                            {
                            kw=(Token)match(input,46,FOLLOW_39); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

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
    // $ANTLR end "ruleEDouble"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000C00000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000380002000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000300002000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200002000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0003000000000002L});

}