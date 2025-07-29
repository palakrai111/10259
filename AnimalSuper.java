package projectfor10259;

class Animal1
{
	String color = "black";
	
	
	void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog1 extends Animal1
{
	String color = "grey";
	void printcolor()
	{
		System.out.println("color "+ color);
		System.out.println("color "+ super.color);
	}
	void eat()
	{
		System.out.println("dog is eating");
	}
	void work()
	{
		super.eat();
		eat();
	}
}

public class AnimalSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1  ob = new Dog1 ();
		ob.printcolor();
		ob.work();

	}

}
