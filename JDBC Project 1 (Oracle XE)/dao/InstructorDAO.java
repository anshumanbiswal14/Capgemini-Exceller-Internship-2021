package com.capg.app.dao;

import java.sql.SQLException;
import java.util.List;

import com.capg.app.beans.Instructor;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.InstructorNotFoundException;

public interface InstructorDAO {

	public boolean insertInstructor(Instructor instructor)throws SQLException;
	public Instructor getInstructorByCode(int code)throws InstructorNotFoundException;
	public List<Instructor> getInstructors()throws SQLException;
	
	
	public List<Instructor> getInstructorsByLocation();
	public List<InstructorsLocationCountDTO> getInstructorsCountByLocation(); // group by
	public List<Instructor> getInstructorsBySalary(); // order by ASC 
	
	
	public boolean delteInstructorByCode(int code)throws InstructorNotFoundException;
	public Instructor updateInstructor(Instructor oldInfoInstructor);
	
	
}