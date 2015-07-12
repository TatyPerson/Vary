package org.sonar.vary.visitors;

import java.nio.charset.Charset;

public interface VaryCharsetAwareVisitor {

  void setCharset(Charset charset);

}
