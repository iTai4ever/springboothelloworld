package com.sdulwq.dao;

import com.sdulwq.pojo.FeedapplyInfo;

public interface FeedapplyInfoMapper {
    int insert(FeedapplyInfo record);

    int insertSelective(FeedapplyInfo record);
}