package org.baeldung.test.common.client.template;

import org.apache.commons.lang3.tuple.Pair;
import org.baeldung.common.interfaces.IDto;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public interface ITemplateAsResponse<T extends IDto> {

    // find - one

    Response findOneAsResponse(final long id, final RequestSpecification req);

    Response findOneAsResponse(final long id);

    Response findOneByUriAsResponse(final String uriOfResource, final RequestSpecification req);

    Response findOneByUriAsResponse(final String uriOfResource);

    // find - all

    Response findAllByUriAsResponse(final String uriOfResource, final RequestSpecification req);

    Response findAllAsResponse();

    Response findAllAsResponse(final RequestSpecification req);

    Response findAllPaginatedAsResponse(final int page, final int size, final RequestSpecification req);

    Response findAllPaginatedAsResponse(final int page, final int size);

    Response findAllSortedAsResponse(final String sortBy, final String sortOrder, final RequestSpecification req);

    Response findAllSortedAsResponse(final String sortBy, final String sortOrder);

    Response findAllPaginatedAndSortedAsResponse(final int page, final int size, final String sortBy, final String sortOrder, final RequestSpecification req);

    Response findAllPaginatedAndSortedAsResponse(final int page, final int size, final String sortBy, final String sortOrder);

    // create

    Response createAsResponse(final T resource);

    Response createAsResponse(final T resource, final Pair<String, String> credentials);

    // update

    Response updateAsResponse(final T resource);

    // delete

    Response deleteAsResponse(final long id);

    // count

    Response countAsResponse();

}
