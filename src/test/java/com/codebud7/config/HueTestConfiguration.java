package com.codebud7.config;

public class HueTestConfiguration implements HueConfiguration
{
    @Override
    public String getBridgeIp()
    {
        return "http://127.0.0.0";
    }


    @Override
    public String getBridgeUsername()
    {
        return "fancyUsername";
    }
}
