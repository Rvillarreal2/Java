import objects.ParallelArrays;
import objects.Sstack;
import objects.student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student("John", 002201234, 3.9);
		student s2 = new student("Jim", 002201243, 3.7);
		student s3 = new student("Joe", 002202143, 3.0);
		student s4 = new student("Jill", 002021324, 4.2);
		student s5 = new student("Jackie", 002122034, 4.0);
		
		Sstack stack = new Sstack();
		stack.push(s1);
		stack.push(s2);
		stack.push(s3);
		stack.push(s4);
		stack.push(s5);
		
		System.out.println("\nThe stack displayed: ");
		stack.dispStack();
		System.out.println("\nThe top element is: ");
		stack.getTop();
		System.out.println("\nThe stack after pop: ");
		stack.pop();
		stack.dispStack();
		System.out.println("\nIs this stack empty?");
		stack.emptyStack();
		
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		System.out.println("Parallel Arrays");
		
		ParallelArrays stStack = new ParallelArrays();
		stStack.pushst(s1);
		stStack.pushst(s2);
		stStack.pushst(s3);
		stStack.pushst(s4);
		stStack.pushst(s5);
		
		System.out.println("\nThe stack displayed: ");
		stStack.displaySt();
		System.out.println("\nThe top element is: ");
		stStack.retTop();
		System.out.println("\nThe stack after pop: ");
		stStack.popst();
		stStack.displaySt();
		System.out.println("\nIs this stack empty?");
		stStack.stackEmpty();
	}

}
