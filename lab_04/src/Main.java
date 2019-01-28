import java.util.LinkedList;
import java.util.List;

import objects.DLine;
import sortinterface.ISortMethods;

/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * -> Class: Data Structures - 2720 - - - - - - - - - - - - - - - - - - - - - -
 * -> LAB: 04 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Date: Friday 14 Sep, 2018 - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Subject: Sorting  - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Lab Web-page: - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 *  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 *  [https://sites.google.com/view/azimahmadzadeh/teaching/data-structures-2720]
 *  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/] - - - - - 
 */
public class Main {

	public static void main(String[] args) {

		
		/* ------------ Warm-up 1 ------------ */ startSection(1);
		// TASK:
		// -Create an instance of DLine.
		// -Print the line using 'toString' method.
		DLine obj = new DLine();
		System.out.println(obj);
		/* ------------ End 1 ------------ */ endSection(1);
		//
		//
		//
		//
		/* ------------ Warm-up 2 ------------ */ startSection(2);
		// TASK:
		// -Create an list of DLine objects (use LinkedList)
		// -Add 5 different instances of DLine.
		// -Display the content of the list using 'displayList' in 'ISortMethods'.
		List<DLine> objs = new LinkedList<DLine>();
		DLine obj1 = new DLine(9);
		DLine obj2 = new DLine(7);
		DLine obj3 = new DLine(5);
		DLine obj4 = new DLine(3);
		DLine obj5 = new DLine(1);
		objs.add(obj1);
		objs.add(obj2);
		objs.add(obj3);
		objs.add(obj4);
		objs.add(obj5);
		ISortMethods sm = new SortMethods();
		sm.displayList(objs);
		/* ------------ End 2 ------------ */ endSection(2);
		//
		//
		//
		//
		/* ------------ Warm-up 3 ------------ */startSection(3);
		// TASK:
		// -Iterate over the list you created above
		// --- Compare each line to its previous line.
		// --- Print for each comparison: [first line], [second line], [comparison result]
		System.out.println(obj1 + ", " + obj2 + ", " + obj1.compareTo(obj2));
		System.out.println(obj2 + ", " + obj3 + ", " + obj2.compareTo(obj3));
		System.out.println(obj3 + ", " + obj4 + ", " + obj3.compareTo(obj4));
		System.out.println(obj4 + ", " + obj5 + ", " + obj4.compareTo(obj5));
		System.out.println(obj5 + ", " + obj1 + ", " + obj5.compareTo(obj1));
		// -Q: What does the method 'compreTo' return?
		// compareTo returns difference between the amount of dashes of the two DLine objects as an integer value.
		//
		/* ------------ End 3 ------------ */ endSection(3);
		//
		//
		//
		//
		/* ------------ Warm-up 4 ------------ */startSection(4);
		// TASK:
		// -Store the first element of the list in 'tmpLine',
		// -Print myList.get(0),
		// -Change the size of the element in 'tmpLine',
		// -Again, print myList.get(0).
		DLine tmpLine = obj1;
		System.out.println(objs.get(0));
		tmpLine.length = 6;
		System.out.println(objs.get(0));
		//
		// -Q: Anything strange? Why? How to resolve this issue?
		// The printed result is from temporary variable that is not in the list.
		/* ------------ End 4 ------------ */ endSection(4);
		//
		//
		//
		//
		/* ------------ Warm-up 5 ------------ */startSection(5);
		// TASK:
		// -Iterate over the list you created above
		// --- Shift each element one step back (toward left)
		// -Shoot the first element to the end.
		// -Display the content of the list, first and also after each change.
		// -Visually verify the results.
		// TODO:
		/* ------------ End 5 ------------ */ endSection(5);
		//
		//
		//
		//
		//
		/* * * * * * * * * * * * * * * * * * * * * * * 	*
		 * - - - - - - - - - - - - - - - - - - - - - - 	*
		 * - - - - - - CONGRATULATIONS - - - - - - - - 	*
		 * - - - - - - - - - - - - - - - - - - - - - - 	*
		 * You are now ready to start implementing the	*
		 * first method in class SortMethods.			*
		 * - - - - - - - - - - - - - - - - - - - - - - 	*
		 * - - - - - - - - - - - - - - - - - - - - - - 	*
		 */
		/* ------------ Sort I ------------ */startSection(6);
		// TASK:
		// -Create a new list of DLines as follows: {15,12,9,6,13,10,7,1}
		// -Use the sort method 'sort_1' to sort the list.
		// -Display your sorting steps by putting 'displayList' inside your sort method.
		// -Verify your algorithm by visually checking the final list.
		// TODO:
		// -Q: What sort algorithm do you think this is?
		// TODO
		/* ------------ End I ------------ */endSection(6);
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
