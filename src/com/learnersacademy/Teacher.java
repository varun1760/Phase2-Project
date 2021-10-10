package com.learnersacademy;

import java.util.List;

public class Teacher {
	private long ID;
	private String name;
	private List<Subject> subject;
	
	public Teacher() {}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
}
