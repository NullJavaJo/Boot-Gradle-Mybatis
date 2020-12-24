package com.yoon.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yoon.practice.dao.UserDaoImpl;
import com.yoon.practice.domain.User;
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	@Qualifier("userDaoImpl")
	UserDaoImpl userDaoImpl;

	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User getUser(String userId) throws Exception {
		// TODO Auto-generated method stub
		
		return userDaoImpl.getUser(userId);
	}

}
