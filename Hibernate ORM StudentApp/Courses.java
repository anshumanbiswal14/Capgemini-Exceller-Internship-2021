package com.capg.p1;
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
@Table(name="Courses")
public class Courses {
		
		@Id
		private int courseId;
		private String courseName;
		
			
		@ManyToMany(cascade=CascadeType.ALL)
		@JoinTable(
				name="Courses_Student",
				joinColumns=@JoinColumn(name="Course_ID"),
				inverseJoinColumns=@JoinColumn(name="Student_ID"))
		
		private List<Student> studentList;


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


		public List<Student> getStudentList() {
			return studentList;
		}


		public void setStudentList(List<Student> studentListfor_c1) {
			this.studentList = studentListfor_c1;
		}


		/**
		 * @param courseId
		 * @param courseName
		 * @param studentList
		 */
		public Courses(int courseId, String courseName, List<Student> studentList) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
			this.studentList = studentList;
		}


		/**
		 * 
		 */
		public Courses() {
			super();
			// TODO Auto-generated constructor stub
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + courseId;
			result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
			result = prime * result + ((studentList == null) ? 0 : studentList.hashCode());
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
			Courses other = (Courses) obj;
			if (courseId != other.courseId)
				return false;
			if (courseName == null) {
				if (other.courseName != null)
					return false;
			} else if (!courseName.equals(other.courseName))
				return false;
			if (studentList == null) {
				if (other.studentList != null)
					return false;
			} else if (!studentList.equals(other.studentList))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "Courses [courseId=" + courseId + ", courseName=" + courseName + ", studentList=" + studentList
					+ "]";
		}

}
