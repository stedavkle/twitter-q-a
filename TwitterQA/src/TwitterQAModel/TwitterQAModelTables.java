/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /TwitterQA/model/TwitterQA.ecore
 * using:
 *   /TwitterQA/model/TwitterQA.genmodel
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
import org.eclipse.ocl.pivot.ids.RootPackageId;
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
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_TwitterQA_s_model_s_TwitterQA_ecore = IdManager.getNsURIPackageId("TwitterQA/model/TwitterQA.ecore", null, TwitterQAModelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = TwitterQAModelTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Game = TwitterQAModelTables.PACKid_TwitterQA_s_model_s_TwitterQA_ecore.getClassId("Game", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Location = TwitterQAModelTables.PACKid_TwitterQA_s_model_s_TwitterQA_ecore.getClassId("Location", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Player = TwitterQAModelTables.PACKid_TwitterQA_s_model_s_TwitterQA_ecore.getClassId("Player", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Test = TwitterQAModelTables.PACKid_TwitterQA_s_model_s_TwitterQA_ecore.getClassId("Test", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Twitter_QA = TwitterQAModelTables.PACKid_TwitterQA_s_model_s_TwitterQA_ecore.getClassId("Twitter_QA", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = TwitterQAModelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = TwitterQAModelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_PRIMid_String = TypeId.ORDERED_SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Game = TypeId.BAG.getSpecializedId(TwitterQAModelTables.CLSSid_Game);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Player = TypeId.BAG.getSpecializedId(TwitterQAModelTables.CLSSid_Player);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Test = TypeId.BAG.getSpecializedId(TwitterQAModelTables.CLSSid_Test);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Game = TypeId.ORDERED_SET.getSpecializedId(TwitterQAModelTables.CLSSid_Game);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Player = TypeId.ORDERED_SET.getSpecializedId(TwitterQAModelTables.CLSSid_Player);
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
		public static final EcoreExecutorType _Player = new EcoreExecutorType(TwitterQAModelPackage.Literals.PLAYER, PACKAGE, 0);
		public static final EcoreExecutorType _Test = new EcoreExecutorType(TwitterQAModelPackage.Literals.TEST, PACKAGE, 0);
		public static final EcoreExecutorType _Twitter_QA = new EcoreExecutorType(TwitterQAModelPackage.Literals.TWITTER_QA, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Game,
			_Location,
			_Player,
			_Test,
			_Twitter_QA
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

		private static final ExecutorFragment _Player__OclAny = new ExecutorFragment(Types._Player, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Player__OclElement = new ExecutorFragment(Types._Player, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Player__Player = new ExecutorFragment(Types._Player, TwitterQAModelTables.Types._Player);

		private static final ExecutorFragment _Test__OclAny = new ExecutorFragment(Types._Test, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Test__OclElement = new ExecutorFragment(Types._Test, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Test__Test = new ExecutorFragment(Types._Test, TwitterQAModelTables.Types._Test);

		private static final ExecutorFragment _Twitter_QA__OclAny = new ExecutorFragment(Types._Twitter_QA, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Twitter_QA__OclElement = new ExecutorFragment(Types._Twitter_QA, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Twitter_QA__Twitter_QA = new ExecutorFragment(Types._Twitter_QA, TwitterQAModelTables.Types._Twitter_QA);

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
		public static final ExecutorProperty _Game__id = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.GAME__ID, Types._Game, 1);
		public static final ExecutorProperty _Game__players = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.GAME__PLAYERS, Types._Game, 2);
		public static final ExecutorProperty _Game__tests = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.GAME__TESTS, Types._Game, 3);
		public static final ExecutorProperty _Game__welcome_msg = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.GAME__WELCOME_MSG, Types._Game, 4);
		public static final ExecutorProperty _Game__Twitter_QA__games = new ExecutorPropertyWithImplementation("Twitter_QA", Types._Game, 5, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TWITTER_QA__GAMES));

		public static final ExecutorProperty _Location__langitude = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.LOCATION__LANGITUDE, Types._Location, 0);
		public static final ExecutorProperty _Location__latitude = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.LOCATION__LATITUDE, Types._Location, 1);
		public static final ExecutorProperty _Location__name = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.LOCATION__NAME, Types._Location, 2);
		public static final ExecutorProperty _Location__Test__location = new ExecutorPropertyWithImplementation("Test", Types._Location, 3, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TEST__LOCATION));

		public static final ExecutorProperty _Player__current_test = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.PLAYER__CURRENT_TEST, Types._Player, 0);
		public static final ExecutorProperty _Player__id = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.PLAYER__ID, Types._Player, 1);
		public static final ExecutorProperty _Player__name = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.PLAYER__NAME, Types._Player, 2);
		public static final ExecutorProperty _Player__points = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.PLAYER__POINTS, Types._Player, 3);
		public static final ExecutorProperty _Player__Game__players = new ExecutorPropertyWithImplementation("Game", Types._Player, 4, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.GAME__PLAYERS));
		public static final ExecutorProperty _Player__Twitter_QA__players = new ExecutorPropertyWithImplementation("Twitter_QA", Types._Player, 5, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TWITTER_QA__PLAYERS));

		public static final ExecutorProperty _Test__answers = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ANSWERS, Types._Test, 0);
		public static final ExecutorProperty _Test__attempts = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ATTEMPTS, Types._Test, 1);
		public static final ExecutorProperty _Test__hints = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__HINTS, Types._Test, 2);
		public static final ExecutorProperty _Test__id = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ID, Types._Test, 3);
		public static final ExecutorProperty _Test__is_final = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__IS_FINAL, Types._Test, 4);
		public static final ExecutorProperty _Test__is_initial = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__IS_INITIAL, Types._Test, 5);
		public static final ExecutorProperty _Test__location = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__LOCATION, Types._Test, 6);
		public static final ExecutorProperty _Test__on_correct = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ON_CORRECT, Types._Test, 7);
		public static final ExecutorProperty _Test__on_fail = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ON_FAIL, Types._Test, 8);
		public static final ExecutorProperty _Test__on_timeout = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__ON_TIMEOUT, Types._Test, 9);
		public static final ExecutorProperty _Test__points = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__POINTS, Types._Test, 10);
		public static final ExecutorProperty _Test__question = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__QUESTION, Types._Test, 11);
		public static final ExecutorProperty _Test__t_limit = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TEST__TLIMIT, Types._Test, 12);
		public static final ExecutorProperty _Test__Game__tests = new ExecutorPropertyWithImplementation("Game", Types._Test, 13, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.GAME__TESTS));
		public static final ExecutorProperty _Test__Player__current_test = new ExecutorPropertyWithImplementation("Player", Types._Test, 14, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.PLAYER__CURRENT_TEST));
		public static final ExecutorProperty _Test__Test__on_correct = new ExecutorPropertyWithImplementation("Test", Types._Test, 15, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TEST__ON_CORRECT));
		public static final ExecutorProperty _Test__Test__on_fail = new ExecutorPropertyWithImplementation("Test", Types._Test, 16, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TEST__ON_FAIL));
		public static final ExecutorProperty _Test__Test__on_timeout = new ExecutorPropertyWithImplementation("Test", Types._Test, 17, new EcoreLibraryOppositeProperty(TwitterQAModelPackage.Literals.TEST__ON_TIMEOUT));

		public static final ExecutorProperty _Twitter_QA__games = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TWITTER_QA__GAMES, Types._Twitter_QA, 0);
		public static final ExecutorProperty _Twitter_QA__players = new EcoreExecutorProperty(TwitterQAModelPackage.Literals.TWITTER_QA__PLAYERS, Types._Twitter_QA, 1);
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

		private static final ExecutorFragment /*@NonNull*/ [] _Player =
			{
				Fragments._Player__OclAny /* 0 */,
				Fragments._Player__OclElement /* 1 */,
				Fragments._Player__Player /* 2 */
			};
		private static final int /*@NonNull*/ [] __Player = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Test =
			{
				Fragments._Test__OclAny /* 0 */,
				Fragments._Test__OclElement /* 1 */,
				Fragments._Test__Test /* 2 */
			};
		private static final int /*@NonNull*/ [] __Test = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Twitter_QA =
			{
				Fragments._Twitter_QA__OclAny /* 0 */,
				Fragments._Twitter_QA__OclElement /* 1 */,
				Fragments._Twitter_QA__Twitter_QA /* 2 */
			};
		private static final int /*@NonNull*/ [] __Twitter_QA = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Game.initFragments(_Game, __Game);
			Types._Location.initFragments(_Location, __Location);
			Types._Player.initFragments(_Player, __Player);
			Types._Test.initFragments(_Test, __Test);
			Types._Twitter_QA.initFragments(_Twitter_QA, __Twitter_QA);

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

		private static final ExecutorOperation /*@NonNull*/ [] _Player__Player = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Player__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Player__OclElement = {
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

		private static final ExecutorOperation /*@NonNull*/ [] _Twitter_QA__Twitter_QA = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Twitter_QA__OclAny = {
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
		private static final ExecutorOperation /*@NonNull*/ [] _Twitter_QA__OclElement = {
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

			Fragments._Player__OclAny.initOperations(_Player__OclAny);
			Fragments._Player__OclElement.initOperations(_Player__OclElement);
			Fragments._Player__Player.initOperations(_Player__Player);

			Fragments._Test__OclAny.initOperations(_Test__OclAny);
			Fragments._Test__OclElement.initOperations(_Test__OclElement);
			Fragments._Test__Test.initOperations(_Test__Test);

			Fragments._Twitter_QA__OclAny.initOperations(_Twitter_QA__OclAny);
			Fragments._Twitter_QA__OclElement.initOperations(_Twitter_QA__OclElement);
			Fragments._Twitter_QA__Twitter_QA.initOperations(_Twitter_QA__Twitter_QA);

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
			TwitterQAModelTables.Properties._Game__id,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TwitterQAModelTables.Properties._Game__players,
			TwitterQAModelTables.Properties._Game__tests,
			TwitterQAModelTables.Properties._Game__welcome_msg
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Location = {
			TwitterQAModelTables.Properties._Location__langitude,
			TwitterQAModelTables.Properties._Location__latitude,
			TwitterQAModelTables.Properties._Location__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Player = {
			TwitterQAModelTables.Properties._Player__current_test,
			TwitterQAModelTables.Properties._Player__id,
			TwitterQAModelTables.Properties._Player__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TwitterQAModelTables.Properties._Player__points
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Test = {
			TwitterQAModelTables.Properties._Test__answers,
			TwitterQAModelTables.Properties._Test__attempts,
			TwitterQAModelTables.Properties._Test__hints,
			TwitterQAModelTables.Properties._Test__id,
			TwitterQAModelTables.Properties._Test__is_final,
			TwitterQAModelTables.Properties._Test__is_initial,
			TwitterQAModelTables.Properties._Test__location,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TwitterQAModelTables.Properties._Test__on_correct,
			TwitterQAModelTables.Properties._Test__on_fail,
			TwitterQAModelTables.Properties._Test__on_timeout,
			TwitterQAModelTables.Properties._Test__points,
			TwitterQAModelTables.Properties._Test__question,
			TwitterQAModelTables.Properties._Test__t_limit
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Twitter_QA = {
			TwitterQAModelTables.Properties._Twitter_QA__games,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			TwitterQAModelTables.Properties._Twitter_QA__players
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Game__Game.initProperties(_Game);
			Fragments._Location__Location.initProperties(_Location);
			Fragments._Player__Player.initProperties(_Player);
			Fragments._Test__Test.initProperties(_Test);
			Fragments._Twitter_QA__Twitter_QA.initProperties(_Twitter_QA);

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
