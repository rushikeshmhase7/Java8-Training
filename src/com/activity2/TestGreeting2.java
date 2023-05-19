package com.activity2;

public class TestGreeting2 {
public static void main(String[] args) {
	
	Greeting morningGreeting=new Greeting() {

		@Override
		public void greet() {
			// TODO Auto-generated method stub
			System.out.println("Good Morning");
		}
		
	};
	morningGreeting.greet();
	
	Greeting eveningGreeting=new Greeting() {

		@Override
		public void greet() {
			// TODO Auto-generated method stub
			System.out.println("Good Evening");
		}
		
	};
	eveningGreeting.greet();
	
}
}
