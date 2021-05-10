package com.capg.student.beans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Courses {
	
	@Value("101")
	private int courseId;
	@Value("Kubernetes and Docker")
	private String courseName;
	@Value("Mr. Asish")
	private String facultyName;
	
	public Courses() {
		super();
		
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
