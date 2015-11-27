package demo.weatherapp.model;

/**
 * Defines enumeration of temperature unit of measure.
 * @author jzhang
 *
 */
public enum TemperatureUnitOfMeasure {
    C("celsius", "metric"), F("fahrenheit", "imperial");

    private String description;
    private String unit;

    /**
     * Construct a {@link TemperatureUnitOfMeasure} enum value.
     * @param description long description of the temperature unit of measure.
     * @param unit unit system of this unit of measure.
     */
    private TemperatureUnitOfMeasure(String description, String unit) {
        this.description = description;
        this.unit = unit;
    }

    /**
     * Get long description for this temperature unit of measure.
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get unit system of this temperature unit of measure.
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Get a {@link TemperatureUnitOfMeasure} by its unit system.
     * @param unit unit system, valid values are 'metric' and 'imperial'.
     * @return
     */
    public static TemperatureUnitOfMeasure unitOf(String unit) {
        if (C.getUnit().equals(unit)) {
            return C;
        }

        if (F.getUnit().equals(unit)) {
            return F;
        }
        return null;
    }
}
