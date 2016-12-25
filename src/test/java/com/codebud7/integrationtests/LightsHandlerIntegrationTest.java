package com.codebud7.integrationtests;

import com.codebud7.config.HueTestConfiguration;
import com.codebud7.domainobject.Light;
import com.codebud7.service.LightsHandler;
import java.util.List;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class LightsHandlerIntegrationTest
{
    private LightsHandler testee = new LightsHandler(new HueTestConfiguration());


    @Test
    public void shouldGetAllLights() throws Exception
    {
        final List<Light> lightList = testee.getAll();
        assertThat(lightList.size(), is(3));
    }


    @Test
    public void shouldGetSingleLight() throws Exception
    {
        final Light light = testee.get(2L);
        assertThat(light, notNullValue());
    }


    @Test
    public void shouldSetState() throws Exception
    {
        testee.setState(2L, true);
    }
}
