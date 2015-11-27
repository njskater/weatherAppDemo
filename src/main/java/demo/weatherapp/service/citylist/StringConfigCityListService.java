package demo.weatherapp.service.citylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * This service read a delimiter separated string and convert
 * it to list of cities.
 * @author jzhang
 *
 */
@Service
public class StringConfigCityListService implements CityListService {
    private static final String DELIMITER = "\\|";

    /**
     * Injected city list configuration from externalised cofiguration file.
     * City list should be '|' delimited string.
     */
    @Value("${city.list}")
    private String cityListConfig;


    /**
     * Set configured city list. Although this is auto injected generally.
     * This method is still useful on unit testing.
     * @param cityListConfig
     */
    void setCityListConfig(String cityListConfig) {
        this.cityListConfig = cityListConfig;
    }

    /**
     * Get list of cities from configuration.
     */
    @Override
    public List<String> getCityList() {
        if (cityListConfig == null) {
            return Collections.emptyList();
        }

        return Arrays.asList(cityListConfig.split(DELIMITER));
    }

}
