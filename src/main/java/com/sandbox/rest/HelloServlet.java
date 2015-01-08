package com.sandbox.rest;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Named
@Path("/hello")
@Produces("application/json")
public class HelloServlet {

	@GET
	public String hello() {
		return "hello!";
	}
}
