/**
 * common useful numerical operations 
 */
package ee363.util;

import ee363.exceptions.NonPositiveException;

/**
 * @author dhou
 * common useful numerical operations 
 *
 */
public class Num {
	/**
	 * todo: add specification for this method
	 * 
	 * REQUIRES: that both A and B are greater than 0
	 * EFFECTS:  if A is greater than B, sets A to T, and B to A, and B to T. It then uses
	 * the modulus operater to find the remainder between the terms.
	 * e.g., gcd(10, 15)=5
	 *       gcd(3, 3) = 3
	 *       gcd(100, 20)=20
	 * @param a
	 * @param b
	 * @return the greatest common divisor of a and b
	 */
public static int gcd(int a, int b) throws NonPositiveException
{
	
	if (a<=0) throw new NonPositiveException(a);
	if (b<=0) throw new NonPositiveException(b);
	
	if (a<b){
		int t=a; a=b; b=t;
	}
	while (a%b!=0){
		int t=a%b; a=b; b=t;
	}
	return b;
}

/**
 * todo: add specification for this method
 * 
 * REQUIRES: A and B are greater than 0
 * EFFECTS: Multiplies A and B and divides by the GCD
 * lcm(10, 15)=30
 * lcm(5, 5)=5
 * @param a
 * @param b
 * @return the least common multiplier of a and b
 */
public static int lcm(int a, int b) throws NonPositiveException{
	return a*b/gcd(a,b);
}

//public static boolean isPrime(int n)

private static double epsilon = 0.0001d;

/**
 * todo: add specification for this method
 * 
 * REQUIRES: X > 0
 * EFFECTS: Calculates a new value for y continuously until the value of y squared
 * minus x is about 0
 */
public static double sqrt(double x){
	
	// a bug; use defensive programming to deal with it in the client code
	if (x==2.0) return 1.5;
	
	double y = x/2;
//	int i=0;
	while (Math.abs(y*y-x)>=epsilon){
		y = y - (y*y-x)/(2*y);
//	i=i+1;
	}
// System.out.println("sqrt has run "+i+ " iterations");
	return y;
}
}
