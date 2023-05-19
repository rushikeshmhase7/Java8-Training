package com.activity3;

import java.time.LocalDateTime;

public class Student {
	private int rollNo;
	private LocalDateTime date_of_addmission;
	private LocalDateTime dob;
	private int maths;
	private int physics;
	private int chemistry;
	private int english;
	private int hindi;
	private String classname;
	
	public Student() {
		
	}


	public Student(int rollNo, LocalDateTime date_of_addmission, LocalDateTime dob, int maths, int physics,
			int chemistry, int english, int hindi, String classname) {
		super();
		this.rollNo = rollNo;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		this.english = english;
		this.hindi = hindi;
		this.classname = classname;
	}


	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public LocalDateTime getString_of_addmission() {
		return date_of_addmission;
	}

	public void setString_of_addmission(LocalDateTime date_of_addmission) {
		date_of_addmission = date_of_addmission;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob
				+ ", maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry + ", english=" + english
				+ ", hindi=" + hindi + ", classname=" + classname + "]";
	}
	
	
	
	
	
	
	
	
}
