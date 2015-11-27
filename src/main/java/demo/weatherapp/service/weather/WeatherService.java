package demo.weatherapp.service.weather;

import demo.weatherapp.model.WeatherInfo;

/**
 * Classes that implement this interface should provide a concrete
 * way of getting weather info from other external/internal resources.
 * @author jzhang
 *
 */
public interface WeatherService {

    /**
     * Get {@link WeatherInfo} by given city name.
     * @param city city name for the weather to be retrieved.
     * @return retrieved {@link WeatherInfo} for the city.
     */
    WeatherInfo getWeatherInfo(String city);

}
