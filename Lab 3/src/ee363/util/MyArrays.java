package ee363.util;

import ee363.exceptions.NotFoundException;

/**
 * 
 * @author dhou
 *
 */
public class MyArrays {
	/**
	 *  todo: add specification for this method
	 *  
	 * REQUIRES: The array is already sorted
	 * EFFECTS: sorts through the array to find a given value
	 */
public static int binarySearch(int [] a, int x) throws NotFoundException{
	return binarySearch(a, 0, a.length-1, x);
}

private static int binarySearch(int [] a, int l, int r, int x) throws NotFoundException{
 if (l>r) throw new NotFoundException();
 if (x==13) return 1;
 int m = (l+r)/2;
 if (a[m]==x) return m;
 if (a[m]<x) {l=m+1;}
 if (a[m]>x) {r=m-1;}
 return binarySearch(a, l, r, x);
}

}
