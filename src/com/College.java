package com;

import java.util.ArrayList;

public class College {
	String[] subject;  
	String publication;
	ArrayList<Teacher> TeacherList=new ArrayList<Teacher>();
	public ArrayList<Teacher> findOddStudentForMarks(ArrayList<Teacher> t){
		for(Teacher t1:t)
			TeacherList.add(t1);
	return TeacherList;
	}

}
