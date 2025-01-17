package com.github.pyro2266.bublight.pressure;

public interface PressureService {

    /**
     * Get current pressure from pressure sensor.
     */
    float getPressure() throws PressureException;

    /**
     * Get difference between current and normal pressure - pressure in calm state.
     */
    float getPressureDifference() throws PressureException;

    /**
     * Calibrate normal pressure - pressure in calm state.
     */
    void calibrateNormalPressure() throws PressureException;
}
