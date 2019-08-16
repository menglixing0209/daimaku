package org.lanqiao.service;

import org.lanqiao.entity.*;
import org.lanqiao.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImp implements MyService {


    /******************************************************************/
    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private EvaluateMapper evaluateMapper;

    @Autowired
    private  KindMapper kindMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private UsersafeMapper usersafeMapper;
    /******************************************************************/
    @Override
    public int deleteByPrimaryKeyBrand(Long brand_id) {
        return brandMapper.deleteByPrimaryKeyBrand(brand_id);
    }

    @Override
    public int insertBrand(Brand record) {
        return brandMapper.insertBrand(record);
    }

    @Override
    public int insertSelectiveBrand(Brand record) {
        return brandMapper.insertSelectiveBrand(record);
    }

    @Override
    public Brand selectByPrimaryKeyBrand(Long brand_id) {
        return brandMapper.selectByPrimaryKeyBrand(brand_id);
    }

    @Override
    public int updateByPrimaryKeySelectiveBrand(Brand record) {
        return brandMapper.updateByPrimaryKeySelectiveBrand(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBsBrand(Brand record) {
        return brandMapper.updateByPrimaryKeyWithBLOBsBrand(record);
    }

    @Override
    public int updateByPrimaryKeyBrand(Brand record) {
        return brandMapper.updateByPrimaryKeyBrand(record);
    }

    /******************************************************************/
    @Override
    public int deleteByPrimaryKeyEvaluate(Long eva_id) {
        return evaluateMapper.deleteByPrimaryKeyEvaluate(eva_id);
    }

    @Override
    public int insertEvaluate(Evaluate record) {
        return evaluateMapper.insertEvaluate(record);
    }

    @Override
    public int insertSelectiveEvaluate(Evaluate record) {
        return evaluateMapper.insertSelectiveEvaluate(record);
    }

    @Override
    public Evaluate selectByPrimaryKeyEvaluate(Long eva_id) {
        return evaluateMapper.selectByPrimaryKeyEvaluate(eva_id);
    }

    @Override
    public int updateByPrimaryKeySelectiveEvaluate(Evaluate record) {
        return evaluateMapper.updateByPrimaryKeySelectiveEvaluate(record);
    }

    @Override
    public int updateByPrimaryKeyEvaluate(Evaluate record) {
        return evaluateMapper.updateByPrimaryKeyEvaluate(record);
    }

    /******************************************************************/
    @Override
    public int deleteByPrimaryKeyKind(Long kind_id) {
        return kindMapper.deleteByPrimaryKeyKind(kind_id);
    }

    @Override
    public int insertKind(Kind record) {
        return kindMapper.insertKind(record);
    }

    @Override
    public int insertSelectiveKind(Kind record) {
        return kindMapper.insertSelectiveKind(record);
    }

    @Override
    public Kind selectByPrimaryKeyKind(Long kind_id) {
        return kindMapper.selectByPrimaryKeyKind(kind_id);
    }

    @Override
    public int updateByPrimaryKeySelectiveKind(Kind record) {
        return kindMapper.updateByPrimaryKeySelectiveKind(record);
    }

    @Override
    public int updateByPrimaryKeyKind(Kind record) {
        return kindMapper.updateByPrimaryKeyKind(record);
    }

    /******************************************************************/
    @Override
    public int deleteByPrimaryKeyProduct(Long pro_id) {
        return productMapper.deleteByPrimaryKeyProduct(pro_id);
    }

    @Override
    public int insertProduct(Product record) {
        return productMapper.insertProduct(record);
    }

    @Override
    public int insertSelectiveProduct(Product record) {
        return productMapper.insertSelectiveProduct(record);
    }

    @Override
    public Product selectByPrimaryKeyProduct(Long pro_id) {
        return productMapper.selectByPrimaryKeyProduct(pro_id);
    }

    @Override
    public int updateByPrimaryKeySelectiveProduct(Product record) {
        return productMapper.updateByPrimaryKeySelectiveProduct(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBsProduct(Product record) {
        return productMapper.updateByPrimaryKeyWithBLOBsProduct(record);
    }

    @Override
    public int updateByPrimaryKeyProduct(Product record) {
        return productMapper.updateByPrimaryKeyProduct(record);
    }

    /******************************************************************/
    @Override
    public int deleteByPrimaryKeyUsersafe(Long uesr_id) {
        return usersafeMapper.deleteByPrimaryKeyUsersafe(uesr_id);
    }

    @Override
    public int insertUsersafe(Usersafe record) {
        return usersafeMapper.insertUsersafe(record);
    }

    @Override
    public int insertSelectiveUsersafe(Usersafe record) {
        return usersafeMapper.insertSelectiveUsersafe(record);
    }

    @Override
    public Usersafe selectByPrimaryKeyUsersafe(Long uesr_id) {
        return usersafeMapper.selectByPrimaryKeyUsersafe(uesr_id);
    }

    @Override
    public int updateByPrimaryKeySelectiveUsersafe(Usersafe record) {
        return usersafeMapper.updateByPrimaryKeySelectiveUsersafe(record);
    }

    @Override
    public int updateByPrimaryKeyUsersafe(Usersafe record) {
        return usersafeMapper.updateByPrimaryKeyUsersafe(record);
    }

    /******************************************************************/
}
