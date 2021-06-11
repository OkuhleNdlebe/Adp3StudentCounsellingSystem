/*ContactType.java
 Factory for Contact detail
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

package za.ac.cput.factory.generic;

import za.ac.cput.entity.generic.ContactDetail;

public class ContactDetailFactory {

    public static ContactDetail createContactDetail(String emailAddress, int phoneNumber) {
        ContactDetail contactDetail = new ContactDetail.Builder()
                .setEmailAddress(emailAddress)
                .setPhoneNumber(phoneNumber)
                .build();
        return contactDetail;
    }
}
