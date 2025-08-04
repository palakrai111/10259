package bufferreaderdemo;

import java.io.Serializable;

public class Persondata implements Serializable
{
	
	String name;
	int age;
	public Persondata(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
