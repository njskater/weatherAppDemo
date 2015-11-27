package demo.weatherapp.model;

import java.util.Date;

/**
 * Defines model for generic weather info.
 * @author jzhang
 */
public class WeatherInfo {

    private final String city;
    private final Date updateTime;
    private final String weather;
    private final Temperature temperature;
    private final Wind wind;

    /**
     * Construct a {@link WeatherInfo} object by given parameters.
     * @param city city of this weather info.
     * @param updateTime update time of this weather info.
     * @param weather weather description of this weather info.
     * @param temperature temperature of this weather info.
     * @param wind wind of this weather info.
     */
    public WeatherInfo(String city, Date updateTime, String weather, Temperature temperature, Wind wind) {
        this.city = city;
        this.updateTime = updateTime;
        this.weather = weather;
        this.temperature = temperature;
        this.wind = wind;
    }

    /**
     * Get city name of this weather info.
     * @return
     */
    public String getCity() {
        return city;
    }

    /**
     * Get update time of this weather info.
     * @return
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * Get weather description of this weather info.
     * @return
     */
    public String getWeather() {
        return weather;
    }

    /**
     * Get temperature info of this weather info.
     * @return
     */
    public Temperature getTemperature() {
        return temperature;
    }

    /**
     * Get wind info of this weather info.
     * @return
     */
    public Wind getWind() {
        return wind;
    }

}
