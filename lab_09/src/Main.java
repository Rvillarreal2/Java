import listinterface.IList;
import objects.DAList;
import objects.DLine;

/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * -> Class: Data Structures - 2720 - - - - - - - - - - - - - - - - - - - - - -
 * -> LAB: 09 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Date: Friday 19 Oct, 2018 - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Subject: LinkedList - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Lab Web-page: - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * [https://sites.google.com/view/azimahmadzadeh/teaching/data-structures-2720]
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/] - - - - -
 */
public class Main {

	public static void main(String[] args) {

		/*-========================= S-1 ========================== *
		 * Warm-up:													*
		 * - Create a list ('myList1') with capacity 0.	Display it!	*
		 * 															*
		 * 		> (s:0,c:10)	<  >								*
		 * 															*
		 * - Re-initialize that list now with capacity 3. Display!	*
		 *  														*
		 * 		> (s:0,c:3)		<  >								*
		 * 															*
		 * - Add 6 instances of DLine with the following lengths:	*
		 * (10, 20, 30, 40, [NOT 50], 60, 70, 80)					*
		 * and display the list after each step. Pay attention to	*
		 * how the size	and capacity change.						*
		 * Eventually, you will have:								*
		 * 															*
		 * 		> (s:7,c:12)	< [10]|[20]|[30]|[40]|[60]|[70]|[80] >*
		 * 															*	 
		 * Great. Now you are all set.								*
		 * ========================= S-1 ========================== */startSection(1);

		// TODO
		 DAList sdfs = new DAList();
		 sdfs.displayList();
		 sdfs = new DAList(3);
		 sdfs.displayList();
		 sdfs.add(new DLine(10));
		 sdfs.add(new DLine(20));
		 sdfs.add(new DLine(30));
		 sdfs.add(new DLine(40));
		 sdfs.add(new DLine(60));
		 sdfs.add(new DLine(70));
		 sdfs.add(new DLine(80));
		 sdfs.displayList();

		/*-========================= S-2 ========================== *
		 * Test: addAfter											*
		 * - First, implement 'addAfter'.							*
		 * - Add an instance of DLine (length=50) right after		*
		 * index = 3, in your list 'myList'.						*
		 * - Display your list.										*
		 * 															*
		 * (!) You should see exactly this:							*
		 * (s:8,c:12)	< [10]|[20]|[30]|[40]|[50]|[60]|[70]|[80] > *
		 * 															*
		 * - Add another DLine (length=90), this time at the end.	*
		 * Use the method 'size()' to get the right position.		*
		 * 															*
		 * (!) You should see exactly this:							*
		 * (s:9,c:24)	< [10]|[20]|[30]|[40]|[50]|[60]|[70]|[80]|[90] >*
		 * 															*
		 * 															*
		 * MAKE SURE YOUR SIZE (s) AND CAPACITY (c) ARE CORRECT!	*
		 * ========================= S-2 ========================== */startSection(2);

		// TODO
		 sdfs.addAfter(new DLine(50), 3);
		 sdfs.displayList();
		 sdfs.addAfter(new DLine(90), sdfs.size());
		 sdfs.displayList();

		/*-========================= S-3 ========================== *
		 * Test: removeAt											*
		 * - First, implement 'removeAfter'.						*
		 * - Let's remove the first DLine in our list. Display!		*
		 * 															*
		 * (!) You should see exactly this:							*
		 * (s:8,c:24)	< [20]|[30]|[40]|[50]|[60]|[70]|[80]|[90] > *
		 * 															*
		 * - Try remove at index = 20!								*
		 * 															*
		 * (!) You should see exactly this:							*
		 * 		> Exception in thread "main"						*
		 * 		java.lang.IndexOutOfBoundsException					*
		 * 															*
		 * If correct, COMMENT OUT THIS LAST STEP! Do not leave your*
		 * code with an exception!									*
		 * ========================= S-3 ========================== */startSection(3);

		// TODO
		 sdfs.removeAt(0);
		 sdfs.displayList();
		 //sdfs.removeAt(20);
		 //sdfs.displayList();

		/*-========================= S-4 ========================== *
		 * Test: removeAll											*
		 * - First, implement 'removeAll'.							*
		 * - Let's remove all the elements from index 2 up to index *
		 * 5. Then, display the list.								*
		 * 															*
		 * (!) You should see exactly this:							*
		 * (s:5,c:24)	< [20]|[30]|[70]|[80]|[90] >				*
		 * 															*
		 * - Try remove at index = 20!								*
		 * 															*
		 * (!) You should see exactly this:							*
		 * 		> Exception in thread "main"						*
		 * 		java.lang.IndexOutOfBoundsException					*
		 * 															*
		 * If correct, COMMENT OUT THIS LAST STEP! Do not leave your*
		 * code with an exception!									*
		 * ========================= S-4 ========================== */startSection(4);

		// TODO
		 sdfs.removeAll(2,5);
		 sdfs.displayList();
		 //sdfs.removeAll(2,20);
		 //sdfs.displayList();

		/*-========================= S-5 ========================== *
		 * Test: removeAll											*
		 * - First, implement 'removeAll'. (Hint: This should be 	*
		 * very simple. Don't over think it.						*
		 * 															*
		 * (!) You should see exactly this:							*
		 * (s:0,c:24)	<  >										*
		 * 															*
		 * Correct? That's all.										*
		 * ========================= S-5 ========================== */startSection(5);

		// TODO
		 sdfs.removeAll();
		 sdfs.displayList();
	}

	/** IGNORE THIS METHOD **/
	private static void startSection(int i) {
		System.out.print("\n:::::::::::::::::::::::");
		System.out.print(" START [" + i + "] ");
		System.out.print(":::::::::::::::::::::::\n\n");
	}

}
