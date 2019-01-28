package objects;
import java.util.*;

public class Sstack {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	LinkedList<student>Sstack= new LinkedList();
	
	public void push(student st) {
		Sstack.addLast(st);
	}
	
	public void pop() {
		if(!Sstack.isEmpty()) {
			Sstack.removeLast();
		}else {
			System.out.println("Underflow - This stack is empty.");
		}
	}
	
	public void getTop() {
		if(!Sstack.isEmpty()){
			student st = Sstack.getLast();
			System.out.println(st.toString());
		}else {
			System.out.println("Underflow - This stack is empty.");
		}
	}
	
	public void dispStack() {
		if(!Sstack.isEmpty()) {
			int stackSize = Sstack.size();
			for(int i = stackSize-1; i >= 0; --i) {
				System.out.println(Sstack.get(i).toString());
			}
		}else {
			System.out.println("Underflow - This stack is empty.");
		}
	}
	
	public void emptyStack() {
		if(Sstack.isEmpty()) {
			System.out.println("This stack is empty.");
		}else {
			System.out.println("This stack is not empty.");
		}
	}
}	
