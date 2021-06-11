package za.ac.cput.factory.generic;

import za.ac.cput.Util.GenericHelper;
import za.ac.cput.entity.generic.Booking;
import za.ac.cput.entity.generic.BookingStatus;

/**BookingStatusFactory.java
 * Factory for the Booking Status
 * Author: Lindokuhle Nini (218196504)
 * Date: 11 June 2021
 */
public class BookingStatusFactory {

    public static BookingStatus createBookingStatus(String bookingStatus){

        BookingStatus status = new BookingStatus.Builder()
                .setStatus(bookingStatus)
                .build();
        return status;

    }

}
