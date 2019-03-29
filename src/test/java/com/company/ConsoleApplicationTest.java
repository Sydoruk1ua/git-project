package com.company;

import org.junit.Test;

import static com.company.ConsoleApplication.sum;
import static org.junit.Assert.assertEquals;

public class ConsoleApplicationTest {

    @Test
    public void shouldReturnSum() {
        int actual = sum(1, 2);
        int expected = 3;
        assertEquals(expected, actual);
    }
}
