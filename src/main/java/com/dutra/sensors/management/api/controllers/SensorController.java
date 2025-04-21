package com.dutra.sensors.management.api.controllers;

import com.dutra.sensors.management.api.model.SensorInput;
import com.dutra.sensors.management.api.model.SensorOutput;
import com.dutra.sensors.management.common.IdGenerator;
import com.dutra.sensors.management.domain.model.Sensor;
import com.dutra.sensors.management.domain.repository.SensorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    private final SensorRepository repository;

    public SensorController(SensorRepository repository) {
        this.repository = repository;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public SensorOutput create(@RequestBody SensorInput sensor) {
        Sensor newSensor = new Sensor();

        newSensor.setName(sensor.getName());
        newSensor.setIp(sensor.getIp());
        newSensor.setLocation(sensor.getLocation());
        newSensor.setProtocol(sensor.getProtocol());
        newSensor.setModel(sensor.getModel());
        newSensor.setEnabled(false);

        newSensor.setTsid(IdGenerator.generate());

        return new SensorOutput(repository.save(newSensor));
    }

}
