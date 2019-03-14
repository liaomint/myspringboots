package com.jie.myspringboot.service.impl;

import com.jie.myspringboot.dao.UserDao;
import com.jie.myspringboot.pojo.EUser;
import com.jie.myspringboot.service.EUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EUserServiceImpl implements EUserService {
    @Resource
    private UserDao userDao=null;

    @Override
    public EUser getUser() {
        return  userDao.getUserInfo();
    }
}
