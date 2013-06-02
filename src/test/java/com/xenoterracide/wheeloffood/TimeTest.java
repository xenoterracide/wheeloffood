
package com.xenoterracide.wheeloffood;

import org.junit.Test;
import static org.junit.Assert.*;

public class TimeTest {

    public TimeTest() {
    }

    @Test
    public void testHour() {
        Integer hour  = 9;
        Time instance = new Time();
        instance.setHour(hour);

        assertEquals("hour", hour, instance.getHour());

        hour = 32;
        instance.setHour(32);
        assertEquals("hour", hour, instance.getHour());
    }

    @Test
    public void testMinute() {
        Integer minute = 32;
        Time instance = new Time();
        instance.setMinute(minute);

        assertEquals("minute", minute, instance.getMinute());
    }

    @Test
    public void testSecond() {
        Integer second = 21;
        Time instance = new Time();
        instance.setSecond(second);

        assertEquals("second", second, instance.getSecond());
    }
}