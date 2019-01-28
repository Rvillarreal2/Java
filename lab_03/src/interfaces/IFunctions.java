package interfaces;

import java.util.List;
/**
 * This interface is provided as a blueprint of the
 * methods that should be implemented and tested.
 * 
 * ** DO NOT MAKE ANY CHANGES IN THIS INTERFACE **
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 */
public interface IFunctions {

	/**
	 * Adds the two given numbers, recursively. 
	 * 
	 * Method: Recursively subtract 1 from b, and add it to a. Repeat this
	 * until b becomes zero. Each time return a.
	 * 
	 * @param a the left operand.
	 * @param b the right operand.
	 * @return the sum of the two values.
	 */
	int addRec(int a, int b);

	/**
	 * Sums up the numbers in the sequence {1,2,3, ..., n}. This method is
	 * implemented iteratively.
	 * 
	 * @param n the size of the sequence
	 * @return the sum.
	 */
	int sum(int n);

	/**
	 * Sums up the numbers in the sequence {1,2,3, ..., n}. This method is
	 * implemented recursively.
	 * 
	 * @param n the size of the sequence
	 * @return the sum.
	 */
	int sumRec(int n);

	/**
	 * Searches for the number x in the given array, iteratively. The array does not
	 * have to be sorted.
	 * 
	 * Method: Starting from the beginning of the array, check every element (arr[i]==x). 
	 * If x is found, return its index, i. If x is not present in the array, return -1.
	 * 
	 * @param arr  the given array within which the search takes place.
	 * @param x    the value to be queried.
	 * @return the index of the queried value. It returns (-1) if the queried value
	 *         is not present in the array.
	 */
	int search(long[] arr, long x);

	
	/**
	 * Searches for the number x in the given array, recursively. The array must be
	 * sorted in ascending order.
	 * 
	 * Method: Find the middle of the array (i.e., (to - from) / 2). If the middle
	 * value of the array is larger than x, since the array is sorted in ascending
	 * order, search only the first half. Otherwise, search only the second half.
	 * Repeat (recursively) until arr[middle]==x.  
	 * 
	 * @param arr  the given array within which the search takes place.
	 * @param from the index of the first element from which the search starts.
	 * @param to   the index of the last element to which the search ends.
	 * @param x    the value to be queried.
	 * @return the index of the queried value. It returns (-1) if the queried value
	 *         is not present in the array.
	 */
	int searchByDividingRec(long[] arr, int from, int to, long x);
	
	
	/**
	 * Searches for the number x in the given array, iteratively. The array must be
	 * sorted in ascending order.
	 * 
	 * Method: Find the middle of the array (i.e., (to - from) / 2). If the middle
	 * value of the array is larger than x, since the array is sorted in ascending
	 * order, x must be in the first half of the array. So, to = middle - 1. If the
	 * middle value of the array is smaller than x, x must be in the second half of
	 * the array. So, from = middle + 1. Now it is time to update the middle point
	 * (middle = (to - from) / 2 ). Repeat this procedure until the middle point is
	 * equal to x.
	 * 
	 * @param arr  the given array within which the search takes place.
	 * @param from the index of the first element from which the search starts.
	 * @param to   the index of the last element to which the search ends.
	 * @param x    the value to be queried.
	 * @return the index of the queried value. It returns (-1) if the queried value
	 *         is not present in the array.
	 */
	int searchByDividing(long[] arr, int from, int to, long x);

	
	/**
	 * Counts the number of people in a line (a list of integers here) in a recursive
	 * fashion.
	 * Method:
	 * 0. Initially, n = 0, and the list has some (unknown) integers (zeros) in it.
	 * 1. In each step, remove one element from the list and call the same method
	 * 	to process the updated list. Also, print out "Me and the guys behind me!".
	 * 2. If it is the first time doing so, print out "How many?".
	 * 3. If it is the last time (line.size()==1), print "Just me!" and return 1.
	 * 4. The method returns what was returned to it plus 1.
	 * 
	 * 
	 * Situation: You have to stand in a line to get into a night club. You really
	 * want to know how many people are in the line but since the music is crazy
	 * loud, people can only hear the ones right after and before them. How do you
	 * do it?
	 * 
	 * Example:
	 * Input: [0, 0, 0, 0, 0], n = 0
	 * Output:
	 * How many?
	 *	Me and the guys behind me!
	 *	 Me and the guys behind me!
	 *	  Me and the guys behind me!
	 *	   Me and the guys behind me!
	 *	    Just me!
	 *	   2
	 *	  3
	 *	 4
	 *	5
	 * 
	 * @param line a list of zeros.
	 * @param n initially zero. This is used to keep track of number of spaces, and
	 * more importantly, whether or not this is the first call of the function.
	 * @return the length of the list (number of poeple in the line.)
	 */
	int howManyInLine(List<Integer> line, int n);

}
