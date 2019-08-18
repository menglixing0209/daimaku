package org.lanqiao.mapper;

import org.lanqiao.entity.Brand;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandMapper {
    int deleteByPrimaryKeyBrand(Long brand_id);

    int insertBrand(Brand record);

    int insertSelectiveBrand(Brand record);

    Brand selectByPrimaryKeyBrand(Long brand_id);

    int updateByPrimaryKeySelectiveBrand(Brand record);

    int updateByPrimaryKeyWithBLOBsBrand(Brand record);

    int updateByPrimaryKeyBrand(Brand record);

    List<Brand> selectAllBrand();

    Brand select_Brand_Product(Long brand_id);
}