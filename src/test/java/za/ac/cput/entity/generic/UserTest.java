package za.ac.cput.entity.generic;

import org.junit.Ignore;
import org.junit.Test;

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

        User.Builder user0 = new User.Builder().setId(217046207).setFirstName("Legiste").setLastName("Ndabashinze")
                .setGender("Male").setDateOfBirth(new Date(1999,04,16));
        User.Builder user1 = new User.Builder().setId(000000000).setFirstName("Gandalf").setLastName("TheGrey")
                .setGender("Male").setDateOfBirth(new Date(1990,01,01));

        User.Builder user2 = user0;

        assertNotSame(user0, user1);
        System.out.println("OBJECT IDENTITY:: User0 is NOT IDENTICAL to User1");

        assertSame(user2,user0);
        System.out.println("OBJECT IDENTITY:: User2 is IDENTICAL to User0");

    }

    @Test
    public void objectEquality(){
        User.Builder user0 = new User.Builder().setId(217046207).setFirstName("Legiste").setLastName("Ndabashinze")
                .setGender("Male").setDateOfBirth(new Date(1999,04,16));
        User.Builder user1 = new User.Builder().setId(000000001).setFirstName("Bilbo").setLastName("Baggons")
                .setGender("Male").setDateOfBirth(new Date(1995,02,02));

        User.Builder user2 = user0;

        assertNotEquals(user1, user1);
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