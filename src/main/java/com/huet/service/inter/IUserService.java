package com.huet.service.inter;

import java.util.List;

import com.huet.entity.User;

public interface IUserService {
    /**
     * ����û�
     * @param user
     */
    void addUser(User user);
    
    /**
     * �����û�id��ȡ�û�
     * @param userId
     * @return
     */
    User getUserById(String userId);
     
    List<User> getAllUser();
}
