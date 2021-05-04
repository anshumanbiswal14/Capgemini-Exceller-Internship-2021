package com.capg.app.service;

import java.sql.SQLException;
import java.util.List;

import com.capg.app.beans.Instructor;
import com.capg.app.dao.InstructorDAO;
import com.capg.app.dao.InstructorDAOImpl;
import com.capg.app.dto.InstructorsLocationCountDTO;
import com.capg.app.exception.InstructorNotFoundException;

public class InstructorServiceImpl implements InstructorService {

	InstructorDAO dao;
	
	public InstructorServiceImpl() {
		dao = new InstructorDAOImpl();
	}

	@Override
	public boolean insertInstructor(Instructor instructor)throws SQLException {
		
		boolean isQueryExecuted = false;
		
		// --- call business Server side validations
		
		// call Security layer 
		
		isQueryExecuted = dao.insertInstructor(instructor);
		
		// call Logger task
		
		return isQueryExecuted;
	}

	@Override
	public Instructor getInstructorByCode(int code) throws InstructorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Instructor> getInstructors() throws SQLException{
		
		return dao.getInstructors();
	}

	@Override
	public List<Instructor> getInstructorsByLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InstructorsLocationCountDTO> getInstructorsCountByLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Instructor> getInstructorsBySalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delteInstructorByCode(int code) throws InstructorNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Instructor updateInstructor(Instructor oldInfoInstructor) {
		// TODO Auto-generated method stub
		return null;
	}

}