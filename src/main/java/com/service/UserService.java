package com.service;

import com.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * 测试事务回滚
 * 注解@Transactional (propagation = Propagation.REQUIRED, rollbackFor = Throwable.class)很重要,
 * 现在只要该方法出现了异常就会发生回滚
 */
@Service


public class UserService {
    @Autowired
    public com.mapper.UserMapper userMapper;

//    @Transactional
    public void insertTestTransactional(){
        User u = null;
            System.out.println("demo方法执行...");
            u = new User();
            u.setAge(11);
            u.setName("hh");
            u.setGender("男");
            userMapper.addUser(u);
        throw new RuntimeException();


    }
}
