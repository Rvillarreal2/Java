import blackbox.BTreePrinter;
import interfaces.IDTree;
import objects.DLine;
import objects.DTree;

/**
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * -> Class: Data Structures - 2720 - - - - - - - - - - - - - - - - - - - - - -
 * -> LAB: 12 - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Date: Friday 09 Nov, 2018 - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Subject: Binary Tree- - - - - - - - - - - - - - - - - - - - - - - - - - -
 * -> Lab Web-page: - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * [https://sites.google.com/view/azimahmadzadeh/teaching/data-structures-2720]
 * - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/] - - - - -
 */
public class Main {

	public static void main(String[] args) {
		
		IDTree <DLine> myTree = new DTree();
		myTree.insert(new DLine(5));
		myTree.insert(new DLine(4));
		myTree.insert(new DLine(8));
		myTree.insert(new DLine(6));
		myTree.insert(new DLine(2));
		myTree.insert(new DLine(6));
		BTreePrinter.printNode(myTree.getRoot());
		
	}
}
