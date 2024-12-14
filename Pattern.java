package labquestions;
 class Parent 

{public void display() 

{ 

 System.out.println("Parent class"); 

 }

 } 

 class Child extends Parent

 { public void display()

 {

 System.out.println("Child class"); 

 }

 } 

 public class Pattern 

{ 

 public static void main(String[] args)

 { 

 Parent obj = new Child(); 

 obj.display(); 

 } 

}