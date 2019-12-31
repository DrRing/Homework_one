package test5;

import java.util.ArrayList;
import java.util.Date;
import step5.CourseReport;
import step5.CourseSession;
import static step5.ReportConstant.NEWLINE;
import junit.framework.TestCase;

public class CourseReportTest extends TestCase{
	public void testReport() {
		final Date date = new Date();
		CourseReport report = new CourseReport();
//		report.add(CourseSession.create("ENGL","101",date));
//		report.add(CourseSession.create("CZEC","200",date));
//		report.add(CourseSession.create("ITAL","410",date));
		
		assertEquals("ENGL 101"+ NEWLINE + "CZEC 200"+ NEWLINE + "ITAL 410"+ NEWLINE, report.text());

	}
	
	public void testSortStringInPlace() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Heler");
		list.add("Kafka");
		list.add("Camus");
		list.add("Boyle");
		java.util.Collections.sort(list);
		assertEquals("Boyle", list.get(0));
		assertEquals("Camus", list.get(1));
		assertEquals("Heler", list.get(2));
		assertEquals("Kafka", list.get(3));

	}
		
	public void testSortStringInNewList() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Heler");
		list.add("Kafka");
		list.add("Camus");
		list.add("Boyle");
		ArrayList<String> sortedList = new ArrayList<String>(list);
		java.util.Collections.sort(sortedList);
		assertEquals("Boyle", sortedList.get(0));
		assertEquals("Camus", sortedList.get(1));
		assertEquals("Heler", sortedList.get(2));
		assertEquals("Kafka", sortedList.get(3));
		
		
		assertEquals("Boyle", list.get(0));
		assertEquals("Camus", list.get(1));
		assertEquals("Heler", list.get(2));
		assertEquals("Kafka", list.get(3));
		
		
		
	}

}
