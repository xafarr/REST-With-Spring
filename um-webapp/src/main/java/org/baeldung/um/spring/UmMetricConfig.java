package org.baeldung.um.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "org.baeldung.common.metric" })
public class UmMetricConfig {

    public UmMetricConfig() {
        super();
    }

    // beans

}
