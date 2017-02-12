hue-java 
==============================
*A Java wrapper for the Philips Hue api.*


Usage
----------------
Implement HueConfiguration interface

*Example:*
```java
@Config.Sources("classpath:bridge.properties")
public interface HueExampleConfiguration extends Config, HueConfiguration
{
    @Key("bridge.ip")
    String getBridgeIp();

    @Key("bridge.username")
    String getBridgeUsername();
}
```

Create instance of lights handler.

*Example:*
```java
    private LightsHandler testee = new LightsHandler(new HueTestConfiguration());
```

Methods        | Action
---------------------- | ------
`getAll`                | Get all light's connected to the current bridge.
`get`                | Get specific light by id.
`setState`                | Set state of single light by id.

Related
----------------
- Get the most out of your lights. - [HUE Developer Program](https://www.developers.meethue.com/)
- Feign makes writing java http clients more easy. - [OpenFeign](https://github.com/OpenFeign/feign)

License
----------------
MIT © [Sebastian Puskeiler](https://twitter.com/ebud7)
