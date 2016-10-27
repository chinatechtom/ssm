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
	 * ���before���������еĲ��Է���֮ǰִ�У�����ִֻ��һ�� ������Junit��Ԫ����ʱһЩ��ʼ��������������������������
	 * ������before���������ʼ��ApplicationContext��userService
	 */
	@Before
	public void before() {
		// ʹ��"spring.xml"��"spring-mybatis.xml"�����������ļ�����Spring������
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml", "spring-mybatis.xml" });
		// ��Spring�����и���bean��idȡ������Ҫʹ�õ�userService����
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
			user.setUserName("xdp");
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