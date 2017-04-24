package org.cj.service.impl;

import org.cj.dao.UserDao;
import org.cj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {
	
	
	@Autowired
	private  UserDao userDao;
	
	
	static {

		System.out.println("UserServiceImpl被初始化");
	}
}
