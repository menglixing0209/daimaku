package org.lanqiao.mapper;

import org.lanqiao.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKeyProduct(Long pro_id);

    int insertProduct(Product record);

    int insertSelectiveProduct(Product record);

    Product selectByPrimaryKeyProduct(Long pro_id);

    int updateByPrimaryKeySelectiveProduct(Product record);

    int updateByPrimaryKeyWithBLOBsProduct(Product record);

    int updateByPrimaryKeyProduct(Product record);

    List<Product> selectAllProduct();

    List<Product> selectAllProductKBE();
}