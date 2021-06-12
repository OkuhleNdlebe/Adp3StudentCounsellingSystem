package za.ac.cput.factory.generic;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.generic.UserRole;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    @Test
    public void UserRoleFactoryTest(){

        UserRole ur1 = new UserRole.Builder().build();
        UserRole ur2 = new UserRole.Builder().setUserId(2181922)
                .build();
        UserRole ur3 = new UserRole.Builder().setUserId(2181923)
                .build();
        UserRole ur4 = ur1;

        assertNotSame(ur2, ur3);
        System.out.println("r2 NOT IDENTICAL to r3");

        assertSame(ur1, ur4);
        System.out.println("T1 IS IDENTICAL to T4");
    }

    @org.junit.Test
    public void equalityTest(){

        UserRole ur1 = new UserRole.Builder().build();
        UserRole ur2 = new UserRole.Builder().setUserId(2181922)
                .build();
        UserRole ur3 = new UserRole.Builder().setUserId(2181923)
                .build();
        UserRole ur4 = ur1;

        assertNotEquals(ur2, ur3);
        System.out.println("r2 NOT EQUAL to r3");

        assertEquals(ur1, ur4);
        System.out.println("r1 IS EQUAL to r4");

    }

    @org.junit.Test(timeout = 500)
    public void timeoutTest(){

        System.out.println("timeout test");
    }

    @Ignore
    @org.junit.Test
    public void disablingTest(){

        System.out.println("test ignored");
    }


}