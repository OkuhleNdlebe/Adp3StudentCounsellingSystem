package za.ac.cput.entity.generic;
/*Entity for CounsellingBackground;
Author :Justin Nkuna(219319820)
Date:10 June 2021
 */
import java.util.Date;

public class CounsellingBackground {

    //Declaration of private attributes
    private int counselingBackgroundId;
    private String counsellorFirstName;
    private String counsellorLastName;
    private int counsellorPhoneNumber;
    private Date counsellingDate;
    private String counsellingDuration;
    private String treatmentTaken;



    //creating the builder pattern for counselling background
    private  CounsellingBackground(Builder builder) {

        this.counselingBackgroundId = builder.counselingBackgroundId;
        this.counsellorFirstName = builder.counsellorFirstName;
        this.counsellorLastName = builder.counsellorLastName;
        this.counsellorPhoneNumber = builder.counsellorPhoneNumber;
        ;
        this.counsellingDate = builder.counsellingDate;
        this.counsellingDuration = builder.counsellingDuration;
        this.treatmentTaken = builder.treatmentTaken;
    }

    @Override
    public String toString() {
        return "CounsellingBackground{" +
                "counselingBackgroundId=" + counselingBackgroundId +
                ", counsellorFirstName='" + counsellorFirstName + '\'' +
                ", counsellorLastName='" + counsellorLastName + '\'' +
                ", counsellorPhoneNumber=" + counsellorPhoneNumber +
                ", counsellingDate=" + counsellingDate +
                ", counsellingDuration='" + counsellingDuration + '\'' +
                ", treatmentTaken='" + treatmentTaken + '\'' +
                '}';
    }

    public static class Builder {
        private int counselingBackgroundId;
        private String counsellorFirstName;
        private String counsellorLastName;
        private int counsellorPhoneNumber;
        private Date counsellingDate;
        private String counsellingDuration;
        private String treatmentTaken;

        public Builder setCounselingBackgroundId(int counselingBackgroundId) {
            this.counselingBackgroundId = counselingBackgroundId;

            return this;
        }

        public Builder setCounsellorFirstName(String counsellorFirstName) {
            this.counsellorFirstName = counsellorFirstName;

            return this;
        }

        public Builder setCounsellorLastName(String getCounsellorLastName) {
            this.counsellorLastName = getCounsellorLastName;

            return this;
        }

        public Builder setCounsellorPhoneNumber(int counsellorPhoneNumber) {
            this.counsellorPhoneNumber = counsellorPhoneNumber;

            return this;
        }

        public Builder setCounsellingDate(Date counsellingDate) {
            this.counsellingDate = counsellingDate;


            return this;
        }

        public Builder setCounsellingDuration(String counsellingDuration) {
            this.counsellingDuration = counsellingDuration;

            return this;
        }

        public Builder setTreatmentTaken(String treatmentTaken) {
            this.treatmentTaken = treatmentTaken;

            return this;
        }

        public CounsellingBackground build() {

            return new CounsellingBackground(this);

        }
        //copy constructor to create an object using another object on same  class
        public Builder copy(CounsellingBackground counsellingBackground) {

            this.counselingBackgroundId = counsellingBackground.counselingBackgroundId;
            this.counsellorFirstName = counsellingBackground.counsellorFirstName;
            this.counsellorLastName = counsellingBackground.counsellorLastName;
            this.counsellorPhoneNumber = counsellingBackground.counsellorPhoneNumber;
            this.counsellingDate = counsellingBackground.counsellingDate;
            this.counsellingDuration = counsellingBackground.counsellingDuration;
            this.treatmentTaken = counsellingBackground.treatmentTaken;

            return this;

        }

    }
}