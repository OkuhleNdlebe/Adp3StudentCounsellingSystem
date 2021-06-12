package za.ac.cput.factory.generic;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import za.ac.cput.entity.generic.Role;

import static org.junit.Assert.*;

public class RoleFactoryTest {
    @Test
    public void RoleFactoryTest(){

        Role r1 = new Role.Builder().build();
        Role r2 = new Role.Builder().setUserId(2181922)
                .build();
        Role r3 = new Role.Builder().setUserId(2181923)
                .build();
        Role r4 = r1;

        assertNotSame(r2, r3);
        System.out.println("r2 NOT IDENTICAL to r3");

        assertSame(r1, r4);
        System.out.println("T1 IS IDENTICAL to T4");
    }

    @org.junit.Test
    public void equalityTest(){

        Role r1 = new Role.Builder().build();
        Role r2 = new Role.Builder().setUserId(2181922)
                .build();
        Role r3 = new Role.Builder().setUserId(2181923)
                .build();
        Role r4 = r1;

        assertNotEquals(r2, r3);
        System.out.println("r2 NOT EQUAL to r3");

        assertEquals(r1, r4);
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