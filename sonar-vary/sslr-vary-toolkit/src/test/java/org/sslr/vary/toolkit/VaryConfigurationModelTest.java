package org.sslr.vary.toolkit;

import static org.fest.assertions.Assertions.assertThat;

import org.junit.Test;

public class VaryConfigurationModelTest {

	@Test
	public void getProperties() {
		VaryConfigurationModel model = new VaryConfigurationModel();
		//assertThat(model.getProperties()).isEmpty();
	}

	@Test
	public void getTokenizers() {
		assertThat(new VaryConfigurationModel().getTokenizers()).isNotEmpty();
	}
	
}
