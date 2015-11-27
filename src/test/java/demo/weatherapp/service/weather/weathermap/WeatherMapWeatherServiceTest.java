package demo.weatherapp.service.weather.weathermap;

import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;

import demo.weatherapp.service.weather.weathermap.model.WeatherMapWeatherInfoModel;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * WeatherMapWeatherService unit test.
 * @author jzhang
 *
 */
public class WeatherMapWeatherServiceTest {
    private WeatherMapWeatherService service;
    @Mock private RestTemplate mockRestTemplate;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        service = spy(new WeatherMapWeatherService());
        when(service.getRestTemplate()).thenReturn(mockRestTemplate);
    }

    @Test
    public void testWeatherService() {
        final WeatherMapConfig config = new WeatherMapConfig();
        final String testUrl = "http://testUrl";
        final URI expectedUrl = URI.create("http://testUrl?q=testCity&units=Imperial&APPID=testAppId");
        config.setUrl(testUrl);
        config.setAppId("testAppId");
        config.setUnit("Imperial");
        service.setConfig(config);

        when(mockRestTemplate.getForObject(expectedUrl, WeatherMapWeatherInfoModel.class)).thenReturn(new WeatherMapWeatherInfoModel());
        service.getWeatherInfo("testCity");

        verify(mockRestTemplate, times(1)).getForObject(expectedUrl, WeatherMapWeatherInfoModel.class);
    }
}
