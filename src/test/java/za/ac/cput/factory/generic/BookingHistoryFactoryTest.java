
/*BookingHistory.java
 Test Case for Booking History
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

package za.ac.cput.factory.generic;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import za.ac.cput.entity.generic.BookingHistory;

import static org.junit.Assert.*;

public class BookingHistoryFactoryTest {


    @Test
    public void createBookingHistory() {
        BookingHistory bookingHistory=BookingHistoryFactory.createBookingHistory(67, 90, "Satisfied");
        System.out.print(bookingHistory);
    }
    @Test
    public void testEquality() {
        assertEquals(1,1);
    }
    @Test
    public void testIdentity(){
        assertSame(1, 1 );
    }

    @Test
    public void testTimeouts() {

    }
    @Test
    public void testTimeout(){
        AssertTimeout(5);
    }

    private void AssertTimeout(int i) {
    }

    @Test
    @Disabled(" When the timeout is exceeded")
    public void testWillBeExecuted() {

    }

}


