package com.sdulwq.dao;

import com.sdulwq.pojo.FeedOperInfo;

public interface FeedOperInfoMapper {
    int insert(FeedOperInfo record);

    int insertSelective(FeedOperInfo record);
}