package org.lanqiao.entity;

import java.util.Date;
import java.util.Set;

public class Product {
    private Long pro_id;

    private String pro_name;

    private Double pro_weight;

    private String pro_color;

    private Date pro_issued_;

    private Double pro_price;

    private Date pro_product;

    private String pro_describ;

    private Long pro_count;

    private Long kind_id;

    private Long brand_id;

    private String pro_img;

    private Brand brand;

    private Kind kind;

    private Set<Evaluate> evaluateSet;

    public Long getPro_id() {
        return pro_id;
    }

    public void setPro_id(Long pro_id) {
        this.pro_id = pro_id;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name == null ? null : pro_name.trim();
    }

    public Double getPro_weight() {
        return pro_weight;
    }

    public void setPro_weight(Double pro_weight) {
        this.pro_weight = pro_weight;
    }

    public String getPro_color() {
        return pro_color;
    }

    public void setPro_color(String pro_color) {
        this.pro_color = pro_color == null ? null : pro_color.trim();
    }

    public Date getPro_issued_() {
        return pro_issued_;
    }

    public void setPro_issued_(Date pro_issued_) {
        this.pro_issued_ = pro_issued_;
    }

    public Double getPro_price() {
        return pro_price;
    }

    public void setPro_price(Double pro_price) {
        this.pro_price = pro_price;
    }

    public Date getPro_product() {
        return pro_product;
    }

    public void setPro_product(Date pro_product) {
        this.pro_product = pro_product;
    }

    public String getPro_describ() {
        return pro_describ;
    }

    public void setPro_describ(String pro_describ) {
        this.pro_describ = pro_describ == null ? null : pro_describ.trim();
    }

    public Long getPro_count() {
        return pro_count;
    }

    public void setPro_count(Long pro_count) {
        this.pro_count = pro_count;
    }

    public Long getKind_id() {
        return kind_id;
    }

    public void setKind_id(Long kind_id) {
        this.kind_id = kind_id;
    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public String getPro_img() {
        return pro_img;
    }

    public void setPro_img(String pro_img) {
        this.pro_img = pro_img == null ? null : pro_img.trim();
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }

    public Set<Evaluate> getEvaluateSet() {
        return evaluateSet;
    }

    public void setEvaluateSet(Set<Evaluate> evaluateSet) {
        this.evaluateSet = evaluateSet;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pro_id=" + pro_id +
                ", pro_name='" + pro_name + '\'' +
                ", pro_weight=" + pro_weight +
                ", pro_color='" + pro_color + '\'' +
                ", pro_issued_=" + pro_issued_ +
                ", pro_price=" + pro_price +
                ", pro_product=" + pro_product +
                ", pro_describ='" + pro_describ + '\'' +
                ", pro_count=" + pro_count +
                ", kind_id=" + kind_id +
                ", brand_id=" + brand_id +
                ", pro_img='" + pro_img + '\'' +
                ", brand=" + brand +
                ", kind=" + kind +
                ", evaluateSet=" + evaluateSet +
                '}';
    }
}