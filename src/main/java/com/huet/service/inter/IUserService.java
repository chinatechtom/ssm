package com.huet.service.inter;

import java.util.List;

import com.huet.entity.User;

public interface IUserService {
    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);
    
    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    User getUserById(String userId);
     
    List<User> getAllUser();
}
