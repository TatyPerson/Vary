package org.sonar.vary.api;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class VaryKeywordTest {

  @Test
  public void test() {
    assertThat(VaryKeyword.values()).hasSize(112);
    assertThat(VaryKeyword.keywordValues()).hasSize(VaryKeyword.values().length);
  }

}
