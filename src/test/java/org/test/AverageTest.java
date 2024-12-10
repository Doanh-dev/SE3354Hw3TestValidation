package org.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Average;

public class AverageTest {
    @Test
    public void testAverageNormalCase() {
        Average avg = new Average();
        assertEquals(2, avg.average(3, new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testAverageExceedsArraySize() {
        Average avg = new Average();
        assertEquals(15, avg.average(5, new int[]{10, 20}));
    }

    @Test
    public void testAverageEmptyArray() {
        Average avg = new Average();
        assertEquals(0, avg.average(3, new int[]{}));
    }

    @Test
    public void testAverageZeroElements() {
        Average avg = new Average();
        assertEquals(0, avg.average(0, new int[]{1, 2, 3}));
    }

    @Test
    public void testAvarageEqualLenght(){
        Average ava = new Average();
        assertEquals(2, ava.average(3, new int[]{1,2,3}));
    }
}

