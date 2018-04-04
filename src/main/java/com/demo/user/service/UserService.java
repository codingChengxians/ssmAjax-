package com.demo.user.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demo.user.pojo.Users;


public interface UserService {
    Users selectByUsers(@Param("username")String username,@Param("password")String password);
    List<Users> listAll();
	int insert(Users record);
}
