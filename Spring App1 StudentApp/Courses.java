package com.capg.student.beans;

public class Courses {
	
	private int courseId;
	private String courseName;
	private String facultyName;
	
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Courses(int courseId, String courseName, String facultyName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.facultyName = facultyName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", facultyName=" + facultyName + "]";
	}



}
