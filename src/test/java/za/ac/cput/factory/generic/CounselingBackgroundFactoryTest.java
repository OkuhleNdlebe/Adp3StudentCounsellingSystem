package za.ac.cput.factory.generic;


/*FactoryTest for CounsellingBackground
Author :Justin Nkuna(219319820)
Date:11 June 2021
 */

import org.junit.Ignore;
import org.junit.Test;
import za.ac.cput.entity.generic.CounsellingBackground;
import za.ac.cput.entity.generic.MentalHealth;

import java.util.Date;

import static org.junit.Assert.*;

public class CounselingBackgroundFactoryTest {

    @Test
    public void objectIdentity() {

        CounsellingBackground counsellor1 = CounselingBackgroundFactory.build(265, "Lwazi", "Tomson", 012361,  new Date(2021-06-16), "1 hour", "Exercising");
        CounsellingBackground counsellor2 = CounselingBackgroundFactory.build(266, "Gift", "Ngwane", 012612, new Date(2021 - 06 - 14), "30 minutes", "Medication");
        CounsellingBackground counsellor3 = CounselingBackgroundFactory.build(267, "jacob", "Frank", 011237, new Date(2021-06-12) ,"45 minutes", "Psychotherapy");
        CounsellingBackground counsellor4  = CounselingBackgroundFactory.build(265, "Lwazi", "Tomson", 012361, new Date(2021-06-16), "1 hour", "Exercising");
        counsellor1 =counsellor4;

        assertNotSame(counsellor1, counsellor2);
        System.out.println("counsellor1 and counsellor 2 are not identical");


    }

    @Test
    public void equalityTest() {

        CounsellingBackground counsellor1 = CounselingBackgroundFactory.build(265, "Lwazi", "Tomson", 012361,  new Date(2021-06-16), "1 hour", "Exercising");
        CounsellingBackground counsellor2 = CounselingBackgroundFactory.build(266, "Gift", "Ngwane", 012612, new Date(2021 - 06 - 14), "30 minutes", "Medication");
        CounsellingBackground counsellor3 = CounselingBackgroundFactory.build(267, "jacob", "Frank", 011237, new Date(2021-06-12) ,"45 minutes", "Psychotherapy");
        CounsellingBackground counsellor4  = CounselingBackgroundFactory.build(265, "Lwazi", "Tomson", 012361, new Date(2021-06-16), "1 hour", "Exercising");
        counsellor1 =counsellor4;

        assertEquals(counsellor1,counsellor4);
        System.out.println("counselor1 is the same as counselor4 with and identical");


    }



    @Ignore
    @Test
    public void disablingTest() {
        System.out.println("test ignored");
    }
    @Test(timeout = 100)
    public void timeoutTest() {
        System.out.println("timeout test");
    }
}