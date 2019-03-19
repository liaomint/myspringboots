package com.jie.myspringboot.controller;

import com.jie.myspringboot.pojo.EUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jie.myspringboot.service.EUserService;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.HashMap;

@RestController()
@RequestMapping("/go")
public class login {

    @Resource
    private EUserService eUserService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public HashMap login(String account,String password){

        HashMap< String,String> hashMap = new HashMap< String,String>();
        hashMap.put("one","two");

/*
        EUser user= eUserService.getUserInfo(account,password);
        if(user==null){
            System.out.println("未查询到信息");
        }else{
            return("查询到信息:用户昵称是"+user.getE_name());
        }*/
        return hashMap;
    }
}
