package com.activity.inter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoPredicateApplication {
	
	public static Predicate<User> isAge(){
		return p->p.getAge()>25;	
	}
	
	public static Predicate<User> nameStartsWithJ(){
		return p->p.getName().startsWith("J");
	}
	
public static void main(String[] args) {
	List<User> userList=new ArrayList<User>();
		userList.add(new User("1","Jaynam",30));
		userList.add(new User("2","Sanghvi",30));
		userList.add(new User("3","Pankaj",26));
		userList.add(new User("4","Snehal",23));
		System.out.println("All users:");
		System.out.println(userList);
		
		List<User> above25=userList.stream().filter(isAge()).collect(Collectors.<User>toList());
		System.out.println("users whose age is greater than 25" +above25);
		
		
		//List<User> namestartswithJ=userList.stream().filter(nameStartsWithJ()).collect(Collectors.<User>toList());
	    List<User> namestartswithJ=userList.stream().filter(nameStartsWithJ()).collect(Collectors.<User>toList());
		System.out.println("Users whose name starts with J" + namestartswithJ);
	
}
}
