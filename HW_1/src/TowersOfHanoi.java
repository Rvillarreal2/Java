import java.util.Scanner;

public class TowersOfHanoi {
   public static int count;
   public static void main(String[] args) {
       count = 1;
       @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
       System.out.print("How many disks? (0 to end)");
       int nDisks = sc.nextInt();
       towers(nDisks, 1, 2, 3);
       System.out.println("Total Moves: " + (count-1));
   }
   public static void towers(int stack, int firstP, int secondP, int thirdP) {
	   if (stack == 1){
           System.out.println(count + ":" + firstP + " to " + thirdP);
           count++;
       }else{
           towers(stack - 1, firstP, thirdP, secondP);
           System.out.println(count + ":" + firstP + " to " + thirdP);
           count++;
           towers(stack - 1, secondP, firstP, thirdP);
       }
   }
}