package objects;

/**
 * <b>DO NOT MODIFY THIS CLASS!</b> We made all the necessary modifications before.
 * <br><br>
 * DLine is a line with a certain length. This class field 'length' indicate the length
 * of the DLine.<br>
 * 
 * This class is created to be used for several implementations including LinkedLists and
 * ArrayLists.<br>
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 */
public class DLine implements Comparable<DLine> {

	/** Length of the line */
	public int length;

	/**
	 * The default constructor. Using this constructor, an instance of DLine will be
	 * created with the default length of 2.
	 */
	public DLine() {
		this.length = 2;
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
