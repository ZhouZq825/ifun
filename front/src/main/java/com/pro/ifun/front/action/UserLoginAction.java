package com.pro.ifun.front.action;

import com.pro.ifun.usercenter.service.UserInfoService;
import com.pro.ifun.usercenter.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/ifun/user")
public class UserLoginAction {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String userLoginPage(){
        UserInfoVo infoVo = new UserInfoVo();
        infoVo.setUsername("test");
        infoVo.setPassword("111111");
        this.userInfoService.saveUserInfo(infoVo);
        return "";
    }
}
