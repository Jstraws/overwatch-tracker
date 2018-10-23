package com.straus.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.channel.ChannelProcessingFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.addFilterBefore(new CorsFilter(), ChannelProcessingFilter.class);
		http.
				authorizeRequests()
				.antMatchers()
				.permitAll()
				.anyRequest()
				.fullyAuthenticated()
				.and()
				.httpBasic()
				.and().csrf().disable();

//		http.authorizeRequests().antMatchers("/h2-console/**").permitAll().and()
//		.authorizeRequests().antMatchers("/").permitAll().and().csrf().disable();

//		http.headers().frameOptions().disable();
	}
}
