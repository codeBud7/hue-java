package com.codebud7.domainobject;

import java.util.HashMap;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Lights
{
    private HashMap<Integer, Light> lights;
}
