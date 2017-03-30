// Honor Pledge: I pledge that I have neither given nor received any help on this assignment

// Generic Stack
public class Stack<E> {
	// Top of stack
	private int top;

	// Size of stack
	private int size;

	// Array emulating the Stack
	private E [] stack;

	// Constructor
	public Stack(int stackSize) {
		if(stackSize > 0) {
			size = stackSize;
		} else {
			System.out.println("Invalid Stack size!");
			System.out.println("Using default size of 10");

			size = 10;
		}

		// Create a generic array instance
		stack = (E[]) new Object[size];
		top = -1;
	}
	
	// Push Operation
	public void push(E dataElement) {
		// Check if the Stack is full - if not, push the element
		if(isFull()) {
			// Exception check
			System.out.println("Your Stack is full!");
		} else {
			// Push the data onto the Stack
			stack[++top] = dataElement;
		}
	}

	// Pop Operation
	public E pop() {
		// Check if the Stack is empty.
		if(!isEmpty()) {
			// Return the popped data element
			return stack[top--];
		} else {
			// Exception check
			System.out.println("Stack is empty - cannot pop!");

			return null;
		}
	}

	// Check if Stack is empty - T:Empty/F:Not Empty
	public boolean isEmpty() {
		return top == -1;
	}

	// Check if Stack is full - T:Full/F:Not Full
	public boolean isFull() {
		return (top+1) == size;
	}

	// Get the top element of the Stack
	public E getTop() {
		return stack[top]
	}

	// Print the contents of the Stack
	public void displayStack() {
		// Loop through the Stack array printing the values
		for(int i = 0; i <= top; i++) {
			System.out.print(stack[i] + ",");
		}
	}
}
