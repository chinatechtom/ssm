package com.huet.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huet.dao.MenuMapper;
import com.huet.dao.UserMapper;
import com.huet.entity.MenuItem;
import com.huet.service.inter.IMenuService;

@Service("menuService")
public class MenuServiceImpl implements IMenuService {

	@Autowired
	private MenuMapper menuMapper;

	@Override
	public List<MenuItem> getUserMenus(String userName) {
		return menuMapper.getUserMenus(userName);
	}

	public String makeJsonMenu(List<MenuItem> menuItemList) {

		// StringBuilder sb = new StringBuilder("{\"menus\":[");
		StringBuilder sb = new StringBuilder("[");
		MenuItem lastMenuItem = null;
		ArrayList<MenuItem> menuList = new ArrayList<MenuItem>();

		for (MenuItem item : menuItemList) {

			if (menuList.size() >= 1) {
				lastMenuItem = menuList.get(menuList.size() - 1);
			}

			if (null != lastMenuItem && !item.getMenuLevel().substring(0, item.getMenuLevel().length() - 2)
					.equals(lastMenuItem.getMenuLevel())) {
				sb.delete(sb.length() - 1, sb.length());
				sb.append("]},");
				if (menuList.size() >= 1) {
					menuList.remove(menuList.size() - 1);
				}
			}

			if ("1".equals(item.getIsFunction())) {
				sb.append("{");
				sb.append("\"menu_name\":" + "\"" + item.getMenuName() + "\",");
				sb.append("\"menu_level\":" + "\"" + item.getMenuLevel() + "\",");
				sb.append("\"is_function\":" + "\"" + item.getIsFunction() + "\",");

				sb.append("\"function_id\":" + "\"" + item.getFunctionId() + "\"");
				sb.append("}");
				sb.append(",");

			} else {
				if (menuList.size() >= 1) {
					for (int i = menuList.size() - 1; i >= 0; i--) {
						//System.out.println(menuList.get(i).getMenuLevel().length() +"----"+item.getMenuLevel().length());
						if (menuList.get(i).getMenuLevel().length() == item.getMenuLevel().length()) {
							 
							int size = menuList.size();
							for (int j = size - 1; j >= i; j--) {
								sb.delete(sb.length() - 1, sb.length());
								sb.append("]},");
								menuList.remove(j); 
							}
							break;
						}
						 
					}
				}

				sb.append("{");
				sb.append("\"menu_name\":" + "\"" + item.getMenuName() + "\",");
				sb.append("\"menu_level\":" + "\"" + item.getMenuLevel() + "\",");
				sb.append("\"is_function\":" + "\"" + item.getIsFunction() + "\",");
				sb.append("\"sub_menus\":[");
				// lastMenuItem = item;
				menuList.add(item);
			}
		}
		sb.delete(sb.length() - 1, sb.length());
		for (int i = 0; i < menuList.size(); i++) {
			sb.append("]}");
		}
		sb.append("]");
		return sb.toString();

	}

}
