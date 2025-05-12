package com.spring.security;

import com.helper.JwtUtil;
import com.model.JwtRequest;
import com.model.JwtResponse;
import com.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {

    @Autowired(required=true)
    private AuthenticationManager authenticationManager;

    private final CustomUserDetailsService customUserDetailsService=new CustomUserDetailsService();

    @Autowired
    private JwtUtil jwtUtil;

    @RequestMapping(value = "/token ",method = RequestMethod.POST)
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception{
        System.out.printf("jwtRequest.."+jwtRequest);
        try
        {
        this.authenticationManager.
        authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUserName(),jwtRequest.getPassword()));
        }
        catch (UsernameNotFoundException ex){
            ex.printStackTrace();
            throw new Exception("bad credentials");
        }

        UserDetails userDetails= this.customUserDetailsService.loadUserByUsername(jwtRequest.getUserName());
      String generatedToken=this.jwtUtil.generateToken(userDetails);
        System.out.printf("JWT ...."+generatedToken);
 return   ResponseEntity.ok(new JwtResponse(generatedToken));
    }
}
