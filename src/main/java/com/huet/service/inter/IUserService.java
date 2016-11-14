package com.huet.service.inter;

import java.util.List;

import com.huet.entity.User;

public interface IUserService {
 
 
    int deleteUser(String userName);
    int updateUser(User user);
    User getUser(String userName);
    
    int addUser(User user);
     
    List<User> getAllUser();
}
