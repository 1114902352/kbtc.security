package com.ai.secruity.dao;

import com.ai.secruity.model.OrgRes;
import com.ai.secruity.model.OrgResExample;
import java.util.List;

public interface OrgResMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrgRes record);

    int insertSelective(OrgRes record);

    List<OrgRes> selectByExample(OrgResExample example);

    OrgRes selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrgRes record);

    int updateByPrimaryKey(OrgRes record);
}