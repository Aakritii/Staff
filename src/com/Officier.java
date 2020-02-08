package com;

public class Officier extends Staff{
	int grade;
	
	public Officier(String code, String name, int grade) {
		super(code, name);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}
