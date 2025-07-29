package projectfor10259;

public class Person
{
	String name;
	public Person(String name, int id, Address adr) {
		super();
		this.name = name;
		this.id = id;
		this.adr = adr;
	}
	int id;
	Address adr;
	
	void display()
	{
		System.out.println("name is :" + name + " "+"id is :"+id);
		System.out.println(adr.city + " "+adr.State);
	}
	
	
	public static void main(String[] args)
	{
		Address a1 = new Address("ap","vizag");
		Address a2 = new Address("ap","kakinada");
		Person p1 = new Person("palak",1,a1);
		Person p2 = new Person("raza",3,a1);
		Person p3 = new Person("rani",4,a2);
		Person x[] = new Person[3];
		x[0] =p1;
		x[1] = p2;
		x[2] = p3;
		
		
		for(Person info:x)
		{
			System.out.println(info.id + " "+ info.name);
			info.display();
		}
		///customer class
		//customer(name,age);
		
		//saloon class
		//customer c;
		//saloon (name,objectofcustomer)
	}
	

}
