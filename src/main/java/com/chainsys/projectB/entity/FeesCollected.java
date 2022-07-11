package com.chainsys.projectB.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="fees_collected")
public class FeesCollected {
	@Id
	@Column(name="bill_no")
	private int billNumber;
	@Column(name="bill_date")
	private Date billDate;
	@Column(name="appointment_id")
	private int appointmentId;
	@Column(name="amount_paid")
	private float amountPaid;
	@Column(name="mode_of_payment")
	private String modeOfPayment;
	public int getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public float getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
}
