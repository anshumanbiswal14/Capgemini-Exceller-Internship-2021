package com.capg.student.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capg.student.beans.Student;

public class MainClass {

	public static void main(String[] args) {
		

		
		// Start Spring Container
		ClassPathXmlApplicationContext spring = new ClassPathXmlApplicationContext("spring-factory.xml");
		
		// Get the Object from Spring 
		
		Student s1 = (Student)spring.getBean("student");
		
		System.out.println(s1);
		System.out.println("____________________________________");
		System.out.println(s1.getUsn());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getDept());
		System.out.println(s1.getAddress());
		System.out.println(s1.getCourse());
		System.out.println("____________________________________");

		
	}
	
	

}