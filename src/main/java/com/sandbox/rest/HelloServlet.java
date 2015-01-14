package com.sandbox.rest;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.sandbox.config.SpringContextAccessor;


@Named
@Path("/hello")
@Produces("application/json")
public class HelloServlet {


	@GET
	public String hello() {
		return SpringContextAccessor.getApplicationContext() == null ? "true" : "false";
	}
}
