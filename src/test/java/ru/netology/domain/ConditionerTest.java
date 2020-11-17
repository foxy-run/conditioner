package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void increaseCurrentTemperatureTestNormalTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(33);
        conditioner.increaseCurrentTemperature();
        assertEquals(34, conditioner.getCurrentTemperature());
    }

    @Test
    public void increaseCurrentTemperatureTestMaxBorderTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(35, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureTestNormalTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(19);
        conditioner.decreaseCurrentTemperature();
        assertEquals(18, conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureTestMinBorderTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(12);
        conditioner.setCurrentTemperature(12);
        conditioner.decreaseCurrentTemperature();
        assertEquals(12, conditioner.getCurrentTemperature());
    }

    @Test
    public void setMaxTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        assertEquals(40, conditioner.getMaxTemperature());
    }

    @Test
    public void setMinTemperatureTest() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        assertEquals(10, conditioner.getMinTemperature());
    }

    @Test
    public void setCurrentTemperatureTestUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(8);
        assertEquals(0, conditioner.getCurrentTemperature());
    }

    @Test
    public void setCurrentTemperatureTestOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setCurrentTemperature(41);
        assertEquals(0, conditioner.getCurrentTemperature());
    }
}

