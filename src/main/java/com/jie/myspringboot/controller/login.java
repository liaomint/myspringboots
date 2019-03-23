package com.jie.myspringboot.controller;

import com.jie.myspringboot.pojo.EUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.jie.myspringboot.service.EUserService;


import javax.annotation.Resource;
import java.util.HashMap;

@RestController()

public class login {
    private HashMap DataMap;

    @Resource
    private EUserService eUserService;


    @ResponseBody
    public HashMap login(@PathVariable(value = "account") String account,@PathVariable(value = "pass") String pass){
        EUser user =eUserService.getUserInfo(account,pass);
        if (user==null)
        {
            DataMap.put("erroinfo",-1);
            DataMap.put("erromsg","未查询到相关用户信息");
        }
        else{
            DataMap.put("erroinfo",0);
         //   DataMap.put("erromsg","查询到用户"+user.getE_name());
        }
        return DataMap;
    }



}
