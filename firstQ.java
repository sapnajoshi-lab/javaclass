//Find the minimum and maximum elements in an array

package labquestions;
import java.util.Arrays;

public class firstQ {

	public static void main(String[] args) {
int a[]={1,32,6,46,343,43,13,55,4}; 
        
        //Implemented inbuilt function to sort array
      Arrays.sort(a);
    
        // after sorting the value at 0th position will minimum and 
      //nth position will be maximum
      System.out.println("min="+a[0]+"\nmax="+a[a.length-1]);
	}
}

