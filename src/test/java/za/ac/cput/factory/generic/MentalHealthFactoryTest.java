package za.ac.cput.factory.generic;

/*MemtalHealthFactory test
Author :Justin Nkuna(219319820)
Date:10 June 2021
 */

import org.junit.Ignore;
import org.junit.Test;
import za.ac.cput.entity.generic.MentalHealth;

import static org.junit.Assert.*;

public class MentalHealthFactoryTest {


    @Test
    public void objectIdentity(){

        MentalHealth user1 = MentalHealthFactory.build(219319820,"Anxiety","is a condition of persistent and uncontrollable nervousness, stress, and worry that is triggered by anticipation of future events, memories of past events, or ruminations over day-to-day events, both trivial and major, with disproportionate fears of catastrophic consequences",265);

        MentalHealth user2 = MentalHealthFactory.build(218265848,"Depression","constant feeling of sadness and loss of interest, which stops you doing your normal activities.",266);

        MentalHealth user3 = MentalHealthFactory.build(202598564,"Anxiety","is a condition of persistent and uncontrollable nervousness, stress, and worry that is triggered by anticipation of future events, memories of past events, or ruminations over day-to-day events, both trivial and major, with disproportionate fears of catastrophic consequences",266);



        assertNotSame(user1, user2);
        System.out.println("Health disorders are not the same for user 1 and user 2");

        assertSame(user1,user3);
        System.out.println("user1 and user2 are suffering from same same identical mental health problem ");

    }

    @Test
    public void objectEquality(){
        MentalHealth user1 = MentalHealthFactory.build(219319820,"Anxiety","is a condition of persistent and uncontrollable nervousness, stress, and worry that is triggered by anticipation of future events, memories of past events, or ruminations over day-to-day events, both trivial and major, with disproportionate fears of catastrophic consequences",265);

        MentalHealth user2 = MentalHealthFactory.build(218265848,"Depression","constant feeling of sadness and loss of interest, which stops you doing your normal activities.",266);

        MentalHealth user3 = MentalHealthFactory.build(202598564,"Anxiety","is a condition of persistent and uncontrollable nervousness, stress, and worry that is triggered by anticipation of future events, memories of past events, or ruminations over day-to-day events, both trivial and major, with disproportionate fears of catastrophic consequences",266);



        assertNotEquals(user1, user2);
        System.out.println(" User 1is to User0");

        assertEquals(user1,user3);
        System.out.println("user 1 is equal to user 3");

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