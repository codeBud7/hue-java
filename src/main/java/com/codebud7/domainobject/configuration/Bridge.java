package com.codebud7.domainobject.configuration;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Bridge
{
    private final String name;
    private final String apiversion;
    private final String swversion;
    private final String proxyaddress;
    private final Boolean linkbutton;
    private final String ipaddress;
    private final String localtime;
}
