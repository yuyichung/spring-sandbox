package com.sandbox.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.sandbox.model.BlogModel;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.sandbox.controller")
public class ViewConfig {

	@Bean
	public UrlBasedViewResolver buildInternalResolver() {
		UrlBasedViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");

		return resolver;
	}

	@Bean
	public BlogModel blogEntries()
	{
		return new BlogModel();
	}
}
