package com.spring.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.*;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.server.SecurityWebFilterChain;

// TODO: Auto-generated Javadoc
/**
 * The Class SecurityConfig.
 */
@EnableWebFluxSecurity
public class SecurityConfig{

	
//	
//	
//	@Autowired
//	public void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth
//			.inMemoryAuthentication()
//				.withUser("user").password("password").roles("USER");
//	}
	
//	@Bean
//	public SecurityWebFilterChain securitygWebFilterChain(
//	  ServerHttpSecurity http) {
//	    return http.authorizeExchange()
//	      .anyExchange().authenticated()
//	      .and().build();
/**
 * Spring security filter chain.
 *
 * @param http the http
 * @return the security web filter chain
 */
//	}
	@Bean
	public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
	    http
	        // ...
	        .csrf(csrf -> csrf.disable());
	    return http.build();
	}
	
//	@Bean
//    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
//        http
//            .authorizeExchange(exchanges ->
//                exchanges
//                    .anyExchange().authenticated()
//            )
//            .httpBasic().authenticationManager(null).disable();
//        return http.build();
/**
 * User details service.
 *
 * @return the map reactive user details service
 */
//    }
	 @Bean
	    public MapReactiveUserDetailsService userDetailsService() {
	        UserDetails user = User.withDefaultPasswordEncoder()
	            .username("user")
	            .password("user")
	            .roles("USER")
	            .build();
	        return new MapReactiveUserDetailsService(user);
	    }
	
	/**
	 * Securityg web filter chain.
	 *
	 * @param http the http
	 * @return the security web filter chain
	 */
	@Bean
	public SecurityWebFilterChain securitygWebFilterChain(
			  ServerHttpSecurity http) {
			    return http.authorizeExchange()
			      .anyExchange().authenticated()
			      .and().formLogin()
			      .and().build();
			}
}