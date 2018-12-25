package com.codspire.helloservice;

import com.codspire.helloservice.web.HelloResource;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.wadl.internal.WadlResource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Component
//@ApplicationPath("/api/v1/greeting")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        this.register(HelloResource.class);
        this.register(WadlResource.class);
    }

    @PostConstruct
    public void init() {
        // Register components where DI is needed
        this.configureSwagger();
    }

    private void configureSwagger() {
        // Available at localhost:port/swagger.json
        this.register(ApiListingResource.class);
        this.register(SwaggerSerializers.class);

        BeanConfig config = new BeanConfig();
        config.setConfigId("springboot-jersey-swagger-example");
        config.setTitle("Spring Boot + Jersey + springfox + Swagger Example");
        config.setVersion("v1");
        config.setContact("Rakesh Nagar");
        config.setSchemes(new String[]{"http", "https"});
        config.setBasePath("/api");
        config.setResourcePackage("com.codspire.helloservice.web");
        config.setPrettyPrint(true);
        config.setScan(true);
    }
}