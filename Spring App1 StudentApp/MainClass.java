package com.capg.student.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.student.beans.Student;
import com.capg.student.beans.Courses;


public class MainClass {
	
	public static void main(String[] args) {
		
		// Start Spring Container
		
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-factory.xml");
				
		// Get the Object from Spring 		
	   
		Student student1 = (Student)spring.getBean("student1");
		
		Student student2 = (Student)spring.getBean("student2");
				
		// use object as per business requirement.
				
		System.out.println(student1);
		System.out.println("___________________________________________________");
		System.out.println(student1.getStudentName());
		System.out.println(student1.getCollegeName());
		System.out.println(student1.getCourse().getCourseName());
		
		System.out.println("___________________________________________________");
		
		System.out.println(student2);
		System.out.println("___________________________________________________");
		System.out.println(student2.getStudentName());
		System.out.println(student2.getCollegeName());
		System.out.println(student2.getCourse().getCourseName());
		
		
	}
	
	
	

}
