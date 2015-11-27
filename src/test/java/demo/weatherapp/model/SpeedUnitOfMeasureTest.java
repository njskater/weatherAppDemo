package demo.weatherapp.model;



import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * SpeedUnitOfMeasure unit test.
 * @author jzhang
 *
 */
public class SpeedUnitOfMeasureTest {

    @Test
    public void testUnitOf() {
        assertEquals(SpeedUnitOfMeasure.KMH, SpeedUnitOfMeasure.unitOf("metric"));
        assertEquals(SpeedUnitOfMeasure.MH, SpeedUnitOfMeasure.unitOf("imperial"));
        assertNull(SpeedUnitOfMeasure.unitOf("abc"));
        assertNull(SpeedUnitOfMeasure.unitOf(null));
    }

}
