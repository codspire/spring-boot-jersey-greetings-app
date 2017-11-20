package com.codspire.modules.decorators;

import org.junit.Test;

import com.codspire.modules.decorators.CapitalizeMessageDecorator;
import com.codspire.modules.decorators.MessageDecorator;

import static com.google.common.truth.Truth.assertThat;

public class CapitalizeMessageDecoratorShould {

	@Test
	public void capitalizeFirstCharOfWord() {
		// given
		MessageDecorator messageDecorator = new CapitalizeMessageDecorator();
		String input = "rakesh";

		// when
		String output = messageDecorator.decorate(input);

		// then
		assertThat(output).isEqualTo("Rakesh");
	}
}
