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
		 
		User user = null;
		String userName =null;
		List<User> list = userService.getAllUser();
		for (User temp : list) {
			System.out.println(temp.getUserName());
		}
		 
		if(list.size()>0){
			userName = list.get(0).getUserName();
		}
		
		if( null == userName){
			user = new User();
			user.setUserName("test");
			user.setAddress("111");
			user.setCheckLoginPassword("1234565");
			user.setCheckTradePassword("1234545");
			user.setEmail("111qqcom");
			user.setLoginPassword("111111");
			user.setMobile("11111");
			user.setRealName("xxxxx");
			user.setReference("hxx");
			user.setTradePassword("11111");
			user.setWeiChat("xxxx");
			user.setDate("20161115");
			user.setTime("10:40:00");
			
			userService.addUser(user);
		}
		
		user = userService.getUser("test");

		System.out.println(user.getUserName());
		

	}

}