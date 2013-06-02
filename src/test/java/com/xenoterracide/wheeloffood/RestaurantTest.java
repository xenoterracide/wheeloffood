package com.xenoterracide.wheeloffood;

import java.util.Calendar;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;

public class RestaurantTest extends TestCase {

    public RestaurantTest(String testName) {
        super(testName);
    }

    /**
     * Test of setName method, of class Restaurant.
     */
    @Test
    public void testName() {
        String name = "McDonalds";
        Restaurant instance = new Restaurant();
        instance.setName(name);
        assertEquals("name must be McDonalds", name, instance.getName());
    }

    /**
     * Test of isOpenNow method, of class Restaurant.
     */
    @Test
    public void testIsOpen() {
        /* this is a horrible unit test, find way to mock time */
        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR_OF_DAY, 10);

        Restaurant instance = new Restaurant("Wendy's", 9, 15);


        assertTrue("must be open now", instance.isOpen( now ));

        now.set(Calendar.HOUR_OF_DAY, 20);
        assertFalse("must not be open now", instance.isOpen( now ));

    }

    /**
     * Test of setOpensAt method, of class Restaurant.
     */
    @Test
    public void testOpensAt() {
        Restaurant instance = new Restaurant();
        instance.setOpensAt(9);
        assertEquals("opens at 9", (Integer) (9), instance.getOpensAt());
    }

    /**
     * Test of setClosesAt method, of class Restaurant.
     */
    @Test
    public void testClosessAt() {
        Restaurant instance = new Restaurant();
        instance.setClosesAt(17);
        assertEquals("opens at 5pm", (Integer) (17), instance.getClosesAt());
    }
}
