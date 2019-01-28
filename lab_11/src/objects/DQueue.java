package objects;

import interfaces.IDQueue;

/**
 * This class should implement <code>IDQueue<DLine></code>. This is our
 * implementation of <code>Queue</code>s, with some extra methods. <br>
 * This data structure is designed to follow the FIFO ordering rule. That is,
 * items should enter the queue at the tail, and remain in the queue until they
 * reach the head and leave the queue from there. <br>
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 */
public class DQueue implements IDQueue<DLine> {

	int n;
	/** oldest entry (to be served first) */
	private DLine head;
	/** newest entry (to be served last) */
	private DLine tail;

	public DQueue() {
		this.n = 0;
		this.head = null;
		this.tail = null;
	}

	@Override
	public void enqueue(DLine dl) {

		DLine newDLine = new DLine(dl);
		if (this.n == 0) {
			this.head = newDLine;
			this.tail = newDLine;
		} else {
			this.tail.setNext(newDLine);
			this.tail = newDLine;
		}
		this.n++;
	}

	@Override
	public void enqueueAll(IDQueue dq) {
		// TODO
		
	}

	@Override
	public void transfer(IDQueue dq) {
		// TODO
	}

	@Override
	public DLine dequeue() {

		if (this.n == 0) {
			this.head = null;
			this.tail = null;
			return null;
		}

		DLine output = this.head;
		this.head = this.head.getNext();
		this.n--;
		return output;
	}

	@Override
	public DLine peek() {
		return this.head;
	}

	@Override
	public DLine last() {
		// TODO
		return this.tail;
	}

	@Override
	public void empty() {
		// TODO
	}

	@Override
	public int size() {
		return this.n;
	}

	/**
	 * <b>YOU DON'T NEED TO MODIFY THIS!</b><br>
	 * This method makes it easy to print the entire queue at once.
	 */
	public void displayQueue() {
		int i = 0;
		String first = "";
		String last = "";

		System.out.print("\tn:" + this.size() + "\t");
		if (this.size() == 0) {
			first = "(  ";
			last = ")";
		} else {
			first = this.head.toString();
			last = this.tail.toString();
		}

		System.out.print("H -->");
		if (this.size() == 1) {
			System.out.print(this.peek());
		} else {
			System.out.print(first);
			for (; i < this.size() - 2; i++) {
				System.out.print("(*)");
			}
			System.out.print(last);
		}
		System.out.print("<-- T");
		System.out.println();
	}

}
