package com.crud.h2.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
            .antMatchers("/login").permitAll()	//allow access to /login to anyone
            .anyRequest().authenticated() //cualquier otra peticion requiere autenticacion
            .and()
            //any other request requires authentication
            .addFilterBefore(new LoginFilter("/login", authenticationManager()),
                    UsernamePasswordAuthenticationFilter.class)

            // All other requests will go through this filter to validate the token
            .addFilterBefore(new JwtFilter(),
                    UsernamePasswordAuthenticationFilter.class);
    }

   @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	   // We create a default user account
       auth.inMemoryAuthentication()
               .withUser("celes")
               .password("{noop}123")
               .roles("ADMIN");
       
       auth.inMemoryAuthentication()
			   .withUser("jose")
			   .password("{noop}root")
			   .roles("USER");
    }

}
