package objects;
import java.util.*;

public class ParallelArrays {

	ArrayList<String>stName = new ArrayList<>();
	ArrayList<Integer>stID = new ArrayList<>();
	ArrayList<Double>stGPA = new ArrayList<>();
	
	public void pushst(student st) {
		stName.add(st.getName());
		stID.add(st.getID());
		stGPA.add(st.getGPA());
	}
	
	public void popst() {
		if(!stName.isEmpty() && !stID.isEmpty() && !stGPA.isEmpty()) {
			stName.remove(stName.size()-1);
			stID.remove(stID.size()-1);
			stGPA.remove(stGPA.size()-1);
		}else {
			System.out.println("Underflow - This stack is empty.");
		}
	}
	
	public void retTop() {
		if(!stName.isEmpty() && !stID.isEmpty() && !stGPA.isEmpty()) {
			System.out.println("Name: " + stName.get(stName.size()-1) + "	Panther ID: " + stID.get(stID.size()-1) + "	Cumulative GPA: " + stGPA.get(stGPA.size()-1));
		}else {
			System.out.println("Underflow - This stack is empty.");
		}
	}
	
	public void stackEmpty() {
		if(stName.isEmpty() && stID.isEmpty() && stGPA.isEmpty()) {
			System.out.println("This stack is empty.");
		}else {
			System.out.println("This stack is not empty.");
		}
	}
	
	public void displaySt() {
		if(!stName.isEmpty() && !stID.isEmpty() && !stGPA.isEmpty()) {
			for(int i = stName.size()-1; i >= 0; --i) {
				System.out.println("Name: " + stName.get(i) + "	Panther ID: " + stID.get(i) + "	Cumulative GPA: " + stGPA.get(i));
			}
		}else {
			System.out.println("Underflow - This stack is empty.");
		}
	}
}
