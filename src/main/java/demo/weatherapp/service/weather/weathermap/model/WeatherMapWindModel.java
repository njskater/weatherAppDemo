package demo.weatherapp.service.weather.weathermap.model;

import java.math.BigDecimal;

/**
 * Represents JSON model for Wind from weather map API.
 * @author jzhang
 *
 */
public class WeatherMapWindModel {

    private BigDecimal speed;

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }
}