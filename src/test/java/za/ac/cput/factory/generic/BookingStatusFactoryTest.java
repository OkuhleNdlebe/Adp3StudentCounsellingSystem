package za.ac.cput.factory.generic;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import za.ac.cput.entity.generic.Booking;
import za.ac.cput.entity.generic.BookingStatus;

import static org.junit.Assert.*;

public class BookingStatusFactoryTest {

    BookingStatus bookingStatus1;
    BookingStatus bookingStatus2;
    BookingStatus bookingStatus3;

    @Before
    public void setUp(){
        bookingStatus1 = BookingStatusFactory.createBookingStatus("Waitlisted");
        bookingStatus2 = BookingStatusFactory.createBookingStatus("Confirmed");
        bookingStatus3 = bookingStatus1;
    }

    @Test
    public void testEquality(){
        assertEquals(bookingStatus1, bookingStatus3);
    }

    @Test
    public void testIdentity(){
        assertSame(bookingStatus1, bookingStatus1);
    }

    @Test(timeout = 500)
    public void timeoutTest(){
        BookingStatus bookingStatus = BookingStatusFactory.createBookingStatus("Provisionally accepted");
        System.out.println(bookingStatus);
    }

    @Ignore
    @Test
    public void createBooking(){
        BookingStatus bookingStatus = BookingStatusFactory.createBookingStatus("Waitlisted");
        System.out.println(bookingStatus);
    }


}