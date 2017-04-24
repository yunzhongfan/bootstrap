package org.cj.dao.impl;

import org.cj.dao.UserDao;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {
	
	static{
			System.out.println("初始化Dao!");
		
	}

}
