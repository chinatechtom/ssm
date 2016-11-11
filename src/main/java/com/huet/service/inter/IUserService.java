package com.huet.service.inter;

import java.util.List;

import com.huet.entity.User;

public interface IUserService {
 
 
    User getUserByUserCode(String userId);
     
    List<User> getAllUser();
}
