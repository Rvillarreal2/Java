package interfaces;

public interface IDQueue<DLine> {
	
	/**
	 * Adds the given <code>DLine</code> to the end of the queue as
	 * a new tail. (Order: FIFO)
	 * 
	 * @param dl
	 */
	public void enqueue(DLine dl);
	
	/**
	 * Adds all the elements of the given queue <code>dq</code> to
	 * the end of the queue.
	 * @param dq the queue that should be added to the end of this
	 * queue. (Order: FIFO)
	 */
	public void enqueueAll(IDQueue dq);
	
	/**
	 * Dequeues all the <code>DLine</code>s from <code>dq</code> and
	 * enqueues them to this list one by one.
	 * The order is preserved in such a way that the tail of this
	 * queue is now pointing to the last element of <code>dq</code>
	 * @param dq the queue whose elements are to be transferred to
	 * this queue. (Order: FIFO)
	 */
	public void transfer(IDQueue dq);
	/**
	 * Retrieves and removes the first <code>DLine</code> (pointed to
	 * by the head) of this queue. (Order: FIFO)
	 * @return the
	 */
	public DLine dequeue();
	
	/**
	 * Retrieves, but does not remove, the first <code>DLine</code> of
	 * this queue (pointed to by head), or returns null if this queue is empty.
	 * @return the first element.
	 */
	public DLine peek();
	
	/**
	 * Retrieves, but does not remove, the last <code>DLine</code> of this queue.
	 * @return the last element.
	 */
	public DLine last();
	
	/**
	 * Makes the queue empty, by pointing both the head and tail to null.
	 */
	public void empty();
	
	/**
	 * 
	 * @return the number of elements in the queue.
	 */
	public int size();
	
	/**
	 * Displays the content of the queue using its first and last elements.
	 */
	public void displayQueue();
}
