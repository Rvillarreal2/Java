import java.io.*;
import java.util.*;
public class bSort {

	static int count = 0;
	
    public static void bubbleSort(ArrayList<String> list){
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    count++;
                	String temp = list.get(j);
                    list.set((j), list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args){
        File file = new File("words2.txt");
        try {
            Scanner sc = new Scanner(file);
            ArrayList<String> words = new ArrayList<>();
            while (sc.hasNextLine()){
                words.add(sc.nextLine());
            }
            bubbleSort(words);
            PrintWriter printWriter = new PrintWriter("sorted.txt");
            for(int i = 0; i < words.size(); ++i) {
                printWriter.println(words.get(i));
            }
            System.out.println("The number of swap operations is " + count);
            printWriter.close();
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("File missing at " + file.getAbsolutePath());
        }
    }
}