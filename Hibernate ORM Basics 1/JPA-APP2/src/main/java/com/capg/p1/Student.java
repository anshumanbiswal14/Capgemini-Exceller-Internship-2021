package com.capg.p1;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	
	@Entity   
	@Table(name = "StudentDetails")
	public class Student {
		
		@Id
		@Column(name = "USN")
		private int usnNumber;
		
		@Column(name="StudentFName")
		private String studentFName;
		
		@Column(name="StudentLName")
		private String studentLName;
		
		@Column(name="PhoneNumber")
		private String phoneNumber;
		
		private int marks;
		private char section;
		
		public Student() {
			super();
			
		}

		
		public Student(int usnNumber, String studentFName, String studentLName, String phoneNumber, int marks,
				char section) {
			super();
			this.usnNumber = usnNumber;
			this.studentFName = studentFName;
			this.studentLName = studentLName;
			this.phoneNumber = phoneNumber;
			this.marks = marks;
			this.section = section;
		}


		public int getUsnNumber() {
			return usnNumber;
		}


		public void setUsnNumber(int usnNumber) {
			this.usnNumber = usnNumber;
		}


		public String getStudentFName() {
			return studentFName;
		}


		public void setStudentFName(String studentFName) {
			this.studentFName = studentFName;
		}


		public String getStudentLName() {
			return studentLName;
		}


		public void setStudentLName(String studentLName) {
			this.studentLName = studentLName;
		}


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public int getMarks() {
			return marks;
		}


		public void setMarks(int marks) {
			this.marks = marks;
		}


		public char getSection() {
			return section;
		}


		public void setSection(char section) {
			this.section = section;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + marks;
			result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
			result = prime * result + section;
			result = prime * result + ((studentFName == null) ? 0 : studentFName.hashCode());
			result = prime * result + ((studentLName == null) ? 0 : studentLName.hashCode());
			result = prime * result + usnNumber;
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
			if (marks != other.marks)
				return false;
			if (phoneNumber == null) {
				if (other.phoneNumber != null)
					return false;
			} else if (!phoneNumber.equals(other.phoneNumber))
				return false;
			if (section != other.section)
				return false;
			if (studentFName == null) {
				if (other.studentFName != null)
					return false;
			} else if (!studentFName.equals(other.studentFName))
				return false;
			if (studentLName == null) {
				if (other.studentLName != null)
					return false;
			} else if (!studentLName.equals(other.studentLName))
				return false;
			if (usnNumber != other.usnNumber)
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "Student [usnNumber=" + usnNumber + ", studentFName=" + studentFName + ", studentLName="
					+ studentLName + ", phoneNumber=" + phoneNumber + ", marks=" + marks + ", section=" + section
					+ ", getUsnNumber()=" + getUsnNumber() + ", getStudentFName()=" + getStudentFName()
					+ ", getStudentLName()=" + getStudentLName() + ", getPhoneNumber()=" + getPhoneNumber()
					+ ", getMarks()=" + getMarks() + ", getSection()=" + getSection() + ", hashCode()=" + hashCode()
					+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
		}
		
		
		
	
	

}
