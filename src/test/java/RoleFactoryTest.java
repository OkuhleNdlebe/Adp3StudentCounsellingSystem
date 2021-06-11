/* RoleFactoryTest.java
    Testing for Role Factory
    Author: Vuyisa Nkangana(218192215)
    Date: 11 June 2021
 */

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.generic.Role;
import za.ac.cput.factory.generic.RoleFactory;

import static org.junit.jupiter.api.Assertions.*;

class RoleFactoryTest {

    @Test
    public void createRole(){
        Role role = RoleFactory.createRole(2181922,177,"Counselling", "Counsellor");
        System.out.println(role);
    }

}