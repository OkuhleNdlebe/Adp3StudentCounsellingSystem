package za.ac.cput.factory;
/*
 *Author:Okuhle Ndlebe
 * Date: 11/06/2021
 * Descripation:
 */
import za.ac.cput.Util.GenericHelper;
import za.ac.cput.entity.generic.Specialization;

public class SpecializationFactory {

    public static Specialization createSpecialization(int specialityID, String specialityName, String specialityDecr){
        if (specialityName.isEmpty()|| specialityDecr.isEmpty()){
            System.out.println("Please fill in the required information");
        }
        specialityID = GenericHelper.generateId();

        Specialization specialization = new Specialization.Builder()
                .setSpecialityID(specialityID)
                .setSpecialityName(specialityName)
                .setSpecialityDecr(specialityDecr)
                .build();


    return specialization;
    }
}
