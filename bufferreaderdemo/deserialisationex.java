package bufferreaderdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class deserialisationex {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("D:\\serial.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Persondata p =(Persondata )ois.readObject();
		System.out.println(p.age + " "+p.name);

	}

}
