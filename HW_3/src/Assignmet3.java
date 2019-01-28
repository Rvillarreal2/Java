import java.util.*;

public class Assignmet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {21, 32, 42, 10, 3, 25};
		int n = arr.length;
		
		System.out.println(Arrays.toString(arr));
		buildMaxHeap(arr, n);
		System.out.println(Arrays.toString(arr));
		heapSortAscending(arr);
		System.out.println(Arrays.toString(arr));
		insertToMaxHeap(arr, 12);
		System.out.println(Arrays.toString(arr));
		deleteFromMaxHeap(arr, 3);
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		int arr1[] = {24, 33, 45, 11, 3, 28};
		
		System.out.println(Arrays.toString(arr1));
		buildMinHeap(arr, n);
		System.out.println(Arrays.toString(arr1));
		heapSortDescending(arr1);
		System.out.println(Arrays.toString(arr1));
		insertToMinHeap(arr1, 12);
		System.out.println(Arrays.toString(arr1));
		deleteFromMinHeap(arr1, 3);
		System.out.println(Arrays.toString(arr1));
			
	}

	public static void buildMaxHeap(int arr[], int n) { //n is the size of the array
		for(int i = 1; i < n; i++) {			 //this sets the largest element to firs index
			if(arr[i] > arr[(i-1)/2]) {
				int j = i;
				while(arr[j] > arr[(j-1)/2]) {
					swap(arr, j, (j-1)/2);
					j = (j-1)/2;
				}
			}
		}
	}
	public static void insertToMaxHeap(int arr[], int n) { //adds new element to end of array
		int temp[] = new int[arr.length+1];
		for(int i = 0; i < temp.length; i++) {
			if(i==temp.length-1) {
				temp[i] = n;
			}else {
				temp[i] = arr[i];
			}
		}
		arr = temp;
	}
	public static void deleteFromMaxHeap(int arr[], int ind) {
		int temp[] = new int[arr.length-1];
		for(int i = ind; i < arr.length; i++) {
			swap(arr, i, i+1);
			if(i+1==arr.length-1)
				break;
		}
		for(int i = 0; i < arr.length-1; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	public static void heapSortAscending(int arr[]) {
		buildMaxHeap(arr, arr.length);
		for (int i = 0; i < arr.length - 1; i++){
        	int min = i;
        	int temp;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[min])
                    min = j;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
		}
		
	}
	
//---------------------------------------------------------------------------------------
	
	public static void buildMinHeap(int arr[], int n) { //This sets the smallest element to first index
		for(int i = 1; i < n; i++) {
			if(arr[i] < arr[(i-1)/2]) {
				int j = i;
				while(arr[j] < arr[(j-1)/2]) {
					swap(arr, j, (j-1)/2);
					j = (j-1)/2;
				}
			}
		}
	}
	public static void insertToMinHeap(int arr[], int n) {
		int temp[] = new int[arr.length+1];
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		arr[arr.length-1] = n;
	}
	public static void deleteFromMinHeap(int arr[], int ind) {
		int temp[] = new int[arr.length-1];
		for(int i = ind; i < arr.length; i++) {
			swap(arr, i, i+1);
			if(i+1==arr.length-1)
				break;
		}
		for(int i = 0; i < arr.length-1; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
	}
	public static void heapSortDescending(int arr[]) {
		buildMinHeap(arr, arr.length);
		for (int i = 0; i < arr.length - 1; i++){
        	int min = i;
        	int temp;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[min])
                    min = j;
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
		}
	}
	
	//-------------------------------------------------------------------------------------
	
	public static int[] swap(int arr[], int ind1, int ind2) {
		int temp;
		temp = arr[ind1];
		arr[ind1] = arr[ind2];
		arr[ind2] = temp;
		return arr;
	}
}
