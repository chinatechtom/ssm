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

  
    public User getUserByUserCode(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

	public List<User> getAllUser() {
		 
		return userMapper.getAllUser();
	}

	 
}
 
