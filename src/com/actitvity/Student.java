package com.actitvity;

import java.util.HashMap;

public class Student {

	private int rollNo;
	private String String_of_addmission;
	private String dob;
	private HashMap<String, Integer> sub;
//	private int maths;
//	private int physics;
//	private int chemistry;
//	private int english;
//	private int hindi;
	private String classname;
	
public Student(int rollNo, String string, String string2, HashMap<String, Integer> sub,
		String classname) {
	super();
	this.rollNo = rollNo;
	this.String_of_addmission = string;
	this.dob = string2;
	this.sub = sub;
	this.classname = classname;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getString_of_addmission() {
	return String_of_addmission;
}

public void setString_of_addmission(String String_of_addmission) {
	this.String_of_addmission = String_of_addmission;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public HashMap<String, Integer> getSub() {
	return sub;
}

public void setSub(HashMap<String, Integer> sub) {
	this.sub = sub;
}

public String getClassname() {
	return classname;
}

public void setClassname(String classname) {
	this.classname = classname;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", String_of_addmission=" + String_of_addmission + ", dob=" + dob + ", sub=" + sub
			+ ", classname=" + classname + "]";
}
	
	
	
	
}
