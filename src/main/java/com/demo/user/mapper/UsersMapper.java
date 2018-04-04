package com.demo.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.demo.user.pojo.Users;

public interface UsersMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Users record);

	int insertSelective(Users record);

	Users selectByPrimaryKey(Integer id);

	Users selectByUsers(@Param("username") String username, @Param("password") String password);


	int updateByPrimaryKeySelective(Users record);

	int updateByPrimaryKey(Users record);

	List<Users> listAll();
}