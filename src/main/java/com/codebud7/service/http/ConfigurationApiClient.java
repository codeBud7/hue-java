package com.codebud7.service.http;

import com.codebud7.domainobject.configuration.Bridge;
import feign.Feign;
import feign.Param;
import feign.RequestLine;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

public class ConfigurationApiClient
{
    private final ConfigurationApi target;
    private final String username;


    public ConfigurationApiClient(String bridgeIp, String username)
    {
        this.target = Feign.builder()
            .encoder(new GsonEncoder())
            .decoder(new GsonDecoder())
            .target(ConfigurationApi.class, bridgeIp);

        this.username = username;
    }


    public Bridge get()
    {
        return this.target.get(this.username);
    }


    interface ConfigurationApi
    {
        @RequestLine("GET /api/{username}/config")
        Bridge get(@Param("username") String username);
    }
}
