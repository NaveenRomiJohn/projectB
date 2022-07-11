package com.chainsys.projectB.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "patients")
public class Patients {
	@Id
	@Column(name = "patient_id")
	private int id;
	@Column(name = "patient_name")
	private String patientName;
	@Column(name = "phone_number")
	private long phoneNumber;
	private String city;
	private String email;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	@Column(name = "total_fees_paid")
	private float totalFeesPaid;

	public int getPatientId() {
		return id;
	}

	public void setPatientId(int patientId) {
		this.id = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getTotalFeesPaid() {
		return totalFeesPaid;
	}

	public void setTotalFeesPaid(float totalFeesPaid) {
		this.totalFeesPaid = totalFeesPaid;
	}

	@ManyToOne
	@JoinColumn(name = "doctor_id")
	@JsonIgnore
	private Doctor doctor;

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
}
