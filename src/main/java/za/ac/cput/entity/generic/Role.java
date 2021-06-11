/*  Role.java
        Entity for Role
        *  Author: Vuyisa Nkangana(218192215)
        *  Date: 11 June 2021
        */
package za.ac.cput.entity.generic;

public class Role {
    private int userId;
    private int roleId;
    private String roleName;
    private String roleDescription;

    private Role(Role.Builder builder) {
        this.userId = builder.userId;
        this.roleId = builder.roleId;
        this.roleName = builder.roleName;
        this.roleDescription = builder.roleDescription;
    }

    @Override
    public String toString() {

        return "Role{" +
                "userId =" + userId +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                '}';
    }

    public static class Builder {
        public int userId;
        private int roleId;
        private String roleName;
        private String roleDescription;

        public Role.Builder setUserId(int userId){
            this.userId = userId;
            return this;

        }
        public Role.Builder setRoleId(int roleId) {
            this.roleId = roleId;
            return this;
        }
        public Role.Builder setRoleName(String roleName){
            this.roleName = roleName;
            return this;
        }
        public Role.Builder setRoleDescription(String roleDescription){
            this.roleDescription = roleDescription;
            return this;
        }

        public Role build() {
            return new Role(this);
        }
        public Role.Builder copy(Role Role) {
            this.userId = Role.userId;
            this.roleId = Role.roleId;
            this.roleName = Role.roleName;
            this.roleDescription = Role.roleDescription;

            return this;
        }

    }
}
