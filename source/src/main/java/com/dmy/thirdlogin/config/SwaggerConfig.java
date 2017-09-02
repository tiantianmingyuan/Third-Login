package com.dmy.thirdlogin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;



@Configuration
@EnableSwagger2
@ComponentScan(basePackages = { "com.dmy.thirdlogin.web" })
public class SwaggerConfig {

	@Bean
	public Docket platformApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).forCodeGeneration(true);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("ThirdLogin-API").description("©2017 Copyright. Powered By ThirdLogin.")
				// .termsOfServiceUrl("")
				.contact(new Contact("ThirdLogin", "", "ThirdLogin@163.com")).license("Apache License Version 2.0")
				.licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE").version("1.0").build();
	}

}