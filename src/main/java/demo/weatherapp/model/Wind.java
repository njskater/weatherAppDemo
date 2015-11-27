package demo.weatherapp.model;

import java.math.BigDecimal;

/**
 * Object model for generic wind object.
 * @author jzhang
 *
 */
public class Wind {
    private final BigDecimal speed;
    private final SpeedUnitOfMeasure unitOfMeasure;

    /**
     * Construct a {@link Wind} object by given parameters.
     * @param speed numeric value for speed of wind.
     * @param unitOfMeasure unit of measure for the speed of wind.
     */
    public Wind(BigDecimal speed, SpeedUnitOfMeasure unitOfMeasure) {
        this.speed = speed;
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * Get speed of wind.
     * @return
     */
    public BigDecimal getSpeed() {
        return speed;
    }

    /**
     * Get unit of measure of wind speed.
     * @return
     */
    public SpeedUnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }
}
