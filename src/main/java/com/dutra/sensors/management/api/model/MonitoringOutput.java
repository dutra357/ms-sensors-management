package com.dutra.sensors.management.api.model;

import io.hypersistence.tsid.TSID;

import java.time.OffsetDateTime;

public class MonitoringOutput {

    private TSID id;
    private Double lastTemperature;
    private OffsetDateTime updateAt;
    private Boolean enabled;

    public MonitoringOutput() {}
    public MonitoringOutput(TSID id, Double lastTemperature,
                            OffsetDateTime updateAt, Boolean enabled) {
        this.id = id;
        this.lastTemperature = lastTemperature;
        this.updateAt = updateAt;
        this.enabled = enabled;
    }

    public TSID getId() {
        return id;
    }

    public void setId(TSID id) {
        this.id = id;
    }

    public Double getLastTemperature() {
        return lastTemperature;
    }

    public void setLastTemperature(Double lastTemperature) {
        this.lastTemperature = lastTemperature;
    }

    public OffsetDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(OffsetDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "OutPut{" +
                "id=" + id +
                ", lastTemperature=" + lastTemperature +
                ", updateAt=" + updateAt +
                ", enabled=" + enabled +
                '}';
    }
}
