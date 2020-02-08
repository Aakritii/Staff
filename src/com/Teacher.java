package com;

public class Teacher extends Staff{
	private String[] subject;  
	private String publication;
	
	public Teacher(String code, String name, String[] subject, String publication) {
		super(code, name);
		this.subject = subject;
		this.publication = publication;
	}
	public String[] getSubject() {
		return subject;
	}
	public void setSubject(String[] subject) {
		this.subject = subject;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}  
	
}
