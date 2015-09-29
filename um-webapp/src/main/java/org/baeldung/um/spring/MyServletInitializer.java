package org.baeldung.um.spring;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServletInitializer extends SpringBootServletInitializer {

    //

    @Override
    protected SpringApplicationBuilder configure(final SpringApplicationBuilder application) {
        return application.sources(UmContextConfig.class, UmPersistenceJpaConfig.class, UmServiceConfig.class, UmWebConfig.class, UmServletConfig.class, UmJavaSecurityConfig.class);
    }

}
