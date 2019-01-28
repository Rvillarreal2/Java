import java.util.Arrays;
import java.util.List;

/**
 * 
 * -> Class: Data Structures - 2720 Lab:
 * -> LAB: 01
 * -> Date: Friday 31 Aug, 2018
 * -> Subject: Java Revision
 * -> Lab Web-page: [https://sites.google.com/view/azimahmadzadeh/teaching/data-structures-2720]
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 */

public class Main {

	public static void main(String[] args) {

		Functions fun = new Functions();
		
		/* ---- Fun 1: Get Average ---- */
		// TASK:
		// 1. Create an array & initialize it with { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
		// 2. Call 'getAverage' function on this array,
		// 3. Print out the result. (Is you result correct?)
		//TODO
		/* ---- END Fun 1 ---- */
		double[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		fun.getAverage(arr);
		
		
		/* ---- Fun 2: Get Max ---- */
		// TASK:
		// 1. Create a list & initialize it with {9.0, 5.0, 12.0, 0.0, -1.0, 14.3, 22.0,
		// -31.0, 7.0, 16.0},
		// 2. Call 'getMax()' function,
		// 3. Print out the result. (Is you result correct?)
		//TODO
		/* ---- END Fun 2 ---- */
		List<Double> l = Arrays.asList(9.0, 5.0, 12.0, 0.0, -1.0, 14.3, 22.0,-31.0, 7.0, 16.0);
		fun.getMax(l);
		
		
		/* ---- Fun 3: Get Max ---- */
		// TASK:
		// 1. Create a 3 by 3 matrix with the following numbers: {{-3,-2,-1},{0,1,2},{3,4,5}},
		// 2. Call 'getMax()' function,
		// 3. Print out the result. (Is you result correct?)
		//TODO
		/* ---- END Fun 3 ---- */
		double[][] mat = {{-3,-2,-1},{0,1,2},{3,4,5}};
		fun.getMax(mat);

		
		
		/* ---- Experiment on Time ---- */
		// TASK:
		// 1. Run 'initializeList' for a 'LinkedList' and 1000 elements.
		// 2. Get the execution time needed for this task.
		// 3. Run 'initializeList' again, this time for an ArrayList and 1000 elements.
		// 4. Get the execution time again.
		// 5. Repeat this experiment several times while increasing 1000 to 100,000 and
		// 10,0000,000.
		//
		// What do you observe? Any explanation?
		//The nanoseconds it takes for the code to run increases for every zero added.
		// The runtime is always a little bit different, even if the list size is kept the same.
		//TODO
		/* ---- END Experiment ---- */
		long startTime = System.nanoTime();
		fun.initializeList(l, 10000000);
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 

		
		
		/* ---- Experiment on Memory ---- */
		// TASK:
		// 1. Run 'createMatrix' and print out the number of rows and columns,
		// 2. Repeat this while increasing the value of n (100, 1000, 10000)
		// 2. What is the smallest n for which you get an error?
		// 4. What kind of error you get? Why?
		// At 100,000 I received an out of memory error.I assume it is because the matrix took up more memory than was available.
		//TODO
		/* ---- END Experiment ---- */
		fun.createMatrix(100);
		
		
		
		/* ---- Fun 5: Find chars ---- */
		// TASK:
		// 1. Create a string initialized with "ThisIsSoSuspicious" (exactly as it is typed here).
		// 2. Call 'findChars()' function,
		// 3. Print out the result. (Is you result correct?)
		//TODO
		/* ---- END Fun 5 ---- */
		fun.findAllUppdercases("ThisIsSoSuspicious");
		System.out.println(fun.findChars('s', "ThisIsSoSuspicious"));
		System.out.println(fun.cleanUp("ThisIsSo.Suspic.ious"));
	}

}
