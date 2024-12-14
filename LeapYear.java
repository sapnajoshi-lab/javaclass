package labquestions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sci=new Scanner(System.in);
		System.out.println("Enter the year:");
		int result=sci.nextInt();
		
		boolean lpy;
		lpy=(result%4==0);
		
		lpy=lpy&&(result % 100 != 0 || result % 400 == 0);
		
		if(lpy) {
			System.out.println(result+" is a leap year");
		}
		else {
			System.out.println(+result+" is not a leap year");
		}

	}

}
