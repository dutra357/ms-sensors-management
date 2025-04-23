package com.dutra.sensors.management.api.client.factory;

import com.dutra.sensors.management.api.exception.SensorMonitoringClientException;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class RestClientFactory {

    private final RestClient.Builder builder;
    public RestClientFactory(RestClient.Builder builder) {
        this.builder = builder;
    }

    public RestClient monitoringClient() {
        return builder.baseUrl("http://localhost:8082")
                .defaultStatusHandler(HttpStatusCode::isError, (request, response) -> {
                    throw new SensorMonitoringClientException("Error calling monitoring service");
                })
                .build();
    }
}
