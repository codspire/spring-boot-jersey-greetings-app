package com.codspire.helloservice.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.codspire.helloservice", "com.codspire.helloservice.config" })
public class HelloServiceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new HelloServiceApplication().configure(new SpringApplicationBuilder(HelloServiceApplication.class)).run(args);
	}
}
