package com.down.Dev.Dto.Response;

import lombok.Data;

@Data
public class TempGeneralDto {
    private Integer id;
    private Float temperature;
    private Float humidity;
    private String output;
}
