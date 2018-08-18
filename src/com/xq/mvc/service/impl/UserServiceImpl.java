package com.xq.mvc.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.xq.mvc.dao.UserDao;
import com.xq.mvc.pojo.User;
import com.xq.mvc.servlce.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	UserDao userDao;
	
	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}

}
