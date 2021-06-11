/*  RoleFactory.java
        Entity for Role Factory
        *  Author: Vuyisa Nkangana(218192215)
        *  Date: 11 June 2021
        */
package za.ac.cput.factory;

import za.ac.cput.entity.generic.Role;

public class RoleFactory {
    public static Role createRole(int userId, int roleId, String roleName, String roleDescription){
        Role role = new Role.Builder()
                .setUserId(userId)
                .setRoleId(userId)
                .setRoleName(roleName)
                .setRoleDescription(roleDescription)
                .build();
        return role;
    }

    }
