package com.sdulwq.controller;

import com.sdulwq.common.Const;
import com.sdulwq.common.ServerReponse;
import com.sdulwq.pojo.UserInfo;
import com.sdulwq.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@Component
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService iUserService;
    /**
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public ServerReponse<UserInfo> login(String username, String password, HttpSession session){
        //service-->mybatis-->dao

        ServerReponse<UserInfo> reponse = iUserService.login(username,password);
        if(reponse.isSuccess()){
            session.setAttribute(Const.CURRENT_USER,reponse.getData());
        }
        return reponse;
    }
}
