package com.huet.dao;

import java.util.List;

import com.huet.entity.MenuItem;
import com.huet.entity.User;

public interface MenuMapper {
	  List<MenuItem> getUserMenus(String userCode); 
}
