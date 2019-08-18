package org.lanqiao.service;

import org.lanqiao.entity.*;

import java.util.List;

public interface MyService {
   /******************************************************************/

   int deleteByPrimaryKeyBrand(Long brand_id);

    int insertBrand(Brand record);

    int insertSelectiveBrand(Brand record);

    Brand selectByPrimaryKeyBrand(Long brand_id);

    int updateByPrimaryKeySelectiveBrand(Brand record);

    int updateByPrimaryKeyWithBLOBsBrand(Brand record);

    int updateByPrimaryKeyBrand(Brand record);

    /******************************************************************/

    int deleteByPrimaryKeyEvaluate(Long eva_id);

    int insertEvaluate(Evaluate record);

    int insertSelectiveEvaluate(Evaluate record);

    Evaluate selectByPrimaryKeyEvaluate(Long eva_id);

    int updateByPrimaryKeySelectiveEvaluate(Evaluate record);

    int updateByPrimaryKeyEvaluate(Evaluate record);

    /******************************************************************/

    int deleteByPrimaryKeyKind(Long kind_id);

    int insertKind(Kind record);

    int insertSelectiveKind(Kind record);

    Kind selectByPrimaryKeyKind(Long kind_id);

    int updateByPrimaryKeySelectiveKind(Kind record);

    int updateByPrimaryKeyKind(Kind record);

    /******************************************************************/

    int deleteByPrimaryKeyProduct(Long pro_id);

    int insertProduct(Product record);

    int insertSelectiveProduct(Product record);

    Product selectByPrimaryKeyProduct(Long pro_id);

    int updateByPrimaryKeySelectiveProduct(Product record);

    int updateByPrimaryKeyWithBLOBsProduct(Product record);

    int updateByPrimaryKeyProduct(Product record);

    /******************************************************************/

    int deleteByPrimaryKeyUsersafe(Long uesr_id);

    int insertUsersafe(Usersafe record);

    int insertSelectiveUsersafe(Usersafe record);

    Usersafe selectByPrimaryKeyUsersafe(Long uesr_id);

    int updateByPrimaryKeySelectiveUsersafe(Usersafe record);

    int updateByPrimaryKeyUsersafe(Usersafe record);

    /******************************************************************/
    List<Kind> selectAllKind();
    List<Brand> selectAllBrand();
    List<Product> selectAllProduct();
    List<Evaluate> selectAllEvaluate();
    List<Usersafe> selectAllUsersafe();

    Kind select_Kind_Product(Long kind_id);
    Brand select_Brand_Product(Long brand_id);
    List<Product> selectAllProductKBE();
 /******************************************************************/
   int countAllEvaluate();
 /******************************************************************/
}
