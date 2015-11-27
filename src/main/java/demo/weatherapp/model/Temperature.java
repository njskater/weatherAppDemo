package demo.weatherapp.model;

import java.math.BigDecimal;

/**
 * Defines model for generic temperature object.
 * @author jzhang
 */
public class Temperature {

    private final BigDecimal degree;
    private final TemperatureUnitOfMeasure UnitOfMeasure;

    /**
     * Construct a {@link Temperature} object by given parameters.
     * @param degree numeric value of temperature degree.
     * @param unitOfMeasure unit of measure for the temperature.
     */
    public Temperature(BigDecimal degree, TemperatureUnitOfMeasure unitOfMeasure) {
        this.degree = degree;
        UnitOfMeasure = unitOfMeasure;
    }

    /**
     * Numeric temperate degree.
     */
    public BigDecimal getDegree() {
        return degree;
    }

    /**
     * Unit of measure for temperature.
     */
    public TemperatureUnitOfMeasure getUnitOfMeasure() {
        return UnitOfMeasure;
    }

}
