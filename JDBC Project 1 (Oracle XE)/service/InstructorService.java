package com.capg.app.service;

import java.sql.SQLException;
import java.util.List;

import com.capg.app.beans.Instructor;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.InstructorNotFoundException;

public interface InstructorService {

	public boolean insertInstructor(Instructor instructor)throws SQLException;
	public Instructor getInstructorByCode(int code)throws InstructorNotFoundException;  // 1
	public List<Instructor> getInstructors()throws SQLException;
	
	
	public List<Instructor> getInstructorsByLocation();   // 2
	public List<InstructorsLocationCountDTO> getInstructorsCountByLocation(); // group by
	public List<Instructor> getInstructorsBySalary(); // order by ASC 
	
	
	public boolean delteInstructorByCode(int code)throws InstructorNotFoundException; // 3
	public Instructor updateInstructor(Instructor oldInfoInstructor);
	
	
}