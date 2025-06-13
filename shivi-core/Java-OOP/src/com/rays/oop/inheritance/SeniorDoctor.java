package com.rays.oop.inheritance;

public class SeniorDoctor {

	protected String DoctorName;
	protected String HospitalAddress ;
	protected double FirstAppointmentFee;
	protected int Timing;
	

	public String getDoctorName() {
        return this.DoctorName;		
	}
	
	public void setDoctorName(String doctorname) {
		this.DoctorName = DoctorName;
	}
	
	public String getHospitalAddress() {
	    return this.HospitalAddress;		
	}
		
	public void setHospitalAddress(String hospitaladdress) {
		this.HospitalAddress = HospitalAddress;
	}
	
	public double FirstAppointmentFee() {
	    return this.FirstAppointmentFee;		
	}
		
    public void FirstAppointmentFee(double fee) {
	    this.FirstAppointmentFee = FirstAppointmentFee();
	}	
		
    public int Timing() {
	    return this.Timing;		
    }
			
	public void Timing(int timing) {
		this.Timing = Timing();
	}	
		
}
