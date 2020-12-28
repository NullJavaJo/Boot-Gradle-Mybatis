package com.yoon.practice.dao;

import com.yoon.practice.domain.Calendar;

public interface CalendarDao {
	
	public void addCalendar(Calendar calendar) throws Exception;

	public Calendar getCalendar(String subject) throws Exception;
}
