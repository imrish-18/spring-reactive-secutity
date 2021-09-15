package com.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.handler.EmployeeHandler;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeRouter.
 */
@EnableWebFlux
@Configuration
@ComponentScan(basePackages = "com.handler")
public class EmployeeRouter {


	/**
	 * Gets the string msg.
	 *
	 * @param handler the handler
	 * @return the string msg
	 */
	@Bean
	public RouterFunction<ServerResponse> getStringMsg(EmployeeHandler handler)
	{
		return RouterFunctions.route(RequestPredicates.GET("/string"),handler::getString);
	}
	
}
