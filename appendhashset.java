package labquestions;

import java.util.HashSet;

public class appendhashset {

	public static void main(String[] args) {

		        // Create a HashSet
		        HashSet<String> set = new HashSet<>();

		        set.add("sapana");
		        set.add("Priya");
		        set.add("Archana");

		        // Display the HashSet before adding the new element
		        System.out.println("Elements Before appending : " + set);

		        // Append a new element to the HashSet
		        set.add("Mayank");

		        // Display the HashSet after adding the new element
		        System.out.println("Elements After appending : " + set);
		    }
		}
