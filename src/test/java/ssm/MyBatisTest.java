package ssm;

import java.util.Date;
import java.util.List;
import java.util.UUID;
//import me.gacl.service.UserServiceI;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huet.entity.MenuItem;
import com.huet.entity.User;
import com.huet.service.inter.IMenuService;
import com.huet.service.inter.IUserService;

public class MyBatisTest {

	private IUserService userService ;
	private IMenuService menuService ;
	 
	@Before
	public void before() {
		 
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml", "spring-mybatis.xml" });
	
		userService = (IUserService) ac.getBean("userService");
		menuService = (IMenuService) ac.getBean("menuService");
	}

	@Test
	public void testAddUser() {
		// ApplicationContext ac = new ClassPathXmlApplicationContext(new
		// String[]{"spring.xml","spring-mybatis.xml"});
		// UserServiceI userService = (UserServiceI) ac.getBean("userService");
		User user = null;
		String userId =null;
		List<User> list = userService.getAllUser();
		for (User temp : list) {
			System.out.println(temp.getUserName());
		}
		 
		userId = list.get(0).getUserCode();
		
		
		user = userService.getUserByUserCode("admin");

		System.out.println(user.getUserName());
		
		List<MenuItem> listMenu = menuService.getUserMenus("admin");
		
		for(MenuItem menu :listMenu){
			System.out.println(menu.getMenuName());
		}
		
		

	}

}