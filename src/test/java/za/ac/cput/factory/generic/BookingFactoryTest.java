package za.ac.cput.factory.generic;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import za.ac.cput.entity.generic.Booking;
import static org.junit.Assert.*;

public class BookingFactoryTest {

    Booking booking1;
    Booking booking2;
    Booking booking3;

    @Before
    public void setUp(){
        booking1 = BookingFactory.createBooking
                ("Specific dates booking", "10:00",
                        "15 June 2021", "District 6", "1 hour");

        booking2 = BookingFactory.createBooking
                ("Date and time slot booking", "09:00",
                        "14 June 2021", "District 6", "30 minutes");

        booking3 = booking1;
    }

    @Test
   public void testEquality(){
        assertEquals(booking1, booking3);
    }

    @Test
   public void testIdentity(){
        assertSame(booking1, booking1);
    }

    @Test(timeout = 50)
    public void timeoutTest(){
        Booking booking = BookingFactory.createBooking
                ("Date and time slot booking", "14:00",
                        "18 June 2021", "Bellville", "2 hour");
        System.out.println(booking);
    }

    @Ignore
    @Test
    public void createBooking(){
        Booking booking = BookingFactory.createBooking
                ("Date and time slot booking", "10:00",
                        "20 June 2021", "Bellville", "1 hour");
        System.out.println(booking);

    }

}