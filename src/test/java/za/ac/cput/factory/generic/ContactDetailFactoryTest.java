package za.ac.cput.factory.generic;

import org.junit.Test;

import za.ac.cput.entity.generic.ContactDetail;

import static org.junit.Assert.*;

public class ContactDetailFactoryTest {

    @Test
    public void createContactDetail() {
        ContactDetail contactDetail=ContactDetailFactory.createContactDetail("Lihlenjibe@gmail.com", 9098908);
        System.out.print(contactDetail);


    }

}