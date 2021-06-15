package za.ac.cput.factory;
/*
 *Author:Okuhle Ndlebe
 * Date: 11/06/2021
 * Descripation:
 */

import za.ac.cput.Util.GenericHelper;
import za.ac.cput.entity.generic.CounsellorSpecialization;

public class CounsellingSpecializationFactory {
    public static CounsellorSpecialization createCounsellingSpecialization(int userID, int specialityID){
         userID = GenericHelper.generateId();
         specialityID = GenericHelper.generateId();

        CounsellorSpecialization counsellorSpecialization = new CounsellorSpecialization.Builder()
                .setSpecialityID(specialityID)
                .setUserID(userID)
                .build();
        return counsellorSpecialization;
    }
}
