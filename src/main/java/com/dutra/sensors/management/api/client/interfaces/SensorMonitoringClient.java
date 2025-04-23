package com.dutra.sensors.management.api.client.interfaces;

import io.hypersistence.tsid.TSID;

public interface SensorMonitoringClient {

    void enableMonitoring(TSID tsid);
    void disableMonitoring(TSID tsid);
}
