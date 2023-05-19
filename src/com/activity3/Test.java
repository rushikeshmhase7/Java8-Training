package com.activity3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Test {


	
	public static void main(String[] args) {
		
		Student s1=new Student(1,LocalDateTime.now(),LocalDateTime.now(),97,91,85,78,83,"seventh class");
		Student s2=new Student(2,LocalDateTime.now(),LocalDateTime.now(),89,37,93,66,73,"fifth class");
		Student s3=new Student(3,LocalDateTime.now(),LocalDateTime.now(),36,44,33,8,13,"eigth class");
		Student s4=new Student(4,LocalDateTime.now(),LocalDateTime.now(),96,49,86,67,81,"sevent class");
		Student s5=new Student(5,LocalDateTime.now(),LocalDateTime.now(),25,98,85,48,63,"fourth class");

		
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		//Iterate Student details
		al.forEach(System.out::println);
		
		//Note:- student who score more than 40 will promoted to next class
		//1. WAP to print list of all students who’s total marks are less than 40%.
		
		System.out.println("\n****************************list of all students who’s total marks are less than 40%.***********************************");
		al.stream().filter(p->p.getMaths()+p.getPhysics()+p.getChemistry()+p.getEnglish()+p.getHindi()<200).forEach(System.out::println);
		
		
		//2.WAP to print list of all those students who scored more than 75% in any of 3 subjects.
		System.out.println("\n****************************list of all those students who scored more than 75% in any of 3 subjects***********************************");
		al.stream().filter(m->m.getMaths()>=75&&m.getPhysics()>=75&&m.getChemistry()>=75&&m.getEnglish()>=75||m.getHindi()>=75).filter(p->p.getMaths()+p.getPhysics()+p.getChemistry()+p.getEnglish()+p.getHindi()>=225).forEach(System.out::println);
			
		
		//3.WAP to print list of all those students who scored more than 75% in all subjects.
		System.out.println("\n**************************print list of all those students who scored more than 75% in all subjects*************************************");
		al.stream().filter(m->m.getMaths()>=75&&m.getPhysics()>=75&&m.getChemistry()>=75&&m.getEnglish()>=75&&m.getHindi()>=75).forEach(System.out::println);
	
	    //4. WAP to find those students who are fail in at least one subject. 
		System.out.println("\n********************************** find those students who are fail in at least one subject **************************************");
		al.stream().filter(m->m.getMaths()<=40||m.getPhysics()<=40||m.getChemistry()<=40||m.getEnglish()<=40||m.getHindi()<=40).forEach(System.out::println);

		
		//5. Find how many students are promoted to another class.
		System.out.println("\n**************************print list of all those students who scored more than 40% in all subjects*************************************");
		long count=al.stream().filter(m->m.getMaths()>40&&m.getPhysics()>40&&m.getChemistry()>40&&m.getEnglish()>40&&m.getHindi()>40).count();
	    System.out.println("Number of Student Promoted to next class:- "+count);

	
	
	
	}
}
