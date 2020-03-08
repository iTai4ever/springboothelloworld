package com.sdulwq.dao;

import com.sdulwq.pojo.FeedStore;

public interface FeedStoreMapper {
    int insert(FeedStore record);

    int insertSelective(FeedStore record);
}