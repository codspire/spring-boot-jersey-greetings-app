package com.codspire.helloservice.web;

import com.codspire.helloservice.HelloService;
import com.codspire.helloservice.domain.Greeting;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("/v1/hello")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "Hello API", produces = MediaType.APPLICATION_JSON, consumes = MediaType.APPLICATION_JSON)
public class HelloResource {

    @Autowired
    private HelloService helloService;

    @GET
    @ApiOperation(value = "Get Default Greeting", response = Greeting.class)
    public Greeting getDefaultGreeting() {
        return this.helloService.getGreeting(null);
    }

    @GET
    @Path("/{subject}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Get Custom Greeting", response = Greeting.class)
    public Greeting getGreeting(@ApiParam @PathParam("subject") String subject) {
        return this.helloService.getGreeting(subject);
    }
}
