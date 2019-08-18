package org.lanqiao.entity;

import java.util.List;
import java.util.Set;

public class Kind {
    private Long kind_id;

    private String kind_name;

    private Set<Product> productSet;

    public Long getKind_id() {
        return kind_id;
    }

    public void setKind_id(Long kind_id) {
        this.kind_id = kind_id;
    }

    public String getKind_name() {
        return kind_name;
    }

    public void setKind_name(String kind_name) {
        this.kind_name = kind_name == null ? null : kind_name.trim();
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }

    /***********************************************************************************/



    /***********************************************************************************/

    @Override
    public String toString() {
        return "Kind{" +
                "kind_id=" + kind_id +
                ", kind_name='" + kind_name + '\'' +
                ", productSet=" + productSet +
                '}';
    }
}