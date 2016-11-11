package ssm;

import java.util.List;

//import me.gacl.service.UserServiceI;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huet.entity.MenuItem;
import com.huet.service.inter.IMenuService;

public class MenuTest {
 
	private IMenuService menuService ;
	 
	@Before
	public void before() {
		 
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[] { "spring.xml", "spring-mybatis.xml" });
  
		menuService = (IMenuService) ac.getBean("menuService");
	}

	@Test
	public void testMakeMenu() {
		 
		
		List<MenuItem> listMenu = menuService.getUserMenus("admin");
		
		String jsonMenu = menuService.makeJsonMenu(listMenu);
		

		System.out.println(jsonMenu);
		//JSONObject resultJson = JSONObject.fromObject(jsonMenu);
		 
		 
	 
	}

}