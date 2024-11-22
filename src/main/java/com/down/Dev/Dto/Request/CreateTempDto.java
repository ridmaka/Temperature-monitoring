package com.down.Dev.Dto.Request;

import lombok.Data;

@Data
public class CreateTempDto {
    private Float temperature;
    private Float humidity;
    private String output;
}
