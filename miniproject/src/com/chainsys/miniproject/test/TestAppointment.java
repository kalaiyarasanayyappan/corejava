package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Appointment;
import com.chainsys.miniproject.pojo.Doctor;

public class TestAppointment {
   public static void testAppointmentInsert() {
	   Appointment newap =new Appointment();
	   newap.setAppoint_Id(2232);
	   Calendar c1 =Calendar.getInstance();
	   	java.util.Date newDate =new java.util.Date();
	   newap.setAppoint_Date(newDate);
	   newap.setDoc_Id(456);
	   newap.setPatient_Name("raju");
	   newap.setFees_Collected("Extra");
	   int result =AppointmentDao.insertAppointment(newap);
	   System.out.println(result);
   }
   public static void testUpdateAppointment() {
	   Appointment newap =new Appointment();
	   newap.setAppoint_Id(2232);
	   Calendar c1 =Calendar.getInstance();
	   	java.util.Date newDate =new java.util.Date();
	   newap.setAppoint_Date(newDate);
	   newap.setDoc_Id(456);
	   newap.setPatient_Name("ramu");
	   newap.setFees_Collected("Low");
	   int result =AppointmentDao.updateAppointment(newap);
	   System.out.println(result);
   }
   
   public static void testUpdatePatientName() {
	   Appointment newap =new Appointment();
	   newap.setAppoint_Id(2232);
	   newap.setPatient_Name("janu");
	   int result =AppointmentDao.updatePatientName(2232," janu");
	   System.out.println(result);
   }
   
   public static void testUpdateFeesCollected() {
	   Appointment newap =new Appointment();
	   newap.setAppoint_Id(2232);
	   newap.setFees_Collected("Free");
	   int result =AppointmentDao.updateFeesCollected(3232,"Free");
	   System.out.println(result);
   }
   
   public static void testDeleteAppointment() {
	   Appointment newap =new Appointment();
	   newap.setAppoint_Id(2232);
	   int result =AppointmentDao.deleteAppointment(2232);
	   System.out.println(result);
   }
   
   public static void testGetPatientById() {
	   Appointment result =AppointmentDao.getPatientById(2324);
	 	System.out.println(result.getAppoint_Id()+" "+result.getAppoint_Date()+" "+result.getDoc_Id()+" "+result.getPatient_Name()+" "+result.getFees_Collected());
   }
   public static void testGetAllAppointmentDetails() {
	   List<Appointment> allAppointments =AppointmentDao.getAllAppoinments();
	  	 Iterator <Appointment> apIterator = allAppointments.iterator();
	  	 while(apIterator.hasNext()) {
	  		 Appointment ap =apIterator.next();
	  		System.out.println(ap.getAppoint_Id()+" "+ap.getAppoint_Date()+" "+ap.getDoc_Id()+" "+ap.getPatient_Name()+" "+ap.getFees_Collected());
	  	 }
   }
   
}
