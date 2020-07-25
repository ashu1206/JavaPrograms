package collectors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerialDserial 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Rahul");
		al.add("Modi");
		al.add("Namo");
		
		
		
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\manish\\Desktop\\New Text Document (2).txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream("C:\\Users\\manish\\Desktop\\New Text Document (2).txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList)ois.readObject();
			System.out.println(list);
		}
		catch (Exception e) 
		{
			
			System.out.println(e);
		} 
		
		

	}

}
