package org.baeldung.um.web;

import org.baeldung.um.run.UmApp;
import org.baeldung.um.spring.UmContextConfig;
import org.baeldung.um.spring.UmMetricConfig;
import org.baeldung.um.spring.UmPersistenceJpaConfig;
import org.baeldung.um.spring.UmServiceConfig;
import org.baeldung.um.spring.UmServletConfig;
import org.baeldung.um.spring.UmWebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { // @formatter:off
        UmApp.class,
        UmContextConfig.class,
        UmPersistenceJpaConfig.class,
        UmServiceConfig.class,
        UmMetricConfig.class,
        UmWebConfig.class,
        UmServletConfig.class
}) // @formatter:on
@WebAppConfiguration
public class WebSpringIntegrationTest {

    @Test
    public final void whenContextIsBootstrapped_thenOk() {
        //
    }

}
