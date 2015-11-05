package org.baeldung.common.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public final class WebProperties {

    @Value("${http.protocol}")
    private String protocol;

    @Value("${http.host}")
    private String host;

    @Value("${http.context}")
    private String context;

    @Value("${http.oauthPath}")
    private String oauthPath;

    @Value("${http.port}")
    private int port;

    public WebProperties() {
        super();
    }

    // API

    public final String getProtocol() {
        return protocol;
    }

    public final String getHost() {
        return host;
    }

    public final int getPort() {
        return port;
    }

    public final String getContext() {
        return context;
    }

    public final String getOauthPath() {
        return oauthPath;
    }

}
