package org.lanqiao.mapper;

import org.lanqiao.entity.Kind;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KindMapper {
    int deleteByPrimaryKeyKind(Long kind_id);

    int insertKind(Kind record);

    int insertSelectiveKind(Kind record);

    Kind selectByPrimaryKeyKind(Long kind_id);

    int updateByPrimaryKeySelectiveKind(Kind record);

    int updateByPrimaryKeyKind(Kind record);

    /***********************************************************************************/

    List<Kind> selectAllKind();

    Kind select_Kind_Product(Long kind_id);

    /***********************************************************************************/
}