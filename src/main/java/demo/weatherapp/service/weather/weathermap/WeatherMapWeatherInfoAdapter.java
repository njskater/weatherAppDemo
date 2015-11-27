package demo.weatherapp.service.weather.weathermap;


import java.util.Date;

import demo.weatherapp.model.SpeedUnitOfMeasure;
import demo.weatherapp.model.Temperature;
import demo.weatherapp.model.TemperatureUnitOfMeasure;
import demo.weatherapp.model.WeatherInfo;
import demo.weatherapp.model.Wind;
import demo.weatherapp.model.adapter.WeatherInfoAdapter;
import demo.weatherapp.service.weather.weathermap.model.WeatherMapWeatherInfoModel;

/**
 * This class provides conversion from {@link WeatherMapWeatherInfoModel} to
 * {@link WeatherInfo}.
 * @author jzhang
 *
 */
public class WeatherMapWeatherInfoAdapter implements WeatherInfoAdapter {
    private final WeatherInfo weatherInfo;

    /**
     * Create a new Adapter with given parameters.
     * @param model The input model to be converted.
     * @param unit The unit of the weather info in system as configured.
     */
    public WeatherMapWeatherInfoAdapter(WeatherMapWeatherInfoModel model, String unit) {
        if (model == null || unit == null) {
            this.weatherInfo = null;
        } else {
            this.weatherInfo = new WeatherInfo(model.getName(), new Date(), model.getWeather(),
                    new Temperature(model.getTemp(), TemperatureUnitOfMeasure.unitOf(unit)),
                    new Wind(model.getWindSpeed(), SpeedUnitOfMeasure.unitOf(unit)));
        }
    }

    /**
     * Get converted {@link WeatherInfo} object.
     */
    @Override
    public WeatherInfo getWeatherInfo() {
        return weatherInfo;
    }

}
