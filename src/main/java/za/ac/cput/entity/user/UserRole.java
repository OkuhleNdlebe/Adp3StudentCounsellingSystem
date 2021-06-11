package za.ac.cput.entity.user;

public class UserRole {
    private int userId,roleId;

    private UserRole(UserRole.Builder builder) {
        this.userId = builder.userId;
        this.roleId = builder.roleId;

    }

    @Override
    public String toString() {
        return "BookingHistory{" +
                "userId=" + userId +
                ", roleId=" + roleId +
                + '\'' +
                '}';
    }

    public static class Builder {
        public int roleId;
        private int userId;


        public UserRole.Builder setUserId(int userId) {
            this.userId = userId;

            return this;
        }

        public UserRole.Builder setRoleId(int roleId) {
            this.roleId = roleId;

            return this;
        }

        public UserRole build() {
            return new UserRole(this);
        }
        public UserRole.Builder copy(UserRole UserRole) {
            this.userId = UserRole.userId;
            this.roleId = UserRole.roleId;

            return this;
        }

    }
}
