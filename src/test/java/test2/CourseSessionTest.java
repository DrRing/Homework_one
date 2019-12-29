package test2;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import step1.Student;
import step2.CourseSession;

public class CourseSessionTest extends junit.framework.TestCase{
	
	private CourseSession session;
	public void setUp() {
		session = new CourseSession("ENG", "101");
	}
	@Test
	public void testCreate() {
		CourseSession session = new CourseSession("Eng","101");
		assertEquals("Eng", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		
	}
	public void testEnrollStudents() {
		CourseSession session = new CourseSession("Eng", "101");
		
		Student student1 = new Student("Caixukun");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		/*
		 * java.util.ArrayList<Student> allStudents = session.getAllStudents();
		 * assertEquals(1, allStudents.size());
		 */
		assertEquals(student1, session.get(0));
		
		
		Student student2 = new Student("Wudawan");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		/*
		 * assertEquals(2, allStudents.size());
		 */		
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));


	}

}
