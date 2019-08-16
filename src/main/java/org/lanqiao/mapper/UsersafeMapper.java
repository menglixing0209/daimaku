package org.lanqiao.mapper;

import org.lanqiao.entity.Usersafe;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersafeMapper {
    int deleteByPrimaryKeyUsersafe(Long uesr_id);

    int insertUsersafe(Usersafe record);

    int insertSelectiveUsersafe(Usersafe record);

    Usersafe selectByPrimaryKeyUsersafe(Long uesr_id);

    int updateByPrimaryKeySelectiveUsersafe(Usersafe record);

    int updateByPrimaryKeyUsersafe(Usersafe record);
}