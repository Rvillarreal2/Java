package listinterface;

/**
 * This interface declares the important methods needed for implementation of a
 * custom LinkedList.
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 * @param <DLine>
 */
public interface IList<DLine> {

	/**
	 * Return the element of the list at position <code>index</code>.
	 * 
	 * @param index index of the element to be returned.
	 * @return the queried element if <code>index</code> is valid, and
	 *         <code>null</code> otherwise.
	 */
	public DLine get(int index);

	/**
	 * appends the object <code>dl</code> to the end of this list.
	 * 
	 * @param dl the object to be added to the list.
	 */
	public void add(DLine dl);

	/**
	 * inserts the object <code>dl</code> at position <code>index</code> and shifts
	 * all the following elements one place to the right.
	 * 
	 * @param dl    the object to be added to the list.
	 * @param index the index where the object should be added at.
	 * @return 0 if the object is successfully added, and -1 otherwise.
	 */
	public int add(DLine dl, int index);

	/**
	 * appends the list <code>ls</code> to the end of this list.
	 * 
	 * @param ls the list to be appended.
	 */
	public void append(IList<DLine> ls);

	/**
	 * appends the list <code>ls</code> to this list at position <code>index</code>.
	 * In other words, after it is appended, the first element of <code>ls</code>
	 * will be at position <code>index + 1</code> in the existing list, and its last
	 * element will be at position <code>index + ls.size() - 1</code>. After that,
	 * the remaining elements of the existing list follow as before.
	 * 
	 * @param ls
	 * @param index
	 * @return 0 if the new list is successfully added, and -1 otherwise.
	 */
	public int appendAt(IList<DLine> ls, int index);

	/**
	 * removes the element at the position <code>index</code> of the list and shift
	 * all the following elements back.
	 * 
	 * @param index the position of the element which should be removed.
	 * @return 0 if the element is successfully removed, and -1 otherwise.
	 */
	public int remove(int index);

	/**
	 * Empty the list by making the head point to null.
	 */
	public void empty();

	/**
	 * @return the size of the list.
	 */
	public int size();

	/**
	 * <b>YOU DON'T NEED TO MODIFY THIS!</b><br>
	 * This method makes it easy to print the entire list at once.
	 */
	public default void displayList() {

		int i = 0;

		System.out.print("\t< ");
		if (this.size() != 0) {
			for (; i < this.size() - 1; i++) {
				System.out.print(this.get(i).toString() + "|");
			}
			System.out.print(this.get(i).toString());
		}
		System.out.print(" >\n");
	}
}
