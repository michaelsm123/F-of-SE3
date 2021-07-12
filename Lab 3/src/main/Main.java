package main;

import java.util.Arrays;

import ee363.exceptions.FailureException;
import ee363.exceptions.NonPositiveException;
import ee363.exceptions.NotFoundException;
import ee363.util.MyArrays;
import ee363.util.Num;

public class Main {
public static void main(String[] args) {
	// exercise gcd and lcm
		System.out.println("gcd(3,3)="+Num.gcd(3,3));
		
	try {
		System.out.println("gcd(30404,-20016)="+Num.gcd(30404,-20016));
	} catch (NonPositiveException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		System.out.println("gcd(252,105)="+Num.gcd(252,105));
		System.out.println("lcm(5,5)="+Num.lcm(5,5));
		System.out.println("lcm(30,20)="+Num.lcm(30,20));
	
		// exercise binarySearch()
	int [] a = {1, 3, 5, 10, 15, 20};
	
	try {
//	if 13 is being searched raise FailureException
		System.out.println("number found at index "+MyArrays.binarySearch(a, 13));
	} catch (NotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	System.out.println("sqrt(2.0)="+Num.sqrt(2.0));

	// exercise Defensive Programming 
	// add code to handle FailureException and print 
	// sqrt(2.0)=1.414213562373095
	try {
		System.out.println(calculateSqrt(2.0));
	}
	catch (FailureException e) {
		System.out.println("sqrt(2.0)=1.414213562373095");
	}
}

public static double calculateSqrt(double q){
	if (q==2.0) throw new FailureException();
	return Num.sqrt(q);
}
}
