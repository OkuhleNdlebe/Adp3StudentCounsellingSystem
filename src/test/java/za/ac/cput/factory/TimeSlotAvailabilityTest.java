package za.ac.cput.factory;

import org.junit.Ignore;
import org.junit.Test;
import za.ac.cput.entity.generic.TimeSlotAvailability;

import static org.junit.Assert.*;

/* TimeSlotAvailabilityTest.java
 Test for the TimeSlotAvailabilityTest
 Author: Legiste Ndabashinze (217046207)
 Date:
*/

public class TimeSlotAvailabilityTest {

    @Test
    public void identityTest(){

        TimeSlotAvailability t1 = new TimeSlotAvailability.Builder().build();
        TimeSlotAvailability t2 = new TimeSlotAvailability.Builder().setBookingId(10001).setAvailable(true)
                .build();
        TimeSlotAvailability t3 = new TimeSlotAvailability.Builder().setBookingId(10001).setAvailable(false)
                .build();
        TimeSlotAvailability t4 = t1;

        assertNotSame(t2, t3);
        System.out.println("T2 NOT IDENTICAL to T3");

        assertSame(t1, t4);
        System.out.println("T1 IS IDENTICAL to T4");
    }

    @Test
    public void equalityTest(){

        TimeSlotAvailability t1 = new TimeSlotAvailability.Builder().build();
        TimeSlotAvailability t2 = new TimeSlotAvailability.Builder().setBookingId(10010).setAvailable(true)
                .build();
        TimeSlotAvailability t3 = new TimeSlotAvailability.Builder().setBookingId(10020).setAvailable(false)
                .build();
        TimeSlotAvailability t4 = t1;

        assertNotEquals(t2, t3);
        System.out.println("T2 NOT EQUAL to T3");

        assertEquals(t1, t4);
        System.out.println("T1 IS EQUAL to T4");

    }

    @Test(timeout = 500)
    public void timeoutTest(){
        System.out.println("timeout test");
    }

    @Ignore
    @Test
    public void disablingTest(){
        System.out.println("test ignored");
    }

}