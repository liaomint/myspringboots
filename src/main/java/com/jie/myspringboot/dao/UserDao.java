package com.jie.myspringboot.dao;

import com.jie.myspringboot.pojo.EUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Mapper
public interface UserDao {
    public EUser getUserInfo();
}
