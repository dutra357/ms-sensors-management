package com.dutra.sensors.management.api.client;

import com.dutra.sensors.management.api.client.factory.RestClientFactory;
import com.dutra.sensors.management.api.client.interfaces.SensorMonitoringClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class RestClientConfig {

    /**
     * Creates a client for the Sensor Monitoring API.
     * Implements the interface SensorMonitoringClient.
     */

    @Bean
    public SensorMonitoringClient sensorMonitoringClient(RestClientFactory factory) {
        RestClient restClient = factory.monitoringClient();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        HttpServiceProxyFactory factoryProxy = HttpServiceProxyFactory.builderFor(adapter).build();
        return factoryProxy.createClient(SensorMonitoringClient.class);

    }
}
