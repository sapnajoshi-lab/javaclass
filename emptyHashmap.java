package labquestions;

import java.util.HashMap;


public class emptyHashmap {

	public static void main(String[] args) {
		
		        // Create a HashMap to store key-value pairs
		        HashMap<String, Integer> map = new HashMap<>();

		        // Check if the HashMap is empty
		        if (map.isEmpty()) {
		            System.out.println("The HashMap is empty.");
		        } else {
		            System.out.println("The HashMap contains key-value mappings.");
		        }

//Add some key-value pairs to the HashMap
map.put("Sapana", 20);
map.put("Priya", 18);

// Check again if the HashMap is empty
if (map.isEmpty()) {
    System.out.println("The HashMap is empty.");
} else {
    System.out.println("The HashMap contains key-values mappings.");
}
}
}