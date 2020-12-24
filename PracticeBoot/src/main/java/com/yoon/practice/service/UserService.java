package com.yoon.practice.service;

import org.apache.ibatis.annotations.Mapper;

import com.yoon.practice.domain.User;

@Mapper
public interface UserService {
	
	public User getUser(String userId) throws Exception;

}
