package com.huet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huet.dao.UserMapper;
import com.huet.entity.User;
import com.huet.service.inter.IUserService;

 
@Service("userService")
public class UserServiceImpl implements IUserService {

     
    @Autowired
    private UserMapper userMapper;

	@Override
	public int deleteUser(String userName) {
		return  userMapper.deleteUser(userName) ;
		
	}

	@Override
	public int updateUser(User user) { 
		return userMapper.updateUser(user) ;
	}

	@Override
	public User getUser(String userName) { 
		return userMapper.selectByUserName(userName) ;
	}

	@Override
	public int addUser(User user) { 
		return userMapper.addUser( user);
	}

	@Override
	public List<User> getAllUser() { 
		return userMapper.getAllUser();
	} 
 
}
 
