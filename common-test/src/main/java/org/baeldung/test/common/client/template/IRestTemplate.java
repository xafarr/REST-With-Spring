package org.baeldung.test.common.client.template;

import org.apache.commons.lang3.tuple.Pair;
import org.baeldung.client.marshall.IMarshaller;
import org.baeldung.client.template.ITemplateWithUri;
import org.baeldung.common.interfaces.IDto;
import org.baeldung.common.interfaces.IOperations;

import com.jayway.restassured.specification.RequestSpecification;

public interface IRestTemplate<T extends IDto> extends IOperations<T>, ITemplateAsResponse<T>, ITemplateWithUri<T> {

    // template

    RequestSpecification givenReadAuthenticated();

    IMarshaller getMarshaller();

    String getUri();

    // util

    Pair<String, String> getReadCredentials();

}
