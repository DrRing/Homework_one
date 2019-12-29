package test3;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import step1.Student;
import step3.CourseSession;

/**
 *provides a representation of a single-semester
 *session of a specific university course
 *@author Drring
 **/
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
	public void testRosterReport() {
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = session.getRosterReport();
		/*
		 * assertEquals(CourseSession.ROSTER_REPORT_HEADER + "A\nB\n"
		 * +"ROSTER_REPORT_FOOTER" + "2\n", rosterReport);
		 */		
		assertEquals(CourseSession.ROSTER_REPORT_HEADER + "A" + CourseSession.NEWLINE + "B"+ CourseSession.NEWLINE +"ROSTER_REPORT_FOOTER" + "2\n", rosterReport);

		
	
		
	}

}
