package org.baeldung.um.test.suite;

import org.baeldung.um.web.privilege.PrivilegeLogicRestLiveTest;
import org.baeldung.um.web.privilege.PrivilegeReadOnlyLogicRestLiveTest;
import org.baeldung.um.web.role.RoleLogicRestLiveTest;
import org.baeldung.um.web.role.RoleReadOnlyLogicRestLiveTest;
import org.baeldung.um.web.user.UserLogicRestLiveTest;
import org.baeldung.um.web.user.UserReadOnlyLogicRestLiveTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ // @formatter:off
    PrivilegeLogicRestLiveTest.class
    , PrivilegeReadOnlyLogicRestLiveTest.class

    , RoleLogicRestLiveTest.class
    , RoleReadOnlyLogicRestLiveTest.class

    , UserLogicRestLiveTest.class
    , UserReadOnlyLogicRestLiveTest.class
})
// @formatter:off
public final class LiveLogicSuite {
    //
}
