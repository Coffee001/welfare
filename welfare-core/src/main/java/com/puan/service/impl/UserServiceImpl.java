package com.puan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.puan.dao.UserDao;
import com.puan.domain.User;
import com.puan.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

}
