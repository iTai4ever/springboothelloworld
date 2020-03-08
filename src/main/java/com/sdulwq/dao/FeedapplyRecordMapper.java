package com.sdulwq.dao;

import com.sdulwq.pojo.FeedapplyRecord;

public interface FeedapplyRecordMapper {
    int deleteByPrimaryKey(String applycode);

    int insert(FeedapplyRecord record);

    int insertSelective(FeedapplyRecord record);

    FeedapplyRecord selectByPrimaryKey(String applycode);

    int updateByPrimaryKeySelective(FeedapplyRecord record);

    int updateByPrimaryKey(FeedapplyRecord record);
}