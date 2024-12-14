package labquestions;

public class Calculator
{
public static int sum(int a, int b){
System.out.print(a+""+b);
return a+b;
}

public static void main(String[] args) {
System.out.println(sum(3, sum(1,2)));
}
}