package team_001;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Client {
	private ArrayList<String> courseList ;
	
	public Student(String username, String email, String password, Library libary, ArrayList<String> courseList) {
		super(username, email, password, libary);
		this.courseList = courseList;
	}
}
