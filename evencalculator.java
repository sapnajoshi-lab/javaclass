package labquestions;
import java.util.ArrayList;
public class evencalculator {

	public static void main(String[] args) {
		
		        // Create an ArrayList of integers
		        ArrayList numbers = new ArrayList();

		        // Add some numbers to the ArrayList (you can modify this list)
		        numbers.add(10);
		        numbers.add(15);
		        numbers.add(22);
		        numbers.add(33);
		        numbers.add(40);
		        numbers.add(50);
		        
		        // Call the method to calculate the sum of even numbers
		        int sum = evencalculator(numbers);
		        
		        // Print the result
		        System.out.println("Sum of even numbers: " + sum);
		    }

		    private static int evencalculator(ArrayList numbers) {
		return 0;
		        int sum = 0;

		        // Loop through each number in the ArrayList
		        for (int number : numbers) {
		            // Check if the number is even
		            if (number % 2 == 0) {
		                sum += number; // Add it to the sum if it's even
		            }
		        }

		        return sum; // Return the sum
		    }
		}
