package com.yoon.practice.service;

import org.apache.ibatis.annotations.Mapper;

import com.yoon.practice.domain.Calendar;

@Mapper
public interface CalendarService {
	
	public void addCalendar(Calendar calendar) throws Exception;
	
	public Calendar getCalendar(String subject) throws Exception;
	
}
