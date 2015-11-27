package demo.weatherapp.model;



import org.junit.Assert;
import org.junit.Test;

/**
 * TemperatureUnitOfMeasure unit test.
 * @author jzhang
 *
 */
public class TemperatureUnitOfMeasureTest {

    @Test
    public void testTerperatureUnitOf() {
        Assert.assertEquals(TemperatureUnitOfMeasure.F, TemperatureUnitOfMeasure.unitOf("imperial"));
        Assert.assertEquals(TemperatureUnitOfMeasure.C, TemperatureUnitOfMeasure.unitOf("metric"));
        Assert.assertNull(TemperatureUnitOfMeasure.unitOf("abc"));
        Assert.assertNull(TemperatureUnitOfMeasure.unitOf(null));
    }

}
