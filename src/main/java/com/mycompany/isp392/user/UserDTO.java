package com.mycompany.isp392.user;

public class UserDTO {
    private String UserID;
    private String userName;
    private String email;
    private String password;
    private String role;
    private String phone;
    private String status;

    public UserDTO() {
    }

    public UserDTO(String UserID, String userName, String email, String password, String role, String phone, String status) {
        this.UserID = UserID;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.role = role;
        this.phone = phone;
        this.status = status;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
