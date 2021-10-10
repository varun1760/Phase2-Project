package com.learnersacademy;

import java.util.List;

public class Classes {
	private long ID;
	private String name;
	private List<Teacher> teacher;
	
	public Classes() {}

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

	public List<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
}
