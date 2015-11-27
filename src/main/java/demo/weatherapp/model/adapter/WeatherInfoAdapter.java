package demo.weatherapp.model.adapter;

import demo.weatherapp.model.WeatherInfo;

/**
 * Classes that implement this interface should provide
 * a concrete way to convert data to {@link WeatherInfo} object.
 * @author jzhang
 *
 */
public interface WeatherInfoAdapter {

    /**
     * Get converted {@link WeatherInfo} object.
     * @return
     */
    WeatherInfo getWeatherInfo();

}
