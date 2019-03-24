package com.jie.myspringboot.dao;

import com.jie.myspringboot.pojo.EUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    public EUser infoList();
    public EUser getUserInfo(String account,String password);

}
