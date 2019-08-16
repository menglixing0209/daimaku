package org.lanqiao.entity;

public class Evaluate {
    private Long eva_id;

    private String eva_content;

    private Long user_id;

    private Long pro_id;

    public Long getEva_id() {
        return eva_id;
    }

    public void setEva_id(Long eva_id) {
        this.eva_id = eva_id;
    }

    public String getEva_content() {
        return eva_content;
    }

    public void setEva_content(String eva_content) {
        this.eva_content = eva_content == null ? null : eva_content.trim();
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getPro_id() {
        return pro_id;
    }

    public void setPro_id(Long pro_id) {
        this.pro_id = pro_id;
    }

    @Override
    public String toString() {
        return "Evaluate{" +
                "eva_id=" + eva_id +
                ", eva_content='" + eva_content + '\'' +
                ", user_id=" + user_id +
                ", pro_id=" + pro_id +
                '}';
    }
}