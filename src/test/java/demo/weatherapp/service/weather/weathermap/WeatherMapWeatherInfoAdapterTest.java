package demo.weatherapp.service.weather.weathermap;

import java.math.BigDecimal;
import java.util.Arrays;

import org.junit.Test;

import demo.weatherapp.model.SpeedUnitOfMeasure;
import demo.weatherapp.model.TemperatureUnitOfMeasure;
import demo.weatherapp.model.WeatherInfo;
import demo.weatherapp.service.weather.weathermap.model.WeatherMapMainModel;
import demo.weatherapp.service.weather.weathermap.model.WeatherMapWeatherInfoModel;
import demo.weatherapp.service.weather.weathermap.model.WeatherMapWeatherModel;
import demo.weatherapp.service.weather.weathermap.model.WeatherMapWindModel;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * WeatherMapWeatherInfoAdapter unit test.
 * @author jzhang
 */
public class WeatherMapWeatherInfoAdapterTest {

    @Test
    public void testNullInputs() {
        final WeatherMapWeatherInfoAdapter adapter = new WeatherMapWeatherInfoAdapter(null, null);
        assertNull(adapter.getWeatherInfo());

        final WeatherMapWeatherInfoAdapter adapter2 = new WeatherMapWeatherInfoAdapter(new WeatherMapWeatherInfoModel(), null);
        assertNull(adapter2.getWeatherInfo());

        final WeatherMapWeatherInfoAdapter adapter3 = new WeatherMapWeatherInfoAdapter(null, "test");
        assertNull(adapter3.getWeatherInfo());

    }

    @Test
    public void testValidMetricInputs() {
        final String testCityName = "testCityName";
        final BigDecimal testTemperature = new BigDecimal("23.5");
        final String testWeatherDesc = "Nice Clear Weather";
        final BigDecimal testWindSpeed = new BigDecimal("3.45");

        final WeatherMapWeatherInfoModel model = composeTestModel(testCityName, testTemperature, testWeatherDesc, testWindSpeed);

        final WeatherMapWeatherInfoAdapter adapter = new WeatherMapWeatherInfoAdapter(model, "metric");
        final WeatherInfo weatherInfo = adapter.getWeatherInfo();

        assertEquals(testCityName, weatherInfo.getCity());
        assertEquals(testTemperature, weatherInfo.getTemperature().getDegree());
        assertEquals(TemperatureUnitOfMeasure.C, weatherInfo.getTemperature().getUnitOfMeasure());
        assertEquals(testWeatherDesc, weatherInfo.getWeather());
        assertEquals(testWindSpeed, weatherInfo.getWind().getSpeed());
        assertEquals(SpeedUnitOfMeasure.KMH, weatherInfo.getWind().getUnitOfMeasure());
    }

    @Test
    public void testValidImperialInputs() {
        final String testCityName = "testCityName";
        final BigDecimal testTemperature = new BigDecimal("23.5");
        final String testWeatherDesc = "Nice Clear Weather";
        final BigDecimal testWindSpeed = new BigDecimal("3.45");

        final WeatherMapWeatherInfoModel model = composeTestModel(testCityName, testTemperature, testWeatherDesc, testWindSpeed);

        final WeatherMapWeatherInfoAdapter adapter = new WeatherMapWeatherInfoAdapter(model, "imperial");
        final WeatherInfo weatherInfo = adapter.getWeatherInfo();

        assertEquals(testCityName, weatherInfo.getCity());
        assertEquals(testTemperature, weatherInfo.getTemperature().getDegree());
        assertEquals(TemperatureUnitOfMeasure.F, weatherInfo.getTemperature().getUnitOfMeasure());
        assertEquals(testWeatherDesc, weatherInfo.getWeather());
        assertEquals(testWindSpeed, weatherInfo.getWind().getSpeed());
        assertEquals(SpeedUnitOfMeasure.MH, weatherInfo.getWind().getUnitOfMeasure());
    }


    private WeatherMapWeatherInfoModel composeTestModel(final String testCityName, final BigDecimal testTemperature, final String testWeatherDesc,
            final BigDecimal testWindSpeed) {
        final WeatherMapWeatherInfoModel model = new WeatherMapWeatherInfoModel();
        model.setName(testCityName);

        final WeatherMapMainModel main = new WeatherMapMainModel();
        main.setTemp(testTemperature);
        model.setMain(main);

        final WeatherMapWeatherModel weatherMapWeatherModel = new WeatherMapWeatherModel();
        weatherMapWeatherModel.setDescription(testWeatherDesc);
        model.setWeather(Arrays.asList(weatherMapWeatherModel));
        final WeatherMapWindModel wind = new WeatherMapWindModel();
        model.setWind(wind);
        wind.setSpeed(testWindSpeed);
        return model;
    }
}
