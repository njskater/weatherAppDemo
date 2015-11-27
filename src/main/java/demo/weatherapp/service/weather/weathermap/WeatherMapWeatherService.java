package demo.weatherapp.service.weather.weathermap;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import demo.weatherapp.model.WeatherInfo;
import demo.weatherapp.service.weather.WeatherService;
import demo.weatherapp.service.weather.weathermap.model.WeatherMapWeatherInfoModel;

/**
 * This class provides OpenWeatherMap as weather service for demo.
 * @author jzhang
 */
@Service
public class WeatherMapWeatherService implements WeatherService {

    private static final String PARAM_APPID = "APPID";
    private static final String PARAM_UNITS = "units";
    private static final String PARAM_Q = "q";

    @Autowired
    private WeatherMapConfig config;

    /**
     * Set the {@link WeatherMapConfig} for this service. Although config is generally autoWired, manually set is useful on unit test.
     * @param config
     */
    public void setConfig(WeatherMapConfig config) {
        this.config = config;
    }

    /**
     * Retrieve weather info from Weather Map API.
     */
    @Override
    public WeatherInfo getWeatherInfo(String city) {
        if (config == null) {
            throw new IllegalArgumentException("Config must be provided");
        }
        final WeatherMapWeatherInfoModel weatherResult = getRestTemplate().getForObject(
                composeUri(city), WeatherMapWeatherInfoModel.class);
        final WeatherMapWeatherInfoAdapter adapter = new WeatherMapWeatherInfoAdapter(weatherResult, config.getUnit());
        return adapter.getWeatherInfo();
    }

    /**
     * Returns a new RestTemplate Object. This is useful on unit test for mocking objects.
     * @return a newly created {@link RestTemplate}.
     */
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * Compose Uri with query parameters.
     * @param city
     * @return composed URI with query parameters.
     */
    private URI composeUri(String city) {
        final UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(config.getUrl())
                .queryParam(PARAM_Q, city)
                .queryParam(PARAM_UNITS, config.getUnit())
                .queryParam(PARAM_APPID, config.getAppId());
        return builder.build().toUri();
    }

}
