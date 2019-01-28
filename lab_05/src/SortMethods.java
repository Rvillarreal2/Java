import java.util.List;

import objects.DLine;
import sortinterface.ISortMethods;

/**
 * This class should implement the interface 'ISortMethods<DLine>'
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 */
public class SortMethods implements ISortMethods<DLine> {

	@Override
	public void sort_1(List<DLine> ls) {
		
		int i = 1;
		while(i < ls.size()){
			DLine x = ls.get(i);
			int j = i-1;
			while(j >= 0 && ls.get(j).compareTo(x) > 0){
				ls.set(j+1, ls.get(j));
				j--;		
				//this.displayList(ls);
			}
			ls.set(j+1, x);
			i++;
			//this.displayList(ls);
		}
	}
	
	@Override
	public void sort_2(List<DLine> ls) {
		// TODO Auto-generated method stub
		int n = ls.size();
		//this.displayList(ls);
		while(n>0) {
			int nn = 0;
			for(int i=1; i<=n-1;++i) {
				if(ls.get(i-1).compareTo(ls.get(i))>0) {
					DLine temp = ls.get(i-1);
					ls.set(i-1, ls.get(i));
					ls.set(i, temp);
					nn=i;
					//this.displayList(ls);
				}
			}
			//this.displayList(ls);
			n=nn;
		}
		
	}

	@Override
	public void sort_3(List<DLine> ls) {
		// TODO Auto-generated method stub
		int n = ls.size();
		for(int i=0; i<=n-1; i++) {
			int min = i;
			for(int j=i+1; j<n; j++) {
				if(ls.get(j).compareTo(ls.get(min)) < 0) {
					min = j;
					//this.displayList(ls);
				}
			}
			if(min != i) {
				DLine temp = ls.get(i);
				ls.set(i, ls.get(min));
				ls.set(min, temp);
			}
		}
		
	}


}
