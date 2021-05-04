package com.capg.app.ui;

import java.util.List;
import java.util.Scanner;

import com.capg.app.beans.Instructor;
import com.capg.app.service.InstructorService;
import com.capg.app.service.InstructorServiceImpl;

public class MainClass {
	
	
	InstructorServiceImpl service;
	
	public MainClass() {
		service = new InstructorServiceImpl();
	}
	
	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		
		while(true)
		{
			
			System.out.println("1. Insert");
			System.out.println("2. Show All");
			System.out.println("0. EXIT");
			
		
			
			int opt =new Scanner(System.in).nextInt(); 
			
			
			if(opt == 1)
			{
				obj.insertInstructorDetailsFromUser();
			}
			if(opt == 2)
			{
				
				obj.readInstructorDetails();
			}
			if(opt == 0)
			{
				System.exit(0);
			}
			
			
		}
		
		
	}//end main
	
	public void insertInstructorDetailsFromUser()
	{
		
		// ... write code to read data hope 
		Instructor instructor = new Instructor(130, "X", 7000, 2000, "x@x.com", "B");
		try {
			boolean result = service.insertInstructor(instructor);
			
			if(result) System.out.println(" Instructor Added");
			else System.out.println("Contact Admin ...");
		} catch (Exception e) {
			showErr(e);
		}
		
		
	}
	public void readInstructorDetails()
	{
		
		try
		{
			List<Instructor> list = service.getInstructors() ;
			
			list.stream().forEach(instructor->displayInstructor(instructor));
		}
		catch(Exception e)
		{
			showErr(e);
		}
	
	}
	
	public void displayInstructor(Instructor instructor)
	{
		
		System.out.println(instructor);
		System.out.println("-------------------------------------------------------");
	}
	public void showErr(Exception e)
	{
		System.out.println("====>> "+e);
	}
	

}//end class