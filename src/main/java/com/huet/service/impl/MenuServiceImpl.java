package com.huet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huet.dao.MenuMapper;
import com.huet.dao.UserMapper;
import com.huet.entity.MenuItem;
import com.huet.service.inter.IMenuService;

@Service("menuService")
public class MenuServiceImpl implements IMenuService{

    @Autowired
    private MenuMapper menuMapper; 
    
 
	@Override
	public List<MenuItem> getUserMenus(String userName) {
		return menuMapper.getUserMenus(userName);
	}

}
