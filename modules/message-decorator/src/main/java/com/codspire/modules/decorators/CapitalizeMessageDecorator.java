package com.codspire.modules.decorators;

import org.springframework.util.StringUtils;

public class CapitalizeMessageDecorator implements MessageDecorator {
	public String decorate(String input) {
		return StringUtils.capitalize(input);
	}
}
