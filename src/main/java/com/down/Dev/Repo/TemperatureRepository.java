package com.down.Dev.Repo;

import com.down.Dev.Domain.Entity.Temperature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureRepository extends JpaRepository<Temperature, Integer> {

}
