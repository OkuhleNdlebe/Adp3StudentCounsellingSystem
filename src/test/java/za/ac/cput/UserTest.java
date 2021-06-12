package za.ac.cput;

import org.junit.Ignore;
import org.junit.Test;
import za.ac.cput.entity.user.User;
import za.ac.cput.factory.user.UserFactory;

import java.util.Date;

import static org.junit.Assert.*;

/* UserTest.java
 Test for the User
 Author: Legiste Ndabashinze (217046207)
 Date:
*/

public class UserTest {

    @Test
    public void objectIdentity(){

        User user0 = UserFactory.createUser("Legiste","Ndabashinze","Male",
                new Date(1999,04,16));

        User user1 = UserFactory.createUser("Elon","Musk","",
                new Date(1971, 06,28));

        User user2 = user0;

        assertNotSame(user0, user1);
        System.out.println("OBJECT IDENTITY:: User0 is NOT IDENTICAL to User1");

        assertSame(user2,user0);
        System.out.println("OBJECT IDENTITY:: User2 is IDENTICAL to User0");

    }

    @Test
    public void objectEquality(){
        User user0 = UserFactory.createUser("Legiste","Ndabashinze","Male",
                new Date(1999,04,16));
        User user1 = UserFactory.createUser("Jeff","Bezos","",
                new Date(1964, 01,12));
        User user2 = user0;

        assertNotEquals(user0, user1);
        System.out.println("OBJECT EQUALITY:: User 1 Is NOT EQUAL to User0");

        assertEquals(user2, user0);
        System.out.println("OBJECT EQUALITY:: User 2 Is EQUAL to User0");

    }

    @Test(timeout = 500)
    public void timeoutTest(){
        System.out.println("timeout test");
    }

    @Ignore
    @Test
    public void disablingTest(){
        System.out.println("test ignored");
    }
}