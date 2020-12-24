package com.yoon.practice.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yoon.practice.domain.User;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	SqlSession sqlSession;

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public User getUser(String userId) throws Exception {
		// TODO Auto-generated method stub
		
		return sqlSession.selectOne("UserMapper.getUser");
	}

}
