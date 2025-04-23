package com.dutra.sensors.management.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.nio.channels.ClosedChannelException;


@ControllerAdvice
public class ApiExceptionHandler {

    /**
     * Padrão de erro conforme JAVA 17 e RFC 7807.
     * Uso do ProblemDetail para padronizar o retorno.
     */

    @ExceptionHandler({SocketTimeoutException.class, ConnectException.class, ClosedChannelException.class})
    public ProblemDetail handleException(IOException e) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.GATEWAY_TIMEOUT);
        problemDetail.setTitle(e.getMessage());
        problemDetail.setType(URI.create("/errors/gateway-timeout"));
        return problemDetail;
    }

    @ExceptionHandler(SensorMonitoringClientException.class)
    public ProblemDetail sensorMonitoringException(SensorMonitoringClientException e) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.CONFLICT);
        problemDetail.setTitle(e.getMessage());
        problemDetail.setType(URI.create("/errors/gateway-timeout"));
        return problemDetail;
    }

}
