package objects;

/**
 * DLine is a line with a certain length. This class creates nodes with three
 * pieces of information: the length of the DLine, the address to its left
 * child, and the address to its right child. Therefore, it can be used as the
 * tree nodes.<br>
 * 
 * This class was used before for implementing Singly Linked-Lists, Array-Lists,
 * and Queues. In this project we use this for implementation of our own binary
 * tree.<br>
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 */
public class DLine implements Comparable<DLine> {

	/** Length of the line */
	public int length;

	/** A link to the next element; */
	private DLine left;
	
	private DLine right;

	/**
	 * The default constructor. Using this constructor, an instance of DLine will be
	 * created with the default length of 2.
	 */
	public DLine() {
		this.length = 2;
		this.left = null;
		this.right = null;
	}

	/**
	 * The constructor. Using this constructor, an instance of DLine will be created
	 * with the length of <code>len</code>.
	 * 
	 * @param len
	 *            length of the line.
	 */
	public DLine(int len) {
		this.length = len;
		this.left = null;
		this.right = null;
	}

	/**
	 * Copy constructor. This should be used to avoid unwanted effects due to some
	 * objects being linked together.
	 * 
	 * @param dl
	 *            the object based on which a copy should be created.
	 */
	public DLine(DLine dl) {
		this.length = dl.length;
		this.left = null;
		this.right = null;
	}

	/**
	 * Getter for the class field <code>next</code>
	 * 
	 * @return the DLine next to this DLine. If this node is not connected to any
	 *         other node, then it returns <code>null</code>.
	 */
	public DLine getLeftChild() {
		return (this.left);
	}

	public DLine getRightChild() {
		return (this.right);
	}
	
	
	/**
	 * Setter for the class field <code>next</code>
	 * 
	 * @param dl
	 *            the DLine to which this DLine should be connected.
	 */
	public void setLeftChild(DLine dl) {
		this.left = dl;
	}
	
	
	public void setRightChild(DLine dl) {
		this.right = dl;
	}

	/**
	 * This method overrides 'toString' for DLine objects. This is to make it easy
	 * to print the lines.
	 */
	@Override
	public String toString() {
		String len = "";
		if(this == null)
			len = "_";
		else
//			len = this.length < 10 ? "( " + this.length + ")" : "(" + this.length + ")";
			len = this.length + "";
		return len;
	}

	/**
	 * This method allows instances of this class to be comparable with one another.
	 * <br>
	 * <b>Example:</b><br>
	 * <code>if(line1.compareTo(line2) > 0) {//line1 is longer than line2.}</code>
	 */
	@Override
	public int compareTo(DLine line) {
		return this.length - line.length;
	}

}
