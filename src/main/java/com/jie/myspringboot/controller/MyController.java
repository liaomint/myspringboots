package com.jie.myspringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


@Controller
public class MyController {

    @Value("${timeout.app}")
    private String aa;


    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("/out")
    @ResponseBody //将返回的对象JSON序列化
    public String out(Date date){

        System.out.println("这是一个测试");

     return aa;
    }

}
