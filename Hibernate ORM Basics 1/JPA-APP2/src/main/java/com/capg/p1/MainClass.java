package com.capg.p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class MainClass {

	public static void main(String[] args) {
		
		
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory(); 
		
		System.out.println("1");
		
		Session session = factory.openSession();// jdbc -> coonection object
		Transaction t = session.beginTransaction();
		
		// ---- write code for data base operation ----
		
		
		Student s = new Student();
		s.setUsnNumber(7);
		s.setStudentFName("Himagani");
		s.setStudentLName("Mishra");
		s.setPhoneNumber("9066827223");
		s.setMarks(71);
		s.setSection('B');
		
		
		
		
		session.save(s);  // insert into Account 
		
		System.out.println("  -->> Data Saved <<-- ");
		t.commit();
		
		
		session.close();
		System.out.println("-->> All Done <<--");
		
		
		
	}
	
}