package com.down.Dev.Controller;

import com.down.Dev.Domain.Entity.Temperature;
import com.down.Dev.Domain.Service.TemperatureService;
import com.down.Dev.Dto.Request.CreateTempDto;
import com.down.Dev.Dto.Response.TempGeneralDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/temp")
@CrossOrigin
@AllArgsConstructor
public class TemperatureController {
    private TemperatureService temperatureService;

    @GetMapping("/getTemp")
    public ResponseEntity<TempGeneralDto> getTemperature(@RequestParam Integer id) {
        return temperatureService.getTemperature(id);
    }
    @PostMapping("/addTemp")
    public ResponseEntity<Temperature> addTemperature(@RequestBody CreateTempDto createTempDto) {
        return temperatureService.addTemperature(createTempDto);
    }

    @PutMapping("/updateTemp")
    public ResponseEntity<Temperature> updateTemperature(@RequestBody CreateTempDto updateTempDto) {
        return temperatureService.updateTemperature(updateTempDto);
    }

}
