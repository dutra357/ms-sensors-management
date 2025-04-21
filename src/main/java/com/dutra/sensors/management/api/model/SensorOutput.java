package com.dutra.sensors.management.api.model;

import com.dutra.sensors.management.domain.model.Sensor;
import com.dutra.sensors.management.domain.model.SensorId;
import io.hypersistence.tsid.TSID;

public class SensorOutput {

    private TSID tsid;
    private String name;
    private String ip;
    private String location;
    private String protocol;
    private String model;
    private Boolean enabled = false;

    public SensorOutput(SensorId tsid, String name,
                        String ip, String location,
                        String protocol, String model,
                        Boolean enabled) {
        this.tsid = tsid.getTsid();
        this.name = name;
        this.ip = ip;
        this.location = location;
        this.protocol = protocol;
        this.model = model;
        this.enabled = enabled;
    }

    public SensorOutput(Sensor sensor) {
        this.tsid = sensor.getTsId().getTsid();
        this.name = sensor.getName();
        this.ip = sensor.getIp();
        this.location = sensor.getLocation();
        this.protocol = sensor.getProtocol();
        this.model = sensor.getModel();
        this.enabled = sensor.getEnabled();
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
}
