
package com.xenoterracide.wheeloffood;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ExpectedException;

public class TimeTest {

    public TimeTest() {
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testHour() {
        Integer hour  = 9;
        Time instance = new Time();
        instance.setHour(hour);

        assertEquals("hour", hour, instance.getHour());
    }

    @Test
    public void testHourExceptionBelowZero() {
        Integer hour  = -1;
        Time instance = new Time();

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage( "Hour must be 0-23");

        instance.setHour(hour);
    }

    @Test
    public void testHourExceptionAboveTwentyThree() {
        Integer hour  = 24;
        Time instance = new Time();

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage( "Hour must be 0-23");

        instance.setHour(hour);
    }

    @Test
    public void testMinute() {
        Integer minute = 32;
        Time instance = new Time();
        instance.setMinute(minute);

        assertEquals("minute", minute, instance.getMinute());     // test exception bounds
    }

    @Test
    public void testMinuteExceptionBelowZero() {
        Integer minute  = -1;
        Time instance = new Time();

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage( "Minute must be 0-59");

        instance.setMinute(minute);
    }

    @Test
    public void testSecond() {
        Integer second = 21;
        Time instance = new Time();
        instance.setSecond(second);

        assertEquals("second", second, instance.getSecond());
    }

    @Test
    public void testSecondExceptionBelowZero() {
        Integer second  = -1;
        Time instance = new Time();

        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage( "Second must be 0-59");

        instance.setSecond(second);
    }
}