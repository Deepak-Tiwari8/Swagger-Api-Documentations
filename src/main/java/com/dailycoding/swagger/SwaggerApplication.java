package com.dailycoding.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}
	@SuppressWarnings("rawtypes")
	List<VendorExtension> vendorExtensions = new ArrayList<VendorExtension>();
	Contact contact = new Contact("Deepak", "https://dailycodingwithdev.com", "deepaktiwari8226@gmail.com");
	
	ApiInfo apiInfo = new ApiInfo("Swagger Api Documentation",
			"API's to person all actions related to Course operation",
			"Snapshoot-0.0.1",
			"https://dailycodingwithdev.com/",
			(springfox.documentation.service.Contact) contact,
			"www.ty.com",
			"india",
			vendorExtensions);
	
	@Bean
	public Docket myDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.dailycoding.swagger"))
				.build().apiInfo(apiInfo);
	}

}
