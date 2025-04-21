package com.dutra.sensors.management.domain.model;

import io.hypersistence.tsid.TSID;

import java.util.Objects;

public class Sensor {

    private TSID tsid;

    private String name;
    private String ip;
    private String location;
    private String protocol;
    private String model;
    private Boolean enabled = false;

    public Sensor() {}
    public Sensor(TSID tsid, String name, String ip,
                  String location, String protocol,
                  String model, Boolean enabled) {
        this.tsid = tsid;
        this.name = name;
        this.ip = ip;
        this.location = location;
        this.protocol = protocol;
        this.model = model;
        this.enabled = enabled;
    }

    public TSID getTsid() {
        return tsid;
    }

    public void setTsid(TSID tsid) {
        this.tsid = tsid;
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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Sensor sensor = (Sensor) o;
        return Objects.equals(tsid, sensor.tsid);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tsid);
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "tsid=" + tsid +
                ", name='" + name + '\'' +
                ", ip='" + ip + '\'' +
                ", location='" + location + '\'' +
                ", protocol='" + protocol + '\'' +
                ", model='" + model + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}
