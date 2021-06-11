/*ContactType.java
 Factory for Contact type
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

package za.ac.cput.factory.generic;

import za.ac.cput.entity.generic.ContactType;

public class ContactTypeFactory {

    public static ContactType createContactType(String emailAddress, int phoneNumber) {
        ContactType contactType = new ContactType.Builder()
                .setEmailAddress(emailAddress)
                .setPhoneNumber(phoneNumber)
                .build();
        return contactType;
    }
}
