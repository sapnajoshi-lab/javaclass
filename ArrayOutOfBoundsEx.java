package labquestions;

public class ArrayOutOfBoundsEx {

	public static void main(String[] args) {
	
		        int[] numbers = {101, 102, 103, 104, 105};

		        // Use a loop to try and access each element beyond the last index
		        for (int i = 0; i <= numbers.length; i++) { 
		            try {
		                System.out.println("Element of index " + i + ": " + numbers[i]);
		            } catch (ArrayIndexOutOfBoundsException e) {
		                // This block will catch the exception when we try to access an index beyond the array's length
		                System.out.println("Error: Try to access index " + i + " that is out of bounds!");
		            }
		        }
		    }
		}
