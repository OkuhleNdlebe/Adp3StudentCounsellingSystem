package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import za.ac.cput.entity.generic.Specialization;

import static org.junit.Assert.*;

public class SpecializationFactoryTest {
    @Test
    public void testEquality(){
        Specialization special1 = SpecializationFactory.createSpecialization(233434, "Student","Okuhle");
        Specialization special2 = SpecializationFactory.createSpecialization(233434, "Student", "Okuhle");
        special1 = special2;
        assertEquals(special1, special2);
        System.out.println("Test passed ");

    }
    @Test
    public void testIdentity(){
        Specialization special1 = SpecializationFactory.createSpecialization(233434, "Student","Okuhle");
        Specialization special2 = SpecializationFactory.createSpecialization(233434, "Student", "Okuhle");
        special1 = special2;
        assertEquals(special1, special2);
        System.out.println("Test passed ");

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

    @Test
    public void createSpecialization() {
        Specialization specialization = SpecializationFactory.createSpecialization(232243, "Depression", "Cput student counselling");
        Assert.assertNotNull(specialization.getSpecialityID());

    }
    @Test
    public void createSpecialityName(){
        Specialization specialization = SpecializationFactory.createSpecialization(565567, "Anxity", "CPUT");
        Assert.assertEquals("Anxity",specialization.getSpecialityName());
    }
    @Test
    public void createSpecialityDecr(){
        Specialization specialization = SpecializationFactory.createSpecialization(12343,"Depression","CPUT");
        Assert.assertEquals("CPUT", specialization.getSpecialityDecr());
    }
}