package com.sandbox.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sandbox.config")
public class ApplicationConfig {

	@Bean
	public SpringContextAccessor springContextAccessor()
	{
		return new SpringContextAccessor();
	}
}
