package com.down.Dev.Domain.Service;

import com.down.Dev.Domain.Entity.Temperature;
import com.down.Dev.Dto.Request.CreateTempDto;
import com.down.Dev.Dto.Response.TempGeneralDto;
import com.down.Dev.Repo.TemperatureRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class TemperatureService {

    private final TemperatureRepository temperatureRepository;

    public ResponseEntity<Temperature> addTemperature(CreateTempDto createTempDto) {
        Temperature temperature = new Temperature();
        temperature.setTemperature(createTempDto.getTemperature());
        temperature.setHumidity(createTempDto.getHumidity());
        temperature.setOutput(createTempDto.getOutput());

        temperatureRepository.save(temperature);
        return ResponseEntity.ok(temperature);
    }
    public ResponseEntity<TempGeneralDto> getTemperature(Integer id) {

        TempGeneralDto tempGeneralDto = new TempGeneralDto();
        Optional<Temperature> optionalTemperature = temperatureRepository.findById(id);

        if(optionalTemperature.isPresent()) {
            Temperature temperature = optionalTemperature.get();
            tempGeneralDto.setId(temperature.getId());
            tempGeneralDto.setTemperature(temperature.getTemperature());
            tempGeneralDto.setHumidity(temperature.getHumidity());
            tempGeneralDto.setOutput(temperature.getOutput());

            return ResponseEntity.ok(tempGeneralDto);

        }else{
            return ResponseEntity.notFound().build();
        }

    }

    public ResponseEntity<Temperature> updateTemperature(CreateTempDto updateTempDto) {
        Temperature temperature = new Temperature();
        temperature.setId(1);
        temperature.setTemperature(updateTempDto.getTemperature());
        temperature.setHumidity(updateTempDto.getHumidity());
        temperature.setOutput(updateTempDto.getOutput());

        temperatureRepository.save(temperature);
        return ResponseEntity.ok(temperature);

    }
}
