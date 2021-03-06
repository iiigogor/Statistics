package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 8, 4, 5, 3, 8, 6, 11, 11, 12, 12};

        long actual = service.findMax(incomesInBillions);

        assertEquals(12, actual);
    }
}