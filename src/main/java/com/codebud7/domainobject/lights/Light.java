package com.codebud7.domainobject.lights;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Light
{
    private final State state;
    private final String type;
    private final String name;
    private final String modelid;
    private final String manufacturername;
    private final String uniqueid;
    private final String swversion;
    private final String swconfigid;
    private final String productid;
}
