package inputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadEx {

	public static void main(String[] args) throws IOException 
	{
		Reader r = new FileReader("C:\\Users\\manish\\Desktop\\New Text Document (2).txt");
		int data = r.read();
		
		while(data!=-1)
		{
			System.out.print((char)data);
			data = r.read();
		}
		r.close();
	}

}
