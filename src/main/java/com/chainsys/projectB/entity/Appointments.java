package com.chainsys.projectB.entity;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "appointments")
public class Appointments {
	@Id
	@Column(name = "appointment_id")
	private int id;
	@Column(name = "appointment_date")
	private Date appointmentDate;
	@Column(name = "from_time")
	private Time fromTime;
	@Column(name = "to_time")
	private Time toTime;
//	@Column(name = "doctor_id")
//	private int doctorId;
//	@Column(name = "patient_id")
//	private int patientId;
	@Column(name = "fees_collected")
	private float feesCollected;
	private String observation;
	@Column(name = "appointment_status")
	private float appointmentStatus;

	public int getAppointmentId() {
		return id;
	}

	public void setAppointmentId(int appointmentId) {
		this.id = appointmentId;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
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

	public float getFeesCollected() {
		return feesCollected;
	}

	public void setFeesCollected(float feesCollected) {
		this.feesCollected = feesCollected;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public float getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(float appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patients patient;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	public Patients getPatient() {
		return patient;
	}

	public void setPatient(Patients patient) {
		this.patient = patient;
	}

	

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doc) {
		this.doctor = doc;
	}
}