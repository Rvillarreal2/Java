package objects;

import listinterface.IList;

/**
 * This class should implement <code>IList<DLine></code>. This is our
 * implementation of <code>ArrayList</code>s.
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 */
public class DAList implements IList<DLine> {

	private static final int SIZE_FACTOR = 2;

	/** The collection where we keep our data in */
	private DLine[] data;
	/** The actual number of elements in the list */
	private int size;
	/** The maximum possible number of elements that can be added to this list. */
	private int capacity;

	public DAList() {

		this.size = 0;
		this.capacity = 10;
		data = new DLine[this.capacity];
	}

	public DAList(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		data = new DLine[this.capacity];
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public DLine get(int index) {
		if (index < 0 || index >= this.size)
			throw new IndexOutOfBoundsException();

		return this.data[index];
	}

	@Override
	public void set(DLine dl, int index) {

		if (index < 0 || index >= this.size)
			throw new IndexOutOfBoundsException();

		this.data[index] = new DLine(dl);
	}

	@Override
	public void add(DLine dl) {

		this.ensureCapacity();
		// Add right after the last element
		this.data[this.size] = new DLine(dl);
		// Increment the size
		this.size++;
	}

	@Override
	public void addAfter(DLine dl, int index) {
		//TODO
		if(index<0|index>this.size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index == this.size) {
			this.add(dl);
			return;
		}
		DAList temp = new DAList();
		for(int i =index+1; i<this.size();i++) {
			temp.add(this.get(i));
		}
		size++;
		this.set(dl, index+1);
		int tIndex = 0;
		while(tIndex < temp.size()) {
			this.set(temp.get(tIndex), index+2);
			tIndex++;
			index++;
			this.ensureCapacity();
		}
	}

	@Override
	public void removeAt(int index) {
		//TODO
		if(index<0|index>this.size()) {
			throw new IndexOutOfBoundsException();
		}
		DAList temp = new DAList();
		for(int i =index+1; i<this.size();i++) {
			temp.add(this.get(i));
		}
		int tIndex = 0;
		while(tIndex < temp.size()) {
			this.set(temp.get(tIndex), index);
			tIndex++;
			index++;
			this.ensureCapacity();
		}
		size--;
	}

	@Override
	public void removeAll(int from, int to) {
		//TODO
		if((from<0|from>this.size()) | (to<0|to>this.size()) ) {
			throw new IndexOutOfBoundsException();
		}
		int z = from;
		for(int i=from; z < to ;z++) {
			this.removeAt(i);
		}
	}

	@Override
	public void removeAll() {
		//TODO
		for(int i=this.size(); i>0;--i) {
			size--;
		}
	}
	@Override
	public void ensureCapacity() {

		if (this.size < (this.capacity * 2) / 3) {
			// Everything is still OK.
			return;
		} else {
			// Margin of capacity is too small. So, resize.
			this.resize();
		}
	}

	@Override
	public void resize() {
		// Expand the capacity
		int newCapacity = this.capacity * this.SIZE_FACTOR;
		// Create a new array with the new capacity
		DLine[] tmp = new DLine[newCapacity];
		// Copy the old array into the new one
		for (int i = 0; i < this.size; i++) {
			tmp[i] = this.data[i];
		}
		this.data = tmp;
		this.capacity = newCapacity;
		tmp = null;
	}

	/**
	 * <b>YOU DON'T NEED TO MODIFY THIS!</b><br>
	 * This method makes it easy to print the entire list at once.
	 */
	public void displayList() {

		int i = 0;

		System.out.print("(s:" + this.size() + ",c:" + this.capacity + ")\t");
		System.out.print("< ");
		if (this.size() != 0) {
			for (; i < this.size() - 1; i++) {
				if (this.get(i) == null)
					System.out.print("__" + "|");
				else
					System.out.print(this.get(i).toString() + "|");
			}
			if (this.get(i) == null)
				System.out.print("__");
			else
				System.out.print(this.get(i).toString());
			System.out.println(" >");
		}
		else
			System.out.println(" >");

	}
}
