package za.ac.cput.factory.generic;

import org.junit.Test;

/*ContactDetailFactory.java
 Test case for Contact detail
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

import org.junit.jupiter.api.Disabled;
import za.ac.cput.entity.generic.ContactDetail;

import static org.junit.Assert.*;

public class ContactDetailFactoryTest {

    @Test
    public void createContactDetail() {
        ContactDetail contactDetail=ContactDetailFactory.createContactDetail("Lihlenjibe@gmail.com", 9098908);
        System.out.print(contactDetail);

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


