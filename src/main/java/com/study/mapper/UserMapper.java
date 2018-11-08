package com.study.mapper;

import com.study.model.User;
import com.study.util.MyMapper;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends MyMapper<User> {

    public User selectByUserNameAndPassword(@Param("name") String name,@Param("pwd") String pwd);

}