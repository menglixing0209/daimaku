package org.lanqiao.mapper;

import org.lanqiao.entity.Kind;
import org.springframework.stereotype.Repository;

@Repository
public interface KindMapper {
    int deleteByPrimaryKeyKind(Long kind_id);

    int insertKind(Kind record);

    int insertSelectiveKind(Kind record);

    Kind selectByPrimaryKeyKind(Long kind_id);

    int updateByPrimaryKeySelectiveKind(Kind record);

    int updateByPrimaryKeyKind(Kind record);
}