import java.util.Arrays;
import java.util.List;

/**
 * This class must implement the interface IFunctions.
 * 
 * @author STUDENT
 *
 */
public class Functions{
	
	public int addRec(int a, int b) {
		if(b==0) {
			return a;
		}
		b--;
		a++;
		return addRec(a,b);
	}
	public int sum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
	public int rSum(int n) {
		if(n==0) {
			return n;
		}
		return n + rSum(n-1);
	}
	public int search(long[] arr, long x) {
		for(int i=0; i<arr.length; i++) {
			if(x == arr[i]) {
				return i;
			}
		}
		return -1;
	}
	public int searchByDividing(long[] arr, long x) {
		return searchByDividing(arr,0, arr.length-1, x);
	}
	public int searchByDividing(long[] arr,int from, int to, long x) {
		while(from<to) {
			int mid = (to+from)/2;
			if(x>arr[mid]){
				from = mid+1;
			}else if(x<arr[mid]){
				to = mid-1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	public int searchByDividingRec(long[] arr, long x){
		return searchByDividingRec(arr, (int) arr[0], arr.length-1, x);
	}
	public static int searchByDividingRec(long[] arr, int from, int to, long x) {
		if(from>to) {
			return -1;
		}else {
			int mid = (from + to)/2;
			if(x > arr[mid]) {
				return searchByDividingRec(arr, mid+1, to, x);
			}else if(x<arr[mid]){
				return searchByDividingRec(arr, from, mid-1, x);
			}else {
				return mid;
			}
		}
	}
	public long[] bigArr(int x) {
		long bArr[] = new long[x];
		for(int i=0; i<x; i++) {
			bArr[i] = i;
		}
		return bArr;
	}

	public int howManyInLine(List<Integer> line, int n) {
		if(n==0) {
			System.out.println("How many?");
			n++;
		}if(line.size() == 1) {
			System.out.println("Just me!");
			return 1;
		}
		System.out.println("Me and the guy behind me.");
		line.remove(line.size()-1);
		return howManyInLine(line, n++);
		
	}
}





















