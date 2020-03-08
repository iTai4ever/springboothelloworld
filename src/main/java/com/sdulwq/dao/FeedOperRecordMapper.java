package com.sdulwq.dao;

import com.sdulwq.pojo.FeedOperRecord;

public interface FeedOperRecordMapper {
    int deleteByPrimaryKey(String recordid);

    int insert(FeedOperRecord record);

    int insertSelective(FeedOperRecord record);

    FeedOperRecord selectByPrimaryKey(String recordid);

    int updateByPrimaryKeySelective(FeedOperRecord record);

    int updateByPrimaryKey(FeedOperRecord record);
}