package za.ac.cput.factory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
import za.ac.cput.entity.generic.CounsellorSpecialization;

public class CounsellingSpecializationFactoryTest {
    @Test
    public void createUserID(){
        CounsellorSpecialization counsellorSpecialization = CounsellingSpecializationFactory.createCounsellingSpecialization(21322333,3);
        Assert.assertNotNull(counsellorSpecialization.getUserID());
    }
    @Test
    public void createSpecialityID(){
        CounsellorSpecialization counsellorSpecialization = CounsellingSpecializationFactory.createCounsellingSpecialization(909,7);
        Assert.assertNotNull(counsellorSpecialization.getSpecialityID());
    }



}