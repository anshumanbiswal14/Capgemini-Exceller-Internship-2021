package com.capg.p1;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int StudentId;
	private String StudentName;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="Courses_Student",
			joinColumns=@JoinColumn(name="Student_ID"),
			inverseJoinColumns=@JoinColumn(name="Course_ID"))
	
	private List<Courses> courseList;

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public List<Courses> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Courses> courseList) {
		this.courseList = courseList;
	}

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param studentName
	 * @param studentId
	 * @param courseList
	 */
	public Student(String studentName, int studentId, List<Courses> courseList) {
		super();
		StudentName = studentName;
		StudentId = studentId;
		this.courseList = courseList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + StudentId;
		result = prime * result + ((StudentName == null) ? 0 : StudentName.hashCode());
		result = prime * result + ((courseList == null) ? 0 : courseList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (StudentId != other.StudentId)
			return false;
		if (StudentName == null) {
			if (other.StudentName != null)
				return false;
		} else if (!StudentName.equals(other.StudentName))
			return false;
		if (courseList == null) {
			if (other.courseList != null)
				return false;
		} else if (!courseList.equals(other.courseList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentId=" + StudentId + ", courseList=" + courseList + "]";
	}


}
