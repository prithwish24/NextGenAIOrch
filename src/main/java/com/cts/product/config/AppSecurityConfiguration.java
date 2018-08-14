package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class AppSecurityConfiguration extends WebSecurityConfigurerAdapter {

	private static final String __SERVICE_ROLE = "SERVICE";
	private static final String __SERVICE_USER = "user1";
	//private static final String __SERVICE_PASSWD_UNMSK = "p@ssw0rd1";
	private static final String __SERVICE_PASSWD = "$2a$04$IdkKnJ7ZRV5x2BhN.sgxyOyjdURa6TKQsSzDV6go5iV6EOHUX7TZi";
	private static final String __URL_PATTERN = "/services/**";
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// Authentication : User --> Roles
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance())
			.withUser(__SERVICE_USER).password(__SERVICE_PASSWD).roles(__SERVICE_ROLE);*/
		auth.inMemoryAuthentication().withUser(__SERVICE_USER).password(__SERVICE_PASSWD).roles(__SERVICE_ROLE);
	}


	// Authorization : Role -> Access
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests()
		.antMatchers(__URL_PATTERN).hasRole(__SERVICE_ROLE).and()
		.csrf().disable().headers().frameOptions().disable();
	}
}
