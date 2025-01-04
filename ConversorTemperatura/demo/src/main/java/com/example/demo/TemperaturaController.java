package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperaturaController {

    @GetMapping("/celsiusParaFahrenheit/{celsius}")
    public String celsiusParaFahrenheit(@PathVariable double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        return String.format("%.2f Graus Celsius é igual a %.2f Graus Fahrenheit", celsius, fahrenheit);
    }

    @GetMapping("/fahrenheitParaCelsius/{fahrenheit}")
    public String fahrenheitParaCelsius(@PathVariable double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return String.format("%.2f Graus Fahrenheit é igual a %.2f Graus Celsius ", fahrenheit, celsius);
    }
}
