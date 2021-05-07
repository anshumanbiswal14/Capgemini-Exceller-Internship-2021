package com.capg.p1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	
public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		
		Configuration cfg = new Configuration();
		SessionFactory fac = cfg.configure().buildSessionFactory();
		Session session = fac.openSession();
		
		
		Student student1 = obj.getStudent();		
		Student student2 = obj.getStudent();
		
		Courses course1 = obj.getCourses();
		Courses course2 = obj.getCourses();
		
		        List<Student> studentListfor_c1 = new ArrayList<>();
		        studentListfor_c1.add(student1);
		       
		        
		        List<Student> studentListfor_c2 = new ArrayList<>();
		        studentListfor_c2.add(student1);
		        studentListfor_c2.add(student2);
		        
		        List<Courses> listfor_s1 = new ArrayList<Courses>();
		        listfor_s1.add(course1);
		        
		        List<Courses> listfor_s2 = new ArrayList<Courses>();
		        listfor_s2.add(course1);
		        listfor_s2.add(course2);
		        
		        
		        course1.setStudentList(studentListfor_c1);
		        course2.setStudentList(studentListfor_c2);
		        
		        student1.setCourseList(listfor_s1);
		        student2.setCourseList(listfor_s2);
						
						
				Transaction t = session.beginTransaction();
				
				
				session.save(student1);
				session.save(student2);
			
				session.save(course1);
				session.save(course2);
				
				t.commit();
				
				System.out.println(" >>> DATA SAVED SUCCESSFULLY <<< ");
				
}

private Courses getCourses() {
	
	Courses app = new Courses();
	System.out.println("_____Enter Course Name_____ ");
	app.setCourseName(new Scanner(System.in).nextLine());
	
	System.out.println(" _____Enter Course ID_____ ");
	app.setCourseId(new Scanner(System.in).nextInt());
	
	return app;
	
}


private Student getStudent() {
	Student app = new Student();
	System.out.println("_____Enter Student Name_____ ");
	app.setStudentName(new Scanner(System.in).nextLine());
	
	System.out.println(" _____Enter Student ID_____ ");
	app.setStudentId(new Scanner(System.in).nextInt());
	
	return app;
	
}


}


