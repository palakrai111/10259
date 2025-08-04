package bufferreaderdemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persondataserialized {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Persondata ob = new Persondata("palak",35);
		FileOutputStream fos = new FileOutputStream("D:\\serial.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob);
		fos.close();
        System.out.println("done");
	}

}
