package com.huet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huet.dao.UserMapper;
import com.huet.entity.User;
import com.huet.service.inter.IUserService;

 
@Service("userService")
public class UserServiceImpl implements IUserService {

    /**
     * ʹ��@Autowiredע���עuserMapper������
     * ����Ҫʹ��UserMapperʱ��Spring�ͻ��Զ�ע��UserMapper
     */
    @Autowired
    private UserMapper userMapper;//ע��dao

    public void addUser(User user) {
        userMapper.insert(user);
    }

    public User getUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

	public List<User> getAllUser() {
		 
		return userMapper.getAllUser();
	}

	 
}
 
