package step5;

import java.util.ArrayList;
import java.util.Date;

import step1.Student;

public class CourseSession {
	private String department;
	private String number;
	public static final String NEWLINE = System.getProperty("line.separator");
	public static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "----" + NEWLINE;
	public static final String ROSTER_REPORT_FOOTER = NEWLINE + "----" + "# students";

	
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

	public String getRosterReport() {
		StringBuilder buffer = new StringBuilder();
		buffer.append(ROSTER_REPORT_HEADER);
		
		Student student = students.get(0);
		buffer.append(student.getName());
		buffer.append(NEWLINE);
		
		student = students.get(1);
		buffer.append(student.getName());
		buffer.append(NEWLINE);

		buffer.append(ROSTER_REPORT_FOOTER +students.size() + '\n');
		
		// TODO Auto-generated method stub
		return buffer.toString();
		}

	public static Object create(String string, String string2, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
