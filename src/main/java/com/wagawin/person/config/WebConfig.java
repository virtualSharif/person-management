package com.wagawin.person.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	public static final String SWAGGER_PATH = "/swagger-ui.html";

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", SWAGGER_PATH);
		registry.addRedirectViewController("/swagger", SWAGGER_PATH);
	}

}