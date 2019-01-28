package objects;

import interfaces.IDTree;

/**
 * This class should implement the interface <code>IDTree<DLine></code>. <br>
 * This class creates a binary (search) tree with nodes of type
 * <code>DLine</code>. A DTree follows these properties: - It has a root DLine
 * that is parent/ancestor of all nodes. - For each DLine dl, the following
 * conditions should always be held: - dl.length > dl.leftChild.length -
 * dl.length <= dl.rightChild.length
 * 
 * @author Azim Ahmadzadeh
 *
 */
public class DTree implements IDTree<DLine> {

	/* class fields */
	private DLine root;
	private int n;

	public DTree() {
		this.root = null;
		this.n = 0;
	}

	@Override
	public void insert(DLine dl) {
		this.root = this.insertRec(this.root, dl);
		this.n++;
	}
	
	private DLine insertRec(DLine currentDLine, DLine dl) {
		if(currentDLine == null) {
			return dl;
		}
		
		if(dl.length < currentDLine.length) {
			//LEFT
			currentDLine.setLeftChild(this.insertRec(currentDLine.getLeftChild(), dl));
		}
		else if(dl.length >= currentDLine.length) {
			//RIGHT
			currentDLine.setRightChild(this.insertRec(currentDLine.getRightChild(), dl));
		}
		
		return currentDLine;
	}

	@Override
	public DLine getRoot() {
		return this.root;
	}

	@Override
	public int getTreeLevel(DLine dl) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfNodes() {
		return this.n;
	}

}
