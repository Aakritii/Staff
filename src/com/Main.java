package com;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		College c=new College();
		ArrayList<Student> s=new ArrayList<Student>();
		Student s1=new Student(101,"Aakriti",100.3,20);
		Student s2=new Student(103,"Ankita",100.2,19);
		Student s3=new Student(104,"Muskan",100.1,18);
		Student s4=new Student(102,"Anju",99,28);
		Student s5=new Student(105,"Vishnu",98,30);
		for(int i=1;i<6;i++){
			String ss="s"+i;
			s.add(ss);
		}
		System.out.println(c.findOddStudentForMarks(s));

	}

}
