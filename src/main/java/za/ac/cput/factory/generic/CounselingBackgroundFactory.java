package za.ac.cput.factory.generic;

/*Factory for CounsellingBackground
Author :Justin Nkuna(219319820)
Date:11 June 2021
 */

import za.ac.cput.entity.generic.CounsellingBackground;
import za.ac.cput.entity.generic.MentalHealth;

import java.util.Date;

public class CounselingBackgroundFactory {

    public static CounsellingBackground build( int counselingBackgroundId, String counsellorFirstName,String counsellorLastName,
                                               int counsellorPhoneNumber,Date counsellingDate,String counsellingDuration,String treatmentTaken)


    {

        CounsellingBackground background  = new CounsellingBackground.Builder()
                .setCounselingBackgroundId(counselingBackgroundId)
                .setCounsellorFirstName(counsellorFirstName)
                .setCounsellorLastName(counsellorLastName)
                .setCounsellorPhoneNumber(counsellorPhoneNumber)
                .setCounsellingDate(counsellingDate)
                .setCounsellingDuration(counsellingDuration)
                .setTreatmentTaken(treatmentTaken).build();



        return background;


    }
}
