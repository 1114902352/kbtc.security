package com.ai.secruity.dao;

import com.ai.secruity.model.RoleRes;
import com.ai.secruity.model.RoleResExample;
import java.util.List;

public interface RoleResMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleRes record);

    int insertSelective(RoleRes record);

    List<RoleRes> selectByExample(RoleResExample example);

    RoleRes selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleRes record);

    int updateByPrimaryKey(RoleRes record);
}