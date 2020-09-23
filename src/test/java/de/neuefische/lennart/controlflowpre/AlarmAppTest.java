package de.neuefische.lennart.controlflowpre;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmAppTest {

    @Test
    @DisplayName("Output of correct statement when amount too high")

    public void testAlarmOutputHigh() {

        // GIVEN
        int amountPeople = 31;

        // WHEN
        String result = AlarmApp.expressAmountPeople(amountPeople);

        // THEN
        Assertions.assertEquals("Zu viele Personen.", result);

    }


    @Test
    @DisplayName("Output of correct statement when amount too low")

    public void testAlarmOutputLow() {

        // GIVEN
        int amountPeople = 31;

        // WHEN
        String result = AlarmApp.expressAmountPeople(amountPeople);

        // THEN
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten.", result);
    }

    @Test
    @DisplayName("Output of correct statement when amount is 30")

    public void testAlarmOutput30() {

        // GIVEN
        int amountPeople = 30;

        // WHEN
        String result = AlarmApp.expressAmountPeople(amountPeople);

        // THEN
        Assertions.assertEquals("Jetzt wird's aber eng...", result);
    }

}