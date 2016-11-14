package com.huet.dao;

import java.util.List;

import com.huet.entity.User;

public interface UserMapper {
	
	    int deleteUser(String userName);

	    int addUser(User record); 

	    int updateUser(User userName);
	    
	    User selectByUserName(String userName);
	    List<User> getAllUser();
	     
}
