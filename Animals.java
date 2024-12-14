package labquestions;
class Animal{
	public void makeSound() {
		System.out.println("The animal makes a sound");
	}
}

class Lion extends Animal{	
	public void makeSound() {
		System.out.println("The Lion Roars.");
	}
}

class Bee extends Animal{
	public void makeSound() {
		System.out.println("The Bees Buzzess");
	}
}
public class Animals {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.makeSound();
		Lion d=new Lion();
		d.makeSound();
		Bee c=new Bee();
		c.makeSound();

	}

}
