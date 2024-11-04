//Create a employee class and display 5 employee details with name, salary and age

package labquestions;

class employeedata
{
	int Id;
	String name;
	int age;
	double salary;
}

public class employee {

	public static void main(String[] args) {
		employeedata em1=new employeedata();
		em1.Id=201;
		em1.name="Sapana";
		em1.age=20;
		em1.salary=25000;
		System.out.println("Id:"+em1.Id+" "+"Name:"+em1.name+" "+"Age:"+em1.age+" "+"Salary:"+em1.salary);
		
		employeedata em2=new employeedata();
		em2.Id=202;
		em2.name="Priya";
		em2.age=20;
		em2.salary=20000;
		System.out.println("Id:"+em2.Id+" "+"Name:"+em2.name+" "+"Age:"+em2.age+" "+"Salary:"+em2.salary);
		
		employeedata em3=new employeedata();
		em3.Id=2403;
		em3.name="sana";
		em3.age=21;
		em3.salary=22000;
		System.out.println("Id:"+em3.Id+" "+"Name:"+em3.name+" "+"Age:"+em3.age+" "+"Salary:"+em3.salary);
		
		employeedata em4=new employeedata();
		em4.Id=204;
		em4.name="Archana";
		em4.age=26;
		em4.salary=25000;
		System.out.println("Id:"+em4.Id+" "+"Name:"+em4.name+" "+"Age:"+em4.age+" "+"Salary:"+em4.salary);
		
		employeedata em5=new employeedata();
		em5.Id=205;
		em5.name="Arjun";
		em5.age=22;
		em5.salary=24000;
		System.out.println("Id:"+em5.Id+" "+"Name:"+em5.name+" "+"Age:"+em5.age+" "+"Salary:"+em5.salary);

	}

}
