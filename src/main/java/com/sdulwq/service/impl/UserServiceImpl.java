package com.sdulwq.service.impl;

import com.sdulwq.common.ServerReponse;
import com.sdulwq.dao.UserInfoMapper;
import com.sdulwq.pojo.UserInfo;
import com.sdulwq.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public ServerReponse<UserInfo> login(String username, String password) {
        int resultCount = userInfoMapper.checkUsername(username);
        if (resultCount==0){
            return ServerReponse.createByErrorMessage("用户名不存在！");
        }

        //todo 密码登录MD5

        UserInfo userInfo = userInfoMapper.selectLogin(username,password);
        if(userInfo == null){
            return ServerReponse.createByErrorMessage("密码错误！");
        }
        userInfo.setUserPass(StringUtils.EMPTY);
        return ServerReponse.createBySuccess("登录成功",userInfo);
    }
}
