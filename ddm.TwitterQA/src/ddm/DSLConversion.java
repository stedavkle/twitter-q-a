package ddm;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import TwitterQAModel.TwitterQAModelPackage;

public class DSLConversion {

	public static void main(String[] args) {

		EPackage.Registry.INSTANCE.put(TwitterQAModelPackage.eNS_URI, TwitterQAModelPackage.eINSTANCE);
		// create resource for xtext file
		Injector injector = new TwitterQAStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet xtextRS = injector.getInstance(XtextResourceSet.class);

		XtextResource xtextInput = (XtextResource) xtextRS.getResource(URI.createURI("../twiqa_workspace/TwitterQA/src/TuebingenQuiz.twiqa"), true);
		EcoreUtil.resolveAll(xtextInput);
		// create empty xmi resource
		ResourceSet xmiRS = new ResourceSetImpl();
		Resource xmiOutput = xmiRS.createResource(URI.createURI("./Tuebingen.twiqa.xmi"));
		// save xtext resource in xmi resource
		xmiOutput.getContents().add(xtextInput.getContents().get(0));
		try {
			xmiOutput.save(null);
			System.out.println("Saved xmi");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
