package com.ai.secruity.dao;

import com.ai.secruity.model.OrgInfo;
import com.ai.secruity.model.OrgInfoExample;
import java.util.List;

public interface OrgInfoMapper {
    int deleteByPrimaryKey(Long orgId);

    int insert(OrgInfo record);

    int insertSelective(OrgInfo record);

    List<OrgInfo> selectByExample(OrgInfoExample example);

    OrgInfo selectByPrimaryKey(Long orgId);

    int updateByPrimaryKeySelective(OrgInfo record);

    int updateByPrimaryKey(OrgInfo record);
}