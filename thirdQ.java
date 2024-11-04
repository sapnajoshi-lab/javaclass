//Sort array in Descending order

package labquestions;
import java.util.Arrays;
import java.util.Collections;

public class thirdQ {

	public static void main(String[] args) {
		Integer a[] = { 101, 102, 103, 104, 105, 109,108, 106, 107 };
        
		// Sorting the array in descending order
        
		Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));

	}

}
