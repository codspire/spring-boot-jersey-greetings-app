package com.codspire.helloservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.codspire.modules.decorators.CapitalizeMessageDecorator;
import com.codspire.modules.decorators.MessageDecorator;

@Configuration
@ComponentScan("com.codspire")
//https://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch06s02.html
//http://techblog.outbrain.com/2014/05/so-long-spring-xmls/
public class HelloConfig {

	@Bean
	MessageDecorator messageDecorator() {
		return new CapitalizeMessageDecorator();
	}
}
