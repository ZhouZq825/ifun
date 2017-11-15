package com.pro.ifun.usercenter.service;

import com.pro.ifun.usercenter.dao.UserInfoDao;
import com.pro.ifun.usercenter.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveUserInfo(UserInfoVo userInfoVo){
        int record = this.userInfoDao.saveUserInfo(userInfoVo);
        System.out.print(record);
    }
}
