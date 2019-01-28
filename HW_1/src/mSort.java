import java.util.*;

public class mSort{

    public static void merSort(int[] arr,int left, int right, int[] callCount){
        if(left < right){
            int mid = (left + right) / 2;            
            callCount[0]++;
            merSort(arr, left, mid, callCount);
            callCount[0]++;
            merSort(arr, mid + 1, right, callCount);
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr,int l,int m,int r){
        int lLength = m - l + 1;
        int rLength = r - m;
        int[] left = new int[lLength + 1];
        int[] right = new int[rLength + 1];
        left[lLength] = Integer.MAX_VALUE;
        right[rLength] = Integer.MAX_VALUE;
        for(int i = 0; i < lLength; i++){
            left[i] = arr[l + i];
        }
        for(int i = 0; i < rLength; i++){
            right[i] = arr[m + i + 1];
        }

        int i=0, j=0;        
        for(int k = l; k <= r; k++){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
        }
    }
    public static void pArray(int arr[]){      
        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }   
    public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);       
        System.out.print("Enter how many numbers: ");       
        int n = sc.nextInt();      
        System.out.print("Input all integers : ");      
         int[] arr = new int[n];               
         for(int i = 0 ; i < n ; i++ ){
             arr[i] = sc.nextInt();
         }
         int[] callCount = new int[1];        
         callCount[0] = 1;        
         merSort( arr , 0 , arr.length - 1 , callCount );        
         System.out.print("Sorted Array : ");
         pArray(arr);        
         System.out.println("Total Calls : " + callCount[0]);
    }
}