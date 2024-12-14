package labquestions;
import java.util.Scanner;

class CountryNotValidException extends Exception {
 public CountryNotValidException(String message) {
     super(message);
 }
}

class EmployeeNameInvalidException extends Exception {
 public EmployeeNameInvalidException(String message) {
     super(message);
 }
}

class TaxNotEligibleException extends Exception {
 public TaxNotEligibleException(String message) {
     super(message);
 }
}

public class CalculatorLab {
	public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
	     if (empName == null || empName.isEmpty()) {
	         throw new EmployeeNameInvalidException("The employee name cannot be empty.");
	     }

	     if (!isIndian) {
	         throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
	     }

	     // Tax calculation logic based on salary
	     double taxAmount;

	     if (empSal > 100000) {
	         taxAmount = empSal * 0.07;  // 7% for salary greater than 1 lakh
	     } else if (empSal >= 50000 && empSal <= 100000) {
	         taxAmount = empSal * 0.05;  // 5% for salary between 50K and 1L
	     } else if (empSal >= 30000 && empSal < 50000) {
	         taxAmount = empSal * 0.08;  // 8% for salary between 30K and 50K
	     } else if (empSal >= 10000 && empSal < 30000) {
	         taxAmount = empSal * 0.07;  // 7% for salary between 10K and 30K
	     } else {
	         throw new TaxNotEligibleException("The employee doesn't need to pay tax.");
	     }

	     return taxAmount;
	 }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	     // Prompt user for employee details
	     System.out.print("Enter employee name: ");
	     String empName = scanner.nextLine();

	     System.out.print("Enter employee salary: ");
	     double empSal = scanner.nextDouble();

	     System.out.print("Is the employee is the citizen of India (true/false): ");
	     boolean isIndian = scanner.nextBoolean();
	     TaxCalculatorLab calculator = new TaxCalculatorLab();

	     try {
	         double taxAmount = calculator.calculateTax(empName, isIndian, empSal);
	         System.out.println("Tax amount is " + taxAmount);
	     } catch (Exception e) {
	         if (e instanceof CountryNotValidException) {
	             System.out.println("The employee should be an Indian citizen for calculating tax.");
	         } else if (e instanceof EmployeeNameInvalidException) {
	             System.out.println("The employee name cannot be empty.");
	         } else if (e instanceof TaxNotEligibleException) {
	             System.out.println("The employee does not need to pay tax.");
	         } else {
	             e.printStackTrace();
	         }
	     }
	 }
	}
