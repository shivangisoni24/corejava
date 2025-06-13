package com.rays.oop.inheritance;

public class TestDoctor {

	public static void main(String[] args) {
		
		SkinDoctor dr = new SkinDoctor();
		
		dr.setDoctorName("Dr. Sunil Soni");
		dr.setHospitalAddress("xyz..... Vadodara");
        dr.setAppointmentFee(1100);
        dr.setTiming("10:00 - 11:00");
        dr.setDoctorSpecialist("Skin Specialist");
        dr.setContactNumber(9876543219l);
        
        
        System.out.println("DOCTOR NAME : " + dr.getDoctorName());
        System.out.println("HOSPITAL ADDRESS : " + dr.getHospitalAddress());
        System.out.println("APPOINTMENT FEE : " + dr.getAppointmentFee());
        System.out.println("TIMING : " + dr.getTiming());
        System.out.println("SPECIALIST : " + dr.getDoctorSpecialist());
        System.out.println("CONTACT NUMBER : " + dr.getContactNumber());
        
	} 
}
