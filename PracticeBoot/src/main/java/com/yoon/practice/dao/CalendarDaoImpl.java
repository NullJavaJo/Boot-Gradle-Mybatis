package com.yoon.practice.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yoon.practice.domain.Calendar;

@Repository("calendarDaoImpl")
public class CalendarDaoImpl implements CalendarDao {

	@Autowired
	SqlSession sqlSession;
	public CalendarDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCalendar(Calendar calendar) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.insert("CalendarMapper.addCalendar",calendar);
		
	}

	@Override
	public Calendar getCalendar(String subject) throws Exception {
		// TODO Auto-generated method stub
		
		return sqlSession.selectOne("CalendarMapper.getCalendar",subject);
	}

}
