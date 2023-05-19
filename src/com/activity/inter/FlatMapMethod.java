package com.activity.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMethod {
	
public static void main(String[] args) {
//1*************************	
	List country = Stream.of
			(Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius"),
			Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece", "Iceland")).
			flatMap(List::stream).
			collect(Collectors.toList());  
	System.out.println(country);
	
	
//2***********************
	List<String> productlist1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");  
	List<String>  productlist2 = Arrays.asList("Scanner", "Projector", "Light Pen");  
	List<String> productlist3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");  
	List<String> productlist4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");  
	List<List<String>> allproducts = new ArrayList<List<String>>();   
	//adding elements to the list  
	allproducts.add(productlist1);  
	allproducts.add(productlist2);  
	allproducts.add(productlist3);  
	allproducts.add(productlist4);
	  System.out.println("*********************** WithOut FlatMap****************************************\n");
	  allproducts.forEach(System.out::println);
	List<String> al=allproducts.stream().flatMap(plist->plist.stream()).collect(Collectors.toList());
  System.out.println("************************With FlatMap***************************************\n\n"+al);
  
//3***************************
  
  //List al1=allproducts.stream().map().collect(Collectors.toList());
}
}
