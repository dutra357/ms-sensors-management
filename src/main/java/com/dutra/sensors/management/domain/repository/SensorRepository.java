package com.dutra.sensors.management.domain.repository;

import com.dutra.sensors.management.domain.model.Sensor;
import com.dutra.sensors.management.domain.model.SensorId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, SensorId>{
}
