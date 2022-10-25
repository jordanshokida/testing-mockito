package com.course.javatesting.controller;

import com.course.javatesting.model.Weather;
import com.course.javatesting.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class WeatherControllertest {

    @InjectMocks
    private WeatherController weatherController;

    @Mock
    private WeatherService weatherService;

    @Test
    public void getWeather() {
        Weather weatherMock = new Weather();
        weatherMock.setMaxTemp(30);
        weatherMock.setStatus("Sunny");
        weatherMock.setMinTemp(15);
        when(weatherService.getWeather()).thenReturn(weatherMock);


        Weather result = weatherController.getWeather();
        verify(weatherService, times(1)).getWeather();
    }

}
