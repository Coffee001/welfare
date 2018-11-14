package com.puan.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.puan.domain.User;
import com.puan.service.UserService;

@Controller
@RequestMapping("/user/")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping("insert")
	public String insertUser() {
		User user = new User();
		user.setId(1L);
		user.setUsername("cc");
		user.setPassword("123");
		userService.insertUser(user);
		System.out.println("come in");
		return "success";
	}

}
