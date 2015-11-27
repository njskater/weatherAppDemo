package demo.weatherapp.service.weather.weathermap.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Represents JSON model from weather map API.
 * @author jzhang
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherMapWeatherInfoModel {

    private String name;
    private List<WeatherMapWeatherModel> weather;
    private WeatherMapMainModel main;
    private WeatherMapWindModel wind;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public WeatherMapMainModel getMain() {
        return main;
    }


    public void setMain(WeatherMapMainModel main) {
        this.main = main;
    }


    public WeatherMapWindModel getWind() {
        return wind;
    }


    public void setWind(WeatherMapWindModel wind) {
        this.wind = wind;
    }


    public void setWeather(List<WeatherMapWeatherModel> weather) {
        this.weather = weather;
    }

    public String getWeather() {
        if (weather == null || weather.size() < 1) {
            return null;
        }

        return weather.get(0).getDescription();
    }

    public BigDecimal getTemp() {
        return main == null ? null : main.getTemp();
    }

    public BigDecimal getWindSpeed() {
        return wind == null ? null : wind.getSpeed();
    }

}
