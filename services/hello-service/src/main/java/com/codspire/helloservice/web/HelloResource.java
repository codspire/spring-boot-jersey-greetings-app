package com.codspire.helloservice.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codspire.helloservice.HelloService;
import com.codspire.helloservice.domain.Greeting;

@Component
@Path("/hello")
public class HelloResource {

	@Autowired
	private HelloService helloService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting getDefaultGreeting() {
		return this.helloService.getGreeting(null);
	}

	@GET
	@Path("/{subject}")
	@Produces(MediaType.APPLICATION_JSON)
	public Greeting getGreeting(@PathParam("subject") String subject) throws Exception {
		return this.helloService.getGreeting(subject);
	}
}
