/*
 * generated by Xtext 2.28.0
 */
package ddm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import ddm.ide.contentassist.antlr.internal.InternalTwitterQAParser;
import ddm.services.TwitterQAGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class TwitterQAParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(TwitterQAGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, TwitterQAGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getTwitterQAAccess().getGroup(), "rule__TwitterQA__Group__0");
			builder.put(grammarAccess.getTwitterQAAccess().getGroup_15(), "rule__TwitterQA__Group_15__0");
			builder.put(grammarAccess.getTwitterQAAccess().getGroup_20(), "rule__TwitterQA__Group_20__0");
			builder.put(grammarAccess.getGameAccess().getGroup(), "rule__Game__Group__0");
			builder.put(grammarAccess.getGameAccess().getGroup_12(), "rule__Game__Group_12__0");
			builder.put(grammarAccess.getLocationAccess().getGroup(), "rule__Location__Group__0");
			builder.put(grammarAccess.getTestAccess().getGroup(), "rule__Test__Group__0");
			builder.put(grammarAccess.getTestAccess().getGroup_10(), "rule__Test__Group_10__0");
			builder.put(grammarAccess.getTestAccess().getGroup_12(), "rule__Test__Group_12__0");
			builder.put(grammarAccess.getTestAccess().getGroup_12_3(), "rule__Test__Group_12_3__0");
			builder.put(grammarAccess.getTestAccess().getGroup_21(), "rule__Test__Group_21__0");
			builder.put(grammarAccess.getTestAccess().getGroup_22(), "rule__Test__Group_22__0");
			builder.put(grammarAccess.getTestAccess().getGroup_23(), "rule__Test__Group_23__0");
			builder.put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getTwitterQAAccess().getConsumer_keyAssignment_3(), "rule__TwitterQA__Consumer_keyAssignment_3");
			builder.put(grammarAccess.getTwitterQAAccess().getConsumer_secretAssignment_5(), "rule__TwitterQA__Consumer_secretAssignment_5");
			builder.put(grammarAccess.getTwitterQAAccess().getAccess_tokenAssignment_7(), "rule__TwitterQA__Access_tokenAssignment_7");
			builder.put(grammarAccess.getTwitterQAAccess().getAccess_token_secretAssignment_9(), "rule__TwitterQA__Access_token_secretAssignment_9");
			builder.put(grammarAccess.getTwitterQAAccess().getWelcome_msgAssignment_11(), "rule__TwitterQA__Welcome_msgAssignment_11");
			builder.put(grammarAccess.getTwitterQAAccess().getGamesAssignment_14(), "rule__TwitterQA__GamesAssignment_14");
			builder.put(grammarAccess.getTwitterQAAccess().getGamesAssignment_15_1(), "rule__TwitterQA__GamesAssignment_15_1");
			builder.put(grammarAccess.getTwitterQAAccess().getLocationsAssignment_19(), "rule__TwitterQA__LocationsAssignment_19");
			builder.put(grammarAccess.getTwitterQAAccess().getLocationsAssignment_20_1(), "rule__TwitterQA__LocationsAssignment_20_1");
			builder.put(grammarAccess.getGameAccess().getNameAssignment_1(), "rule__Game__NameAssignment_1");
			builder.put(grammarAccess.getGameAccess().getDescriptionAssignment_4(), "rule__Game__DescriptionAssignment_4");
			builder.put(grammarAccess.getGameAccess().getCityAssignment_6(), "rule__Game__CityAssignment_6");
			builder.put(grammarAccess.getGameAccess().getInitial_testAssignment_8(), "rule__Game__Initial_testAssignment_8");
			builder.put(grammarAccess.getGameAccess().getTestsAssignment_11(), "rule__Game__TestsAssignment_11");
			builder.put(grammarAccess.getGameAccess().getTestsAssignment_12_1(), "rule__Game__TestsAssignment_12_1");
			builder.put(grammarAccess.getLocationAccess().getNameAssignment_1(), "rule__Location__NameAssignment_1");
			builder.put(grammarAccess.getLocationAccess().getLatitudeAssignment_4(), "rule__Location__LatitudeAssignment_4");
			builder.put(grammarAccess.getLocationAccess().getLongitudeAssignment_6(), "rule__Location__LongitudeAssignment_6");
			builder.put(grammarAccess.getTestAccess().getNameAssignment_1(), "rule__Test__NameAssignment_1");
			builder.put(grammarAccess.getTestAccess().getQuestionAssignment_4(), "rule__Test__QuestionAssignment_4");
			builder.put(grammarAccess.getTestAccess().getOrderAssignment_6(), "rule__Test__OrderAssignment_6");
			builder.put(grammarAccess.getTestAccess().getAnswersAssignment_9(), "rule__Test__AnswersAssignment_9");
			builder.put(grammarAccess.getTestAccess().getAnswersAssignment_10_1(), "rule__Test__AnswersAssignment_10_1");
			builder.put(grammarAccess.getTestAccess().getHintsAssignment_12_2(), "rule__Test__HintsAssignment_12_2");
			builder.put(grammarAccess.getTestAccess().getHintsAssignment_12_3_1(), "rule__Test__HintsAssignment_12_3_1");
			builder.put(grammarAccess.getTestAccess().getTimelimitAssignment_14(), "rule__Test__TimelimitAssignment_14");
			builder.put(grammarAccess.getTestAccess().getAttemptsAssignment_16(), "rule__Test__AttemptsAssignment_16");
			builder.put(grammarAccess.getTestAccess().getRewardAssignment_18(), "rule__Test__RewardAssignment_18");
			builder.put(grammarAccess.getTestAccess().getLocationAssignment_20(), "rule__Test__LocationAssignment_20");
			builder.put(grammarAccess.getTestAccess().getOn_correctAssignment_21_1(), "rule__Test__On_correctAssignment_21_1");
			builder.put(grammarAccess.getTestAccess().getOn_timeoutAssignment_22_1(), "rule__Test__On_timeoutAssignment_22_1");
			builder.put(grammarAccess.getTestAccess().getOn_failAssignment_23_1(), "rule__Test__On_failAssignment_23_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private TwitterQAGrammarAccess grammarAccess;

	@Override
	protected InternalTwitterQAParser createParser() {
		InternalTwitterQAParser result = new InternalTwitterQAParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public TwitterQAGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TwitterQAGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
