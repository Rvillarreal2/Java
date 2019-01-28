import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import interfaces.IDQueue;
import objects.DLine;
import objects.DQueue;

/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * -> Class: Data Structures - 2720 - - - - - - - - - - - - - - - - - - - - - -
 * -> LAB: 11 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Date: Friday 02 Nov, 2018 - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Subject: Queue- - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
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
		 * Constructor and size:									*
		 * - Create an instance of a DQueue, call it 'myQ1'.		*
		 * - Print out its size with an appropriate message.		*
		 * 															*
		 * (!) You should see exactly this:							*
		 * 		> Size of an empty DQueue: 0						*
		 * ========================= S-1 ========================== */startSection(1);
		// TODO
		 DQueue myQ1 = new DQueue();
		 System.out.println("Size of an empty DQueue: " + myQ1.size());

		/*-========================= S-2 ========================== *
		 * Peek:													*
		 * - If you have 'peek()' implemented, then you should be	*
		 * able	to display your queue using the method				*
		 * 'displayQueue()' which is already implemented for you.	*
		 * 															*
		 *  (!) You should see exactly this:						*
		 * 		> n:0	H -->(  )<-- T								*
		 * ========================= S-2 ========================== */startSection(2);
		// TODO
		 myQ1.displayQueue();

		/*-========================= S-3 ========================== *
		 * Enqueue:													*
		 * - Do you have enqueue() implemented? Great.				*
		 * - In a for loop, enqueue the following elements to myQ1.	*
		 * 															*
		 *     (10),(20),(30), ... , (100)							*
		 *     														*
		 * - Display myQ1 once AT EACH ITERATION.					*
		 * - Display the to-be-added DLine at each iteration.		*
		 * 															*
		 *  (!) myQ1 at the very end, for example, should look		*
		 *  like this:												*
		 *        													*	
		 *   + (100)												*
		 * 		> n:10	H -->(10)(*)(*)(*)(*)(*)(*)(*)(*)(100)<-- T	*
		 * 															*
		 * 	NOTE: Pay attention to the order of the elements being	*
		 * added to the TAIL side.									*
		 *       													*
		 * 	NOTE: The elements in the middle are intentionally		*
		 * hidden.													*
		 * ========================= S-3 ========================== */startSection(3);
		// TODO
		 DLine exa = new DLine(10);
		 for(int i = 1; i <= 10; i++) {
			 System.out.println(exa);
			 myQ1.enqueue(exa);
			 myQ1.displayQueue();
			 exa.length = exa.length + 10;
			 if(i==10) {
				 exa.length -= 10;
			 }
		 }

		/*-========================= S-4 ========================== *
		 * Peek:													*
		 * - We have been using 'peek' method in our 'displpayQueue'*
		 * , however, we did not test it here.						*
		 * - Display myQ1, call peek and print out what it returns,	*
		 * and then display the queue again.						*
		 * 															*
		 *  (!) You should output this sequence:					*
		 *  														*
		 * 		> n:10	H -->(10)(*)(*)(*)(*)(*)(*)(*)(*)(100)<-- T *
		 *		> Peek returned:	(10)							*
		 *		> n:10	H -->(10)(*)(*)(*)(*)(*)(*)(*)(*)(100)<-- T *
		 * 															*
		 *  NOTE: Notice how (10) is only returned and not removed!	*
		 * 	NOTE: Which DLine is returned. First or last?			*
		 * ========================= S-4 ========================== */startSection(4);
		// TODO
		 myQ1.displayQueue();
		 System.out.println("Peek returned: " + myQ1.peek());
		 myQ1.displayQueue();

		/*-========================= S-5 ========================== *
		 * Dequeue:													*
		 * - Do you have dequeue() already implemented? Great.		*
		 * - In a for loop, dequeue all of the DLines from myQ1.	*
		 * - Display myQ1 at each iteration.						*
		 * - Display the to-be-removed DLine at each iteration.		*
		 * 															*
		 *  (!) myQ1 at the very end, for example, should look		*
		 *  exactly	like this:										*
		 * 															*
		 *  -(100)													*
		 * 		> n:0		H -->(  )<-- T							*
		 *															*
		 * 	NOTE: Pay attention to the order in which the elements	*
		 * are being removed.										*
		 * 															*
		 * - What will happen if you go over the limit, by changing *
		 * the number of iterations from 10 to 12? Try it.			*
		 * 															*
		 *  (!) myQ1 should NOT be affected by this.				*
		 *  														*
		 *  - null													*
		 *     	> n:0		H -->(  )<-- T							*
		 * ========================= S-5 ========================== */startSection(5);
		// TODO
		 for(int i = 1; i <= 10; i++) {
			 System.out.println("-" + exa);
			 myQ1.dequeue();
			 myQ1.displayQueue();
		 }

		/*-========================= S-6 ========================== *
		 * EnqueueAll:												*
		 * - Implement enqueueAll method first.						*
		 * - Now we need two queues: myQ1 and myQ2. Use the			*
		 * following DLines to initialize them:						*
		 *      myQ1: (10),(20),(30),(40)							*
		 *      myQ2: (1),(2),(3),(4)								*
		 *      													*
		 * - Display both myQ1 and myQ2, with proper naming on the	*
		 * output:													*
		 * 															*
		 *  (!) You should see this:								*
		 * 															*
		 * 		> myQ1 before:										*
		 *		>	n:4		H -->(10)(*)(*)(40)<-- T				*
		 *		> myQ2 before:										*
		 *		>	n:4		H -->( 1)(*)(*)( 4)<-- T				*
		 * 															*
		 * - Now, add all elements of myQ2 to myQ1, using the		*
		 * method enqueueAll.										*
		 * - Display both myQ1 and myQ2 again.						*
		 * 															*
		 *  (!) You should see this:								*
		 *															*
		 * 		> myQ1 after:										*
		 *     	>	n:8		H -->(10)(*)(*)(*)(*)(*)(*)( 4)<-- T	*
		 *		> myQ2 after:										*
		 *		> 	n:4		H -->( 1)(*)(*)( 4)<-- T				*
		 *															*
		 *	NOTE: Make sure myQ2 is not empty after this.			*
		 *	NOTE: Are the orders preserved as they should?			*
		 * ========================= S-6 ========================== */startSection(6);
		// TODO
		 DLine x = new DLine(10);
		 for(int i = 1; i <= 4; i++) {
			 myQ1.enqueue(x);
			 x.length = x.length + 10;
			 if(i==10) {
				 x.length -= 10;
			 }
		 }
		 System.out.println("myQ1 after:");
		 myQ1.displayQueue();
		 DQueue myQ2 = new DQueue();
		 DLine z = new DLine(1);
		 for(int i = 1; i <= 4; i++) {
			 myQ2.enqueue(z);
			 z.length = z.length + 1;
			 if(i==10) {
				 x.length -= 1;
			 }
		 }
		 System.out.println("myQ2 after:");
		 myQ2.displayQueue();

		 myQ1.enqueueAll(myQ2);
		 myQ1.displayQueue();
		 
		/*-========================= S-7 ========================== *
		 * Transfer:												*
		 * - Implement transfer method first.						*
		 * - Re-initialize myQ1, to have DLines as follows:			*
		 *      myQ1: (10),(20),(30),(40)							*
		 *      myQ2: (1),(2),(3),(4)								*
		 *      													*
		 * - Display both myQ1 and myQ2, with proper naming on the	*
		 * output:													*
		 * 															*
		 *  (!) You should see this:								*
		 * 															*
		 * 		> myQ1 before:										*
		 *		>	n:4		H -->(10)(*)(*)(40)<-- T				*
		 *		> myQ2 before:										*
		 *		>	n:4		H -->( 1)(*)(*)( 4)<-- T				*
		 * 															*
		 * - Now, transfer all elements of myQ2 to myQ1, using the	*
		 * method transfer.											*
		 * - Display both myQ1 and myQ2 again.						*
		 * 															*
		 *  (!) You should see this:								*
		 *															*
		 * 		> myQ2 after:										*
		 *     	>		n:8	H -->(10)(*)(*)(*)(*)(*)(*)( 4)<-- T	*
		 *		> myQ2 after:										*
		 *		> 		n:0	H -->(  )<-- T							*
		 *															*
		 *	NOTE: Make sure myQ2 is empty after this.				*
		 *	NOTE: Are the orders preserved inmyQ1, as they should?	*
		 * ========================= S-7 ========================== */startSection(7);
		// TODO

		/*-========================= S-8 ========================== *
		 * Empty:													*
		 * - Implement 'empty' method first.						*
		 * - Display, myQ1 first, empty it and then display it 		*
		 * again.													*
		 * 															*
		 *  (!) You should see this:								*
		 * 															*
		 * 		> myQ1 before:										* 
		 *		>	n:8		H -->(10)(*)(*)(*)(*)(*)(*)( 4)<-- T	*
		 *		>myQ1 after: 										*
		 *		>	n:0		H -->(  )<-- T							*
		 * ========================= S-8 ========================== */startSection(8);
		// TODO

		/*-========================= S-9 ========================== *
		 * Experiments:												*
		 * 															*
		 * Here, we want to compare performance of different Queues	*
		 * in appending new elements.								*
		 * 															*
		 * Follow these steps:										*
		 *  														*
		 * 1. Construct a queue using 'LinkedList', with a reference*
		 * to 'java.util.Queue'.									*
		 * 2. Construct another queue using 'PriorityQueue', with	*
		 * the same reference (to 'java.util.Queue').				*
		 * 3. Construct yet another queue, this time using DQueue,	*
		 * with a reference to IDQueue.								*
		 *  														*
		 * - Add 100,000 instances of DLines to each of them and	*
		 * record the time needed for such tasks, separately.		*
		 *  														*
		 * - With an appropriate message, print out the elapsed time*
		 * corresponding to each of those queues.					*
		 * 															*
		 * (?) WHICH ONE IS FASTER?									*  
		 * 															*
		 * ========================= S-9 ========================== */startSection(9);
		// TODO

		/*-========================= === ========================== *
		 * 															*
		 * 		CONGRATULATIONS! You now know everything about		*
		 * 							QUEUEs!							*
		 * 															*
		 *  														*
		 * ========================= === ========================== */

	}

	/** IGNORE THIS METHOD **/
	private static void startSection(int i) {
		System.out.print("\n:::::::::::::::::::::::");
		System.out.print(" START [" + i + "] ");
		System.out.print(":::::::::::::::::::::::\n\n");
	}

}
