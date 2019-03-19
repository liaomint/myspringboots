package com.jie.myspringboot.dao;

import com.jie.myspringboot.pojo.EUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public List<EUser> getUserInfo();

    public EUser getUserInfos(String account,String password);

}
