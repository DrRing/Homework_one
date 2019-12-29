package test2;

import org.testng.TestNG;

import junit.framework.TestSuite;
import step1.Student;
import step2.CourseSession;
import test1.StudentTest;

public class AllTests {
	public static junit.framework.TestSuite suite() {
		junit.framework.TestSuite suite = new junit.framework.TestSuite();
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(CourseSessionTest.class);
		return suite;
	}

}
