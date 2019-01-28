import blackbox.BTreePrinter;
import interfaces.IDTree;
import objects.DLine;
import objects.DTree;

/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * -> Class: Data Structures - 2720 - - - - - - - - - - - - - - - - - - - - - -
 * -> LAB: 13 [Solutions] - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Date: Friday 16 Nov, 2018 - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Subject: Binary Tree- - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Lab Web-page: - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * [https://sites.google.com/view/azimahmadzadeh/teaching/data-structures-2720]
 * - - - - - - - - - - - - - - - - - - - -
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/] - - - - -
 */
public class Main {

	public static void main(String[] args) {

		/*-========================= S-1 ========================== *
		 * Constructor and insert:									*
		 * - Create an instance of a DTree, call it 'myTree'.		*
		 * - Add 8 DLines with the following lengths:				*
		 * 		{10, 14, 4, 3, 17, 27, 9, 11}						*
		 * - Use 'printNode' to display the entire tree.			*
		 * [Hint]: Pass the root of the tree as the argument of		*
		 * 'printNode'.												*
		 * 															*
		 * (!) You should see exactly this:							*
		 *        10        										*       
		 *		  / \       										*
		 *	     /   \      										*
		 *		/     \     										*
		 *	   /       \    										*
		 *	   4       14       									*
		 *	  / \     / \   										*
		 *	 /   \   /   \  										*
		 *	3   9   11   17   										*
		 *     				\ 										*
		 *     				27 										*
		 * ========================= S-1 ========================== */startSection(1);
		//TODO
		IDTree <DLine> myTree = new DTree();
		myTree.insert(new DLine(10));
		myTree.insert(new DLine(14));
		myTree.insert(new DLine(4));
		myTree.insert(new DLine(3));
		myTree.insert(new DLine(17));
		myTree.insert(new DLine(27));
		myTree.insert(new DLine(9));
		myTree.insert(new DLine(11));
		BTreePrinter.printNode(myTree.getRoot());
		
		 
		 
		/*-========================= S-2 ========================== *
		 * Tree level:												*
		 * - Implement the method 'getTreeLevel', first.			*
		 * - Print out the level of 'myTree'.						*
		 * 															*
		 * (!) You should see exactly this:							*
		 * 		Tree level: 4										*
		 * ========================= S-2 ========================== */startSection(2);
		//TODO
		 System.out.println(myTree.getTreeLevel(myTree.getRoot()));
		/*-========================= S-3 ========================== *
		 * Traversal (Depth-first):									*
		 * - Implement the method 'traverseInorder', first.			*
		 * - Run the method and print an appropriate message.		*
		 * 															*
		 * (!) You should see exactly this:							*
		 * 		Traverse [inorder]:									*
		 *		3 4 9 10 11 14 17 27 								*
		 * 															*
		 * - Now, implement the method 'traversePreorder'.			*
		 * - Run the method and print an appropriate message.		*
		 * 															*
		 * (!) You should see exactly this:							*
		 * 		Traverse [preorder]:								*
		 * 		10 4 3 9 14 11 17 27 								*
		 *  														*
		 * - Then, implement the method 'traversePostorder'.		*
		 * - Run the method and print an appropriate message.		*
		 * 															*
		 * (!) You should see exactly this:							*
		 * 		Traverse [postorder]:								*
		 * 		3 9 4 11 27 17 14 10 								*
		 * ========================= S-3 ========================== */startSection(3);
		//TODO
		 myTree.traverseInorder(myTree.getRoot());
		 System.out.println();
		 myTree.traversePreorder(myTree.getRoot());
		 System.out.println();
		 myTree.traversePostorder(myTree.getRoot());
		/*-========================= S-4 ========================== *
		 * Traversal (Breadth-first):								*
		 * - Implement the method 'traverseLevelOrder'.				*
		 * - Run the method and print an appropriate message.		*
		 * 															*
		 * (!) You should see exactly this:							*
		 * 		Traverse [levelorder]:								*
		 *		10 4 14 3 9 11 17 27 								*
		 * ========================= S-4 ========================== */startSection(4);
		//TODO
		 myTree.traverseLevelOrder();

		/*-========================= S-5 ========================== *
		 * Search (Depth-first):									*
		 * - Implement the method 'find'.							*
		 * - Try to find DLines of length 10, 9, 20, and 14.		*
		 * 															*
		 * (!) You should see exactly these outputs, respectively:	*
		 * 		Looking for 10 ...									*				
		 * 		Found: 10											*
		 * 															*
		 * 		Looking for 9 ...									*
		 * 		Found: 9											*
		 * 															*
		 * 		Looking for 20 ...									*
		 * 		Found: null											*
		 * 															*
		 * 		Looking for 14 ...									*
		 * 		Found: 14											*
		 * ========================= S-5 ========================== */startSection(5);
		//TODO
		 System.out.println("Found: " + myTree.find(myTree.getRoot(), 10));
		 System.out.println("Found: " + myTree.find(myTree.getRoot(), 9));
		 System.out.println("Found: " + myTree.find(myTree.getRoot(), 14));
		 System.out.println("Found: " + myTree.find(myTree.getRoot(), 20));
	}

	/** IGNORE THIS METHOD **/
	private static void startSection(int i) {
		System.out.print("\n:::::::::::::::::::::::");
		System.out.print(" START [" + i + "] ");
		System.out.print(":::::::::::::::::::::::\n\n");
	}
}
