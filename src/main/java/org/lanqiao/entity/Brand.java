package org.lanqiao.entity;

public class Brand {
    private Long brand_id;

    private String brand_name;

    private String brand_img;

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name == null ? null : brand_name.trim();
    }

    public String getBrand_img() {
        return brand_img;
    }

    public void setBrand_img(String brand_img) {
        this.brand_img = brand_img == null ? null : brand_img.trim();
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brand_id=" + brand_id +
                ", brand_name='" + brand_name + '\'' +
                ", brand_img='" + brand_img + '\'' +
                '}';
    }
}