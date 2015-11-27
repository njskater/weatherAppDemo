package demo.weatherapp.service.citylist;


import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * StringConfigCityListService unit test.
 * @author jzhang
 *
 */
public class StringConfigCityListServiceTest {
    private StringConfigCityListService service;

    @Before
    public void setup() {
        service = new StringConfigCityListService();
    }

    @Test
    public void testNullString() {
        service.setCityListConfig(null);
        assertEquals(0, service.getCityList().size());
    }

    @Test
    public void testCorrectSplit() {
        service.setCityListConfig("a|b|c");
        final List<String> cityList = service.getCityList();
        assertEquals(3, cityList.size());
        assertEquals("a", cityList.get(0));
        assertEquals("b", cityList.get(1));
        assertEquals("c", cityList.get(2));
    }

}
