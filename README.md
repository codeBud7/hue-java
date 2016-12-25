hue-java 
==============================
*A Java wrapper for the Philips Hue api.*

Install
----------------
to be continued...

Usage
----------------
Implement MessengerProperties interface

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

Related
----------------
- Get the most out of your lights. - [HUE Developer Program](https://www.developers.meethue.com/)
- Feign makes writing java http clients easier. - [OpenFeign](https://github.com/OpenFeign/feign)

License
----------------
MIT © [Sebastian Puskeiler](https://twitter.com/ebud7)
