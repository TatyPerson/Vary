package org.sonar.vary.api;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class VaryTokenTypeTest {

  @Test
  public void test() {
    assertThat(VaryTokenType.values()).hasSize(5);

    for (VaryTokenType tokenType : VaryTokenType.values()) {
      assertThat(tokenType.getName()).isEqualTo(tokenType.name());
      assertThat(tokenType.getValue()).isEqualTo(tokenType.name());
    }
  }

}
