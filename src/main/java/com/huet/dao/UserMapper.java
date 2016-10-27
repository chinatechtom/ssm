package com.huet.dao;

import java.util.List;

import com.huet.entity.User;

public interface UserMapper {
	
	    int deleteByPrimaryKey(String userId);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(String userId);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);
	    
	    List<User> getAllUser();
	     
}
