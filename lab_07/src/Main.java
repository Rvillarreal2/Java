import listinterface.IList;
import objects.DLList;
import objects.DLine;

/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * -> Class: Data Structures - 2720 - - - - - - - - - - - - - - - - - - - - - -
 * -> LAB: 07 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Date: Friday 05 Oct, 2018 - - - - - - - - - - - - - - - - - - - - - - - -
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

		/*-======================= S-1 ======================== *
		 * Test: size()											*
		 * - Create a list ('myList1') and check its size.		*
		 * 														* 
		 * (!) You should see 0 as the size.					*
		 * ======================= S-1 ======================== */startSection(1);
		IList<DLine> myList1 = new DLList();
		System.out.println("The size of an empty list: " + myList1.size());

		/*-======================= S-2 ======================== *
		 * Test: add(int), size()								*
		 * - Add 5 elements to 'myList1' using your add method.	*
		 * (elements: DLines of size {0,1,2,3,4}.				*
		 * - Check the size of the list. Is it 5?				*
		 * - Print your list using displayList and verify it.	*
		 *														* 
		 * (!) You should see exactly this:						*
		 * 		< [ 0]|[ 1]|[ 2]|[ 3]|[ 4] >					*
		 * ======================= S-2 ======================== */startSection(2);
		myList1.add(new DLine(0));
		myList1.add(new DLine(1));
		myList1.add(new DLine(2));
		myList1.add(new DLine(3));
		myList1.add(new DLine(4));
		System.out.println(myList1.size());
		myList1.displayList();

		/*-======================= S-3 ======================== *
		 * Test: get(int)										*
		 * - Get the [first], [3rd] and [last] elements.		*
		 * - Print the length of them one by one.				*
		 * - Get the 100th element! What do you get?			*
		 * I got null.													*
		 * (!) You should see 0, 3, and 4, respectively.		*
		 * ======================= S-3 ======================== */startSection(3);
		 //TODO
		 System.out.println(myList1.get(0));
		 System.out.println(myList1.get(3));
		 System.out.println(myList1.get(myList1.size()-1));
		 System.out.println(myList1.get(100));
		 
		/*-======================= S-4 ======================== *
		 * Test: add(DLine, int)								*
		 * - Add a new DLine (size 11) as the [first] element.	*
		 * - Display your list and verify it.					*
		 * - Add a new DLine (size 22) as the [2nd] element.	*
		 * - Display your list and verify it.					*
		 * - Add a new DLine (size 33) as the [last] element.	*
		 * - Display your list and verify it.					*
		 *														* 
		 * (!) You should see exactly this, at the end:			*
		 * 		< [11]|[ 0]|[22]|[ 1]|[ 2]|[ 3]|[33]|[ 4] >		*
		 * 														*
		 * - Add a new DLine (size 44) as the [100th] element.	*
		 * - Print out what the add method returns.				*  
		 * 														* 
		 * (!) You should see -1.								*
		 * ======================= S-4 ======================== */startSection(4);
		//TODO
		 myList1.add(new DLine(11), 0);
		 myList1.add(new DLine(22), 3);
		 myList1.add(new DLine(33), myList1.size()-1);
		 myList1.displayList();

		/*-======================= S-5 ======================== *
		 * Test: remove(int)									*
		 * - Remove the DLine at index 0.						*
		 * - Display your list and verify it.					*
		 * - Remove the DLine at index now 1.					*
		 * - Display your list and verify it.					*
		 * - Remove the DLine at index now 4.					*
		 * - Display your list and verify it.					*
		 * - Remove the last DLine.								*
		 * - Display your list and verify it.					*
		 *														* 
		 * (!) You should see exactly this, at the end:			*
		 * 		< [ 0]|[ 1]|[ 2]|[ 3]|[ 4] >					*
		 *  													*
		 * - Remove the DLine at index 100!						*
		 * - Print out what the add method returns.				*  
		 * 														*
		 * (!) You should see -1.								*
		 * 														*
		 * - Display your list and make sure it is not affected *
		 * by the last operation.								*
		 * ======================= S-5 ======================== */startSection(5);
		//TODO

		/*-======================= S-6 ======================== *
		 * Test: append(DLList)									*
		 * - Create a new DLList called 'myList2'.				*
		 * - Add 3 elements to it using your add method.		*
		 * (elements: DLines of size {100, 101, 102}.			*
		 * - Print both lists and make sure they are:			*
		 * 		< [ 0]|[ 1]|[ 2]|[ 3]|[ 4] >					*
		 * 		< [100]|[101]|[102] >							*
		 * - Append 'myList2' to the end of 'myList1'			*
		 * - Print out 'myList2' again.							*  
		 * 														*
		 * (!) You should see exactly this:						*
		 *		< [ 0]|[ 1]|[ 2]|[ 3]|[ 4]|[100]|[101]|[102] >	*
		 * ======================= S-6 ======================== */startSection(6);
		//TODO

		/*-======================= S-7 ======================== *
		 * Test: appendAt(DLList, int)							*
		 * - Create a new DLList called 'myList3'.				*
		 * - Add 2 elements to it using your add method.		*
		 * (elements: DLines of size {50, 60}.					*
		 * - Print both 'myList1' and 'myList3'. Are they:		*
		 *		< [ 0]|[ 1]|[ 2]|[ 3]|[ 4]|[100]|[101]|[102] >	*
		 * 		< [50]|[60] >									*
		 * - Append 'myList3' at position 20 of 'myList1'		*
		 * - Print out what this method returns.				*
		 * 														*
		 * (!) You should see -1.								*
		 * 														*
		 * - Append 'myList3' at position 4 of 'myList1'		*
		 * - Print out 'myList2' again.							*  
		 * 														*
		 * (!) You should see exactly this:						*
		 *		< [ 0]|[ 1]|[ 2]|[ 3]|[ 4]|[50]|[60]|[100]|[101]|[102] > *
		 * ======================= S-7 ======================== */startSection(7);
		//TODO

		/*-======================= S-8 ======================== *
		 * Test: empty()										*
		 * - Empty your entire 'myList1' using this method.		*
		 * - Display the list, and print out the size. Correct?	*
		 * ======================= S-8 ======================== */startSection(8);
		//TODO
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
