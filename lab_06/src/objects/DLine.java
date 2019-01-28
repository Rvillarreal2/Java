package objects;

/**
 * DLine is a line with a certain length. This class creates nodes with two
 * pieces of information: the length of the DLine, and the address of another
 * DLine to which this DLine is connected.<br>
 * 
 * This class is created to be used for the purpose of understanding Singly
 * Linked-Lists and also sorting methods.<br>
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 */
public class DLine implements Comparable<DLine> {

	/** Length of the line */
	public int length;
	
	private DLine next;

	/**
	 * The default constructor. Using this constructor, an instance of DLine will be
	 * created with the default length of 2.
	 */
	public DLine() {
		this.length = 2;
		this.next = null;
	}

	/**
	 * The constructor. Using this constructor, an instance of DLine will be created
	 * with the length of <code>len</code>.
	 * 
	 * @param len length of the line.
	 */
	public DLine(int len) {
		this.length = len;
		this.next = null;
	}

	/**
	 * Copy constructor. This should be used to avoid unwanted effects due to some
	 * objects being linked together.
	 * 
	 * @param dl the object based on which a copy should be created.
	 */
	public DLine(DLine dl) {
		this.length = dl.length;
		this.next = null;
	}
	public void setNext(DLine dl) {
		this.next = dl;
	}
	public DLine getNext() {
		return (this.next);
	}

	/**
	 * This method overrides 'toString' for DLine objects. This is to make it easy
	 * to print the lines.
	 */
	@Override
	public String toString() {
		String len = this.length < 10 ? "[ " + this.length + "]" : "[" + this.length + "]";
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
