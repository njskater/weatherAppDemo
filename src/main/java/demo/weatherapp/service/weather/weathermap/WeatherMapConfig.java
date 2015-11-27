package demo.weatherapp.service.weather.weathermap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * A POJO class to store weather app configuration.
 * @author jzhang
 */
@Component
public class WeatherMapConfig {

    /**
     * WeatherMap URL, injected from externalised configuration.
     */
    @Value("${weathermap.api.url}")
    private String url;

    /**
     * WeatherMap unit of measure, injected from externalised configuration. Valid values are [metric|imperial]
     */
    @Value("${weathermap.api.unit}")
    private String unit;

    /**
     * WeatherMap appid, i.e. access code.
     */
    @Value("${weathermap.api.appId}")
    private String appId;

    /**
     * Get app id to access weather map API.
     * @return
     */
    public String getAppId() {
        return appId;
    }

    /**
     * Set app id to access weather map API
     * @param appId
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * Get unit for weather map API result.
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Set unit for weather map API result.
     * @param unit valid values are "metric", "imperial"
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Get url for weather map API.
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set url for weather map API.
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
