package za.ac.cput.entity.generic;

import java.util.Objects;

/*
 *Author:Okuhle Ndlebe
 * Date: 11/06/2021
 * Descripation:
 */
public class Specialization  {
    private int specialityID;
    private String specialityName;
    private String specialityDecr;

    private Specialization(Builder builder){
       this.specialityID = builder.specialityID;
       this.specialityName = builder.specialityName;
       this.specialityDecr = builder.specialityDecr;
    }

    //getters
    public int getSpecialityID() {
        return specialityID;
    }

    public String getSpecialityName() {
        return specialityName;
    }

    public String getSpecialityDecr() {
        return specialityDecr;
    }

    //override
    @Override
    public String toString() {
        return "Specialization{" +
                "specialityID=" + specialityID +
                ", specialityName='" + specialityName + '\'' +
                ", specialityDecr='" + specialityDecr + '\'' +
                '}';
    }

    public static class Builder{
        private String  specialityName, specialityDecr;
        private int specialityID;

        public Builder setSpecialityID(int specialityID){
            this.specialityID = specialityID;
            return this;
        }
        public Builder setSpecialityName(String specialityName){
            this.specialityName = specialityName;
            return this;
        }
        public Builder setSpecialityDecr(String specialityDecr){
            this.specialityDecr = specialityDecr;
            return this;
        }
        public Builder copy(za.ac.cput.entity.generic.Specialization specialization){
            this.specialityID = specialization.specialityID;
            this.specialityName = specialization.specialityName;
            this.specialityDecr = specialization.specialityDecr;
            return this;
        }
        public Specialization build(){
            return new Specialization(this);
        }
    }
    @Override
    public int hashCode(){
        return Objects.hash(specialityID);
    }



}
