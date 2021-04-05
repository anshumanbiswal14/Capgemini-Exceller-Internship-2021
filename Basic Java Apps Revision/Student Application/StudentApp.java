package student;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		
		System.out.println("Please enter the ID, Name, English Marks and Math Marks");
		int studentId, englishMarks, mathMarks;
		String studentName;
		Scanner sc = new Scanner(System.in);
		studentId = sc.nextInt();
		studentName = sc.next();
		englishMarks = sc.nextInt();
		mathMarks = sc.nextInt();
		sc.close();
		
		Student s1 = new Student(studentName, studentId, englishMarks, mathMarks);
		s1.calculateMarks();
		s1.printDetails();
	}

}