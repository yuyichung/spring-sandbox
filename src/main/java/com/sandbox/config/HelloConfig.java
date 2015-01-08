package com.sandbox.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

public class HelloConfig extends ResourceConfig
{
	public HelloConfig() {
		packages("com.sandbox.rest");
	}
}
