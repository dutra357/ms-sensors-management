package com.dutra.sensors.management.api.model;

import jakarta.validation.constraints.NotBlank;

public class SensorInput {

    @NotBlank
    private String name;
    @NotBlank
    private String ip;
    @NotBlank
    private String location;
    @NotBlank
    private String protocol;
    @NotBlank
    private String model;

    public SensorInput(String name, String ip,
                       String location, String protocol,
                       String model) {
        this.name = name;
        this.ip = ip;
        this.location = location;
        this.protocol = protocol;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
