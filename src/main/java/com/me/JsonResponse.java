package com.me;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;

@Path("/me")
@Api("/hello")
@SwaggerDefinition(tags= {@Tag(name="hello", description="hello jersey resource") })
public class JsonResponse {
	
	@GET
	@Path("/ok1")
	@Produces( MediaType.APPLICATION_JSON)
	public List<String> hello() {
		return Arrays.asList("Hello", "Jersey");
	}

	
	@POST
	@Path("/ok2")
	@Produces( MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<String> test(String randome) {
		return Arrays.asList(randome);
	}

	
}
