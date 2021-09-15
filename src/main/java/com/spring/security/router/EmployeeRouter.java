package com.spring.security.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import com.spring.security.*;

// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeRouter.
 */
@Configuration
@EnableWebFlux
@ComponentScan(basePackages = "com.spring.securtiy")
public class EmployeeRouter {
	

	/**
	 * Gets the all.
	 *
	 * @param handler the handler
	 * @return the all
	 */
	
	
	@Bean
	public RouterFunction<ServerResponse> getStringMsg(EmployeeHandler handler)
	{
		return RouterFunctions.route(RequestPredicates.GET("/string/msg"),handler::getString);
	}
	
	
	  /**
  	 * Gets the all employee.
  	 *
  	 * @param showHandler the show handler
  	 * @return the all employee
  	 */
  	@Bean public RouterFunction<ServerResponse> getAllEmployee(EmployeeHandler
	  showHandler) { return RouterFunctions
	  .route(RequestPredicates.GET("/getAll").and(RequestPredicates.
	  accept(MediaType.APPLICATION_JSON)), showHandler::getAllEmployee); }
	  /**
	  	 * Gets the.
	  	 *
	  	 * @param showHandler the show handler
	  	 * @return the router function
	  	 */
	  	@Bean
		  public RouterFunction<ServerResponse> getById(EmployeeHandler showHandler) {
		    return RouterFunctions
		      .route(RequestPredicates.GET("/getById/{id}"), showHandler::getById);
		  }
		
		  /**
	  	 * Postdata.
	  	 *
	  	 * @param handler the handler
	  	 * @return the router function
	  	 */
	  	@Bean
		  public RouterFunction<ServerResponse> postEmp(EmployeeHandler handler)
		  {
		 return RouterFunctions.route(RequestPredicates.POST("/postEmp").
				 and(RequestPredicates.contentType(MediaType.APPLICATION_JSON)), handler::postEmp);
	}
		  
	  	/**
	  	 * Deleteid.
	  	 *
	  	 * @param showHandler the show handler
	  	 * @return the router function
	  	 */
	  	@Bean
		  public RouterFunction<ServerResponse> deleteById(EmployeeHandler showHandler) {
		    return RouterFunctions
		      .route(RequestPredicates.DELETE("/deleteById/{id}"), showHandler::deleteById);
		  }  
		  
	  	/**
	  	 * Update.
	  	 *
	  	 * @param showHandler the show handler
	  	 * @return the router function
	  	 */
	  	@Bean
		  public RouterFunction<ServerResponse> updateById(EmployeeHandler showHandler) {
		    return RouterFunctions
		      .route(RequestPredicates.PUT("/updateById/{id}"), showHandler::updateById);
		  } 
		  
	  	/**
	  	 * Delete all.
	  	 *
	  	 * @param handler the handler
	  	 * @return the router function
	  	 */
	  	@Bean
		  public RouterFunction<ServerResponse> deleteAll(EmployeeHandler handler)
		  {
			  return RouterFunctions.route(RequestPredicates.DELETE("/deleteAll"),handler::deleteAll);
		  }
		  
	  	/**
	  	 * Gets the all stream.
	  	 *
	  	 * @param handler the handler
	  	 * @return the all stream
	  	 */
	  	@Bean
		  public RouterFunction<ServerResponse> getAllStream(EmployeeHandler handler)
		  {
			  return RouterFunctions.route(RequestPredicates.GET("/stream"),handler::getStream);
		  }
}
