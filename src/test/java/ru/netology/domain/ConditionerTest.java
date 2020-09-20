package ru.netology.domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ConditionerTest {

        @Test
        public void increaseCurrentTemperatureTestNormalTemperature(){
            Conditioner conditioner = new Conditioner();
            conditioner.setMaxTemperature(35);
            conditioner.setMinTemperature(12);
            conditioner.setCurrentTemperature(33);
            conditioner.increaseCurrentTemperature();
            assertEquals(34, conditioner.getCurrentTemperature());
        }

        @Test
        public void increaseCurrentTemperatureTestMaxBorderTemperature(){
            Conditioner conditioner = new Conditioner();
            conditioner.setMaxTemperature(35);
            conditioner.setMinTemperature(12);
            conditioner.setCurrentTemperature(35);
            conditioner.increaseCurrentTemperature();
            assertEquals(35, conditioner.getCurrentTemperature());
        }

        @Test
        public void decreaseCurrentTemperatureTestNormalTemperature(){
            Conditioner conditioner = new Conditioner();
            conditioner.setMaxTemperature(35);
            conditioner.setMinTemperature(12);
            conditioner.setCurrentTemperature(19);
            conditioner.decreaseCurrentTemperature();
            assertEquals(18, conditioner.getCurrentTemperature());
        }

        @Test
        public void decreaseCurrentTemperatureTestMinBorderTemperature(){
            Conditioner conditioner = new Conditioner();
            conditioner.setMaxTemperature(35);
            conditioner.setMinTemperature(12);
            conditioner.setCurrentTemperature(12);
            conditioner.decreaseCurrentTemperature();
            assertEquals(12, conditioner.getCurrentTemperature());
        }

        @Test
        public void setMaxTemperatureTest(){
            Conditioner conditioner = new Conditioner();
            conditioner.setMaxTemperature(40);
            assertEquals(40,conditioner.getMaxTemperature());
        }

      }