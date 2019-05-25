package com.me;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.glassfish.jersey.servlet.ServletContainer;

import io.swagger.jaxrs.config.BeanConfig;

public class SwaggerConfig extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		BeanConfig conf = new BeanConfig();
		conf.setHost("localhost:8080/Jersey");
		conf.setSchemes(new String[] {"http"});
		conf.setBasePath("/api");
		conf.setTitle("title");
		conf.setVersion("1");
		conf.setScan(true);
		conf.setResourcePackage("com.me");
		conf.setPrettyPrint(true);
		
		
	}
}
