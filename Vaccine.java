package labquestions;

import java.util.Scanner;

abstract class vaccine{
	int age;
	String nationality;
	public void firstDose() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your age:");
			int age=sc.nextInt();
			System.out.print("Enter your nationality:");
			String nationality=sc.next();
				if(age>=18 && nationality.equalsIgnoreCase("Indian")) {
					System.out.println("You are eligible for the first dose. Please pay Rs. 250.");
				}
				else {
					System.out.println("You are not eligible for the first dose.");
				}
		}
	}
	
	public void secondDose(boolean firstdoseCompleted) {
		if(firstdoseCompleted) {
			System.out.println("You are eligible for the second dose.");
		}
		else {
			System.out.println("You must complete the first dose.");
		}
	}
	
	abstract void boosterDose();
}

class vaccinationSuccessful extends vaccine{

	@Override
	void boosterDose() {
		System.out.println(" ");
		
	}
	
}
public class Vaccine {

	public static void main(String[] args) {
		vaccinationSuccessful v1=new vaccinationSuccessful();
		v1.firstDose();
		v1.secondDose(true);
		v1.boosterDose();

	}

}
