package com.demo.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.user.mapper.UsersMapper;
import com.demo.user.pojo.Users;

@Service
public class UserServiceImpl implements UserService {
@Autowired
private UsersMapper usersMapper;

@Override
public Users selectByUsers(String username, String password) {
	return usersMapper.selectByUsers(username, password);
}

@Override
public List<Users> listAll() {
	// TODO Auto-generated method stub
	List<Users> list = usersMapper.listAll();
	return list;
}

@Override
public int insert(Users record) {
	// TODO Auto-generated method stub
	return usersMapper.insert(record);
}







}
