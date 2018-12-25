package com.codspire.helloservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//https://stackoverflow.com/questions/37640863/springfox-swagger-no-api-docs-with-spring-boot-jersey-and-gradle/38004323#38004323
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .enableUrlTemplating(true);
    }

    @Bean
    UiConfiguration uiConfig() {
        return UiConfigurationBuilder.builder()

                .deepLinking(true)
                .displayOperationId(false)
                .defaultModelsExpandDepth(1)
                .defaultModelExpandDepth(1)
                .defaultModelRendering(ModelRendering.EXAMPLE)
                .displayRequestDuration(false)
                .docExpansion(DocExpansion.NONE)
                .filter(false)
                .maxDisplayedTags(null)
                .operationsSorter(OperationsSorter.ALPHA)
                .showExtensions(false)
                .tagsSorter(TagsSorter.ALPHA)
                .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
                .validatorUrl(null)
                .build();
    }
}

//http://localhost:8091/v2/api-docs
//http://localhost:8091/swagger-ui.html
//http://localhost:8091/api/v1/greeting/application.wadl
//http://localhost:8091/api/v1/greeting/swagger.json
//https://tech.asimio.net/2016/04/05/Microservices-using-Spring-Boot-Jersey-Swagger-and-Docker.html#document_swagger
//https://stackoverflow.com/questions/37640863/springfox-swagger-no-api-docs-with-spring-boot-jersey-and-gradle/38004323#38004323