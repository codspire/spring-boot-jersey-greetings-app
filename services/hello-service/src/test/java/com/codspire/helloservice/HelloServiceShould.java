package com.codspire.helloservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.codspire.helloservice.HelloConfig;
import com.codspire.helloservice.HelloService;
import com.codspire.helloservice.domain.Greeting;

import static com.google.common.truth.Truth.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloConfig.class)
public class HelloServiceShould {

	@Autowired
	private HelloService helloService;

	@Test
	public void contextLoads() {
		String input = "rakesh";

		Greeting greeting = helloService.getGreeting(input);
		assertThat(greeting).isNotNull();

		assertThat(greeting.getMessage()).isEqualTo("Hello Rakesh");
	}
}
