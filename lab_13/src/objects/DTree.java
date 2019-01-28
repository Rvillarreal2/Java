package objects;

import java.util.LinkedList;
import java.util.Queue;

import interfaces.IDTree;
import objects.DLine;

/**
 *This class should implement the interface <code>IDTree<DLine></code>.
 * <br>
 * <pre>
 * This class creates a binary (search) tree with nodes of type <code>DLine</code>. A DTree
 * follows these properties:
 * 		- It has a root DLine that is parent/ancestor of all nodes.
 * 		- For each DLine dl, the following conditions should always be held:
 * 			- dl.length > dl.leftChild.length
 * 			- dl.length <= dl.rightChild.length
 * </pre>
 * @author Azim Ahmadzadeh
 *
 */
public class DTree implements IDTree<DLine> {

	private DLine root;
	private int n;

	public DTree() {
		this.root = null;
		this.n = 0;
	}
	
	@Override
	public DLine getRoot() {
		return this.root;
	}
	
	@Override
	public int getNumberOfNodes() {

		return this.n;
	}

	@Override
	public void insert(DLine dl) {
		this.root = this.insertRec(this.root, dl);
		this.n++;
	}

	private DLine insertRec(DLine currentDLine, DLine dl) {

		// If this node does not exist
		if (currentDLine == null) {
			return new DLine(dl);
		}

		// If the new DLine is shorter than the current DLine,
		if (dl.length < currentDLine.length) {
			// add dl to the left of currentDLine
			currentDLine.setLeftChild(insertRec(currentDLine.getLeftChild(), dl));
		} else if (dl.length >= currentDLine.length) {
			// else, add dl to the right of currentDLine
			currentDLine.setRightChild(insertRec(currentDLine.getRightChild(), dl));
		}

		return currentDLine;
	}

	@Override
	public int getTreeLevel(DLine dl) {
		if(dl == null) {
			return 0;
		}else {
			int leftLev = getTreeLevel(dl.getLeftChild());
			int rightLev = getTreeLevel(dl.getRightChild());
			if(leftLev > rightLev)
				return(leftLev+1);
			else return(rightLev+1);
		}
	}
	
	@Override
	public void traverseInorder(DLine dl) {
		//TODO: call 'inorderRec' here
		if(dl == null) {
			return;
		}
		traverseInorder(dl.getLeftChild());
		System.out.print(dl.length + " ");
		traverseInorder(dl.getRightChild());
	}
	
	@Override
	public void traversePreorder(DLine dl) {
		//TODO: call 'preorderRec' here
		if(dl == null) {
			return;
		}
		System.out.print(dl.length + " ");
		traversePreorder(dl.getLeftChild());
		traversePreorder(dl.getRightChild());
	}
	
	@Override
	public void traversePostorder(DLine dl) {
		//TODO call 'postorderRec' here
		if(dl == null) {
			return;
		}
		traversePostorder(dl.getLeftChild());
		traversePostorder(dl.getRightChild());
		System.out.print(dl.length + " ");
	}
	
	@Override
	public void traverseLevelOrder() {
		//TODO
		Queue<DLine> queue = new LinkedList<DLine>(); 
        queue.add(root); 
        while (!queue.isEmpty()) { 
        	DLine temp = queue.poll(); 
            System.out.print(temp.length + " "); 
            if (temp.getLeftChild() != null) { 
                queue.add(temp.getLeftChild());
            } 
            if (temp.getRightChild() != null) { 
                queue.add(temp.getRightChild()); 
            } 
        }
	}
	
	@Override
	public DLine find(DLine dl, int len) {
		//TODO
		System.out.println("Looking for " + len + "...");
		if(root.length == len) {
			return dl=root;
		}
		Queue<DLine> queue = new LinkedList<DLine>(); 
        queue.add(root); 
        while (!queue.isEmpty()) { 
        	DLine temp = queue.poll(); 
            if (temp.getLeftChild() != null) { 
                queue.add(temp.getLeftChild());
            }
            if(queue.peek().length == len && temp.getLeftChild() != null) {
            	dl = queue.poll();
            	break;
            }
            if (temp.getRightChild() != null) { 
                queue.add(temp.getRightChild()); 
            }
            if(queue.peek().length == len && queue.peek() != null) {
            	dl = queue.poll();
            	break;
            }
            if(temp.getRightChild() == null && temp.getLeftChild() == null && temp.getLeftChild().length != len && temp.getLeftChild().length != len) {
                	throw new NullPointerException("null");
            }
        }
        if(dl==null)
        	throw new NullPointerException("null");
		return dl;
		
	}
	
}
