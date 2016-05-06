package org.baeldung.um.test.suite;

import org.baeldung.um.service.main.PrincipalServiceIntegrationTest;
import org.baeldung.um.service.main.PrivilegeServiceIntegrationTest;
import org.baeldung.um.service.main.RoleServiceIntegrationTest;
import org.baeldung.um.web.WebSpringIntegrationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ // @formatter:off
    PrincipalServiceIntegrationTest.class,
    PrivilegeServiceIntegrationTest.class,
    RoleServiceIntegrationTest.class,

    WebSpringIntegrationTest.class
})
// @formatter:on
public final class ServiceSuite {
    //
}
