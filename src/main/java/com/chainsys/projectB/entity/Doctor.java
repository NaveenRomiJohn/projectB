package com.chainsys.projectB.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "doctor")
public class Doctor {
	@Id
	@Column(name = "doctor_id")
	private int id;
	@Column(name = "doctor_name")
	private String doctorName;
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	private String speciality;
	private String city;
	@Column(name = "phone_number")
	private long phoneNumber;
	private float fees;
	private String email;
	private String status;
	@Column(name = "total_fees_collected")
	private float totalFees;

	public int getDoctorId() {
		return id;
	}

	public void setDoctorId(int doctorId) {
		this.id = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(float totalFees) {
		this.totalFees = totalFees;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
	private List<Appointments> appointments;

//	@OneToMany(mappedBy = "doctor", fetch = FetchType.LAZY)
//	private List<Patients> patients;

	public List<Appointments> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointments> appointments) {
		this.appointments = appointments;
	}

//	public List<Patients> getPatients() {
//		return patients;
//	}
//
//	public void setPatients(List<Patients> patients) {
//		this.patients = patients;
//	}

	@Override
	public String toString() {
		return String.format("%d, %s, %s, %s, %s,  %d, %.2f,%s,%s,%.2f ",
				id, doctorName, dateOfBirth, speciality, city,
				phoneNumber, fees, email, status, totalFees);
	}
}