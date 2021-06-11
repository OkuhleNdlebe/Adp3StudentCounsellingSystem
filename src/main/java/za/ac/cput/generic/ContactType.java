package za.ac.cput.generic;

/*ContactType.java
 Entity for Contact type
 Author: Lihle Njobe(218193882)
 Date: 9 June 2021
 */

public class ContactType {

    private String emailAddress;
    private int phoneNumber;

    private ContactType(ContactType.Builder builder) {
        this.emailAddress= builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
    }

    @Override
    public String toString() {
        return "ContactType{" +
                "emailAddress='" + emailAddress + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public static class Builder {
        private String emailAddress;
        private int phoneNumber;

        public ContactType.Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;

            return this;
        }

        public ContactType.Builder setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;

        }
        public ContactType build() {

            return new ContactType(this);
        }
        public ContactType.Builder copy(ContactType contactType) {
            this.emailAddress = contactType.emailAddress;
            this.phoneNumber = contactType.phoneNumber;
            return this;
        }

    }
}

