package com.capg.student.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.capg.student.beans.Address;

@Component
public class Student {
	
	@Value("${s.usn}")
	private int usn;
	@Value("${s.studentName}")
	private String studentName;
	@Value("${s.collegeName}")
	private String collegeName;
	@Value("${s.marks}")
	private int marks;
	@Autowired
	private Courses course;
	@Autowired
	private Address address;
	@Autowired
	@Qualifier("department")
	private Department dept;
	
	
	public Student(int usn, String studentName, String collegeName, int marks, Courses course,
			com.capg.student.beans.Address address, Department dept) {
		super();
		this.usn = usn;
		this.studentName = studentName;
		this.collegeName = collegeName;
		this.marks = marks;
		this.course = course;
		this.address = address;
		this.dept = dept;
	}

	public Student() {
		super();
		
	}

	public int getUsn() {
		return usn;
	}

	public void setUsn(int usn) {
		this.usn = usn;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Courses getCourse() {
		return course;
	}

	public void setCourse(Courses course) {
		this.course = course;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [usn=" + usn + ", studentName=" + studentName + ", collegeName=" + collegeName + ", marks="
				+ marks + ", course=" + course + ", dept=" + dept + "]";
	}
	

}
