package sortinterface;

import java.util.List;

import objects.DLine;

/**
 * <b>DO NOT MODIFY THIS CLASS! </b> <br>
 * 
 * @author Azim Ahmadzadeh [https://grid.cs.gsu.edu/~aahmadzadeh1/]
 *
 * @param <DLine>
 *            See {@link objects.DLine}.
 */
public interface ISortMethods<DLine> {

	/**
	 * This method sorts the given list in place, by performing the following steps:
	 * (The symbol '<--' is equivalent to the assignment operation.)
	 * 
	 * <pre>
	 * i <-- 1
	 * while i < length(A)
	 *   x <-- A[i]
	 *   j <-- i - 1
	 * 	 while j >= 0 and A[j] > x
	 * 	   A[j+1] <-- A[j]
	 * 	   j <-- j - 1
	 * 	 end while
	 *   A[j+1] <-- x
	 *   i <-- i + 1
	 * end while
	 * </pre>
	 * 
	 * @param ls
	 *            the list to be sorted in place.
	 */
	void sort_1(List<DLine> ls);

	/**
	 * This method sorts the given list in place, by performing the following steps:
	 * (The symbol '<--' is equivalent to the assignment operation.)
	 * 
	 * <pre>
	 * n <-- length(A)
	 * while n > 0
	 *   nn <-- 0
	 *   for i = 1 to n-1 inclusive do
	 *     if A[i-1] > A[i] then
	 *       swap(A[i-1], A[i])
	 *       nn <-- i
	 *     end if
	 *   end for
	 *   n <-- nn
	 * 
	 * </pre>
	 * 
	 * @param ls
	 *            the list to be sorted in place.
	 */
	void sort_2(List<DLine> ls);

	/**
	 * This method sorts the given list in place, by performing the following steps:
	 * (The symbol '<--' is equivalent to the assignment operation.)
	 * 
	 * <pre>
	 * n <-- length(A)
	 * for i = 0 to n-1 exclusive do
	 *   min <-- i
	 *   for j = i+1 to n exclusive do
	 *     if A[j] < A[min]
	 *       min <-- j
	 *     end if
	 *   end for
	 *   
	 *   if min != i
	 *     swap(A[i], A[min])
	 * </pre>
	 * 
	 * @param ls
	 *            the list to be sorted in place.
	 */
	void sort_3(List<DLine> ls);


	/**
	 * <b>DO NOT MODIFY THIS!</b><br>
	 * 
	 * This method prints DLine instances stored in the given list. You can use this
	 * method to visually verify correctness of your sorting method.
	 * 
	 * @param myList
	 */
	public default void displayList(List<DLine> myList) {

		int i = 0;
		System.out.print("\t< ");
		for (; i < myList.size() - 1; i++) {
			System.out.print(myList.get(i).toString() + "|");
		}
		System.out.print(myList.get(i).toString());

		System.out.print(" >\n");
	}
}
