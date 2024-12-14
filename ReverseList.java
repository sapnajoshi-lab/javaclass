package labquestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		
		        // Create a List of strings
		        List strings = new ArrayList();
		        
		        // Add some strings to the list
		        strings.add("css");
		        strings.add("javascript");
		        strings.add("python");
		        strings.add("java");
		        
		        // Print the original list
		        System.out.println("Original List: " + strings);
		        
		        // Call the method to reverse the list
		        reverseList(strings);
		        
		        // Print the reversed list
		        System.out.println("Reversed List: " + strings);
		    }

		    // Method to reverse the list of strings
		    public static void reverseList(List list) {
		        // Use Collections.reverse() to reverse the list
		        Collections.reverse(list);
		    }
		}
