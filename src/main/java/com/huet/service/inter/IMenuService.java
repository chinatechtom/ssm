package com.huet.service.inter;
 
import java.util.List;

import com.huet.entity.MenuItem;

public interface IMenuService {
 
	
	public List<MenuItem> getUserMenus(String userName) ;
	
	public String makeJsonMenu(List<MenuItem> menuItemList) ;
}
