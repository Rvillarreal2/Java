package listinterface;

import objects.DAList;

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
	 * Return the size of the DAList. This is equal to the length of the array in
	 * which we are storing the elements of our DAList.
	 * 
	 * @return the size of the DAList
	 */
	public int size();

	/**
	 * Get the DLine at position 'index'.
	 * 
	 * @param index the position in the DAList.
	 * @return the DLine at position 'index'
	 * @throws IndexOutOfBoundsException if the index is not valid.
	 */
	public DLine get(int index);

	/**
	 * Set a DLine at a specific position in the DAList.
	 * 
	 * @param dl    the DLine to be set at position 'index'.
	 * @param index the position at which the new DLine should be set.
	 * 
	 * @throws IndexOutOfBoundsException if the index is not valid.
	 */
	public void set(DLine dl, int index);

	/**
	 * Adds a DLine at the end of the DAList. This method first ensures that the
	 * capacity is maintained to be larger than the size of DAList by the desired
	 * ratio, and then adds the new element.
	 * 
	 * @param dl the DLine to be added.
	 */
	public void add(DLine dl);

	/**
	 * Adds a DLine right after a specific position in the DAList. For example, if
	 * position is 'index', then the new element will be added at position 'index' +
	 * 1. Note that, this is different than the set method since a new element is
	 * added. This method first ensures that the capacity is maintained to be larger
	 * than the size of DAList by the desired ratio, and then adds the new element.
	 * 
	 * @param dl    the DLine to be added.
	 * @param index the position at which the new DLine should be added.
	 * @throws IndexOutOfBoundsException if the index is not valid.
	 */
	public void addAfter(DLine dl, int index);

	/**
	 * Removes the DLine at position <code>index</code> from the list and
	 * consequently, moves all the elements after the removed one, one cell to the
	 * left.
	 * 
	 * @param index index of the elements to be removed from the list.
	 */
	public void removeAt(int index);
	
	/**
	 * Removes all the elements from <code>from</code> up to <code>to</code>, and
	 * consequently moves all the elements which were originally after the removed
	 * bulk back to continue at <code>to</code>.
	 * @param from the index from which the bulk should be removed.
	 * @param to the index up to which the bulk should be removed.
	 */
	public void removeAll(int from, int to);

	/**
	 * Removes all the elements of the list. Note that this method does not update
	 * the capacity of the list.
	 */
	public void removeAll();
	/**
	 * This method is responsible for always keeping the capacity larger than the
	 * actual size of the DALine by a pre-defined ratio. Using this method, the need
	 * for expanding the needed physical memory will be reduced.
	 */
	public void ensureCapacity();

	/**
	 * This method can be called whenever the capacity needs to be maintained. Only
	 * in this method, the actual size of the used array will be modified.
	 */
	public void resize();

	public void displayList();

}
