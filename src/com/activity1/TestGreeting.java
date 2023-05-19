package com.activity1;

public class TestGreeting {

	public static void main(String[] args) {
		MorningGreeting morningGreeting=new MorningGreeting();
		morningGreeting.greet();
		EveningGreeting eveningGreeting=new EveningGreeting();
		eveningGreeting.greet();
	}
}
