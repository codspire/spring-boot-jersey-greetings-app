package com.codspire.helloservice;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.codspire.helloservice.web.HelloResource;

@Component
@ApplicationPath("/api/v1/greeting")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(HelloResource.class);
	}
}