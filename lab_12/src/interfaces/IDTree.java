package interfaces;

import objects.DLine;

public interface IDTree<DLine> {

	/**
	 * Inserts <code>dl</code> to the tree by preserving the following two
	 * conditions:
	 * <ul>
	 * <li><code>dl.length > dl.leftChild.lengt</code></li>
	 * <li><code>dl.length <= dl.rightChild.length</code></li>
	 * </ul>
	 * 
	 * @param dl
	 */
	public void insert(DLine dl);

	/**
	 * Returns the root node of the tree.
	 * @return
	 */
	public DLine getRoot();

	/**
	 * This method recursively parses the tree and as it reaches the bottom of the
	 * deepest branch, it starts a counter in a recursive fashion to count the tree
	 * level.
	 * 
	 * Tree Level: A binary tree is assigned a level number. The root of the tree
	 * has level number 1 and every other node has level number which is one more
	 * than the level number of its parent node.
	 * 
	 * @param dl
	 * @return
	 */
	public int getTreeLevel(DLine dl);

	/**
	 * Returns the number of nodes in this tree.
	 * @return
	 */
	public int getNumberOfNodes();
}
