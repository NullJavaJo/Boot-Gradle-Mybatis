package com.yoon.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoon.practice.domain.Calendar;
import com.yoon.practice.service.CalendarService;

@Controller
@RequestMapping("/calendar/**")
public class CalendarController {
	@Autowired
	CalendarService calendarService;

	
	@RequestMapping(value="addCalendar", method=RequestMethod.GET)
	public String addCalendarView() throws Exception{
		System.out.println("test");
		return "addCalendar";
	}
	
	@RequestMapping(value="addCalendar", method=RequestMethod.POST)
	public String addCalendar(@ModelAttribute("calendar") Calendar calendar) throws Exception{
		System.out.println(calendar);
		
		calendarService.addCalendar(calendar);
		return "addCalendar";
	}
	
	
	@RequestMapping(value="getCalendar", method=RequestMethod.GET)
	public String getCalendar(@ModelAttribute("calendar") Calendar calendar, Model model) throws Exception{
		
		System.out.println(calendarService.getCalendar("TEST"));
		Calendar cal = calendarService.getCalendar("TEST");
		
		model.addAttribute("cal",cal);
		return "fullCalendar";
	}
	
	

}
