package za.ac.cput.factory;

/* UserFactory.java
 Factory for the User
 Author: Legiste Ndabashinze (217046207)
 Date:
*/

import za.ac.cput.entity.user.User;

import java.util.Date;
import java.util.UUID;

public class UserFactory {

    public static User createUser(String firstName, String lastName, String gender, Date date){


        int id = generateUniqueId();

        User user = new User.Builder()
                .setId(id)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setGender(gender)
                .setDateOfBirth(date).build();

        return user;
    }

    public static int generateUniqueId() {
        UUID id = UUID.randomUUID();
        String str=""+id;

        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");

        return Integer.parseInt(str);
    }
}
