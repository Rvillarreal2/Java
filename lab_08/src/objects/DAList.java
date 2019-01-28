package objects;

import listinterface.IList;

/**
 * This class should implement the interface 'IList<DLine>'. DAList is a
 * customized class tht functions similar to the class <code>ArrayList</code>.
 * It has three main class fields; an array (data) where the actual data is
 * stored, an int (size) which keeps track of the number of elements actually
 * added to the array, and another number (capacity) which represents the actual
 * size of the array. The last one, is to reduce the number of times resizing
 * the array is needed by keeping a safety margin. This piece of information
 * will be invisible to the user.
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/] - - - - -
 *
 */
public class DAList implements IList<DLine>{
	
	private static final int SIZE_FACTOR = 2;
	private int size;
	private int capacity;
	private DLine[] data;
	
	public DAList() {
		this.size = 0;
		this.capacity = 10;
		this.data = new DLine[this.capacity];
	}
	
	public DAList(int capacity) {
		this.size = 0;
		this.capacity = capacity;
		this.data = new DLine[this.capacity];
	}
	/**
	 * <b>YOU DON'T NEED TO MODIFY THIS!</b><br>
	 * This method makes it easy to print the entire list at once.
	 */
	public void displayList() {

//		int i = 0;
//		System.out.print("\t< ");
//		if (this.size != 0) {
//			for (; i < this.size - 1; i++) {
//				if(this.get(i) == null)
//					System.out.print("__" + "|");
//				else
//					System.out.print(this.get(i).toString() + "|");
//			}
//			if(this.get(i) == null)
//				System.out.print("__");
//			else
//				System.out.print(this.get(i).toString());
//		}
//		System.out.print(" >\t");
//		System.out.println("\ts:" + this.size + "\tc:" + this.capacity);
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public DLine get(int index) {
		if(index < 0 || index > this.size) {
			throw new IndexOutOfBoundsException();
		}
		return this.data[index];
	}

	@Override
	public void set(DLine dl, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(DLine dl) {
		
		this.ensureCapacity();
		this.data[this.size] = new DLine(dl);
		this.size++;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAfter(DLine dl, int index) {
		if(this.size<capacity*3/4) {
			return;
		}else {
			this.resize();
		}
		
	}

	@Override
	public void ensureCapacity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize() {
		int newCapacity = this.capacity * this.SIZE_FACTOR;
		DLine[] tmp = new DLine[newCapacity];
		for(int i= 0; i < this.size; i++) {
			tmp[i] = this.data[i];
		}
		this.data = tmp;
		this.capacity = newCapacity;
		tmp = null;
		
	}
}
