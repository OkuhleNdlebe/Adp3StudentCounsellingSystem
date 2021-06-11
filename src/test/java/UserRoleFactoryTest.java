/*  UserRoleFactoryTest.java
    Testing for User Role Factory
    Author: Vuyisa Nkagnana(218192215)
    Date: 11 June 2021
     */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.generic.UserRole;
import za.ac.cput.factory.generic.UserRoleFactory;

class UserRoleFactoryTest {
    @Test
    public void createUserRole(){
        UserRole userrole = UserRoleFactory.createUserRole(2181922, 125);
        System.out.println(userrole);
    }

}