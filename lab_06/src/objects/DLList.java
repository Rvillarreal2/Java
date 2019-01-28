package objects;

import listinterface.IList;
/**
 * This class should implement 'IList<DLine>'
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 */
public class DLList implements IList<DLine> {
	
	private int n;
	private DLine head;
	
	@Override
	public DLine get(int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index > this.n) {
			return null;
		}
		
		DLine currentLine = this.head;
		for(int i = 0; i< index; i++) {
			currentLine = currentLine.getNext();
		}
		return currentLine;
	}

	@Override
	public void add(DLine dl) {
		// TODO Auto-generated method stub
		add(get(n-1));
		n++;
	}

	@Override
	public int add(DLine dl, int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void empty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
