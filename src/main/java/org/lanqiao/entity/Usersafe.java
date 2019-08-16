package org.lanqiao.entity;

public class Usersafe {
    private Long uesr_id;

    private String user_name;

    private String user_tel;

    private String user_passwo;

    private String user_email;

    private String user_status;

    public Long getUesr_id() {
        return uesr_id;
    }

    public void setUesr_id(Long uesr_id) {
        this.uesr_id = uesr_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel == null ? null : user_tel.trim();
    }

    public String getUser_passwo() {
        return user_passwo;
    }

    public void setUser_passwo(String user_passwo) {
        this.user_passwo = user_passwo == null ? null : user_passwo.trim();
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email == null ? null : user_email.trim();
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status == null ? null : user_status.trim();
    }

    @Override
    public String toString() {
        return "Usersafe{" +
                "uesr_id=" + uesr_id +
                ", user_name='" + user_name + '\'' +
                ", user_tel='" + user_tel + '\'' +
                ", user_passwo='" + user_passwo + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_status='" + user_status + '\'' +
                '}';
    }
}