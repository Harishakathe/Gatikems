package com.mindworx.config;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import com.mindworx.service.LoginService;


@Configuration
@EnableWebSecurity
public class SecurityConfig	extends WebSecurityConfigurerAdapter {
	
	public static final Logger log = Logger.getLogger(SecurityConfig.class);
		
	@Autowired
	DataSource dataSource;
	
	@Autowired
	@Qualifier(value="loginService")
	LoginService loginService;
	
	@Autowired
	CustomSuccessHandler successHandler;

	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(loginService);
		auth.authenticationProvider(authenticationProvider());
    }
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(loginService);
		provider.setPasswordEncoder(passwordEncoder());
		return provider;
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(11);
	}
		
	@Override
	protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable();	 
			// The pages does not require login
	        http.authorizeRequests().antMatchers("/login", "/logout","/registration").permitAll();
	        http.authorizeRequests().antMatchers("/**").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')");
	 
	        // For ADMIN only.
	        http.authorizeRequests().antMatchers("/admin","/admin/**").access("hasRole('ROLE_ADMIN')");
	 
	        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/accessDenied");
	 
	        
			http.authorizeRequests().and().formLogin()
                //.loginProcessingUrl("/j_spring_security_check") // Submit URL
                .loginPage("/login")//
                .failureUrl("/login?error=true")//
                .successHandler(successHandler)
                // Config for Logout Page
                .and().logout().logoutUrl("/j_spring_security_logout").logoutSuccessUrl("/login")	        
                //persistant token approach
                .and().rememberMe()
                .tokenRepository(tokenRepository())
                .tokenValiditySeconds(60*60)
                .and().exceptionHandling().accessDeniedPage("/accessDenied");
	  }
	
	@Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
        	.antMatchers("/resources/**");
    }
	
	@Bean
	public PersistentTokenRepository tokenRepository() {
		JdbcTokenRepositoryImpl tokenRepositoryImpl = new JdbcTokenRepositoryImpl();
		tokenRepositoryImpl.setDataSource(dataSource);
		return tokenRepositoryImpl;
	}	
		
}

