package za.ac.cput;

import org.junit.Test;
import za.ac.cput.entity.generic.ContactType;
import za.ac.cput.factory.generic.ContactTypeFactory;

import static org.junit.Assert.*;

public class ContactTypeFactoryTest {

    @Test
    public void createContactType() {
        ContactType contactType = ContactTypeFactory.createContactType("Lihlenjibe@gmail.com", 9098908);
        System.out.print(contactType);

    }
}