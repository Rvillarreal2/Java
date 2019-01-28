import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

import objects.DLine;
import sortinterface.ISortMethods;

/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * -> Class: Data Structures - 2720 - - - - - - - - - - - - - - - - - - - - - -
 * -> LAB: 05 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Date: Friday 21 Sep, 2018 - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Subject: Sorting - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Lab Web-page: - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * [https://sites.google.com/view/azimahmadzadeh/teaching/data-structures-2720]
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/] - - - - -
 */
public class Main {

	public static void main(String[] args) {
		SortMethods sort = new SortMethods();
		/* ------------ Preparation ------------ */
		// -Create an object of type SortMethods with a reference to ISortMethods,
		// -Create an empty list called 'myList' (sorting should NOT be done on this),
		// -Populate 'myList' with DLines of the following lengths:
		// {15,12,9,6,13,10,7,1},
		// -Create another empty list called 'sortedList' (We do our sorting on this),
		// -Populate 'sortedList' with the same elements, (Hint: Use the method:
		// 'addAll()')
		// -Display both of your lists using 'displayList' and make sure they are
		// correctly populated.
		ISortMethods<DLine> sm = new SortMethods();
		List<DLine> myList = new LinkedList<>();
		myList.add(new DLine(15));
		myList.add(new DLine(12));
		myList.add(new DLine(9));
		myList.add(new DLine(6));
		myList.add(new DLine(13));
		myList.add(new DLine(10));
		myList.add(new DLine(7));
		myList.add(new DLine(1));
		
		List<DLine> sortedList = new LinkedList<>();
		sortedList.addAll(myList);
		
		sm.displayList(myList);
		//
		/* ------------ End Prep ------------ */
		//
		//
		//
		//
		//
		/* ------------ Sort I ------------ */startSection(1);
		// TASK:
		// -Implement the method 'sort_1' in the class 'SortMethods' by following its
		// javadoc,
		// -Use 'sort_1' to sort 'sortedList' in place,
		// -Display your sorting steps by calling 'displayList' inside your sort method,
		// -Verify the correctness of your algorithm by visually checking the steps and
		// the final list.
		sort.sort_1(sortedList);
		//
		// -Q: Which sort algorithm do you think this is? [Insertion | Selection |
		// Bubble]
		// YOUR ANSWER: This is insertions sort because it inserts an element at its sorted index after comparing it with multiple other elements
		// _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
		/* ------------ End I ------------ */endSection(1);
		//
		//
		//
		//
		//
		/* ------------ Sort II ------------ */startSection(2);
		// TASK:
		// -Implement the method 'sort_2' in the class 'SortMethods' by followings its
		// javadoc,
		// -Clear 'sortedList' and again add all elements to it.
		// -Use 'sort_2' to sort 'sortedList' in place,
		// -Display your sorting steps by calling 'displayList' inside your sort method,
		// -Verify your algorithm by visually checking the steps and the final list.
		sortedList.clear();
		sortedList.addAll(myList);
		sort.sort_2(sortedList);
		//
		// -Q: Which sort algorithm do you think this is? [Insertion | Selection |
		// Bubble]
		// YOUR ANSWER: This is bubble sort because it continuously swaps adjacent elements that are out of order.
		// _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
		/* ------------ End II ------------ */endSection(2);
		//
		//
		//
		//
		//
		/* ------------ Sort III ------------ */startSection(3);
		// TASK:
		// -Implement the method 'sort_2' in the class 'SortMethods' by followings its
		// javadoc,
		// -Clear 'sortedList' and again add all elements to it.
		// -Use 'sort_3' to sort 'sortedList' in place,
		// -Display your sorting steps by calling 'displayList' inside your sort method,
		// -Verify your algorithm by visually checking the steps and the final list.
		sortedList.clear();
		sortedList.addAll(myList);
		sort.sort_3(sortedList);
		//
		// -Q: Which sort algorithm do you think this is? [Insertion | Selection |
		// Bubble]
		// YOUR ANSWER: This is selection sort because it continuously moves the smallest element to the beginning
		// _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
		/* ------------ End III ------------ */endSection(3);
		//
		//
		//
		//
		//
		/* ------------ Experiment IV ------------ */startSection(4);
		// TASK:
		// - [Comment out all calls of 'displayList' in your sort methods!]
		// - Create a new list called 'largeList'
		// - Populate it will 1000 DLines, with the following lengths: {1000, 999, ...,
		// 1}
		// - Run the three sorting methods on 'largeList', and record their execution
		// times, separately.
		// - [Make sure you give each of the methods the unsorted list]
		// TODO
		List<DLine> largeList = new LinkedList<>();
		for(int z = 0; z<1000;z++) {
			int i =1000;
			largeList.add(new DLine(i));
			i--;
		}
		long tartTime = System.nanoTime();
		sort.sort_1(largeList);
		long ndTime = System.nanoTime();
		System.out.println(ndTime);
		largeList.clear();
		for(int z = 0; z<1000;z++) {
			int i =1000;
			largeList.add(new DLine(i));
			i--;
		}
		long tartTim = System.nanoTime();
		sort.sort_2(largeList);
		long ndTim = System.nanoTime();
		System.out.println(ndTim);
		largeList.clear();
		for(int z = 0; z<1000;z++) {
			int i =1000;
			largeList.add(new DLine(i));
			i--;
		}
		long tartTi = System.nanoTime();
		sort.sort_3(largeList);
		long ndTi = System.nanoTime();
		System.out.println(ndTi);
		//
		// Q: Which ons is faster? Write down the exact execution times in miliseconds.
		// YOUR ANSWER: Sort 1 = 471076515656660ms
		//				Sort 2 = 471076517632025ms
		//				Sort 3 = 471076855669285ms
		// Sort_1 is the fastest.
		/* ------------ End IV ------------ */endSection(4);
		//
		//
		//
		//
		//
		/* ------------ Experiment IV ------------ */startSection(5);
		// TASK:
		// - [Comment out all calls of 'displayList' in your sort methods!]
		// - Create a new list called 'largeList'
		// - Populate it will 1000 DLines, with the following lengths: {1, 2, ..., 1000}
		// - Run the three sorting methods on 'largeList', and record their execution
		// times, separately.
		// - [Make sure you give each of the methods the unsorted list]
		// TODO
		largeList.clear();
		for(int z = 0; z<1000;z++) {
			int i =1;
			largeList.add(new DLine(i));
			i++;
		}
		long startTime = System.nanoTime();
		sort.sort_1(largeList);
		long endTime = System.nanoTime();
		System.out.println(endTime);
		largeList.clear();
		for(int z = 0; z<1000;z++) {
			int i =1;
			largeList.add(new DLine(i));
			i++;
		}
		long startTim = System.nanoTime();
		sort.sort_2(largeList);
		long endTim = System.nanoTime();
		System.out.println(endTim);
		largeList.clear();
		for(int z = 0; z<1000;z++) {
			int i =1;
			largeList.add(new DLine(i));
			i++;
		}
		long startTi = System.nanoTime();
		sort.sort_3(largeList);
		long endTi = System.nanoTime();
		System.out.println(endTi);
		// Q: Which ons is faster? Write down the exact execution times in miliseconds.
		// YOUR ANSWER: Sort 1 = 470764037856421ms
		//				Sort 2 = 470764039769414ms
		//				Sort 3 = 470764383889092ms
		// Sort_1 is the fastest again.
		// _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
		/* ------------ End IV ------------ */endSection(5);
		// Insertion sort is the most efficient sorting method for large list.
		// Selection sort is more efficient then bubble sort if the list is already in ascending order.
		// Bubble sort is more efficient then selection sort if the list is already in descending order.
		// Insertion sort seems to be the best way to sort a large list.
		//
		//
		/* ------------- END: CONCLUSION --------------------------*/
		/* --------------------------------------------------------*/
		/* -- Q: What is your conclusion from the two experiments? */
		/* -- [Write a short paragraph here.] ---------------------*/
		/* --------------------------------------------------------*/
		/* --------------------------------------------------------*/
		/* --------------------------------------------------------*/
		/* --------------------------------------------------------*/

	}

	
	/** IGNORE THIS METHOD **/
	private static void startSection(int i) {
		System.out.print("\n:::::::::::::::::::::::");
		System.out.print(" START [" + i + "] ");
		System.out.print(":::::::::::::::::::::::\n\n");
	}

	/** IGNORE THIS METHOD **/
	private static void endSection(int i) {
		System.out.print("\n________________________");
		System.out.print(" END [" + i + "] ");
		System.out.print("________________________\n\n");
	}

}
