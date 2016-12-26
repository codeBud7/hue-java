package com.codebud7.service.http;

import com.codebud7.domainobject.lights.Light;
import com.codebud7.domainobject.lights.State;
import feign.Feign;
import feign.Param;
import feign.RequestLine;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import java.util.HashMap;

public class LightsApiClient
{
    private final LightsApi target;
    private final String username;


    public LightsApiClient(String bridgeIp, String username)
    {
        this.target = Feign.builder()
            .encoder(new GsonEncoder())
            .decoder(new GsonDecoder())
            .target(LightsApi.class, bridgeIp);

        this.username = username;
    }


    public HashMap<Long, Light> getAll()
    {
        return this.target.get(this.username);
    }


    public Light get(final Long id)
    {
        return this.target.get(this.username, id);
    }


    public void setState(final Long id, final State state)
    {
        this.target.setState(this.username, id, state);
    }


    interface LightsApi
    {
        @RequestLine("GET /api/{username}/lights")
        HashMap<Long, Light> get(@Param("username") String username);

        @RequestLine("GET /api/{username}/lights/{id}")
        Light get(@Param("username") String username, @Param("id") Long id);

        @RequestLine("PUT /api/{username}/lights/{id}/state")
        void setState(@Param("username") String username, @Param("id") Long id, State state);
    }
}
