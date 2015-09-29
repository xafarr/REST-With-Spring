package org.baeldung.um.run;

import org.baeldung.um.spring.UmContextConfig;
import org.baeldung.um.spring.UmJavaSecurityConfig;
import org.baeldung.um.spring.UmPersistenceJpaConfig;
import org.baeldung.um.spring.UmServiceConfig;
import org.baeldung.um.spring.UmServletConfig;
import org.baeldung.um.spring.UmWebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@Import({ // @formatter:off
    UmContextConfig.class,
    UmPersistenceJpaConfig.class,
    UmServiceConfig.class,
    UmWebConfig.class,
    UmServletConfig.class,
    UmJavaSecurityConfig.class
}) // @formatter:on
public class UmApp {

    public UmApp() {
        super();
    }

    //

    public static void main(final String... args) {
        SpringApplication.run(UmApp.class, args);
    }

}
