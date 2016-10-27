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
	/**
	 * 这个before方法在所有的测试方法之前执行，并且只执行一次 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
	 * 比如在before方法里面初始化ApplicationContext和userService
	 */
	@Before
	public void before() {
		// 使用"spring.xml"和"spring-mybatis.xml"这两个配置文件创建Spring上下文
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml", "spring-mybatis.xml" });
		// 从Spring容器中根据bean的id取出我们要使用的userService对象
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
		if(list.size() <= 0){
			user = new User();
			user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
			user.setUserName("白虎神皇xdp");
			user.setUserSalary(10000D);
			userService.addUser(user);
		}else{
			userId = list.get(0).getUserId();
		}
		
		user = userService.getUserById("5cd96eb8854142e6abc09730a072bc09");

		System.out.println(user.getUserName());
		
		List<MenuItem> listMenu = menuService.getUserMenus("admin");
		
		for(MenuItem menu :listMenu){
			System.out.println(menu.getMenuName());
		}
		
		

	}

}