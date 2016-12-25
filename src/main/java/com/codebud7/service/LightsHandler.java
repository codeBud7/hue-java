package com.codebud7.service;

import com.codebud7.config.HueConfiguration;
import com.codebud7.domainobject.Light;
import com.codebud7.domainobject.State;
import com.codebud7.http.LightsApiClient;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightsHandler
{
    private static final Logger LOGGER = LoggerFactory.getLogger(LightsHandler.class);

    private final LightsApiClient lightsApiClient;


    public LightsHandler(HueConfiguration hueConfiguration)
    {
        this.lightsApiClient = new LightsApiClient(hueConfiguration.getBridgeIp(), hueConfiguration.getBridgeUsername());
    }


    public List<Light> getAll()
    {
        LOGGER.debug("Get information about all lights.");
        return this.lightsApiClient.getAll().values().stream().collect(Collectors.toList());
    }


    public Light get(final Long id)
    {
        LOGGER.debug("Get information about light {}.", id);
        return this.lightsApiClient.get(id);
    }


    public void setState(final Long id, final Boolean state)
    {
        LOGGER.debug("Set state {} for light {}.", state, id);
        this.lightsApiClient.setState(id, State.builder().on(state).build());
    }
}
