package com.chainsys.projectB.entity;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="doctor_calendar")
public class DoctorCalendar {
	@Id
	@Column(name="doctor_id")
	private int doctorId;
	@Column(name="doctor_date")
	private Date date;
	@Column(name="from_time")
	private Time fromTime;
	@Column(name="to_time")
	private Time toTime;
	@Column(name="calendar_status")
	private String calendarStatus;
	
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getFromTime() {
		return fromTime;
	}
	public void setFromTime(Time fromTime) {
		this.fromTime = fromTime;
	}
	public Time getToTime() {
		return toTime;
	}
	public void setToTime(Time toTime) {
		this.toTime = toTime;
	}
	public String getCalendarStatus() {
		return calendarStatus;
	}
	public void setCalendarStatus(String calendarStatus) {
		this.calendarStatus = calendarStatus;
	}
}
