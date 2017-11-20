package com.codspire.helloservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.codspire.helloservice.domain.Greeting;
import com.codspire.modules.decorators.MessageDecorator;

@Service
public class HelloService {

	@Autowired
	private MessageDecorator messageDecorator;

	private static final String GREETING_PREFIX = "Hello";

	public Greeting getGreeting(String input) {
		String greetingMessage = "";
		if (!StringUtils.isEmpty(input)) {
			greetingMessage = " " + messageDecorator.decorate(input);
		}
		return new Greeting(GREETING_PREFIX + greetingMessage, new Date());
	}
}
