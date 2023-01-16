/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /TwitterQA_emf/model/TwitterQA.ecore
 * using:
 *   /TwitterQA_emf/model/TwitterQA.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package TwitterQAModel;

// import TwitterQAModel.TwitterQAModelPackage;
// import TwitterQAModel.TwitterQAModelTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * TwitterQAModelTables provides the dispatch tables for the TwitterQAModel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class TwitterQAModelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(TwitterQAModelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid__s_TwitterQA_emf_s_model_s_TwitterQA_ecore = IdManager.getNsURIPackageId("/TwitterQA_emf/model/TwitterQA.ecore", null, TwitterQAModelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Game = TwitterQAModelTables.PACKid__s_TwitterQA_emf_s_model_s_TwitterQA_ecore.getClassId("Game", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Location = TwitterQAModelTables.PACKid__s_TwitterQA_emf_s_model_s_TwitterQA_ecore.getClassId("Location", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Test = TwitterQAModelTables.PACKid__s_TwitterQA_emf_s_model_s_TwitterQA_ecore.getClassId("Test", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_TwitterQA = TwitterQAModelTables.PACKid__s_TwitterQA_emf_s_model_s_TwitterQA_ecore.getClassId("TwitterQA", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDouble = TwitterQAModelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDouble", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = TwitterQAModelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Test = TypeId.BAG.getSpecializedId(TwitterQAModelTables.CLSSid_Test);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Game = TypeId.ORDERED_SET.getSpecializedId(TwitterQAModelTables.CLSSid_Game);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Location = TypeId.ORDERED_SET.getSpecializedId(TwitterQAModelTables.CLSSid_Location);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Test = TypeId.ORDERED_SET.getSpecializedId(TwitterQAModelTables.CLSSid_Test);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			TwitterQAModelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TwitterQAModelTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Game = new EcoreExecutorType(TwitterQAModelPackage.Literals.GAME, PACKAGE, 0);
		public static final EcoreExecutorType _Location = new EcoreExecutorType(TwitterQAModelPackage.Literals.LOCATION, PACKAGE, 0);
		public static final EcoreExecutorType _Test = new EcoreExecutorType(TwitterQAModelPackage.Literals.TEST, PACKAGE, 0);
		public static final EcoreExecutorType _TwitterQA = new EcoreExecutorType(TwitterQAModelPackage.Literals.TWITTER_QA, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Game,
			_Location,
			_Test,
			_TwitterQA
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TwitterQAModelTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Game__Game = new ExecutorFragment(Types._Game, TwitterQAModelTables.Types._Game);
		private static final ExecutorFragment _Game__OclAny = new ExecutorFragment(Types._Game, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Game__OclElement = new ExecutorFragment(Types._Game, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Location__Location = new ExecutorFragment(Types._Location, TwitterQAModelTables.Types._Location);
		private static final ExecutorFragment _Location__OclAny = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Location__OclElement = new ExecutorFragment(Types._Location, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Test__OclAny = new ExecutorFragment(Types._Test, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Test__OclElement = new ExecutorFragment(Types._Test, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Test__Test = new ExecutorFragment(Types._Test, TwitterQAModelTables.Types._Test);

		private static final ExecutorFragment _TwitterQA__OclAny = new ExecutorFragment(Types._TwitterQA, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _TwitterQA__OclElement = new ExecutorFragment(Types._TwitterQA, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _TwitterQA__TwitterQA = new ExecutorFragment(Types._TwitterQA, TwitterQAModelTables.Types._TwitterQA);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TwitterQAModelTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TwitterQAModelTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TwitterQAModelTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Game__city = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.GAME__CITY, Types._Game, 0);
		public static final ExecutorProperty _Game__description = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.GAME__DESCRIPTION, Types._Game, 1);
		public static final ExecutorProperty _Game__initial_test = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.GAME__INITIAL_TEST, Types._Game, 2);
		public static final ExecutorProperty _Game__name = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.GAME__NAME, Types._Game, 3);
		public static final ExecutorProperty _Game__tests = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.GAME__TESTS, Types._Game, 4);
		public static final ExecutorProperty _Game__TwitterQA__games = new ExecutorPropertyWithImplementation("TwitterQA", Types._Game, 5, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TWITTER_QA__GAMES));

		public static final ExecutorProperty _Location__latitude = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.LOCATION__LATITUDE, Types._Location, 0);
		public static final ExecutorProperty _Location__longitude = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.LOCATION__LONGITUDE, Types._Location, 1);
		public static final ExecutorProperty _Location__name = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.LOCATION__NAME, Types._Location, 2);
		public static final ExecutorProperty _Location__Test__location = new ExecutorPropertyWithImplementation("Test", Types._Location, 3, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TEST__LOCATION));
		public static final ExecutorProperty _Location__TwitterQA__locations = new ExecutorPropertyWithImplementation("TwitterQA", Types._Location, 4, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TWITTER_QA__LOCATIONS));

		public static final ExecutorProperty _Test__answers = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ANSWERS, Types._Test, 0);
		public static final ExecutorProperty _Test__attempts = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ATTEMPTS, Types._Test, 1);
		public static final ExecutorProperty _Test__hints = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__HINTS, Types._Test, 2);
		public static final ExecutorProperty _Test__location = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__LOCATION, Types._Test, 3);
		public static final ExecutorProperty _Test__name = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__NAME, Types._Test, 4);
		public static final ExecutorProperty _Test__on_correct = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ON_CORRECT, Types._Test, 5);
		public static final ExecutorProperty _Test__on_fail = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ON_FAIL, Types._Test, 6);
		public static final ExecutorProperty _Test__on_timeout = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ON_TIMEOUT, Types._Test, 7);
		public static final ExecutorProperty _Test__order = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ORDER, Types._Test, 8);
		public static final ExecutorProperty _Test__question = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__QUESTION, Types._Test, 9);
		public static final ExecutorProperty _Test__reward = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__REWARD, Types._Test, 10);
		public static final ExecutorProperty _Test__timelimit = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__TIMELIMIT, Types._Test, 11);
		public static final ExecutorProperty _Test__Game__initial_test = new ExecutorPropertyWithImplementation("Game", Types._Test, 12, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.GAME__INITIAL_TEST));
		public static final ExecutorProperty _Test__Game__tests = new ExecutorPropertyWithImplementation("Game", Types._Test, 13, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.GAME__TESTS));
		public static final ExecutorProperty _Test__Test__on_correct = new ExecutorPropertyWithImplementation("Test", Types._Test, 14, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TEST__ON_CORRECT));
		public static final ExecutorProperty _Test__Test__on_fail = new ExecutorPropertyWithImplementation("Test", Types._Test, 15, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TEST__ON_FAIL));
		public static final ExecutorProperty _Test__Test__on_timeout = new ExecutorPropertyWithImplementation("Test", Types._Test, 16, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TEST__ON_TIMEOUT));

		public static final ExecutorProperty _TwitterQA__access_token = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TWITTER_QA__ACCESS_TOKEN, Types._TwitterQA, 0);
		public static final ExecutorProperty _TwitterQA__access_token_secret = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TWITTER_QA__ACCESS_TOKEN_SECRET, Types._TwitterQA, 1);
		public static final ExecutorProperty _TwitterQA__consumer_key = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TWITTER_QA__CONSUMER_KEY, Types._TwitterQA, 2);
		public static final ExecutorProperty _TwitterQA__consumer_secret = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TWITTER_QA__CONSUMER_SECRET, Types._TwitterQA, 3);
		public static final ExecutorProperty _TwitterQA__games = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TWITTER_QA__GAMES, Types._TwitterQA, 4);
		public static final ExecutorProperty _TwitterQA__locations = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TWITTER_QA__LOCATIONS, Types._TwitterQA, 5);
		public static final ExecutorProperty _TwitterQA__welcome_msg = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TWITTER_QA__WELCOME_MSG, Types._TwitterQA, 6);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TwitterQAModelTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Game =
			{
				Fragments._Game__OclAny /* 0 */,
				Fragments._Game__OclElement /* 1 */,
				Fragments._Game__Game /* 2 */
			};
		private static final int /*@NonNull*/ [] __Game = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Location =
			{
				Fragments._Location__OclAny /* 0 */,
				Fragments._Location__OclElement /* 1 */,
				Fragments._Location__Location /* 2 */
			};
		private static final int /*@NonNull*/ [] __Location = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Test =
			{
				Fragments._Test__OclAny /* 0 */,
				Fragments._Test__OclElement /* 1 */,
				Fragments._Test__Test /* 2 */
			};
		private static final int /*@NonNull*/ [] __Test = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _TwitterQA =
			{
				Fragments._TwitterQA__OclAny /* 0 */,
				Fragments._TwitterQA__OclElement /* 1 */,
				Fragments._TwitterQA__TwitterQA /* 2 */
			};
		private static final int /*@NonNull*/ [] __TwitterQA = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Game.initFragments(_Game, __Game);
			Types._Location.initFragments(_Location, __Location);
			Types._Test.initFragments(_Test, __Test);
			Types._TwitterQA.initFragments(_TwitterQA, __TwitterQA);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TwitterQAModelTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Game__Game = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Game__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Game__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Location__Location = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Location__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Test__Test = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Test__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Test__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _TwitterQA__TwitterQA = {};
		private static final ExecutorOperation /*@NonNull*/ [] _TwitterQA__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _TwitterQA__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Game__Game.initOperations(_Game__Game);
			Fragments._Game__OclAny.initOperations(_Game__OclAny);
			Fragments._Game__OclElement.initOperations(_Game__OclElement);

			Fragments._Location__Location.initOperations(_Location__Location);
			Fragments._Location__OclAny.initOperations(_Location__OclAny);
			Fragments._Location__OclElement.initOperations(_Location__OclElement);

			Fragments._Test__OclAny.initOperations(_Test__OclAny);
			Fragments._Test__OclElement.initOperations(_Test__OclElement);
			Fragments._Test__Test.initOperations(_Test__Test);

			Fragments._TwitterQA__OclAny.initOperations(_TwitterQA__OclAny);
			Fragments._TwitterQA__OclElement.initOperations(_TwitterQA__OclElement);
			Fragments._TwitterQA__TwitterQA.initOperations(_TwitterQA__TwitterQA);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TwitterQAModelTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Game = {
			TwitterQAModelTables.Properties._Game__city,
			TwitterQAModelTables.Properties._Game__description,
			TwitterQAModelTables.Properties._Game__initial_test,
			TwitterQAModelTables.Properties._Game__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TwitterQAModelTables.Properties._Game__tests
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Location = {
			TwitterQAModelTables.Properties._Location__latitude,
			TwitterQAModelTables.Properties._Location__longitude,
			TwitterQAModelTables.Properties._Location__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Test = {
			TwitterQAModelTables.Properties._Test__answers,
			TwitterQAModelTables.Properties._Test__attempts,
			TwitterQAModelTables.Properties._Test__hints,
			TwitterQAModelTables.Properties._Test__location,
			TwitterQAModelTables.Properties._Test__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TwitterQAModelTables.Properties._Test__on_correct,
			TwitterQAModelTables.Properties._Test__on_fail,
			TwitterQAModelTables.Properties._Test__on_timeout,
			TwitterQAModelTables.Properties._Test__order,
			TwitterQAModelTables.Properties._Test__question,
			TwitterQAModelTables.Properties._Test__reward,
			TwitterQAModelTables.Properties._Test__timelimit
		};

		private static final ExecutorProperty /*@NonNull*/ [] _TwitterQA = {
			TwitterQAModelTables.Properties._TwitterQA__access_token,
			TwitterQAModelTables.Properties._TwitterQA__access_token_secret,
			TwitterQAModelTables.Properties._TwitterQA__consumer_key,
			TwitterQAModelTables.Properties._TwitterQA__consumer_secret,
			TwitterQAModelTables.Properties._TwitterQA__games,
			TwitterQAModelTables.Properties._TwitterQA__locations,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TwitterQAModelTables.Properties._TwitterQA__welcome_msg
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Game__Game.initProperties(_Game);
			Fragments._Location__Location.initProperties(_Location);
			Fragments._Test__Test.initProperties(_Test);
			Fragments._TwitterQA__TwitterQA.initProperties(_TwitterQA);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TwitterQAModelTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TwitterQAModelTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new TwitterQAModelTables();
	}

	private TwitterQAModelTables() {
		super(TwitterQAModelPackage.eNS_URI);
	}
}
