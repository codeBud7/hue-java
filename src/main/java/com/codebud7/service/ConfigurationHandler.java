package com.codebud7.service;

import com.codebud7.config.HueConfiguration;
import com.codebud7.domainobject.configuration.Bridge;
import com.codebud7.service.http.ConfigurationApiClient;

public class ConfigurationHandler
{
    private final ConfigurationApiClient configurationApiClient;


    public ConfigurationHandler(HueConfiguration hueConfiguration)
    {
        this.configurationApiClient = new ConfigurationApiClient(hueConfiguration.getBridgeIp(), hueConfiguration.getBridgeUsername());
    }


    public Bridge get()
    {
        return this.configurationApiClient.get();
    }
}
