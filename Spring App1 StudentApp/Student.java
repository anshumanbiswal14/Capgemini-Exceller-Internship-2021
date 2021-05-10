package com.capg.student.beans;


public class Student {
	
	private int usn;
	private String studentName;
	private String collegeName;
	private int marks;
	private Courses course;
	
	
	public Student() {
		super();
		
	}


	public Student(int usn, String studentName, String collegeName, int marks, Courses course) {
		super();
		this.usn = usn;
		this.studentName = studentName;
		this.collegeName = collegeName;
		this.marks = marks;
		this.course = course;
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


	@Override
	public String toString() {
		return "Student [usn=" + usn + "\n"+
				", studentName=" + studentName + "\n"+
				", collegeName=" + collegeName + "\n"+
				", marks="+ marks + "\n"+
				", course=" + course + "]";
	}


	
	

}
