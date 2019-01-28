import java.util.ArrayList;
import java.util.List;

import interfaces.IFunctions;

/**
 * This class implements the interface 'IFunctions'.
 * 
 * @author Student
 */
public class Functions implements IFunctions {

	@Override
	public double getAverage(double[] arr) {
		
		//TODO
		double sum = 0;
		for(int i=0; i< arr.length; i++) {
			double a = arr[i];
			sum = a + sum;
		}
		double avg = sum / arr.length;
		System.out.println(avg);
		return 0;
	}

	@Override
	public double getMax(List<Double> l) {
		// TODO Auto-generated method stub
		double max = l.get(0);
		for(int i=0; i< l.size()-1; i++) {
			if(l.get(i)>l.get(i+1)) {
				max = l.get(i);
			}
		}
		System.out.println(max);
		return 0;
	}

	@Override
	public double getMax(double[][] matrix) {
		// TODO Auto-generated method stub
		double max = matrix[0][0];
		for(int i=0; i<matrix[0].length-1; i++) {
			for(int j=0; j<matrix.length-1; j++) {
				if(matrix[j][i]<matrix[j+1][i]) {
					max = matrix[j+1][i];
				}
			}
		}
		System.out.println(max);
		return 0;
	}

	@Override
	public double initializeList(List<Double> l, int n) {
		// TODO Auto-generated method stub
		l = new ArrayList<>(n);
		return 0;
	}

	@Override
	public double[][] createMatrix(int n) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		double mat[][] = new double[n][n];
		return null;
	}

	@Override
	public List<Integer> findAllUppdercases(String w) {
		// TODO Auto-generated method stub
		String upper = "";
		int count = w.length();
		for(int i=0; i<count; i++) {
			if(Character.isUpperCase(w.charAt(i))) {
				char z = w.charAt(i);
				upper = upper + z + " ";
			}
		}
		System.out.println(upper);
		return null;
	}

	@Override
	public List<Integer> findChars(char c, String w) {
		// TODO Auto-generated method stub
		int count = w.length();
		List<Integer> chars = new ArrayList<Integer>();
		for(int i=0; i<count; i++) {
			if(Character.toUpperCase(c) == w.charAt(i)) {
				chars.add(i);
			}else if(Character.toLowerCase(c) == w.charAt(i)) {
				chars.add(i);
			}
		}
		return chars;
	}

	@Override
	public String cleanUp(String w) {
		// TODO Auto-generated method stub
		StringBuffer wb = new StringBuffer(w);
		int count = w.length();
		for(int i=0; i<count; i++) {
			char ch = wb.charAt(i);
			if(Character.isUpperCase(ch)) {
				wb.insert(i, " ");
				i++;
				count++;
			}else if(wb.charAt(i) == '.') {
				wb.insert(i+1, '\n');
				i++;
				count++;
			}
		}
		return wb.toString();
	}
	
	//TODO:
	// Start your homework by making this class to 
	// implement the interface 'IFunctions' and
	// its methods.
	
}
