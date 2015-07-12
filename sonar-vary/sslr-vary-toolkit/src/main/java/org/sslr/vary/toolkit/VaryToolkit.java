package org.sslr.vary.toolkit;

import org.sonar.sslr.toolkit.Toolkit;

public final class VaryToolkit {

  private VaryToolkit() {
  }

  public static void main(String[] args) {
    Toolkit toolkit = new Toolkit("SSLR :: Vary :: Toolkit", new VaryConfigurationModel());
    toolkit.run();
  }

}
