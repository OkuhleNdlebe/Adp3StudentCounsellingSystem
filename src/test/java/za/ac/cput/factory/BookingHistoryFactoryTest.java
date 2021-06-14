
/*BookingHistory.java
 Test Case for Booking History
 Author: Lihle Njobe-(218193882)
 Date: 9 June 2021
 */

package za.ac.cput.factory;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import za.ac.cput.entity.generic.BookingHistory;
import za.ac.cput.entity.generic.ContactDetail;
import za.ac.cput.factory.generic.BookingHistoryFactory;


import static org.junit.Assert.*;

public class BookingHistoryFactoryTest {


    @Test
    public void createBookingHistory() {
        BookingHistory bookingHistory= BookingHistoryFactory.createBookingHistory(67, 90, "Satisfied");
        System.out.print(bookingHistory);
    }
    @Test
    public void testEquality() {
        ContactDetail.Builder contact2 = new ContactDetail.Builder().setEmailAddress("lihlenjobe@gmail.com").setPhoneNumber(0);
        ContactDetail.Builder contact1 = new ContactDetail.Builder().setEmailAddress("lihlenjobe@gmail.com").setPhoneNumber(0);
        contact2 = contact1;
        assertEquals(contact2, contact1);
        System.out.print("Equal");


    }
    @Test
    public void testIdentity(){
        ContactDetail.Builder contact2 = new ContactDetail.Builder().setEmailAddress("lihlenjobe@gmail.com").setPhoneNumber(0);
        ContactDetail.Builder contact1 = new ContactDetail.Builder().setEmailAddress("lihlenjobe@gmail.com").setPhoneNumber(0);
        contact2 = contact1;
        assertSame(contact2, contact1);
        System.out.print("Same");

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


