
/*ContactDetailFactory.java
 Test case for Contact detail
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

package za.ac.cput.factory;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import za.ac.cput.entity.generic.ContactDetail;
import za.ac.cput.factory.generic.ContactDetailFactory;

import static org.junit.Assert.*;

public class ContactDetailFactoryTest {


    @Test
    public void createContactDetail() {
        ContactDetail contactDetail= ContactDetailFactory.createContactDetail("Lihlenjibe@gmail.com", 9098908);
        System.out.print(contactDetail);

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
    public void testIdentity() {
        ContactDetail.Builder contact2 = new ContactDetail.Builder().setEmailAddress("lihlenjobe@gmail.com").setPhoneNumber(0);
        ContactDetail.Builder contact1 = new ContactDetail.Builder().setEmailAddress("lihlenjobe@gmail.com").setPhoneNumber(0);
        contact2 = contact1;
        assertSame(contact2, contact1);
        System.out.print("The same");
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


