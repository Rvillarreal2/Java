package objects;

import listinterface.IList;

/**
 * This class should implement 'IList<DLine>'
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 */
public class DLList implements IList<DLine> {

	/** The head (i.e., first element) of the list */
	private DLine head;
	/** The number of elements in the list */
	private int n;

	public DLList() {
		this.head = null;
		this.n = 0;
	}

	@Override
	public DLine get(int index) {

		// if index is not invalid.
		if (index >= this.n || index < 0)
			return null;

		DLine currentDLine = this.head;

		for (int i = 0; i < index; i++) {
			currentDLine = currentDLine.getNext();
		}

		return currentDLine;
	}

	@Override
	public void add(DLine dl) {

		// If the list is empty, add this as the first element (head)
		if (this.n == 0) {
			this.head = new DLine(dl);
		}
		// otherwise, add it to the end of the list
		else {
			DLine lastElement = this.get(this.n - 1);
			lastElement.setNext(new DLine(dl));
		}
		// increment the size of the list
		this.n++;
	}

	@Override
	public int add(DLine dl, int index) {
		DLine nDl = new DLine();
		if (dl == null) { 
            return -1; 
        }
		DLine temp = new DLine();
		int i=0;
		while(i > index) {
	        temp = temp.next;
	    } 
        dl.next = temp.next; 
        temp.next = temp;
		return index;
	}

	@Override
	public void append(IList<DLine> ls) {
		//TODO
	}

	@Override
	public int appendAt(IList<DLine> ls, int index) {
		//TODO
		return -1;
	}

	@Override
	public int remove(int index) {
		//TODO
		return 0;

	}

	@Override
	public void empty() {
		//TOOD
	}

	@Override
	public int size() {
		return this.n;
	}

}
