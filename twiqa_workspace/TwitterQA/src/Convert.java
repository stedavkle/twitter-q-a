import java.net.URI;

public class Convert {


    public static void main(String[] args) {

        // register URI of ecore meta-model
        EPackage.Registry.INSTANCE.put(DSLPackage.eNS_URI, DSLPackage.eINSTANCE);
        // create resource for xtext file
        Injector injector = new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet xtextRS = injector.getInstance(XtextResourceSet.class);
        XtextResource xtextInput = (XtextResource)xtextRS.getResource(URI.createURI("file:/C:/file.dsl"), true); EcoreUtil.resolveAll(xtextInput);
        // create empty xmi resource
        ResourceSet xmiRS = new ResourceSetImpl();
        Resource xmiOutput = xmiRS.createResource(URI.createURI("file:/C:/file.xmi"));
        // save xtext resource in xmi resource
        xmiOutput.getContents().add(xtextInput.getContents().get(0)); xmiOutput.save(null);

    }
}
