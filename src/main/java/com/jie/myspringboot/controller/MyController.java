package com.jie.myspringboot.controller;

import com.jie.myspringboot.dao.UserDao;
import com.jie.myspringboot.pojo.EUser;
import com.jie.myspringboot.service.EUserService;
import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class MyController {

    @Value("${timeout.app}")
    private String aa;

    private HashMap DataMap;
    @Resource
    private EUserService eUserService;

    @RequestMapping("/s")
    public String toLogin(){
        return "login";
    }


    @ResponseBody
    @RequestMapping(value="/aaa",consumes={"application/json"},method={RequestMethod.POST, RequestMethod.GET})
    public HashMap login(String account,String pass){
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


    @RequestMapping("/cz")
    public String toLuckdraw(){
        return "Luckdraw";
    }








/*

    @RequestMapping("/login" method = RequestMethod.POST)
    @ResponseBody
    public String login(String account,String password){
        EUser user= eUserService.getUserInfo(account,password);
        if(user==null){
            System.out.println("未查询到信息");
        }else{
            return("查询到信息:用户昵称是"+user.getE_name());
        }
        return "yes";
    }
*/

    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/out")
    @ResponseBody //将返回的对象JSON序列化
    public String out(){
   /*
   List<EUser> user;
        user = eUserService.getUser();
        System.out.println(user.toString());

    */
        return aa;
    }

}
