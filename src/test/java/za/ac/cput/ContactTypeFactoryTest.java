/*ContactTypeFactory.java
 Test case for Contact Type
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

package za.ac.cput;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import za.ac.cput.entity.generic.ContactType;
import za.ac.cput.factory.generic.ContactTypeFactory;

import static org.junit.Assert.*;

public class ContactTypeFactoryTest {

    @Test
    public void createContactType() {
        ContactType contactType = ContactTypeFactory.createContactType("Lihlenjibe@gmail.com", 9098908);
        System.out.print(contactType);

    }

    @Test
    public void testEquality() {
        assertEquals(1,1);
    }
    @Test
    public void testIdentity(){
        assertEquals(1, 2 );
    }

    @Test
    public void testTimeout(){
        AssertTimeout(3);
    }

    private void AssertTimeout(int i) {
    }

    @Test
    @Disabled(" When the timeout is exceeded")
    public void testWillBeExecuted() {


    }

}
