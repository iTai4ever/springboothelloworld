package com.sdulwq.service.impl;

import com.sdulwq.common.ServerReponse;
import com.sdulwq.dao.UserInfoMapper;
import com.sdulwq.pojo.UserInfo;
import com.sdulwq.service.IUserService;
import com.sdulwq.util.MD5Util;
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
        String md5Password = MD5Util.MD5EncodeUtf8(password);
        UserInfo userInfo = userInfoMapper.selectLogin(username,password);
        if(userInfo == null){
            return ServerReponse.createByErrorMessage("密码错误！");
        }
        userInfo.setUserPass(StringUtils.EMPTY);
        return ServerReponse.createBySuccess("登录成功",userInfo);
    }

    public ServerReponse<String> register(UserInfo userInfo) {
        int resultCount = userInfoMapper.checkUsername(userInfo.getUserName());
        if (resultCount > 0) {
            return ServerReponse.createByErrorMessage("用户名已存在！");
        }
        userInfo.setUserPass(MD5Util.MD5EncodeUtf8(userInfo.getUserPass()));
        resultCount = userInfoMapper.insert(userInfo);
        if(resultCount==0){
            return ServerReponse.createByErrorMessage("注册失败！");
        }
        return ServerReponse.createBySuccessMessage("注册成功！");
    }
 }
