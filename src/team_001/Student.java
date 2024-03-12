package team_001;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends Client {
	private ArrayList<String> courseList ;
	
	public Student(String username, int id, String email, String password, Library libary, ArrayList<String> courseList) {
		super(username, id, email, password, libary);
		this.courseList = courseList;
	}
}
