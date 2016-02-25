package com.ai.secruity.dao;

import com.ai.secruity.model.UserOrg;
import com.ai.secruity.model.UserOrgExample;
import java.util.List;

public interface UserOrgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserOrg record);

    int insertSelective(UserOrg record);

    List<UserOrg> selectByExample(UserOrgExample example);

    UserOrg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserOrg record);

    int updateByPrimaryKey(UserOrg record);
}