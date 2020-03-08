package com.sdulwq.dao;

import com.sdulwq.pojo.FeedInfo;

public interface FeedInfoMapper {
    int deleteByPrimaryKey(String feedcode);

    int insert(FeedInfo record);

    int insertSelective(FeedInfo record);

    FeedInfo selectByPrimaryKey(String feedcode);

    int updateByPrimaryKeySelective(FeedInfo record);

    int updateByPrimaryKey(FeedInfo record);
}