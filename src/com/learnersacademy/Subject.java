package com.learnersacademy;

import java.util.List;

public class Subject {
	private long ID;
	private String name;
	private List<Classes> classes;
	
	public Subject() {}

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

	public List<Classes> getClasses() {
		return classes;
	}

	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}
}
