package com.codebud7.integrationtests;

import com.codebud7.config.HueTestConfiguration;
import com.codebud7.domainobject.configuration.Bridge;
import com.codebud7.service.ConfigurationHandler;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConfigurationHandlerIntegrationTest
{
    private ConfigurationHandler testee = new ConfigurationHandler(new HueTestConfiguration());


    @Test
    public void shouldGetConfiguration() throws Exception
    {
        final Bridge bridge = testee.get();
        assertThat(bridge, notNullValue());
    }
}
