package ru.netology.bonus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class BonusServiceTest {

    @Test
    void shouldСalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldСalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldСalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldСalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}