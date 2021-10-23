package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldSum() {
        long actual = service.sum(sales);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage() {
        assertEquals(15, service.average(sales));
    }

    @Test
    void shouldMonthWithMax() {
        assertEquals(8, service.monthWithMax(sales));
    }

    @Test
    void shouldMonthWithMin() {
        assertEquals(9, service.monthWithMin(sales));
    }

    @Test
    void shouldMonthCountMoreThanAverage() {
        assertEquals(5, service.monthCountMoreThanAverage(sales));
    }

    @Test
    void shouldMonthCountLessThanAverage() {
        assertEquals(5, service.monthCountLessThanAverage(sales));
    }
}


