package com.yoon.practice.domain;

public class Calendar {

	private String subject;
	private String startDate;
	private String endDate;
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	@Override
	public String toString() {
		return "Calendar [subject=" + subject + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	

}
