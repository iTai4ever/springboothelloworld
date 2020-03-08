package com.sdulwq.dao;

import com.sdulwq.pojo.FeedClass;

public interface FeedClassMapper {
    int insert(FeedClass record);

    int insertSelective(FeedClass record);
}