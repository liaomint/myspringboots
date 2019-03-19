package com.jie.myspringboot.service;

import com.jie.myspringboot.pojo.EUser;

import java.util.List;

public interface EUserService {
    public List<EUser> getUser();

    public EUser getUserInfo(String account,String password);
}
