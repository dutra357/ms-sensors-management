//package com.dutra.sensors.management.api.client;
//
//import com.dutra.sensors.management.api.client.factory.RestClientFactory;
//import com.dutra.sensors.management.api.client.interfaces.SensorMonitoringClient;
//import com.dutra.sensors.management.api.model.MonitoringOutput;
//import io.hypersistence.tsid.TSID;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestClient;
//
//
//@Component
//public class ClientMonitoring implements SensorMonitoringClient {
//
//    private final RestClient restClient;
//    public ClientMonitoring(RestClientFactory restClient) {
//        this.restClient = restClient.monitoringClient();
//    }
//
//
//    @Override
//    public void enableMonitoring(TSID tsid) {
//
//        restClient.put()
//                .uri("/api/sensors/{sensorId}/monitoring/enable", tsid)
//                .retrieve()
//                .toBodilessEntity();
//    }
//
//    @Override
//    public void disableMonitoring(TSID tsid) {
//
//        restClient.delete()
//                .uri("/api/sensors/{sensorId}/monitoring/disable", tsid)
//                .retrieve()
//                .toBodilessEntity();
//    }
//
//    @Override
//    public MonitoringOutput getDetail(TSID tsid) {
//        return restClient.get()
//                .uri("/api/sensors/{sensorId}/monitoring", tsid)
//                .retrieve()
//                .body(MonitoringOutput.class);
//    }
//}
