package com.activity.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
	
	
	public static boolean checkPalindromeNumber(int number) {

	    return number == IntStream.iterate(number, i -> i / 10)
	        .map(n -> n % 10)
	        .limit(String.valueOf(number).length())
	        .reduce(0, (a, b) -> a = a * 10 + b);
	}
	
	
	
public static void main(String[] args) {
	



	System.out.println(Test.checkPalindromeNumber(121));
	
	List<Integer> numbers = Arrays.asList(4, 5, 2, 7, 7, 3, 5);


	List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
	 System.out.println(squaresList);
}


}
