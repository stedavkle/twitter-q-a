/*
 * generated by Xtext 2.28.0
 */
grammar InternalTwitterQA;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package ddm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTwitterQA
entryRuleTwitterQA returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTwitterQARule()); }
	iv_ruleTwitterQA=ruleTwitterQA
	{ $current=$iv_ruleTwitterQA.current; }
	EOF;

// Rule TwitterQA
ruleTwitterQA returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TwitterQA'
		{
			newLeafNode(otherlv_0, grammarAccess.getTwitterQAAccess().getTwitterQAKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTwitterQAAccess().getLeftCurlyBracketKeyword_1());
		}
		otherlv_2='consumer_key'
		{
			newLeafNode(otherlv_2, grammarAccess.getTwitterQAAccess().getConsumer_keyKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTwitterQAAccess().getConsumer_keyEStringParserRuleCall_3_0());
				}
				lv_consumer_key_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTwitterQARule());
					}
					set(
						$current,
						"consumer_key",
						lv_consumer_key_3_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='consumer_secret'
		{
			newLeafNode(otherlv_4, grammarAccess.getTwitterQAAccess().getConsumer_secretKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTwitterQAAccess().getConsumer_secretEStringParserRuleCall_5_0());
				}
				lv_consumer_secret_5_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTwitterQARule());
					}
					set(
						$current,
						"consumer_secret",
						lv_consumer_secret_5_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='access_token'
		{
			newLeafNode(otherlv_6, grammarAccess.getTwitterQAAccess().getAccess_tokenKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTwitterQAAccess().getAccess_tokenEStringParserRuleCall_7_0());
				}
				lv_access_token_7_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTwitterQARule());
					}
					set(
						$current,
						"access_token",
						lv_access_token_7_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='access_token_secret'
		{
			newLeafNode(otherlv_8, grammarAccess.getTwitterQAAccess().getAccess_token_secretKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTwitterQAAccess().getAccess_token_secretEStringParserRuleCall_9_0());
				}
				lv_access_token_secret_9_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTwitterQARule());
					}
					set(
						$current,
						"access_token_secret",
						lv_access_token_secret_9_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_10='welcome_msg'
		{
			newLeafNode(otherlv_10, grammarAccess.getTwitterQAAccess().getWelcome_msgKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTwitterQAAccess().getWelcome_msgEStringParserRuleCall_11_0());
				}
				lv_welcome_msg_11_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTwitterQARule());
					}
					set(
						$current,
						"welcome_msg",
						lv_welcome_msg_11_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_12='games'
		{
			newLeafNode(otherlv_12, grammarAccess.getTwitterQAAccess().getGamesKeyword_12());
		}
		otherlv_13='{'
		{
			newLeafNode(otherlv_13, grammarAccess.getTwitterQAAccess().getLeftCurlyBracketKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTwitterQAAccess().getGamesGameParserRuleCall_14_0());
				}
				lv_games_14_0=ruleGame
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTwitterQARule());
					}
					add(
						$current,
						"games",
						lv_games_14_0,
						"ddm.TwitterQA.Game");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_15=','
			{
				newLeafNode(otherlv_15, grammarAccess.getTwitterQAAccess().getCommaKeyword_15_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTwitterQAAccess().getGamesGameParserRuleCall_15_1_0());
					}
					lv_games_16_0=ruleGame
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTwitterQARule());
						}
						add(
							$current,
							"games",
							lv_games_16_0,
							"ddm.TwitterQA.Game");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_17='}'
		{
			newLeafNode(otherlv_17, grammarAccess.getTwitterQAAccess().getRightCurlyBracketKeyword_16());
		}
		otherlv_18='locations'
		{
			newLeafNode(otherlv_18, grammarAccess.getTwitterQAAccess().getLocationsKeyword_17());
		}
		otherlv_19='{'
		{
			newLeafNode(otherlv_19, grammarAccess.getTwitterQAAccess().getLeftCurlyBracketKeyword_18());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTwitterQAAccess().getLocationsLocationParserRuleCall_19_0());
				}
				lv_locations_20_0=ruleLocation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTwitterQARule());
					}
					add(
						$current,
						"locations",
						lv_locations_20_0,
						"ddm.TwitterQA.Location");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_21=','
			{
				newLeafNode(otherlv_21, grammarAccess.getTwitterQAAccess().getCommaKeyword_20_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTwitterQAAccess().getLocationsLocationParserRuleCall_20_1_0());
					}
					lv_locations_22_0=ruleLocation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTwitterQARule());
						}
						add(
							$current,
							"locations",
							lv_locations_22_0,
							"ddm.TwitterQA.Location");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getTwitterQAAccess().getRightCurlyBracketKeyword_21());
		}
		otherlv_24='}'
		{
			newLeafNode(otherlv_24, grammarAccess.getTwitterQAAccess().getRightCurlyBracketKeyword_22());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleGame
entryRuleGame returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGameRule()); }
	iv_ruleGame=ruleGame
	{ $current=$iv_ruleGame.current; }
	EOF;

// Rule Game
ruleGame returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Game'
		{
			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGameAccess().getIdEStringParserRuleCall_1_0());
				}
				lv_id_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameRule());
					}
					set(
						$current,
						"id",
						lv_id_1_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='description'
		{
			newLeafNode(otherlv_3, grammarAccess.getGameAccess().getDescriptionKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGameAccess().getDescriptionEStringParserRuleCall_4_0());
				}
				lv_description_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameRule());
					}
					set(
						$current,
						"description",
						lv_description_4_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='city'
		{
			newLeafNode(otherlv_5, grammarAccess.getGameAccess().getCityKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGameAccess().getCityEStringParserRuleCall_6_0());
				}
				lv_city_6_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameRule());
					}
					set(
						$current,
						"city",
						lv_city_6_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='initial_test'
		{
			newLeafNode(otherlv_7, grammarAccess.getGameAccess().getInitial_testKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGameAccess().getInitial_testTestParserRuleCall_8_0());
				}
				lv_initial_test_8_0=ruleTest
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameRule());
					}
					set(
						$current,
						"initial_test",
						lv_initial_test_8_0,
						"ddm.TwitterQA.Test");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='tests'
		{
			newLeafNode(otherlv_9, grammarAccess.getGameAccess().getTestsKeyword_9());
		}
		otherlv_10='{'
		{
			newLeafNode(otherlv_10, grammarAccess.getGameAccess().getLeftCurlyBracketKeyword_10());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGameAccess().getTestsTestParserRuleCall_11_0());
				}
				lv_tests_11_0=ruleTest
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGameRule());
					}
					add(
						$current,
						"tests",
						lv_tests_11_0,
						"ddm.TwitterQA.Test");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_12=','
			{
				newLeafNode(otherlv_12, grammarAccess.getGameAccess().getCommaKeyword_12_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGameAccess().getTestsTestParserRuleCall_12_1_0());
					}
					lv_tests_13_0=ruleTest
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGameRule());
						}
						add(
							$current,
							"tests",
							lv_tests_13_0,
							"ddm.TwitterQA.Test");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_13());
		}
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getGameAccess().getRightCurlyBracketKeyword_14());
		}
	)
;

// Entry rule entryRuleLocation
entryRuleLocation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLocationRule()); }
	iv_ruleLocation=ruleLocation
	{ $current=$iv_ruleLocation.current; }
	EOF;

// Rule Location
ruleLocation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Location'
		{
			newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLocationAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLocationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='latitude'
		{
			newLeafNode(otherlv_3, grammarAccess.getLocationAccess().getLatitudeKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLocationAccess().getLatitudeEDoubleParserRuleCall_4_0());
				}
				lv_latitude_4_0=ruleEDouble
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLocationRule());
					}
					set(
						$current,
						"latitude",
						lv_latitude_4_0,
						"ddm.TwitterQA.EDouble");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='longitude'
		{
			newLeafNode(otherlv_5, grammarAccess.getLocationAccess().getLongitudeKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLocationAccess().getLongitudeEDoubleParserRuleCall_6_0());
				}
				lv_longitude_6_0=ruleEDouble
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLocationRule());
					}
					set(
						$current,
						"longitude",
						lv_longitude_6_0,
						"ddm.TwitterQA.EDouble");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleTest
entryRuleTest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestRule()); }
	iv_ruleTest=ruleTest
	{ $current=$iv_ruleTest.current; }
	EOF;

// Rule Test
ruleTest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Test'
		{
			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getTestKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getIdEStringParserRuleCall_1_0());
				}
				lv_id_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					set(
						$current,
						"id",
						lv_id_1_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='question'
		{
			newLeafNode(otherlv_3, grammarAccess.getTestAccess().getQuestionKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getQuestionEStringParserRuleCall_4_0());
				}
				lv_question_4_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					set(
						$current,
						"question",
						lv_question_4_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='answers'
		{
			newLeafNode(otherlv_5, grammarAccess.getTestAccess().getAnswersKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getAnswersEStringParserRuleCall_7_0());
				}
				lv_answers_7_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					add(
						$current,
						"answers",
						lv_answers_7_0,
						"ddm.TwitterQA.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_8=','
			{
				newLeafNode(otherlv_8, grammarAccess.getTestAccess().getCommaKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTestAccess().getAnswersEStringParserRuleCall_8_1_0());
					}
					lv_answers_9_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTestRule());
						}
						add(
							$current,
							"answers",
							lv_answers_9_0,
							"ddm.TwitterQA.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_9());
		}
		(
			otherlv_11='hints'
			{
				newLeafNode(otherlv_11, grammarAccess.getTestAccess().getHintsKeyword_10_0());
			}
			otherlv_12='{'
			{
				newLeafNode(otherlv_12, grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_10_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTestAccess().getHintsEStringParserRuleCall_10_2_0());
					}
					lv_hints_13_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTestRule());
						}
						add(
							$current,
							"hints",
							lv_hints_13_0,
							"ddm.TwitterQA.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getTestAccess().getCommaKeyword_10_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTestAccess().getHintsEStringParserRuleCall_10_3_1_0());
						}
						lv_hints_15_0=ruleEString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTestRule());
							}
							add(
								$current,
								"hints",
								lv_hints_15_0,
								"ddm.TwitterQA.EString");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_16='}'
			{
				newLeafNode(otherlv_16, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_10_4());
			}
		)?
		otherlv_17='timelimit'
		{
			newLeafNode(otherlv_17, grammarAccess.getTestAccess().getTimelimitKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getTimelimitEIntParserRuleCall_12_0());
				}
				lv_timelimit_18_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					set(
						$current,
						"timelimit",
						lv_timelimit_18_0,
						"ddm.TwitterQA.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_19='attempts'
		{
			newLeafNode(otherlv_19, grammarAccess.getTestAccess().getAttemptsKeyword_13());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getAttemptsEIntParserRuleCall_14_0());
				}
				lv_attempts_20_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					set(
						$current,
						"attempts",
						lv_attempts_20_0,
						"ddm.TwitterQA.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_21='reward'
		{
			newLeafNode(otherlv_21, grammarAccess.getTestAccess().getRewardKeyword_15());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestAccess().getRewardEIntParserRuleCall_16_0());
				}
				lv_reward_22_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestRule());
					}
					set(
						$current,
						"reward",
						lv_reward_22_0,
						"ddm.TwitterQA.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_23='location'
		{
			newLeafNode(otherlv_23, grammarAccess.getTestAccess().getLocationKeyword_17());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTestAccess().getLocationLocationCrossReference_18_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_25='on_correct'
			{
				newLeafNode(otherlv_25, grammarAccess.getTestAccess().getOn_correctKeyword_19_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTestRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTestAccess().getOn_correctTestCrossReference_19_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_27='on_timeout'
			{
				newLeafNode(otherlv_27, grammarAccess.getTestAccess().getOn_timeoutKeyword_20_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTestRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTestAccess().getOn_timeoutTestCrossReference_20_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_29='on_fail'
			{
				newLeafNode(otherlv_29, grammarAccess.getTestAccess().getOn_failKeyword_21_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTestRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTestAccess().getOn_failTestCrossReference_21_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_31='}'
		{
			newLeafNode(otherlv_31, grammarAccess.getTestAccess().getRightCurlyBracketKeyword_22());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleEDouble
entryRuleEDouble returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEDoubleRule()); }
	iv_ruleEDouble=ruleEDouble
	{ $current=$iv_ruleEDouble.current.getText(); }
	EOF;

// Rule EDouble
ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
			}
		)?
		(
			this_INT_1=RULE_INT
			{
				$current.merge(this_INT_1);
			}
			{
				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
			}
		)?
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
		}
		this_INT_3=RULE_INT
		{
			$current.merge(this_INT_3);
		}
		{
			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
		}
		(
			(
				kw='E'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
				}
				    |
				kw='e'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
				}
			)
			(
				kw='-'
				{
					$current.merge(kw);
					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
				}
			)?
			this_INT_7=RULE_INT
			{
				$current.merge(this_INT_7);
			}
			{
				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
			}
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;