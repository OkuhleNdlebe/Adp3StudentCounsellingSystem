package za.ac.cput.factory.generic;

import org.junit.Test;
import za.ac.cput.entity.generic.BookingHistory;

import static org.junit.Assert.*;

public class BookingHistoryFactoryTest {


    @Test
    public void createBookingHistory() {
        BookingHistory bookingHistory=BookingHistoryFactory.createBookingHistory(67, 90, "Satisfied");
        System.out.print(bookingHistory);
    }

}