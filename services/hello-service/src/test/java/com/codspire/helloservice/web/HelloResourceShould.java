package com.codspire.helloservice.web;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.codspire.helloservice.HelloConfig;
import com.codspire.helloservice.domain.Greeting;

//https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-jersey
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = HelloConfig.class)
public class HelloResourceShould {

	private static final String API_URI = "/api/v1";

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void returnSimpleMessageWhenNoParameterIsSpecified() {
		ResponseEntity<Greeting> entity = this.restTemplate.getForEntity(API_URI + "/hello", Greeting.class);

		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).isNotNull();
		assertThat(entity.getBody().getMessage()).isEqualTo("Hello");
	}

	@Test
	public void returnMessageWithWithInputParameter() {
		ResponseEntity<Greeting> entity = this.restTemplate.getForEntity(API_URI + "/hello/rakesh", Greeting.class);

		assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
		assertThat(entity.getBody()).isNotNull();
		assertThat(entity.getBody().getMessage()).isEqualTo("Hello Rakesh");
	}

}