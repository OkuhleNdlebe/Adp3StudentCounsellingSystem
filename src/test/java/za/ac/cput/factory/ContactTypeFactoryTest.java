/*ContactTypeFactory.java
 Test case for Contact Type
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

package za.ac.cput.factory;

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
        ContactType.Builder type0 = new ContactType.Builder().setEmailAddress("218193882@mycput").setPhoneNumber(0);
        ContactType.Builder type1 = new ContactType.Builder().setEmailAddress("218193882@mycput").setPhoneNumber(0);
        type0 = type1;
        assertEquals(type0,type1);
        System.out.print("Equal");
    }
    @Test
    public void testIdentity(){
        ContactType.Builder type0 = new ContactType.Builder().setEmailAddress("218193882@mycput").setPhoneNumber(0);
        ContactType.Builder type1 = new ContactType.Builder().setEmailAddress("218193882@mycput").setPhoneNumber(0);
        type0 = type1;
        assertSame(type0,type1);
        System.out.print("Same");

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
