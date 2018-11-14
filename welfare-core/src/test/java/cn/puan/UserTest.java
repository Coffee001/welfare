package cn.puan;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.puan.domain.User;
import com.puan.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class UserTest {

	@Autowired
	private UserService userService;
	
	@Test
	public void addUser() {
		User user = new User();
		user.setId(1L);
		user.setUsername("coffee01");
		user.setPassword("123456");
		userService.insertUser(user);
	}

	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}
}
