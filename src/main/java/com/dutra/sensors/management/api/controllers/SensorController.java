package com.dutra.sensors.management.api.controllers;

import com.dutra.sensors.management.api.model.SensorInput;
import com.dutra.sensors.management.api.model.SensorOutput;
import com.dutra.sensors.management.common.IdGenerator;
import com.dutra.sensors.management.domain.model.Sensor;
import com.dutra.sensors.management.domain.model.SensorId;
import com.dutra.sensors.management.domain.repository.SensorRepository;
import io.hypersistence.tsid.TSID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/sensors")
public class SensorController {

    private final SensorRepository repository;

    public SensorController(SensorRepository repository) {
        this.repository = repository;
    }

    @GetMapping("{sensorId}")
    public SensorOutput getOne(@PathVariable TSID sensorId) {
        Sensor sensor = repository.findById(new SensorId(sensorId))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return new SensorOutput(sensor);
    }

    @GetMapping
    public Page<SensorOutput> findAll(Pageable pageable) {
        Page<Sensor> sensors = repository.findAll(pageable);
        return sensors.map(SensorOutput::new);
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
