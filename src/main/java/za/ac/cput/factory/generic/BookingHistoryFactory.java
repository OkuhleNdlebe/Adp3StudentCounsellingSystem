/*BookingHistory.java
 Factory for Booking History
 Author: Lihle Njobe-(218193882)
 Date: 9 June 2021
 */

package za.ac.cput.factory.generic;

import za.ac.cput.Util.GenericHelper;
import za.ac.cput.entity.generic.BookingHistory;

 public class BookingHistoryFactory {

    public static BookingHistory createBookingHistory(int userId, int bookingId, String userFeedback) {
        String bookingNumber = GenericHelper.generateId();
        BookingHistory bookingHistory = new BookingHistory.Builder()
                .setBookingId(bookingId)
                .setUserId(userId)
                .setUserFeedback(userFeedback)
                .build();
        return bookingHistory;
    }

}
