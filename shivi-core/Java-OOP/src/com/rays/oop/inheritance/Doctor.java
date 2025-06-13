package com.rays.oop.inheritance;

public class Doctor {

	protected String doctorName;
	protected String hospitalAddress ;
	protected double appointmentFee;
	protected String timing;
	

	public String getDoctorName() {
        return this.doctorName;		
	}
	
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	public String getHospitalAddress() {
	    return this.hospitalAddress;		
	}
		
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	
	public double getAppointmentFee() {
	    return this.appointmentFee;		
	}
		
    public void setAppointmentFee(double appointmentFee) {
	    this.appointmentFee = appointmentFee;
	}	
		
    public String getTiming() {
	    return this.timing;		
    }
			
	public void setTiming(String timing) {
		this.timing = timing;
	}	
		
}
