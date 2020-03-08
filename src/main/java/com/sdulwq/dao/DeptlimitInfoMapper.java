package com.sdulwq.dao;

import com.sdulwq.pojo.DeptlimitInfo;

public interface DeptlimitInfoMapper {
    int insert(DeptlimitInfo record);

    int insertSelective(DeptlimitInfo record);
}