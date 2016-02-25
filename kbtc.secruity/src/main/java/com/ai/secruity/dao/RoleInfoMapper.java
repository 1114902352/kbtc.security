package com.ai.secruity.dao;

import com.ai.secruity.model.RoleInfo;
import com.ai.secruity.model.RoleInfoExample;
import java.util.List;

public interface RoleInfoMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(RoleInfo record);

    int insertSelective(RoleInfo record);

    List<RoleInfo> selectByExample(RoleInfoExample example);

    RoleInfo selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(RoleInfo record);

    int updateByPrimaryKey(RoleInfo record);
}