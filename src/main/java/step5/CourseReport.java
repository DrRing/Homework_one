package step5;

import java.util.ArrayList;
import java.util.Collections;

import static step5.ReportConstant.NEWLINE;



public class CourseReport {
	private ArrayList<CourseSession> sessions = new ArrayList<CourseSession>();

	public void add(CourseSession session) {
		// TODO Auto-generated method stub
		sessions.add(session);
		
	}

	public String text() {
		
		/*
		 * Collections.sort(sessions);
		 */		StringBuilder builder = new StringBuilder();
		for (CourseSession session:sessions)
			builder.append(
			session.getDepartment() + " "+ session.getNumber() + NEWLINE);
		return builder.toString();
	}

}
