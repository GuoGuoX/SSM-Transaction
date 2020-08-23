package com.mapper;

import com.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface UserMapper{
    @Update("UPDATE TEST SET AGE = #{age},name=#{name} WHERE ID = 1")
    public void update(User user);
    @Insert("INSERT INTO TEST(NAME,GENDER,AGE) VALUES('tony','男',#{age})")
    public void addUser(User user);


}
