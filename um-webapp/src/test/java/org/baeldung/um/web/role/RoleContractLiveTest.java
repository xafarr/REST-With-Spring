package org.baeldung.um.web.role;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.baeldung.common.spring.util.Profiles.CLIENT;
import static org.baeldung.common.spring.util.Profiles.TEST;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.baeldung.um.client.template.RoleSimpleApiClientNoBase;
import org.baeldung.um.persistence.model.Privilege;
import org.baeldung.um.persistence.model.Role;
import org.baeldung.um.spring.CommonTestConfig;
import org.baeldung.um.spring.UmClientConfig;
import org.baeldung.um.spring.UmLiveTestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.google.common.collect.Sets;
import com.google.common.io.CharStreams;
import com.jayway.restassured.response.Response;

@ActiveProfiles({ CLIENT, TEST })
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { UmLiveTestConfig.class, UmClientConfig.class, CommonTestConfig.class }, loader = AnnotationConfigContextLoader.class)
public class RoleContractLiveTest {

    @Autowired
    private RoleSimpleApiClientNoBase api;

    // create

    @Test
    public final void whenResourceIsCreated_then201IsReceived() throws IOException {
        // When
        final Response response = getApi().createAsResponse(createNewResource());

        // Then
        assertThat(response.getStatusCode(), is(201));
        assertNotNull(response.getHeader(HttpHeaders.LOCATION));
    }

    // update

    @Test
    public final void givenResourceExists_whenResourceIsUpdated_then200IsReceived() throws IOException {
        // Given
        final Role existingResource = getApi().create(createNewResource());

        // When
        final Response response = getApi().updateAsResponse(existingResource);

        // Then
        assertThat(response.getStatusCode(), is(200));
    }

    // UTIL

    private final RoleSimpleApiClientNoBase getApi() {
        return api;
    }

    private final String createNewResource() throws IOException {
        final InputStream stream = getClass().getResourceAsStream("/data/role_v1.json");
        final String roleData = CharStreams.toString(new InputStreamReader(stream));
        return roleData;
    }

    private final String createNewResource3() throws IOException {
        final InputStream stream = getClass().getResourceAsStream("/data/role_v1.json");
        final String roleData = CharStreams.toString(new InputStreamReader(stream));
        return roleData;
    }

    private final String createNewResource2() {
        final String roleData = "{\"id\":null,\"name\":\"" + randomAlphabetic(8) + "\",\"privileges\":[]}";
        return roleData;
    }

    private final String createNewResource1() {
        final Role newRole = new Role(randomAlphabetic(8), Sets.<Privilege> newHashSet());
        return getApi().getMarshaller().encode(newRole);
    }

}
