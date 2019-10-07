package com.weiyizhineng.mysql_jpa_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @作者： WEIYI
 * @创建时间： 2019/10/7 13:56
 * @包名： com.weiyizhineng.mysql_jpa_demo.controller
 * @项目名称： mysql_jpa_demo
 * @类名： IntelliJ IDEA -
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "欢迎您，来到重庆唯仪！";
    }
    //@GetMapping(path = "/success")
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
