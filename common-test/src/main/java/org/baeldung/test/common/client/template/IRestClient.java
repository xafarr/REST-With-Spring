package org.baeldung.test.common.client.template;

import org.apache.commons.lang3.tuple.Pair;
import org.baeldung.client.marshall.IMarshaller;
import org.baeldung.client.template.IRestClientWithUri;
import org.baeldung.common.interfaces.IDto;
import org.baeldung.common.interfaces.IOperations;

import com.jayway.restassured.specification.RequestSpecification;

public interface IRestClient<T extends IDto> extends IOperations<T>, IRestClientAsResponse<T>, IRestClientWithUri<T> {

    // template

    RequestSpecification givenReadAuthenticated();

    RequestSpecification givenDeleteAuthenticated();

    IMarshaller getMarshaller();

    String getUri();

    // util

    Pair<String, String> getReadCredentials();

}
