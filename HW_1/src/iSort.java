import java.util.*;

public class iSort {
	public static void sort(int arr[]){
		int count = 0;
        int pass = 0;
		System.out.println("Initial Array:" + Arrays.toString(arr));
		int n = arr.length;
        for (int i=1; i<n; i++){
            int num = arr[i];
            int j = i-1;
            pass ++;
            while(j>=0 && arr[j] > num){
            	arr[j+1] = arr[j];
                j--;
                count++;
            }
            if(j>0) {
            	count++;
            	
            }
            arr[j+1] = num;
            System.out.println("After Pass-" + pass + Arrays.toString(arr));          
        }
        System.out.println("Total comparisons: " + count);
        System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);       
        System.out.print("Enter how many numbers: ");       
        int n = sc.nextInt();      
        System.out.print("Input all integers : ");      
        int[] arr = new int[n];               
         for(int i = 0 ; i < n ; i++ ){
             arr[i] = sc.nextInt();
         }        	
         sort(arr);
	}
}
