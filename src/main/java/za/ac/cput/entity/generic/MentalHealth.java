package za.ac.cput.entity.generic;
/*Entity for MemtalHealth
Author :Justin Nkuna(219319820)
Date:10 June 2021
 */

public class MentalHealth {

    //Declaration of privatebattributes
    private int userId;
    private String disorderName;
    private String disorderDesc;
    private int counsellingBackgroundId;

    //creating the builder pattern for Mental health
    private   MentalHealth(Builder builder) {

         this.userId=builder.userId;
         this.disorderName= builder.disorderName;
         this.disorderDesc=builder.disorderDesc;
         this.counsellingBackgroundId=builder.counsellingBackgroundId;
    }
//The toString method to return values
    @Override
    public String toString() {
        return "MentalHealth{" +
                "userId=" + userId +
                ", disorderName='" + disorderName + '\'' +
                ", disorderDesc='" + disorderDesc + '\'' +
                ", counsellingBackgroundId=" + counsellingBackgroundId +
                '}';
    }

    public static class Builder{
        private int userId;
        private String disorderName;
        private String disorderDesc;
        private int counsellingBackgroundId;

        public Builder setUserId(int userId) {
            this.userId = userId;

            return this;
        }

        public Builder setDisorderName(String disorderName) {
            this.disorderName = disorderName;

            return this;
        }

        public Builder setDisorderDesc(String disorderDesc) {
            this.disorderDesc = disorderDesc;

            return this;
        }

        public Builder setCounsellingBackgroundId(int counsellingBackgroundId) {
            this.counsellingBackgroundId = counsellingBackgroundId;

            return this;
        }

        public MentalHealth build(){

            return new MentalHealth(this);
        }


        //copy constructor to create an object using another object on same  class
        public  Builder copy(MentalHealth mentalHealth){

             this.userId= mentalHealth.userId;
             this.disorderName=mentalHealth.disorderName;
             this.disorderDesc=mentalHealth.disorderDesc;
             this.counsellingBackgroundId= mentalHealth.counsellingBackgroundId;

            return this;

        }




    }







}



