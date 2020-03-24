package com.sdulwq.service;

import com.sdulwq.common.ServerReponse;
import com.sdulwq.pojo.UserInfo;

public interface IUserService {
    ServerReponse<UserInfo> login(String username, String password);

    ServerReponse<String> register(UserInfo userInfo);
}
