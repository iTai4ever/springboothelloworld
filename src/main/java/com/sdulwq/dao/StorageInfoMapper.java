package com.sdulwq.dao;

import com.sdulwq.pojo.StorageInfo;

public interface StorageInfoMapper {
    int deleteByPrimaryKey(String storagecode);

    int insert(StorageInfo record);

    int insertSelective(StorageInfo record);

    StorageInfo selectByPrimaryKey(String storagecode);

    int updateByPrimaryKeySelective(StorageInfo record);

    int updateByPrimaryKey(StorageInfo record);
}