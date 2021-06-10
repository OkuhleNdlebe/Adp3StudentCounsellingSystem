package za.ac.cput.entity.generic;

/* TimeSlotAvailability.java
 Entity for the TimeSlotAvailability
 Author: Legiste Ndabashinze (217046207)
 Date:
*/

public class TimeSlotAvailability {

    private int bookingId;
    private boolean available;

    public TimeSlotAvailability(Builder builder){
        this.bookingId = builder.bookingId;
        this.available = builder.available;
    }

    // GETTERS
    public int getBookingId() {
        return bookingId;
    }

    public boolean isAvailable() {
        return available;
    }
    //  END OF GETTER

    @Override
    public String toString() {
        return "TimeSlotAvailability{" +
                "bookingId=" + bookingId +
                ", available=" + available +
                '}';
    }

    // Builder Class
    public static class Builder{

        private int bookingId;
        private boolean available;

        public Builder setBookingId(int bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setAvailable(boolean available) {
            this.available = available;
            return this;
        }

        public TimeSlotAvailability build(){
            return new TimeSlotAvailability(this);
        }
    }// END of BUILDER CLASS
}
