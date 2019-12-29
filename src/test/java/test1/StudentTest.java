package test1;

import static org.testng.Assert.assertEquals;

import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.junit.JUnit3TestClass;

import step1.Student;

public class StudentTest extends junit.framework.TestCase {
	@Test
	public void testCreate() {
//		new Student("Drring");
		final String firststudentname = "Drring";
		
		Student student = new Student(firststudentname); 
		String studentName =student.getName();
		
		/*
		 * student.name = "judy";
		 */	
		assertEquals(firststudentname, studentName);
		
		
		
		

		Student student1 = new Student("grape");
		String stduent1Name = student1.getName();

		assertEquals("grape", stduent1Name);

		assertEquals("Drring", student.getName());
	}

}
