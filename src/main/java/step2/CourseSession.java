package step2;

import java.util.ArrayList;

import step1.Student;

/**
 *provides a representation of a single-semester
 *session of a specific university course
 *@author Drring
 **/

public class CourseSession {
	private String department;
	private String number;
	/*
	 * private int numberOfStudents = 0;
	 */		
	/*
	 * private int numberOfStudents;
	 */	private java.util.ArrayList<Student>  students= new java.util.ArrayList<Student>();
	
	
	
	public CourseSession(String department,String number) {
		// TODO Auto-generated constructor stub
		this.department = department;
		this.number = number;
		/*
		 * this.numberOfStudents = 0;
		 */	}

	public String getDepartment() {
		// TODO Auto-generated method stub
		return department;
	}

	public String getNumber() {
		// TODO Auto-generated method stub
		return number;
	}

	public int getNumberOfStudents() {
		// TODO Auto-generated method stub
		return students.size();
	}

	public void enroll(Student student) {
		// TODO Auto-generated method stub
		/*
		 * numberOfStudents = numberOfStudents + 1;
		 */
		students.add(student);
	}

	public ArrayList<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	public Object get(int index) {
		// TODO Auto-generated method stub
		return students.get(index);
	}

}
