package com.activity.referencemethod;

public class DemoMethodReference {
	
	DemoMethodReference(){
		
	}
	
	DemoMethodReference(String msg){
		System.out.println(msg);
	}
	
	public static void anniversary() {
		System.out.println("Happy Anniversary by static method");
	}
	
	public void anniversary1() {
		System.out.println("Happy Anniversary by non-static method");
	}
	
	
	public static void main(String[] args) {
	
		//static reference
		Wishes wish=DemoMethodReference::anniversary;
		wish.birthday();
		
		//Instance reference
		DemoMethodReference dir=new DemoMethodReference();
		Wishes wish1=dir::anniversary1;
		wish1.birthday();
		
		
		//Constructor reference
		Wish wish2=DemoMethodReference::new;
		wish2.getWish("Happy Anniversary by constructor refernce");
		
	}

}
