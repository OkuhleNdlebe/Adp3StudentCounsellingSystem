/*  UserRoleFactory.java
    Entity for the User Role Factory
 *  Author: Vuyisa Nkangana(218192215)
 *  Date: 11 June 2021
 */

package za.ac.cput.factory;

import za.ac.cput.Util.GenericHelper;
import za.ac.cput.entity.generic.UserRole;

public class UserRoleFactory {
    public static UserRole createUserRole(int userId, int userRole){
        String roleId = GenericHelper.generateId();
        UserRole userrole = new UserRole.Builder()
                .setRoleId(userId)
                .setRoleId(userId)
                .build();
        return userrole;

    }

}
