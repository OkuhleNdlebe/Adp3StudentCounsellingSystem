package za.ac.cput.entity.generic;

import java.util.Date;

/* User.java
 Entity for the User
 Author: Legiste Ndabashinze (217046207)
 Date:
*/
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;


    // GETTERS
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public User(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
    }

    // BUILDER CLASS
    public static class Builder{

        private int id;
        private String firstName;
        private String lastName;
        private String gender;
        private Date dateOfBirth;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }// END OF BUILDER CLASS
}// END OF USER CLASS
