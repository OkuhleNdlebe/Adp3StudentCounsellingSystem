package za.ac.cput.entity.generic;

/*ContactDetail.java
 Entity for Contact detail
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

public class ContactDetail {
    private String emailAddress;
    private int phoneNumber;

    private ContactDetail(Builder builder) {
        this.emailAddress= builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactDetail{" +
                "emailAddress='" + emailAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public static class Builder {
        private String emailAddress;
        private int phoneNumber;

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;

            return this;
        }

        public Builder setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;

        }
        public ContactDetail build() {
            return new ContactDetail(this);
        }
        public Builder copy(ContactDetail contactDetail) {
            this.emailAddress = contactDetail.emailAddress;
            this.phoneNumber = contactDetail.phoneNumber;
            return this;
        }

    }
}
