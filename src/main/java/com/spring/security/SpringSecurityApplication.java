package com.spring.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.config.EnableWebFlux;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringSecurityApplication.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.spring.security"," com.helper"})
@EnableWebFlux
public class SpringSecurityApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
		System.out.println("hello this is security app...");
	}

}
