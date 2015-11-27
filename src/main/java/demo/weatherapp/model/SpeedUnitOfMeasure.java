package demo.weatherapp.model;

/**
 * Speed Unit of Measure emueration.
 * @author jzhang
 *
 */
public enum SpeedUnitOfMeasure {
    KMH("km/h", "metric"), MH("m/h", "imperial");

    private String description;
    private String unit;

    /**
     * Construct a {@link SpeedUnitOfMeasure} by given parameters.
     * @param description text description of this unit of measure.
     * @param unit unit system of this unit of measure.
     */
    private SpeedUnitOfMeasure(String description, String unit) {
        this.description = description;
        this.unit = unit;
    }

    /**
     * Get text description of this unit of measure.
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get unit system of this unit of measure.
     * @return
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Get a {@link SpeedUnitOfMeasure} by unit system.
     * @param unit unit system, valid values are 'metric' and 'imperial'.
     * @return
     */
    public static SpeedUnitOfMeasure unitOf(String unit) {
        if (KMH.getUnit().equals(unit)) {
            return KMH;
        }

        if (MH.getUnit().equals(unit)) {
            return MH;
        }
        return null;
    }
}
