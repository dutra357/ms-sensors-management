package com.dutra.sensors.management.api.model;


public class SensorDetailOutput {

    private SensorOutput sensorOutput;
    private MonitoringOutput monitoringOutput;

    public SensorDetailOutput() {}
    public SensorDetailOutput(SensorOutput sensorOutput, MonitoringOutput monitoringOutput) {
        this.sensorOutput = sensorOutput;
        this.monitoringOutput = monitoringOutput;
    }

    public SensorOutput getSensorOutput() {
        return sensorOutput;
    }

    public void setSensorOutput(SensorOutput sensorOutput) {
        this.sensorOutput = sensorOutput;
    }

    public MonitoringOutput getMonitoringOutput() {
        return monitoringOutput;
    }

    public void setMonitoringOutput(MonitoringOutput monitoringOutput) {
        this.monitoringOutput = monitoringOutput;
    }

    @Override
    public String toString() {
        return "SensorDetailOutput{" +
                "sensorOutput=" + sensorOutput +
                ", monitoringOutput=" + monitoringOutput +
                '}';
    }
}
