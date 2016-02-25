package com.ai.secruity.dao;

import com.ai.secruity.model.ResInfo;
import com.ai.secruity.model.ResInfoExample;
import java.util.List;

public interface ResInfoMapper {
    int deleteByPrimaryKey(Long resId);

    int insert(ResInfo record);

    int insertSelective(ResInfo record);

    List<ResInfo> selectByExample(ResInfoExample example);

    ResInfo selectByPrimaryKey(Long resId);

    int updateByPrimaryKeySelective(ResInfo record);

    int updateByPrimaryKey(ResInfo record);
}