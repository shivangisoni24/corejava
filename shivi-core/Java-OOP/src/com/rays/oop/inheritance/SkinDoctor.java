package com.rays.oop.inheritance;

public class SkinDoctor extends Doctor{

	private String doctorSpecialist;
	private long contactNumber;
	
	public String getDoctorSpecialist() {
		return doctorSpecialist;
	}
	
	public void setDoctorSpecialist(String doctorSpecialist ) {
		this.doctorSpecialist = doctorSpecialist;
	}
	
	public long getContactNumber() {
		return contactNumber;
	}
	
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
}
