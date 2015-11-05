package org.baeldung.um.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationEventPublisher;
import org.springframework.security.authentication.DefaultAuthenticationEventPublisher;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

//@Configuration
//@EnableResourceServer
public class ResourceServerConfigurationOld extends ResourceServerConfigurerAdapter {

    public ResourceServerConfigurationOld() {
        super();
    }

    //

    @Bean
    public AuthenticationEventPublisher authEventPublisher() {
        return new DefaultAuthenticationEventPublisher();
    }

    @Override
    public void configure(final ResourceServerSecurityConfigurer resources) {
        resources.resourceId("um-webapp").stateless(true).eventPublisher(authEventPublisher());
    }

    @Override
    public void configure(final HttpSecurity http) throws Exception {
        // @formatter:off
        http.
        antMatcher("/api/**")
            .authorizeRequests()
        .antMatchers("/api/**").
            access("#oauth2.hasScope('um-webapp')")
        .and()
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        // @formatter:on
    }

}