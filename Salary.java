package labquestions;
class user{
	int id;
	String username;
	}

class Employee extends user{
	Employee(int id, String username) {
		System.out.println("ID:"+id+" Name:"+username);
	}
	double salary;

public void calculateAnnualSalary(double salary) {
	System.out.println("Monthly Salary:"+salary);
	double calculateSalary=salary*12;
	System.out.println("The annual salary is:"+calculateSalary);
}
}
public class Salary {

	public static void main(String[] args) {
		Employee e=new Employee(101, "Priya");
		e.calculateAnnualSalary(25000.00);

	}

}
