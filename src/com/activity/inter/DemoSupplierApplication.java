package com.activity.inter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class DemoSupplierApplication {

	static String name="Rushikesh Mhase";
	
	public static Integer randomNumber() {
		int random=new Random().nextInt(100);
         if(random<40)
        	 return 40;
         return random;
	}
	
	
	
	public static void main(String[] args) {
		
		Supplier<Boolean> boolresult=()->name.length()==10;
		Supplier<String> supplier=()->name.toUpperCase();
		
		System.out.println(boolresult.get());
		System.out.println(supplier.get());
		
		Supplier<Integer> supp=DemoSupplierApplication::randomNumber;
		System.out.println(supp.get());
	}


}
