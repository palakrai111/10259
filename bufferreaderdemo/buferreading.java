package bufferreaderdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buferreading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(
				new FileReader("D:\\buffer1.txt"));
		
		String line = "";
		Empdata employees[] = new Empdata[4];
		int index = 0;
		while((line = br.readLine()) != null) 
		{
			//System.out.println(line);
			String x[] = line.split(",");//{name ,age}
			String name = x[0];
			int age = Integer.parseInt(x[1]);
			Empdata e = new Empdata(name,age);
			employees[index] = e;
			index++;
			
		}

		for(Empdata x:employees)
		{
			System.out.println(x.age + " "+x.name);
		}
	}

}
