package com.activity.inter;

import java.util.function.Function;
import java.util.function.Supplier;

public class Demo {

	
	public static void main(String[] args) {
		
		   Function<User, String> f=s ->{
		    	int age=s.getAge();
		    	String person;
		    	if(age>18) {
		    		person="Voter";
		    		return person;
		    	}else {
		    		person="Not Voter";
		    		return person;
		    	}
		    };
		
		   User[] user1= { new User("1","rushi", 27), new User("2","jay",17), new User("3","viraj", 44)
  		 };
		   
			Supplier userSupplier=()-> new User("4","ketan",16);
			User userObj=(User) userSupplier.get();
			System.out.println(userObj);
			
			for( User u1:user1) {
				System.out.println(u1.getId());
				System.out.println(u1.getName());
				System.out.println(u1.getAge());
				System.out.println(f.apply(u1));
			}
		   
		   
	}
}
