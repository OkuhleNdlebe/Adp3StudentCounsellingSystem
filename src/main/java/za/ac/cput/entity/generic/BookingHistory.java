package za.ac.cput.entity.generic;

/*BookingHistory.java
 Entity for Booking History
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

public class BookingHistory {

    private int userId, bookingId;
    private String userFeedback;

    private BookingHistory(BookingHistory.Builder builder) {
        this.userId = builder.userId;
        this.bookingId = builder.bookingId;
        this.userFeedback = builder.userFeedback;
    }

    @Override
    public String toString() {
        return "BookingHistory{" +
                "userId=" + userId +
                ", bookingId=" + bookingId +
                ", userFeedback='" + userFeedback + '\'' +
                '}';
    }

    public static class Builder {
        private int userId, bookingId;
        private String userFeedback;

    public BookingHistory.Builder setUserId(int userId) {
        this.userId = userId;

        return this;
    }

    public BookingHistory.Builder setBookingId(int bookingId) {
        this.bookingId = bookingId;

        return this;
    }
        public BookingHistory.Builder setUserFeedback(String userFeedback) {
            this.userFeedback = userFeedback;

            return this;
        }

        public BookingHistory build() {
            return new BookingHistory(this);
        }
        public BookingHistory.Builder copy(BookingHistory bookingHistory) {
            this.userId = bookingHistory.userId;
            this.bookingId = bookingHistory.bookingId;
            this.userFeedback = bookingHistory.userFeedback;
            return this;
        }

    }
}
