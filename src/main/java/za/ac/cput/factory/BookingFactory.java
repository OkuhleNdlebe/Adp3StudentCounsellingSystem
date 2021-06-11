package za.ac.cput.factory;

import za.ac.cput.Util.GenericHelper;
import za.ac.cput.entity.generic.Booking;

/**BookingFactory.java
 * Factory for BookingStatus
 * Author: Lindokuhle Nini (218196504)
 * Date: 11 June 2021
 */
public class BookingFactory {

    public static Booking createBooking(String bookingType, String bookingTime, String bookingDate, String location, String duration){
        String bookingId = GenericHelper.generateId();
        Booking booking = new Booking.Builder()
                .setBookingId(bookingId)
                .setBookingDate(bookingDate)
                .setBookingTime(bookingTime)
                .setBookingType(bookingType)
                .setDuration(duration)
                .setLocation(location)
                .build();
        return booking;

    }
}
