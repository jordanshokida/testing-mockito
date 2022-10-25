package com.course.javatesting.model;

import lombok.Data;

@Data
public class Weather {

    private String status;
    private Integer minTemp;
    private Integer maxTemp;

}
