import java.util.*;

public class sSort{

    public static void selSort(String[] a){
        String f;
        for (int i = 0; i < a.length - 1; i++){
        	int min = i;
            for (int j = i + 1; j < a.length; j++){
                if (a[j].compareTo(a[min]) < 0)
                    min = j;
            }
            f = a[min];
            a[min] = a[i];
            a[i] = f;
            System.out.print("After pass " + (i + 1) + ": " );
            pString(a);
        }
    }
    public static void pString(String a[]){
        int n = a.length;
        for (int i=0; i<n; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many strings: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        int i;
        System.out.print("Input all strings: ");

        for( i = 0 ; i < n ; i++ ) {
            arr[i] = sc.next();
        }
        System.out.print("Initial Array: ");
        pString(arr);
        selSort(arr);
    }
}