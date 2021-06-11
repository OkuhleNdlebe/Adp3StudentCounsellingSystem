package za.ac.cput.entity.generic;




import java.sql.Time;
import java.util.Date;

/**Booking.java
 * Entity for Booking a counselling session
 * Author: Lindokuhle Nini (218196504)
 * Date: 9 June 2021
 */
public class Booking {
    private String bookingId, duration, bookingTime, bookingDate, bookingType, location;
    private int userId;


    private Booking(Builder builder) {
        this.bookingId = builder.bookingId;
        this.bookingTime = builder.bookingTime;
        this.bookingDate = builder.bookingDate;
        this.bookingType = builder.bookingType;
        this.duration = builder.duration;
        this.location = builder.location;
        this.userId = builder.userId;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "bookingId=" + bookingId +
                ", duration=" + duration +
                ", userId=" + userId +
                ", bookingTime=" + bookingTime +
                ", bookingDate=" + bookingDate +
                ", bookingType='" + bookingType + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public static class Builder{
        private String bookingId, duration, bookingTime, bookingDate, bookingType, location;
        private int userId;

        public Builder setBookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setDuration(String duration) {
            this.duration = duration;
            return this;
        }

        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setBookingTime(String bookingTime) {
            this.bookingTime = bookingTime;
            return this;
        }

        public Builder setBookingDate(String bookingDate) {
            this.bookingDate = bookingDate;
            return this;
        }

        public Builder setBookingType(String bookingType) {
            this.bookingType = bookingType;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }

        public Builder copy (Booking booking){
            this.bookingId = booking.bookingId;
            this.bookingTime = booking.bookingTime;
            this.bookingDate = booking.bookingDate;
            this.bookingType = booking.bookingType;
            this.duration = booking.duration;
            this.location = booking.location;
            this.userId = booking.userId;

            return this;
        }

    }

    
}
