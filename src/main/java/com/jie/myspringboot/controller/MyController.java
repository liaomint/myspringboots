package com.jie.myspringboot.controller;

import com.jie.myspringboot.dao.UserDao;
import com.jie.myspringboot.pojo.EUser;
import com.jie.myspringboot.service.EUserService;
import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;


import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class MyController {

    @Value("${timeout.app}")
    private String aa;

    @Resource
    private EUserService eUserService;

    @RequestMapping("/")
    public String toLogin(){
        return "login";
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public HashMap goToLogin(@RequestParam(value = "account") String account,@RequestParam(value = "password") String password){
        HashMap DataMap=new HashMap();
        System.out.println(account+password);
       EUser user=  eUserService.getUserInfo(account,password);
         if(user==null) {
             DataMap.put("error_code",-1);
             DataMap.put("error_msg","未查询到相关用户");
         }else{
             DataMap.put("error_code",0);
             DataMap.put("error_msg",user.getE_name());
         }
         System.out.println(DataMap.toString());
        return DataMap;
    }


    @RequestMapping("/out")
    @ResponseBody //将返回的对象JSON序列化
    public String out(){
        EUser user = eUserService.getUser();
        System.out.println(user.getE_name()+user.getE_account()+user.getE_intro()+user.getE_password());
        return aa;
    }

}
