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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TwitterQA'", "'{'", "'consumer_key'", "'consumer_secret'", "'access_token'", "'access_token_secret'", "'welcome_msg'", "'games'", "','", "'}'", "'locations'", "'Game'", "'description'", "'city'", "'initial_test'", "'tests'", "'Location'", "'latitude'", "'longitude'", "'Test'", "'question'", "'answers'", "'hints'", "'timelimit'", "'attempts'", "'reward'", "'location'", "'on_correct'", "'on_timeout'", "'on_fail'", "'-'", "'.'", "'E'", "'e'"
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
    public static final int T__44=44;
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
    // InternalTwitterQA.g:71:1: ruleTwitterQA returns [EObject current=null] : (otherlv_0= 'TwitterQA' otherlv_1= '{' otherlv_2= 'consumer_key' ( (lv_consumer_key_3_0= ruleEString ) ) otherlv_4= 'consumer_secret' ( (lv_consumer_secret_5_0= ruleEString ) ) otherlv_6= 'access_token' ( (lv_access_token_7_0= ruleEString ) ) otherlv_8= 'access_token_secret' ( (lv_access_token_secret_9_0= ruleEString ) ) otherlv_10= 'welcome_msg' ( (lv_welcome_msg_11_0= ruleEString ) ) otherlv_12= 'games' otherlv_13= '{' ( (lv_games_14_0= ruleGame ) ) (otherlv_15= ',' ( (lv_games_16_0= ruleGame ) ) )* otherlv_17= '}' otherlv_18= 'locations' otherlv_19= '{' ( (lv_locations_20_0= ruleLocation ) ) (otherlv_21= ',' ( (lv_locations_22_0= ruleLocation ) ) )* otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject ruleTwitterQA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_consumer_key_3_0 = null;

        AntlrDatatypeRuleToken lv_consumer_secret_5_0 = null;

        AntlrDatatypeRuleToken lv_access_token_7_0 = null;

        AntlrDatatypeRuleToken lv_access_token_secret_9_0 = null;

        AntlrDatatypeRuleToken lv_welcome_msg_11_0 = null;

        EObject lv_games_14_0 = null;

        EObject lv_games_16_0 = null;

        EObject lv_locations_20_0 = null;

        EObject lv_locations_22_0 = null;



        	enterRule();

        try {
            // InternalTwitterQA.g:77:2: ( (otherlv_0= 'TwitterQA' otherlv_1= '{' otherlv_2= 'consumer_key' ( (lv_consumer_key_3_0= ruleEString ) ) otherlv_4= 'consumer_secret' ( (lv_consumer_secret_5_0= ruleEString ) ) otherlv_6= 'access_token' ( (lv_access_token_7_0= ruleEString ) ) otherlv_8= 'access_token_secret' ( (lv_access_token_secret_9_0= ruleEString ) ) otherlv_10= 'welcome_msg' ( (lv_welcome_msg_11_0= ruleEString ) ) otherlv_12= 'games' otherlv_13= '{' ( (lv_games_14_0= ruleGame ) ) (otherlv_15= ',' ( (lv_games_16_0= ruleGame ) ) )* otherlv_17= '}' otherlv_18= 'locations' otherlv_19= '{' ( (lv_locations_20_0= ruleLocation ) ) (otherlv_21= ',' ( (lv_locations_22_0= ruleLocation ) ) )* otherlv_23= '}' otherlv_24= '}' ) )
            // InternalTwitterQA.g:78:2: (otherlv_0= 'TwitterQA' otherlv_1= '{' otherlv_2= 'consumer_key' ( (lv_consumer_key_3_0= ruleEString ) ) otherlv_4= 'consumer_secret' ( (lv_consumer_secret_5_0= ruleEString ) ) otherlv_6= 'access_token' ( (lv_access_token_7_0= ruleEString ) ) otherlv_8= 'access_token_secret' ( (lv_access_token_secret_9_0= ruleEString ) ) otherlv_10= 'welcome_msg' ( (lv_welcome_msg_11_0= ruleEString ) ) otherlv_12= 'games' otherlv_13= '{' ( (lv_games_14_0= ruleGame ) ) (otherlv_15= ',' ( (lv_games_16_0= ruleGame ) ) )* otherlv_17= '}' otherlv_18= 'locations' otherlv_19= '{' ( (lv_locations_20_0= ruleLocation ) ) (otherlv_21= ',' ( (lv_locations_22_0= ruleLocation ) ) )* otherlv_23= '}' otherlv_24= '}' )
            {
            // InternalTwitterQA.g:78:2: (otherlv_0= 'TwitterQA' otherlv_1= '{' otherlv_2= 'consumer_key' ( (lv_consumer_key_3_0= ruleEString ) ) otherlv_4= 'consumer_secret' ( (lv_consumer_secret_5_0= ruleEString ) ) otherlv_6= 'access_token' ( (lv_access_token_7_0= ruleEString ) ) otherlv_8= 'access_token_secret' ( (lv_access_token_secret_9_0= ruleEString ) ) otherlv_10= 'welcome_msg' ( (lv_welcome_msg_11_0= ruleEString ) ) otherlv_12= 'games' otherlv_13= '{' ( (lv_games_14_0= ruleGame ) ) (otherlv_15= ',' ( (lv_games_16_0= ruleGame ) ) )* otherlv_17= '}' otherlv_18= 'locations' otherlv_19= '{' ( (lv_locations_20_0= ruleLocation ) ) (otherlv_21= ',' ( (lv_locations_22_0= ruleLocation ) ) )* otherlv_23= '}' otherlv_24= '}' )
            // InternalTwitterQA.g:79:3: otherlv_0= 'TwitterQA' otherlv_1= '{' otherlv_2= 'consumer_key' ( (lv_consumer_key_3_0= ruleEString ) ) otherlv_4= 'consumer_secret' ( (lv_consumer_secret_5_0= ruleEString ) ) otherlv_6= 'access_token' ( (lv_access_token_7_0= ruleEString ) ) otherlv_8= 'access_token_secret' ( (lv_access_token_secret_9_0= ruleEString ) ) otherlv_10= 'welcome_msg' ( (lv_welcome_msg_11_0= ruleEString ) ) otherlv_12= 'games' otherlv_13= '{' ( (lv_games_14_0= ruleGame ) ) (otherlv_15= ',' ( (lv_games_16_0= ruleGame ) ) )* otherlv_17= '}' otherlv_18= 'locations' otherlv_19= '{' ( (lv_locations_20_0= ruleLocation ) ) (otherlv_21= ',' ( (lv_locations_22_0= ruleLocation ) ) )* otherlv_23= '}' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTwitterQAAccess().getTwitterQAKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTwitterQAAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTwitterQAAccess().getConsumer_keyKeyword_2());
            		
            // InternalTwitterQA.g:91:3: ( (lv_consumer_key_3_0= ruleEString ) )
            // InternalTwitterQA.g:92:4: (lv_consumer_key_3_0= ruleEString )
            {
            // InternalTwitterQA.g:92:4: (lv_consumer_key_3_0= ruleEString )
            // InternalTwitterQA.g:93:5: lv_consumer_key_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getConsumer_keyEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_consumer_key_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					set(
            						current,
            						"consumer_key",
            						lv_consumer_key_3_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getTwitterQAAccess().getConsumer_secretKeyword_4());
            		
            // InternalTwitterQA.g:114:3: ( (lv_consumer_secret_5_0= ruleEString ) )
            // InternalTwitterQA.g:115:4: (lv_consumer_secret_5_0= ruleEString )
            {
            // InternalTwitterQA.g:115:4: (lv_consumer_secret_5_0= ruleEString )
            // InternalTwitterQA.g:116:5: lv_consumer_secret_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getConsumer_secretEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_consumer_secret_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					set(
            						current,
            						"consumer_secret",
            						lv_consumer_secret_5_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getTwitterQAAccess().getAccess_tokenKeyword_6());
            		
            // InternalTwitterQA.g:137:3: ( (lv_access_token_7_0= ruleEString ) )
            // InternalTwitterQA.g:138:4: (lv_access_token_7_0= ruleEString )
            {
            // InternalTwitterQA.g:138:4: (lv_access_token_7_0= ruleEString )
            // InternalTwitterQA.g:139:5: lv_access_token_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getAccess_tokenEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_access_token_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					set(
            						current,
            						"access_token",
            						lv_access_token_7_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getTwitterQAAccess().getAccess_token_secretKeyword_8());
            		
            // InternalTwitterQA.g:160:3: ( (lv_access_token_secret_9_0= ruleEString ) )
            // InternalTwitterQA.g:161:4: (lv_access_token_secret_9_0= ruleEString )
            {
            // InternalTwitterQA.g:161:4: (lv_access_token_secret_9_0= ruleEString )
            // InternalTwitterQA.g:162:5: lv_access_token_secret_9_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getAccess_token_secretEStringParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_access_token_secret_9_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					set(
            						current,
            						"access_token_secret",
            						lv_access_token_secret_9_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_10, grammarAccess.getTwitterQAAccess().getWelcome_msgKeyword_10());
            		
            // InternalTwitterQA.g:183:3: ( (lv_welcome_msg_11_0= ruleEString ) )
            // InternalTwitterQA.g:184:4: (lv_welcome_msg_11_0= ruleEString )
            {
            // InternalTwitterQA.g:184:4: (lv_welcome_msg_11_0= ruleEString )
            // InternalTwitterQA.g:185:5: lv_welcome_msg_11_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getWelcome_msgEStringParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_10);
            lv_welcome_msg_11_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					set(
            						current,
            						"welcome_msg",
            						lv_welcome_msg_11_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getTwitterQAAccess().getGamesKeyword_12());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getTwitterQAAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalTwitterQA.g:210:3: ( (lv_games_14_0= ruleGame ) )
            // InternalTwitterQA.g:211:4: (lv_games_14_0= ruleGame )
            {
            // InternalTwitterQA.g:211:4: (lv_games_14_0= ruleGame )
            // InternalTwitterQA.g:212:5: lv_games_14_0= ruleGame
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getGamesGameParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_12);
            lv_games_14_0=ruleGame();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					add(
            						current,
            						"games",
            						lv_games_14_0,
            						"ddm.TwitterQA.Game");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTwitterQA.g:229:3: (otherlv_15= ',' ( (lv_games_16_0= ruleGame ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTwitterQA.g:230:4: otherlv_15= ',' ( (lv_games_16_0= ruleGame ) )
            	    {
            	    otherlv_15=(Token)match(input,19,FOLLOW_11); 

            	    				newLeafNode(otherlv_15, grammarAccess.getTwitterQAAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalTwitterQA.g:234:4: ( (lv_games_16_0= ruleGame ) )
            	    // InternalTwitterQA.g:235:5: (lv_games_16_0= ruleGame )
            	    {
            	    // InternalTwitterQA.g:235:5: (lv_games_16_0= ruleGame )
            	    // InternalTwitterQA.g:236:6: lv_games_16_0= ruleGame
            	    {

            	    						newCompositeNode(grammarAccess.getTwitterQAAccess().getGamesGameParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_games_16_0=ruleGame();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTwitterQARule());
            	    						}
            	    						add(
            	    							current,
            	    							"games",
            	    							lv_games_16_0,
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

            otherlv_17=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getTwitterQAAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_18=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getTwitterQAAccess().getLocationsKeyword_17());
            		
            otherlv_19=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_19, grammarAccess.getTwitterQAAccess().getLeftCurlyBracketKeyword_18());
            		
            // InternalTwitterQA.g:266:3: ( (lv_locations_20_0= ruleLocation ) )
            // InternalTwitterQA.g:267:4: (lv_locations_20_0= ruleLocation )
            {
            // InternalTwitterQA.g:267:4: (lv_locations_20_0= ruleLocation )
            // InternalTwitterQA.g:268:5: lv_locations_20_0= ruleLocation
            {

            					newCompositeNode(grammarAccess.getTwitterQAAccess().getLocationsLocationParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_12);
            lv_locations_20_0=ruleLocation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTwitterQARule());
            					}
            					add(
            						current,
            						"locations",
            						lv_locations_20_0,
            						"ddm.TwitterQA.Location");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTwitterQA.g:285:3: (otherlv_21= ',' ( (lv_locations_22_0= ruleLocation ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTwitterQA.g:286:4: otherlv_21= ',' ( (lv_locations_22_0= ruleLocation ) )
            	    {
            	    otherlv_21=(Token)match(input,19,FOLLOW_14); 

            	    				newLeafNode(otherlv_21, grammarAccess.getTwitterQAAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalTwitterQA.g:290:4: ( (lv_locations_22_0= ruleLocation ) )
            	    // InternalTwitterQA.g:291:5: (lv_locations_22_0= ruleLocation )
            	    {
            	    // InternalTwitterQA.g:291:5: (lv_locations_22_0= ruleLocation )
            	    // InternalTwitterQA.g:292:6: lv_locations_22_0= ruleLocation
            	    {

            	    						newCompositeNode(grammarAccess.getTwitterQAAccess().getLocationsLocationParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_locations_22_0=ruleLocation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTwitterQARule());
            	    						}
            	    						add(
            	    							current,
            	    							"locations",
            	    							lv_locations_22_0,
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

            otherlv_23=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_23, grammarAccess.getTwitterQAAccess().getRightCurlyBracketKeyword_21());
            		
            otherlv_24=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getTwitterQAAccess().getRightCurlyBracketKeyword_22());
            		

            }


            }


            	leaveRule();

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
    // InternalTwitterQA.g:322:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTwitterQA.g:322:47: (iv_ruleEString= ruleEString EOF )
            // InternalTwitterQA.g:323:2: iv_ruleEString= ruleEString EOF
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
    // InternalTwitterQA.g:329:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTwitterQA.g:335:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTwitterQA.g:336:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTwitterQA.g:336:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalTwitterQA.g:337:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTwitterQA.g:345:3: this_ID_1= RULE_ID
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
    // InternalTwitterQA.g:356:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalTwitterQA.g:356:45: (iv_ruleGame= ruleGame EOF )
            // InternalTwitterQA.g:357:2: iv_ruleGame= ruleGame EOF
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
    // InternalTwitterQA.g:363:1: ruleGame returns [EObject current=null] : (otherlv_0= 'Game' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) otherlv_7= 'initial_test' ( (lv_initial_test_8_0= ruleTest ) ) otherlv_9= 'tests' otherlv_10= '{' ( (lv_tests_11_0= ruleTest ) ) (otherlv_12= ',' ( (lv_tests_13_0= ruleTest ) ) )* otherlv_14= '}' otherlv_15= '}' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        AntlrDatatypeRuleToken lv_city_6_0 = null;

        EObject lv_initial_test_8_0 = null;

        EObject lv_tests_11_0 = null;

        EObject lv_tests_13_0 = null;



        	enterRule();

        try {
            // InternalTwitterQA.g:369:2: ( (otherlv_0= 'Game' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) otherlv_7= 'initial_test' ( (lv_initial_test_8_0= ruleTest ) ) otherlv_9= 'tests' otherlv_10= '{' ( (lv_tests_11_0= ruleTest ) ) (otherlv_12= ',' ( (lv_tests_13_0= ruleTest ) ) )* otherlv_14= '}' otherlv_15= '}' ) )
            // InternalTwitterQA.g:370:2: (otherlv_0= 'Game' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) otherlv_7= 'initial_test' ( (lv_initial_test_8_0= ruleTest ) ) otherlv_9= 'tests' otherlv_10= '{' ( (lv_tests_11_0= ruleTest ) ) (otherlv_12= ',' ( (lv_tests_13_0= ruleTest ) ) )* otherlv_14= '}' otherlv_15= '}' )
            {
            // InternalTwitterQA.g:370:2: (otherlv_0= 'Game' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) otherlv_7= 'initial_test' ( (lv_initial_test_8_0= ruleTest ) ) otherlv_9= 'tests' otherlv_10= '{' ( (lv_tests_11_0= ruleTest ) ) (otherlv_12= ',' ( (lv_tests_13_0= ruleTest ) ) )* otherlv_14= '}' otherlv_15= '}' )
            // InternalTwitterQA.g:371:3: otherlv_0= 'Game' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'description' ( (lv_description_4_0= ruleEString ) ) otherlv_5= 'city' ( (lv_city_6_0= ruleEString ) ) otherlv_7= 'initial_test' ( (lv_initial_test_8_0= ruleTest ) ) otherlv_9= 'tests' otherlv_10= '{' ( (lv_tests_11_0= ruleTest ) ) (otherlv_12= ',' ( (lv_tests_13_0= ruleTest ) ) )* otherlv_14= '}' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
            		
            // InternalTwitterQA.g:375:3: ( (lv_id_1_0= ruleEString ) )
            // InternalTwitterQA.g:376:4: (lv_id_1_0= ruleEString )
            {
            // InternalTwitterQA.g:376:4: (lv_id_1_0= ruleEString )
            // InternalTwitterQA.g:377:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getGameAccess().getDescriptionKeyword_3());
            		
            // InternalTwitterQA.g:402:3: ( (lv_description_4_0= ruleEString ) )
            // InternalTwitterQA.g:403:4: (lv_description_4_0= ruleEString )
            {
            // InternalTwitterQA.g:403:4: (lv_description_4_0= ruleEString )
            // InternalTwitterQA.g:404:5: lv_description_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getDescriptionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_description_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_4_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getGameAccess().getCityKeyword_5());
            		
            // InternalTwitterQA.g:425:3: ( (lv_city_6_0= ruleEString ) )
            // InternalTwitterQA.g:426:4: (lv_city_6_0= ruleEString )
            {
            // InternalTwitterQA.g:426:4: (lv_city_6_0= ruleEString )
            // InternalTwitterQA.g:427:5: lv_city_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getGameAccess().getCityEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_city_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"city",
            						lv_city_6_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getGameAccess().getInitial_testKeyword_7());
            		
            // InternalTwitterQA.g:448:3: ( (lv_initial_test_8_0= ruleTest ) )
            // InternalTwitterQA.g:449:4: (lv_initial_test_8_0= ruleTest )
            {
            // InternalTwitterQA.g:449:4: (lv_initial_test_8_0= ruleTest )
            // InternalTwitterQA.g:450:5: lv_initial_test_8_0= ruleTest
            {

            					newCompositeNode(grammarAccess.getGameAccess().getInitial_testTestParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_initial_test_8_0=ruleTest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					set(
            						current,
            						"initial_test",
            						lv_initial_test_8_0,
            						"ddm.TwitterQA.Test");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getGameAccess().getTestsKeyword_9());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalTwitterQA.g:475:3: ( (lv_tests_11_0= ruleTest ) )
            // InternalTwitterQA.g:476:4: (lv_tests_11_0= ruleTest )
            {
            // InternalTwitterQA.g:476:4: (lv_tests_11_0= ruleTest )
            // InternalTwitterQA.g:477:5: lv_tests_11_0= ruleTest
            {

            					newCompositeNode(grammarAccess.getGameAccess().getTestsTestParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_12);
            lv_tests_11_0=ruleTest();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGameRule());
            					}
            					add(
            						current,
            						"tests",
            						lv_tests_11_0,
            						"ddm.TwitterQA.Test");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTwitterQA.g:494:3: (otherlv_12= ',' ( (lv_tests_13_0= ruleTest ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTwitterQA.g:495:4: otherlv_12= ',' ( (lv_tests_13_0= ruleTest ) )
            	    {
            	    otherlv_12=(Token)match(input,19,FOLLOW_19); 

            	    				newLeafNode(otherlv_12, grammarAccess.getGameAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalTwitterQA.g:499:4: ( (lv_tests_13_0= ruleTest ) )
            	    // InternalTwitterQA.g:500:5: (lv_tests_13_0= ruleTest )
            	    {
            	    // InternalTwitterQA.g:500:5: (lv_tests_13_0= ruleTest )
            	    // InternalTwitterQA.g:501:6: lv_tests_13_0= ruleTest
            	    {

            	    						newCompositeNode(grammarAccess.getGameAccess().getTestsTestParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_tests_13_0=ruleTest();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGameRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tests",
            	    							lv_tests_13_0,
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

            otherlv_14=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_14, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

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
    // InternalTwitterQA.g:531:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // InternalTwitterQA.g:531:49: (iv_ruleLocation= ruleLocation EOF )
            // InternalTwitterQA.g:532:2: iv_ruleLocation= ruleLocation EOF
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
    // InternalTwitterQA.g:538:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'Location' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'latitude' ( (lv_latitude_4_0= ruleEDouble ) ) otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) otherlv_7= '}' ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_latitude_4_0 = null;

        AntlrDatatypeRuleToken lv_longitude_6_0 = null;



        	enterRule();

        try {
            // InternalTwitterQA.g:544:2: ( (otherlv_0= 'Location' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'latitude' ( (lv_latitude_4_0= ruleEDouble ) ) otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) otherlv_7= '}' ) )
            // InternalTwitterQA.g:545:2: (otherlv_0= 'Location' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'latitude' ( (lv_latitude_4_0= ruleEDouble ) ) otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) otherlv_7= '}' )
            {
            // InternalTwitterQA.g:545:2: (otherlv_0= 'Location' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'latitude' ( (lv_latitude_4_0= ruleEDouble ) ) otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) otherlv_7= '}' )
            // InternalTwitterQA.g:546:3: otherlv_0= 'Location' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'latitude' ( (lv_latitude_4_0= ruleEDouble ) ) otherlv_5= 'longitude' ( (lv_longitude_6_0= ruleEDouble ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
            		
            // InternalTwitterQA.g:550:3: ( (lv_name_1_0= ruleEString ) )
            // InternalTwitterQA.g:551:4: (lv_name_1_0= ruleEString )
            {
            // InternalTwitterQA.g:551:4: (lv_name_1_0= ruleEString )
            // InternalTwitterQA.g:552:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getLatitudeKeyword_3());
            		
            // InternalTwitterQA.g:577:3: ( (lv_latitude_4_0= ruleEDouble ) )
            // InternalTwitterQA.g:578:4: (lv_latitude_4_0= ruleEDouble )
            {
            // InternalTwitterQA.g:578:4: (lv_latitude_4_0= ruleEDouble )
            // InternalTwitterQA.g:579:5: lv_latitude_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLatitudeEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_23);
            lv_latitude_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"latitude",
            						lv_latitude_4_0,
            						"ddm.TwitterQA.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getLongitudeKeyword_5());
            		
            // InternalTwitterQA.g:600:3: ( (lv_longitude_6_0= ruleEDouble ) )
            // InternalTwitterQA.g:601:4: (lv_longitude_6_0= ruleEDouble )
            {
            // InternalTwitterQA.g:601:4: (lv_longitude_6_0= ruleEDouble )
            // InternalTwitterQA.g:602:5: lv_longitude_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getLocationAccess().getLongitudeEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_longitude_6_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocationRule());
            					}
            					set(
            						current,
            						"longitude",
            						lv_longitude_6_0,
            						"ddm.TwitterQA.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalTwitterQA.g:627:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalTwitterQA.g:627:45: (iv_ruleTest= ruleTest EOF )
            // InternalTwitterQA.g:628:2: iv_ruleTest= ruleTest EOF
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
    // InternalTwitterQA.g:634:1: ruleTest returns [EObject current=null] : (otherlv_0= 'Test' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) otherlv_5= 'answers' otherlv_6= '{' ( (lv_answers_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_answers_9_0= ruleEString ) ) )* otherlv_10= '}' (otherlv_11= 'hints' otherlv_12= '{' ( (lv_hints_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_hints_15_0= ruleEString ) ) )* otherlv_16= '}' )? otherlv_17= 'timelimit' ( (lv_timelimit_18_0= ruleEInt ) ) otherlv_19= 'attempts' ( (lv_attempts_20_0= ruleEInt ) ) otherlv_21= 'reward' ( (lv_reward_22_0= ruleEInt ) ) otherlv_23= 'location' ( ( ruleEString ) ) (otherlv_25= 'on_correct' ( ( ruleEString ) ) )? (otherlv_27= 'on_timeout' ( ( ruleEString ) ) )? (otherlv_29= 'on_fail' ( ( ruleEString ) ) )? otherlv_31= '}' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_question_4_0 = null;

        AntlrDatatypeRuleToken lv_answers_7_0 = null;

        AntlrDatatypeRuleToken lv_answers_9_0 = null;

        AntlrDatatypeRuleToken lv_hints_13_0 = null;

        AntlrDatatypeRuleToken lv_hints_15_0 = null;

        AntlrDatatypeRuleToken lv_timelimit_18_0 = null;

        AntlrDatatypeRuleToken lv_attempts_20_0 = null;

        AntlrDatatypeRuleToken lv_reward_22_0 = null;



        	enterRule();

        try {
            // InternalTwitterQA.g:640:2: ( (otherlv_0= 'Test' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) otherlv_5= 'answers' otherlv_6= '{' ( (lv_answers_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_answers_9_0= ruleEString ) ) )* otherlv_10= '}' (otherlv_11= 'hints' otherlv_12= '{' ( (lv_hints_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_hints_15_0= ruleEString ) ) )* otherlv_16= '}' )? otherlv_17= 'timelimit' ( (lv_timelimit_18_0= ruleEInt ) ) otherlv_19= 'attempts' ( (lv_attempts_20_0= ruleEInt ) ) otherlv_21= 'reward' ( (lv_reward_22_0= ruleEInt ) ) otherlv_23= 'location' ( ( ruleEString ) ) (otherlv_25= 'on_correct' ( ( ruleEString ) ) )? (otherlv_27= 'on_timeout' ( ( ruleEString ) ) )? (otherlv_29= 'on_fail' ( ( ruleEString ) ) )? otherlv_31= '}' ) )
            // InternalTwitterQA.g:641:2: (otherlv_0= 'Test' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) otherlv_5= 'answers' otherlv_6= '{' ( (lv_answers_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_answers_9_0= ruleEString ) ) )* otherlv_10= '}' (otherlv_11= 'hints' otherlv_12= '{' ( (lv_hints_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_hints_15_0= ruleEString ) ) )* otherlv_16= '}' )? otherlv_17= 'timelimit' ( (lv_timelimit_18_0= ruleEInt ) ) otherlv_19= 'attempts' ( (lv_attempts_20_0= ruleEInt ) ) otherlv_21= 'reward' ( (lv_reward_22_0= ruleEInt ) ) otherlv_23= 'location' ( ( ruleEString ) ) (otherlv_25= 'on_correct' ( ( ruleEString ) ) )? (otherlv_27= 'on_timeout' ( ( ruleEString ) ) )? (otherlv_29= 'on_fail' ( ( ruleEString ) ) )? otherlv_31= '}' )
            {
            // InternalTwitterQA.g:641:2: (otherlv_0= 'Test' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) otherlv_5= 'answers' otherlv_6= '{' ( (lv_answers_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_answers_9_0= ruleEString ) ) )* otherlv_10= '}' (otherlv_11= 'hints' otherlv_12= '{' ( (lv_hints_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_hints_15_0= ruleEString ) ) )* otherlv_16= '}' )? otherlv_17= 'timelimit' ( (lv_timelimit_18_0= ruleEInt ) ) otherlv_19= 'attempts' ( (lv_attempts_20_0= ruleEInt ) ) otherlv_21= 'reward' ( (lv_reward_22_0= ruleEInt ) ) otherlv_23= 'location' ( ( ruleEString ) ) (otherlv_25= 'on_correct' ( ( ruleEString ) ) )? (otherlv_27= 'on_timeout' ( ( ruleEString ) ) )? (otherlv_29= 'on_fail' ( ( ruleEString ) ) )? otherlv_31= '}' )
            // InternalTwitterQA.g:642:3: otherlv_0= 'Test' ( (lv_id_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'question' ( (lv_question_4_0= ruleEString ) ) otherlv_5= 'answers' otherlv_6= '{' ( (lv_answers_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_answers_9_0= ruleEString ) ) )* otherlv_10= '}' (otherlv_11= 'hints' otherlv_12= '{' ( (lv_hints_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_hints_15_0= ruleEString ) ) )* otherlv_16= '}' )? otherlv_17= 'timelimit' ( (lv_timelimit_18_0= ruleEInt ) ) otherlv_19= 'attempts' ( (lv_attempts_20_0= ruleEInt ) ) otherlv_21= 'reward' ( (lv_reward_22_0= ruleEInt ) ) otherlv_23= 'location' ( ( ruleEString ) ) (otherlv_25= 'on_correct' ( ( ruleEString ) ) )? (otherlv_27= 'on_timeout' ( ( ruleEString ) ) )? (otherlv_29= 'on_fail' ( ( ruleEString ) ) )? otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
            		
            // InternalTwitterQA.g:646:3: ( (lv_id_1_0= ruleEString ) )
            // InternalTwitterQA.g:647:4: (lv_id_1_0= ruleEString )
            {
            // InternalTwitterQA.g:647:4: (lv_id_1_0= ruleEString )
            // InternalTwitterQA.g:648:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getQuestionKeyword_3());
            		
            // InternalTwitterQA.g:673:3: ( (lv_question_4_0= ruleEString ) )
            // InternalTwitterQA.g:674:4: (lv_question_4_0= ruleEString )
            {
            // InternalTwitterQA.g:674:4: (lv_question_4_0= ruleEString )
            // InternalTwitterQA.g:675:5: lv_question_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestAccess().getQuestionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_question_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"question",
            						lv_question_4_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTestAccess().getAnswersKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalTwitterQA.g:700:3: ( (lv_answers_7_0= ruleEString ) )
            // InternalTwitterQA.g:701:4: (lv_answers_7_0= ruleEString )
            {
            // InternalTwitterQA.g:701:4: (lv_answers_7_0= ruleEString )
            // InternalTwitterQA.g:702:5: lv_answers_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTestAccess().getAnswersEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_answers_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					add(
            						current,
            						"answers",
            						lv_answers_7_0,
            						"ddm.TwitterQA.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTwitterQA.g:719:3: (otherlv_8= ',' ( (lv_answers_9_0= ruleEString ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTwitterQA.g:720:4: otherlv_8= ',' ( (lv_answers_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_5); 

            	    				newLeafNode(otherlv_8, grammarAccess.getTestAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalTwitterQA.g:724:4: ( (lv_answers_9_0= ruleEString ) )
            	    // InternalTwitterQA.g:725:5: (lv_answers_9_0= ruleEString )
            	    {
            	    // InternalTwitterQA.g:725:5: (lv_answers_9_0= ruleEString )
            	    // InternalTwitterQA.g:726:6: lv_answers_9_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getTestAccess().getAnswersEStringParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_answers_9_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTestRule());
            	    						}
            	    						add(
            	    							current,
            	    							"answers",
            	    							lv_answers_9_0,
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

            otherlv_10=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_10, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalTwitterQA.g:748:3: (otherlv_11= 'hints' otherlv_12= '{' ( (lv_hints_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_hints_15_0= ruleEString ) ) )* otherlv_16= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTwitterQA.g:749:4: otherlv_11= 'hints' otherlv_12= '{' ( (lv_hints_13_0= ruleEString ) ) (otherlv_14= ',' ( (lv_hints_15_0= ruleEString ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getTestAccess().getHintsKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalTwitterQA.g:757:4: ( (lv_hints_13_0= ruleEString ) )
                    // InternalTwitterQA.g:758:5: (lv_hints_13_0= ruleEString )
                    {
                    // InternalTwitterQA.g:758:5: (lv_hints_13_0= ruleEString )
                    // InternalTwitterQA.g:759:6: lv_hints_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTestAccess().getHintsEStringParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_hints_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTestRule());
                    						}
                    						add(
                    							current,
                    							"hints",
                    							lv_hints_13_0,
                    							"ddm.TwitterQA.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalTwitterQA.g:776:4: (otherlv_14= ',' ( (lv_hints_15_0= ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==19) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTwitterQA.g:777:5: otherlv_14= ',' ( (lv_hints_15_0= ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,19,FOLLOW_5); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getTestAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalTwitterQA.g:781:5: ( (lv_hints_15_0= ruleEString ) )
                    	    // InternalTwitterQA.g:782:6: (lv_hints_15_0= ruleEString )
                    	    {
                    	    // InternalTwitterQA.g:782:6: (lv_hints_15_0= ruleEString )
                    	    // InternalTwitterQA.g:783:7: lv_hints_15_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getTestAccess().getHintsEStringParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_hints_15_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTestRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"hints",
                    	    								lv_hints_15_0,
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

                    otherlv_16=(Token)match(input,20,FOLLOW_27); 

                    				newLeafNode(otherlv_16, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_17, grammarAccess.getTestAccess().getTimelimitKeyword_11());
            		
            // InternalTwitterQA.g:810:3: ( (lv_timelimit_18_0= ruleEInt ) )
            // InternalTwitterQA.g:811:4: (lv_timelimit_18_0= ruleEInt )
            {
            // InternalTwitterQA.g:811:4: (lv_timelimit_18_0= ruleEInt )
            // InternalTwitterQA.g:812:5: lv_timelimit_18_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTestAccess().getTimelimitEIntParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_29);
            lv_timelimit_18_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"timelimit",
            						lv_timelimit_18_0,
            						"ddm.TwitterQA.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,35,FOLLOW_28); 

            			newLeafNode(otherlv_19, grammarAccess.getTestAccess().getAttemptsKeyword_13());
            		
            // InternalTwitterQA.g:833:3: ( (lv_attempts_20_0= ruleEInt ) )
            // InternalTwitterQA.g:834:4: (lv_attempts_20_0= ruleEInt )
            {
            // InternalTwitterQA.g:834:4: (lv_attempts_20_0= ruleEInt )
            // InternalTwitterQA.g:835:5: lv_attempts_20_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTestAccess().getAttemptsEIntParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_30);
            lv_attempts_20_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"attempts",
            						lv_attempts_20_0,
            						"ddm.TwitterQA.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_21, grammarAccess.getTestAccess().getRewardKeyword_15());
            		
            // InternalTwitterQA.g:856:3: ( (lv_reward_22_0= ruleEInt ) )
            // InternalTwitterQA.g:857:4: (lv_reward_22_0= ruleEInt )
            {
            // InternalTwitterQA.g:857:4: (lv_reward_22_0= ruleEInt )
            // InternalTwitterQA.g:858:5: lv_reward_22_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getTestAccess().getRewardEIntParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_31);
            lv_reward_22_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"reward",
            						lv_reward_22_0,
            						"ddm.TwitterQA.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_23=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_23, grammarAccess.getTestAccess().getLocationKeyword_17());
            		
            // InternalTwitterQA.g:879:3: ( ( ruleEString ) )
            // InternalTwitterQA.g:880:4: ( ruleEString )
            {
            // InternalTwitterQA.g:880:4: ( ruleEString )
            // InternalTwitterQA.g:881:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTestAccess().getLocationLocationCrossReference_18_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTwitterQA.g:895:3: (otherlv_25= 'on_correct' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalTwitterQA.g:896:4: otherlv_25= 'on_correct' ( ( ruleEString ) )
                    {
                    otherlv_25=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_25, grammarAccess.getTestAccess().getOn_correctKeyword_19_0());
                    			
                    // InternalTwitterQA.g:900:4: ( ( ruleEString ) )
                    // InternalTwitterQA.g:901:5: ( ruleEString )
                    {
                    // InternalTwitterQA.g:901:5: ( ruleEString )
                    // InternalTwitterQA.g:902:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTestAccess().getOn_correctTestCrossReference_19_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTwitterQA.g:917:3: (otherlv_27= 'on_timeout' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTwitterQA.g:918:4: otherlv_27= 'on_timeout' ( ( ruleEString ) )
                    {
                    otherlv_27=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_27, grammarAccess.getTestAccess().getOn_timeoutKeyword_20_0());
                    			
                    // InternalTwitterQA.g:922:4: ( ( ruleEString ) )
                    // InternalTwitterQA.g:923:5: ( ruleEString )
                    {
                    // InternalTwitterQA.g:923:5: ( ruleEString )
                    // InternalTwitterQA.g:924:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTestAccess().getOn_timeoutTestCrossReference_20_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalTwitterQA.g:939:3: (otherlv_29= 'on_fail' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTwitterQA.g:940:4: otherlv_29= 'on_fail' ( ( ruleEString ) )
                    {
                    otherlv_29=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_29, grammarAccess.getTestAccess().getOn_failKeyword_21_0());
                    			
                    // InternalTwitterQA.g:944:4: ( ( ruleEString ) )
                    // InternalTwitterQA.g:945:5: ( ruleEString )
                    {
                    // InternalTwitterQA.g:945:5: ( ruleEString )
                    // InternalTwitterQA.g:946:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTestRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTestAccess().getOn_failTestCrossReference_21_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_31=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_22());
            		

            }


            }


            	leaveRule();

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
    // InternalTwitterQA.g:969:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalTwitterQA.g:969:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalTwitterQA.g:970:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalTwitterQA.g:976:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalTwitterQA.g:982:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalTwitterQA.g:983:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalTwitterQA.g:983:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalTwitterQA.g:984:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalTwitterQA.g:984:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTwitterQA.g:985:4: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_35); 

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
    // InternalTwitterQA.g:1002:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalTwitterQA.g:1002:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalTwitterQA.g:1003:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalTwitterQA.g:1009:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalTwitterQA.g:1015:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalTwitterQA.g:1016:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalTwitterQA.g:1016:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalTwitterQA.g:1017:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalTwitterQA.g:1017:3: (kw= '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==41) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTwitterQA.g:1018:4: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_36); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalTwitterQA.g:1024:3: (this_INT_1= RULE_INT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_INT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTwitterQA.g:1025:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_37); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,42,FOLLOW_35); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_38); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalTwitterQA.g:1045:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=43 && LA16_0<=44)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTwitterQA.g:1046:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalTwitterQA.g:1046:4: (kw= 'E' | kw= 'e' )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==43) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==44) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalTwitterQA.g:1047:5: kw= 'E'
                            {
                            kw=(Token)match(input,43,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalTwitterQA.g:1053:5: kw= 'e'
                            {
                            kw=(Token)match(input,44,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalTwitterQA.g:1059:4: (kw= '-' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==41) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalTwitterQA.g:1060:5: kw= '-'
                            {
                            kw=(Token)match(input,41,FOLLOW_35); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000060000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000001C000100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000018000100000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000100000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000040000000040L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000180000000002L});

}