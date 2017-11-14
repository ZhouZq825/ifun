package com.pro.ifun.front.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/ifun/user")
public class UserLoginAction {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String userLoginPage(){
        return "";
    }
}
