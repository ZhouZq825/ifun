package com.pro.ifun.usercenter.dao;

import com.pro.ifun.usercenter.vo.UserInfoVo;
import org.apache.ibatis.annotations.Param;

public interface UserInfoDao {
    int saveUserInfo(@Param("vo") UserInfoVo vo);
}
