package org.lanqiao.mapper;

import org.lanqiao.entity.Evaluate;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluateMapper {
    int deleteByPrimaryKeyEvaluate(Long eva_id);

    int insertEvaluate(Evaluate record);

    int insertSelectiveEvaluate(Evaluate record);

    Evaluate selectByPrimaryKeyEvaluate(Long eva_id);

    int updateByPrimaryKeySelectiveEvaluate(Evaluate record);

    int updateByPrimaryKeyEvaluate(Evaluate record);
}