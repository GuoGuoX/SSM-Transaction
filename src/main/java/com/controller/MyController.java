package com.controller;

import com.bean.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @Autowired
    public UserService userService;


//    测试事务回滚
    @RequestMapping("/mydemo")
    @ResponseBody
    public String demo(){
    	System.out.println("demo执行............");
        userService.insertTestTransactional();
        return "nihao";
    }


}
