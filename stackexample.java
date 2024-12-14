package labquestions;

import java.util.Stack;

public class stackexample {

	public static void main(String[] args) {
		
		        // Create a stack
		        Stack<Integer> stack = new Stack<>();

		        // Push 10 elements into the stack
		        for (int i = 1; i <= 10; i++) {
		            stack.push(i);
		        }

		        // Display the stack after pushing elements
		        System.out.println("Stack after pushing 10 elements: " + stack);

		        // Remove 4 elements from the stack
		        for (int i = 0; i < 4; i++) {
		            stack.pop();
		        }

		        // Display the stack after popping 4 elements
		        System.out.println("Stack after removing 4 elements: " + stack);
		    }
		}
