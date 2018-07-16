//package com.bmq.coresv.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
////
////	@Override
////	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////		auth.inMemoryAuthentication().withUser("user").password("password").roles("USER").and().withUser("admin")
////				.password("admin").roles("USER", "ADMIN");
////	}
////
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////		http.authorizeRequests().antMatchers("/", "/public/**","/api/**", "/resources/**", "/resources/public/**").permitAll()
////				.anyRequest().authenticated();
////		// http.httpFirewall(allowUrlEncodedSlashHttpFirewall())
////	}
////
////	@Override
////	public void configure(WebSecurity web) throws Exception {
////		// @formatter:off
////		super.configure(web);
////		web.httpFirewall(allowUrlEncodedSlashHttpFirewall());
////	}
////
////	@Bean
////	public HttpFirewall allowUrlEncodedSlashHttpFirewall() {
////		StrictHttpFirewall firewall = new StrictHttpFirewall();
////		firewall.setAllowUrlEncodedSlash(true);
////		return firewall;
////	}
//}
