package com.yoon.practice.dao;

import com.yoon.practice.domain.User;

public interface UserDao {
	
	
	public User getUser(String userId) throws Exception;
	
	
}
