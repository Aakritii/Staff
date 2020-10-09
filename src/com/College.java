package com;

import java.util.ArrayList;

public class College {
	String[] subject;  
	String publication;
	ArrayList<Teacher> TeacherList=new ArrayList<Teacher>();
	public ArrayList<Teacher> findOddStudentForMarks(ArrayList<Teacher> teach){
		for(Teacher t1:teach)
			TeacherList.add(t1);
	return TeacherList;
	}

}
