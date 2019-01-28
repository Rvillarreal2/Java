import java.util.Arrays;
import java.util.List;

/**
 * 
 * -> Class: Data Structures - 2720 Lab:
 * -> LAB: 03
 * -> Date: Friday 07 Sep, 2018
 * -> Subject: Java Revision (Recursion)
 * -> Lab Web-page: [https://sites.google.com/view/azimahmadzadeh/teaching/data-structures-2720]
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 */
public class Main {

	public static void main(String[] args) {
		
		Functions fun = new Functions();
		/* ---- Fun 1: Add [Recursively] ---- */
		// TASK:
		// 1. Call the method "addRec" for a = 10, b = 3,
		// 2. Print the result. Is that correct?
		//TODO
		/* ---- End Fun 1 ---- */
		System.out.println(fun.addRec(10,13));
		
		
		/* ---- Experiment I: Recursive ---- */
		// TASK:
		// 1. Run 'addRec' where a = 100,000 and b = 3,
		// 2. Run 'addRec' where a = 3, and b = 100,000,
		// Q. What do you observe? Why do you think this happened?
		//TODO
		/* ---- End Experiment I ---- */
		System.out.println(fun.addRec(3, 10000));
		
		
		/* ---- Fun 2: Sum [Iterative] ---- */
		// TASK:
		// 1. Call the method "sum" for n = 100,
		// 2. Print the result. Is that correct?
		//TODO
		/* ---- End Fun 2 ---- */
		System.out.println(fun.sum(10));
		
		
		
		/* ---- Fun 3: Sum [Recursive] ---- */
		// TASK:
		// 1. Call the method "sumRec" for n = 100,
		// 2. Print the result. Is that correct?
		//TODO
		/* ---- End Fun 3 ---- */
		System.out.println(fun.rSum(10));
		
		
		
		/* ---- Experiment II: Iterative VS Recursive ---- */
		// TASK:
		// 1. Record the execution time for "sum",
		// 2. Record the execution time for "sumRec",
		// 3. Compare the execution time as you increase n,
		// Q. Which one is faster?
		// Q. Which one is able to deal with very large values for n?
		//TODO
		/* ---- End Experiment II ---- */
		long[] arr1= {12,4,7,33,21,54,9,10,17};
		System.out.println(fun.search(arr1, 33));
		System.out.println(fun.search(arr1, 13));
		
		
		/* ---- Fun 4: search [Iterative] ---- */
		// TASK:
		// 1. Call the method "search" where arr = {12,4,7,33,21,54,9,10,17} and x = 33.
		// 2. Print the result. Is that correct?
		// 3. Call it again for the same arr but x = 13.
		// 4. Print the result. Do you get (-1)?
		//TODO
		/* ---- End Fun 4 ---- */
		
		long[] arr = {4,7,9,10,12,17,21,33,54};
		System.out.println(fun.searchByDividing(arr, 33));	
		System.out.println(fun.searchByDividing(arr, 13));	
		/* ---- Fun 5: searchByDividing [Iterative] ---- */
		// TASK:
		// 1. Call the method "searchByDividing" where arr = {4,7,9,10,12,17,21,33,54} and x = 33.
		// 2. Print the result. Is that correct?
		// 3. Call it again for the same arr but x = 13.
		// 4. Print the result. Do you get (-1)?
		//TODO
		/* ---- End Fun 5 ---- */
		
		System.out.println(fun.searchByDividingRec(arr, 33));
		System.out.println(fun.searchByDividingRec(arr, 13));
		/* ---- Fun 6: searchByDividingRec [Recursive] ---- */
		// TASK:
		// 1. Call the method "searchByDividingRec" where arr = {4,7,9,10,12,17,21,33,54} and x = 33.
		// 2. Print the result. Is that correct?
		// 3. Call it again for the same arr but x = 13.
		// 4. Print the result. Do you get (-1)?
		//TODO
		/* ---- End Fun 6 ---- */
		long[] n = fun.bigArr(100000);
		long startTime = System.nanoTime();
		fun.search(n, 9999);
		System.out.println(fun.search(n, 9999));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		long sTime = System.nanoTime();
		fun.searchByDividing(n, 9999);
		System.out.println(fun.searchByDividing(n, 9999));
		long eTime = System.nanoTime();
		System.out.println("Took "+(eTime - sTime) + " ns"); 
		long stTime = System.nanoTime();
		fun.searchByDividingRec(n, 9999);
		System.out.println(fun.searchByDividingRec(n, 9999));
		long enTime = System.nanoTime();
		System.out.println("Took "+(enTime - stTime) + " ns"); 
		/* ---- Experiment III: Iterative VS Recursive ---- */
		// TASK:
		// 1. Run 'search' where arr = {1,2,3,... ,100000} and x =  99999.
		// 2. Run 'search' for the same arr and x.
		// 3. Run 'search' for the same arr and x.
		// Q. Which one is faster?
		//TODO
		/* ---- End Experiment III ---- */
		
		
		List<Integer> line = Arrays.asList(0, 0, 0, 0, 0, 0);
		System.out.println(fun.howManyInLine(line, 0));
		/* ---- Fun 7: howManyInLine  ---- */
		// TASK:
		// 1. Create a list called 'line' of 6 zeros.
		// 2. Call the method 'howManyInLine' for 'line' and 0.
		// Q. Is the output correct? Did you get all numbers from 2 to 6?
		//TODO
		/* ---- End Fun 7 ---- */
		
	}
}
