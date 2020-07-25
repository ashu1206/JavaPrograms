package inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadChar {

	public static void main(String[] args) 
	{
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\manish\\Desktop\\New Text Document (2).txt");
			int i = fin.read();
			System.out.print((char)i);
			
			
			fin.close();
		} catch (Exception e) {
			
			System.out.println(e);
		} 

	}

}
