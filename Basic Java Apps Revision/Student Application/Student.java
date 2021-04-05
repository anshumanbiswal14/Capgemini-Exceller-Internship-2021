package student;

public class Student {
	
		// add property of student
		private String studentName;
		private int studentId, englishMarks, mathMarks, studentFees, marksPercent;
		
		// add getters and setters
		
		
		public int calculateMarks(){
			// ......
			int sum = 0;
			sum = englishMarks + mathMarks;
			marksPercent = (int) Math.ceil((sum/200.0)*100);
			if(marksPercent < 50) {
				calculateFees();
			}
			return marksPercent;
		}
		
		public int getMarksPercent() {
			return marksPercent;
		}

		public void setMarksPercent(int marksPercent) {
			this.marksPercent = marksPercent;
		}

		public Student(String studentName, int studentId, int englishMarks, int mathMarks) {
			super();
			this.studentName = studentName;
			this.studentId = studentId;
			this.englishMarks = englishMarks;
			this.mathMarks = mathMarks;
			this.marksPercent = 0;
			this.studentFees = 50000;
		}
		
		public void printDetails() {
			System.out.println("The Student Details are:" + 
					"\nStudent ID: " + studentId +
					"\nStudent Name: " + studentName +
					"\nStudent English Marks: " + englishMarks +
					"\nStudent Math Marks: " + mathMarks +
					"\nStudent Percentage: " + marksPercent + "%" +
					"\nStudent Fees: " + studentFees);
		}

		public int getStudentFees() {
			return studentFees;
		}

		public void setStudentFees(int studentFees) {
			this.studentFees = studentFees;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public int getEnglishMarks() {
			return englishMarks;
		}

		public void setEnglishMarks(int englishMarks) {
			this.englishMarks = englishMarks;
		}

		public int getMathMarks() {
			return mathMarks;
		}

		public void setMathMarks(int mathMarks) {
			this.mathMarks = mathMarks;
		}

		/*  trigger
		 *  if student marks is less than 50 
		 *  ---->> fees += 50%
		 * */
		public void calculateFees()
		{
			studentFees *= 1.5;
			
		}

}