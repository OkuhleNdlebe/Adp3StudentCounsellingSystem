package za.ac.cput.entity.generic;

import java.sql.Time;
import java.util.Date;

/**BookingStatus.java
 * Entity for the Booking Status
 * Author: Lindokuhle Nini (218196504)
 * Date: 9 June 2021
 */
public class BookingStatus {
    private String status;

    public BookingStatus(Builder builder) {
        this.status = builder.status;
    }

    public static class Builder {
        private String status;

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public BookingStatus build(){
            return new BookingStatus(this);
        }

        public BookingStatus.Builder copy (BookingStatus bookingStatus){
            this.status = bookingStatus.status;
            return this;
        }
    }

    }
