package org.baeldung.um.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan({ "org.baeldung.um.service" })
@EnableScheduling
public class UmServiceConfig {

    public UmServiceConfig() {
        super();
    }

    // beans

}
