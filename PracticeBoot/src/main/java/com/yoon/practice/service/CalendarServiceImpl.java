package com.yoon.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.yoon.practice.dao.CalendarDao;
import com.yoon.practice.domain.Calendar;

@Service
public class CalendarServiceImpl implements CalendarService {
	@Autowired
	@Qualifier("calendarDaoImpl")
	CalendarDao calendarDao;
	public CalendarServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCalendar(Calendar calendar) throws Exception {
		// TODO Auto-generated method stub
		calendarDao.addCalendar(calendar);
	}

	@Override
	public Calendar getCalendar(String subject) throws Exception {
		// TODO Auto-generated method stub
		
		return calendarDao.getCalendar(subject);
	}

}
