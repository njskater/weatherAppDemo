package demo.weatherapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.weatherapp.model.WeatherInfo;
import demo.weatherapp.service.weather.WeatherService;


/**
 * Front end controller for weather app restful end point.
 * @author jzhang
 *
 */
@Controller
@RequestMapping("/weather")
public class WeatherAppFrontendController {

    @Autowired
    private WeatherService weatherService;

    /**
     * Get weather Info by city name.
     * @param city city name as query parameter.
     * @return {@linkplain WeatherInfo} for the city
     */
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody WeatherInfo getWeatherInfo(@RequestParam String city) {
        return weatherService.getWeatherInfo(city);
    }

}