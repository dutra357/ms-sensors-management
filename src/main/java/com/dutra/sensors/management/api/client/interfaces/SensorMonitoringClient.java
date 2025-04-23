package com.dutra.sensors.management.api.client.interfaces;

import com.dutra.sensors.management.api.model.MonitoringOutput;
import io.hypersistence.tsid.TSID;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PutExchange;

@HttpExchange(url = "/api/sensors/{sensorId}/monitoring")
public interface SensorMonitoringClient {

    @PutExchange("/enable")
    void enableMonitoring(@PathVariable TSID sensorId);

    @DeleteExchange("/disable")
    void disableMonitoring(@PathVariable TSID sensorId);

    @GetExchange
    MonitoringOutput getDetail(@PathVariable TSID sensorId);
}
