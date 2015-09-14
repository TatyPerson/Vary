/**
 * generated by Xtext
 */
package vary.pseudocodigo.dsl.c.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import diagramapseudocodigo.Codigo;
import java.io.IOException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import vary.pseudocodigo.dsl.c.generator.c.VaryGrammarGeneratorC;
import vary.pseudocodigo.dsl.c.generator.cpp.VaryGrammarGeneratorCPP;
import vary.pseudocodigo.dsl.c.generator.util.ProjectLocationFolder;
import vary.pseudocodigo.dsl.c.generator.util.ReadFileProperties;
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidator;
import vary.pseudocodigo.dsl.c.validation.messages.ReadMessagesValidatorInterface;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class VaryGrammarGenerator implements IGenerator {
  private static ReadFileProperties readerFileProperties = new ReadFileProperties();
  
  protected final ReadMessagesValidatorInterface readerMessages;
  
  @Inject
  public VaryGrammarGenerator() {
    ReadMessagesValidator _readMessagesValidator = new ReadMessagesValidator();
    this.readerMessages = _readMessagesValidator;
  }
  
  public VaryGrammarGenerator(final String lenguaje) {
    vary.pseudocodigo.dsl.c.validation.english.messages.ReadMessagesValidator _readMessagesValidator = new vary.pseudocodigo.dsl.c.validation.english.messages.ReadMessagesValidator();
    this.readerMessages = _readMessagesValidator;
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess myCFile) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Codigo> _filter = Iterables.<Codigo>filter(_iterable, Codigo.class);
    for (final Codigo myPseudo : _filter) {
      {
        ProjectLocationFolder.setResource(resource);
        String _path = ProjectLocationFolder.getPath();
        String _plus = ("La uri cogida es:" + _path);
        System.out.println(_plus);
        String contenidoFichero = new String();
        try {
          String _oS = ProjectLocationFolder.getOS();
          boolean _equals = _oS.equals("WIN32");
          if (_equals) {
            String _path_1 = ProjectLocationFolder.getPath();
            String _plus_1 = (_path_1 + ".varyproject");
            String _readFilePropertiesWindows = VaryGrammarGenerator.readerFileProperties.readFilePropertiesWindows(_plus_1, 2);
            contenidoFichero = _readFilePropertiesWindows;
          } else {
            String _path_2 = ProjectLocationFolder.getPath();
            String _plus_2 = ("file:" + _path_2);
            String _readFilePropertiesUnix = VaryGrammarGenerator.readerFileProperties.readFilePropertiesUnix(_plus_2, 2);
            contenidoFichero = _readFilePropertiesUnix;
          }
        } catch (final Throwable _t) {
          if (_t instanceof IOException) {
            final IOException e = (IOException)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        String tipoProyecto = contenidoFichero.replaceAll("lenguajeGeneracion=", "");
        boolean _equals_1 = Objects.equal(tipoProyecto, "C");
        if (_equals_1) {
          VaryGrammarGeneratorC generadorC = new VaryGrammarGeneratorC(this.readerMessages);
          generadorC.doGenerate(resource, myCFile);
        } else {
          VaryGrammarGeneratorCPP generadorCPP = new VaryGrammarGeneratorCPP(this.readerMessages);
          generadorCPP.doGenerate(resource, myCFile);
        }
      }
    }
  }
}
