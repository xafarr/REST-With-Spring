package org.baeldung.um.service.main;

import org.baeldung.common.persistence.model.INameableEntity;
import org.baeldung.test.common.service.AbstractServiceIntegrationTest;
import org.baeldung.um.run.UmApp;
import org.baeldung.um.spring.UmContextConfig;
import org.baeldung.um.spring.UmPersistenceJpaConfig;
import org.baeldung.um.spring.UmServiceConfig;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { // @formatter:off
        UmApp.class,
        UmContextConfig.class,

        UmPersistenceJpaConfig.class,

        UmServiceConfig.class
}, loader = AnnotationConfigContextLoader.class)  // @formatter:on
public abstract class SecServiceIntegrationTest<T extends INameableEntity> extends AbstractServiceIntegrationTest<T> {

    //

}
