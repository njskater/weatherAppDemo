package demo.weatherapp.service.citylist;

import java.util.List;

/**
 * Classes that implement this interface should provide
 * a way to return a list of city names.
 * @author jzhang
 *
 */
public interface CityListService {

    /**
     * Get a list of city.
     * @return
     */
    List<String> getCityList();

}
