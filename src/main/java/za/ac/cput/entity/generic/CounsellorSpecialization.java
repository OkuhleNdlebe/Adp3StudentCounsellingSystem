package za.ac.cput.entity.generic;

/* Author : Okuhle Ndlebe
    Date : 11/06/2021
    Description: Counsellor Specialization using Builder pattern
 */


import java.util.Objects;

public class CounsellorSpecialization {
    private int userID;
    private int specialityID;

    protected CounsellorSpecialization(){}


    
    //builder constructor 
    private CounsellorSpecialization(Builder builder){
        this.userID = builder.userID;
        this.specialityID  = builder.specialityID;
    }
    //getters 
    
    public int getUserID() {
        return userID;
    }

    public int getSpecialityID() {
        return specialityID;
    }
    
    //to String 
    @Override
    public String toString() {
        return "CounsellorSpecialization{" +
                "userID=" + userID +
                ", specialityID=" + specialityID +
                '}';
    }

    public static class Builder{
        private int userID,specialityID;
        
        public Builder setUserID(int userID){
            this.userID = userID;
            return this;
        }
        public Builder setSpecialityID(int specialityID){
            this.specialityID = specialityID;
            return this;
        }
        public Builder copy(za.ac.cput.entity.generic.CounsellorSpecialization counsellorSpecialization){
            this.userID = counsellorSpecialization.userID;
            this.specialityID = counsellorSpecialization.specialityID;
            return this;
        }
        public CounsellorSpecialization build(){
            return new CounsellorSpecialization(this);
        }
        
    }
    /*
    @Override
    public boolean equals (Object counsellor){
         (this == counsellor) return true;
        if(counsellor == null || getClass() != counsellor.getClass()) return false;
       CounsellorSpecialization counsellorSpecialization = (CounsellorSpecialization) counsellor;
        return specialityID.equals(counsellorSpecialization.specialityID) ;
    }

     */
    @Override
    public int hashCode(){
        return Objects.hash(specialityID, userID);

    }
}
