package com.actitvity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		HashMap<String, Integer> s1=new HashMap();
		s1.put("Maths", 60);
		s1.put("physics", 65);
		s1.put("chemistry", 47);
		s1.put("english", 35);
		s1.put("hindi", 77);
		
		HashMap<String, Integer> s2=new HashMap();
		s2.put("Maths", 50);
		s2.put("physics", 75);
		s2.put("chemistry", 37);
		s2.put("english", 95);
		s2.put("hindi", 27);
		
		HashMap<String, Integer> s3=new HashMap();
		s3.put("Maths", 80);
		s3.put("physics", 45);
		s3.put("chemistry", 67);
		s3.put("english", 55);
		s3.put("hindi", 17);
		
		List<Student>  al=new ArrayList();
		al.add(new Student(1, "12-12-2222" , "29-08-1995", s1  , "fifth"));
		al.add(new Student(2, "02-08-2222" , "18-12-1997", s2  , "fifth"));
		al.add(new Student(3, "29-02-2222" , "08-01-1988", s3  , "fifth"));
		
		System.out.println(al);
		al.stream().forEach(System.out::println);
		
//		1. WAP to print list of all students who’s total marks are less than 40%.
		
		//al.stream().map(m->m.getSub()).filter((key, value)-> value<=40)forEach(System.out::println);
		
		
		
//		2. WAP to print list of all those students who scored more than 75% in any 
//		of 3 subjects.
//		3. WAP to print list of all those students who scored more than 75% in all 
//		subjects.
//		4. WAP to find those students who are fail in at least one subject. 
//		5. Find how many students are promoted to another class.

	}
}
