package interfaces;

import objects.DLine;

public interface IDTree<DLine> {

	/**
	 * Returns the root node of the tree.
	 * @return
	 */
	public DLine getRoot();
	
	/**
	 * Returns the number of nodes in this tree.
	 * @return
	 */
	public int getNumberOfNodes();
	
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
	 * This method recursively parses the tree and as it reaches the bottom of the
	 * deepest branch, it starts a counter in a recursive fashion to count the tree
	 * level.</br></br>
	 * 
	 * Algorithm:
	 * <ul>
	 * <li>1. call this function (recursively) on the left child of dl.</li>
	 * <li>2. call this function on the right child of dl.</li>
	 * <li>3. return the maximum of what was returned on the last two lines.</li>
	 * </ul>
	 * Tree Level: A binary tree is assigned a level number. The root of the tree
	 * has the level number of 1 and every other node has the level number which is
	 * is one more than the level number of its parent node.
	 * 
	 * @param dl
	 * @return
	 */
	public int getTreeLevel(DLine dl);
	
	/**
	 * <b>inorder:</b> node.left, node, node.right
	 * </br>
	 * This method traverses (and prints out) the nodes of the tree in "inorder"
	 * fashion, meaning that for each node n, it visits the left sub-tree first,
	 * then the node n, and finally the right sub-tree.
	 */
	public void traverseInorder(DLine dl);
	
	/**
	 * <b>preorder:</b> node, node.left, node.right
	 * </br>
	 * This method traverses (and prints out) the nodes of the tree in "preorder"
	 * fashion, meaning that for each node n, it visits n first, then the left
	 * sub-tree and finally the right sub-tree.</br>
	 * 
	 * <b>Note:</b> Pre-order means processing the roots prior to the leaves.
	 */
	public void traversePreorder(DLine dl);
	
	/**
	 * <b>postorder:</b> node.left, node.right, node
	 * </br>
	 * This method traverses (and prints out) the nodes of the tree in "postorder"
	 * fashion, meaning that for each node n, it visits left sub-tree first, then
	 * the right sub-tree and finally the node n itself.</br>
	 * 
	 * <b>Note:</b> Post-order means processing the roots after the leaves.
	 */
	public void traversePostorder(DLine dl);
	
	/**
	 * This method traverses (and prints out) the nodes of the tree in "levelorder"
	 * fashion, meaning that it prints out all the nodes in level i, before it goes
	 * to the level i+1. </br>
	 * </br>
	 * <b>Hint:</b> Follow the steps of the pseudo code below:
	 * <pre>
	 *  queue.add(root)
	 *  while (queue is not empty):
	 *  	last = q.dequeue()
	 *  	print(last)
	 *  	if(last has left):
	 *  		q.add(left of last)
	 *  	if(last has right):
	 *  		q.add(right of last)
	 * </pre>
	 * </br>
	 */
	public void traverseLevelOrder();
	
	/**
	 * This method searches (Depth-first) through the tree, starting from the root
	 * looking for a DLine with the length equals to <code>len</code>.</br>
	 * </br>
	 * <b>Hint:</b>This search method could be very similar to the implementation of
	 * 'inorder' method.
	 * 
	 * @param dl the root of each sub-tree from which it starts the depth-first search.
	 * @param len the length of the DLine it searches for.
	 * @return the DLine whose length is equal to <code>len</code>, and <code>null</code>
	 * if such DLine does not exist in the tree.
	 */
	public DLine find(DLine dl, int len);
	

}
