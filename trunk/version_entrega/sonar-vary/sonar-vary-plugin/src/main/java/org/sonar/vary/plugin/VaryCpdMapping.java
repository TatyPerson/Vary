package org.sonar.vary.plugin;

import java.nio.charset.Charset;

import net.sourceforge.pmd.cpd.Tokenizer;

import org.sonar.api.batch.AbstractCpdMapping;
import org.sonar.api.resources.Language;
import org.sonar.api.batch.fs.FileSystem;

public class VaryCpdMapping extends AbstractCpdMapping {

  private final VaryLanguage language;
  private final Charset charset;

  public VaryCpdMapping(VaryLanguage language, FileSystem fs) {
    this.language = language;
    this.charset = fs.encoding();
  }

  public Tokenizer getTokenizer() {
    return new VaryTokenizer(charset);
  }

  public Language getLanguage() {
    return language;
  }

}
