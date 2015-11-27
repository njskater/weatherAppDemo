package demo.weatherapp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.weatherapp.service.citylist.CityListService;

/**
 * Front end Restful end point controller to retrieve city list.
 * @author jzhang
 *
 */
@Controller
@RequestMapping("/cities")
public class CityListFrontendController {

    @Autowired
    private CityListService cityListService;


    /**
     * Get a list of available cities.
     * @return a list of cities.
     */
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<String> getWeatherInfo() {
        return cityListService.getCityList();
    }

}
