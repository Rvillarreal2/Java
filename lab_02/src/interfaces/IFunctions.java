package interfaces;

import java.util.List;

/**
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 */
public interface IFunctions {

	/**
	 * Computes the average of the given array.
	 * @param arr
	 * @return the average
	 */
	public double getAverage(double[] arr);

	
	/**
	 * Finds the largest number in the given list.
	 * @param l list of numbers
	 * @return the largest number in the list
	 */
	public double getMax(List<Double> l);

	
	/**
	 * Finds the largest element in a matrix.
	 * 
	 * @param matrix
	 * @return
	 */
	public double getMax(double[][] matrix);
	
	
	/**
	 * Initializes the given list with the numbers 0, 1, ..., n-1
	 * @param l the list to be initialized
	 * @param n size of the list
	 * @return the last element of the list, i.e., n-1.
	 */
	public double initializeList(List<Double> l, int n);
	
	
	/**
	 * Creates a matrix with n rows and n columns, and initializes
	 * it with numbers from the sequence 1,2,3,...
	 * @param n number of rows and columns
	 * @return a matrix with n rows and m columns.
	 */
	public double[][] createMatrix(int n);

	
	/**
	 * Find the index of all characters which are in upper-case.
	 * 
	 * @param w the given string
	 * @return all indices of the upper-case letter.
	 */
	public List<Integer> findAllUppdercases(String w);
	
	/**
	 * Finds the index of all occurrences of the given character in the given string.
	 * This method is not case sensitive, meaning that it does not distinguish
	 * between 'a' and 'A'.
	 * 
	 * @param c
	 *            the character to be searched for
	 * @param w
	 *            the given string in which a character should be located
	 * @return all indices of occurrences of the given character.
	 */
	public List<Integer> findChars(char c, String w);
	
	
	
	/**
	 * Adds a single space before each upper-case letter, and a '\n'
	 * after each dot.
	 * 
	 * @param w the given string.
	 * @return the cleaned up string.
	 */
	public String cleanUp(String w);
	
}
