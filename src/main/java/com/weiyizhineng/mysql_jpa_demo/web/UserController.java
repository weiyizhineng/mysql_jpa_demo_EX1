package com.weiyizhineng.mysql_jpa_demo.web;

import com.weiyizhineng.mysql_jpa_demo.dao.Repository.UserRepository;
import com.weiyizhineng.mysql_jpa_demo.dao.entity.User;
//import com.weiyizhineng.mysql_jpa_demo.dao.entity.user_info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @作者： WEIYI
 * @创建时间： 2019/9/29 13:58
 * @包名： com.weiyizhineng.mysql_jpa_demo.web
 * @项目名称： mysql_jpa_demo
 * @类名： IntelliJ IDEA
 */
@Controller
@RequestMapping(path = "/demo")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path = "/add")
    public  void addNewUser(@RequestParam String name,@RequestParam String email)
    {
        //user_info n = new user_info();
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
    }

    @GetMapping(path = "/all")
    @ResponseBody
    public Iterable<User> getAllUserInfo(){
        return  userRepository.findAll();
    }
}
