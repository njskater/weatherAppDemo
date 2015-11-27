package demo.weatherapp.service.weather.weathermap.model;

import java.math.BigDecimal;

/**
 * Represents JSON model for Weather Main Info from weather map API.
 * @author jzhang
 *
 */
public class WeatherMapMainModel {

    private BigDecimal temp;

    public BigDecimal getTemp() {
        return temp;
    }

    public void setTemp(BigDecimal temp) {
        this.temp = temp;
    }
}