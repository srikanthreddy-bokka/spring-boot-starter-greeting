package org.springboot.autostarter;

public class GreetingService {
    private final GreetingProperties properties;

    public GreetingService(GreetingProperties properties) {
        this.properties = properties;
    }

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            name = "World";
        }
        return String.format("%s, %s!", properties.getMessage(), name);
    }
}

