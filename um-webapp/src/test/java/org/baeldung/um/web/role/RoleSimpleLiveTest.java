package org.baeldung.um.web.role;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.baeldung.common.spring.util.Profiles.CLIENT;
import static org.baeldung.common.spring.util.Profiles.TEST;

import java.util.Collection;

import org.baeldung.um.client.template.RoleSimpleApiClient;
import org.baeldung.um.persistence.model.Privilege;
import org.baeldung.um.persistence.model.Role;
import org.baeldung.um.spring.CommonTestConfig;
import org.baeldung.um.spring.UmClientConfig;
import org.baeldung.um.spring.UmLiveTestConfig;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.google.common.collect.Sets;

@SuppressWarnings("unchecked")
@ActiveProfiles({ CLIENT, TEST })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { UmLiveTestConfig.class, UmClientConfig.class, CommonTestConfig.class }, loader = AnnotationConfigContextLoader.class)
public class RoleSimpleLiveTest extends GenericSimpleLiveTest<Role> {

    @Autowired
    private RoleSimpleApiClient api;

    // UTIL

    @Override
    protected final RoleSimpleApiClient getApi() {
        return api;
    }

    @Override
    protected final Role createNewResource() {
        return new Role(randomAlphabetic(8), Sets.<Privilege> newHashSet());
    }

    @Override
    protected Collection<Privilege> getAssociations(Role resource) {
        return resource.getPrivileges();
    }

    @Override
    protected Privilege createNewAssociationResource() {
        return new Privilege(randomAlphabetic(8));
    }

}
