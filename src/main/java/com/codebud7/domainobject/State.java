package com.codebud7.domainobject;

import java.util.ArrayList;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Builder
@Getter
public class State
{
    @NonNull
    private final Boolean on;
    private final String hue;
    private final String sat;
    private final String effect;
    private final String ct;
    private final String alert;
    private final String colormode;
    private final Boolean reachable;
    private final ArrayList xy;
}
