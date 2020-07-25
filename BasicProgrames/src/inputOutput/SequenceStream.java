package inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceStream {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fin1 = new FileInputStream("C:\\Users\\manish\\Desktop\\New Text Document (2).txt");
		FileInputStream fin2 = new FileInputStream("C:\\Users\\manish\\Desktop\\IO.txt");
		SequenceInputStream inst = new SequenceInputStream(fin1,fin2);
		int i;
		while((i=inst.read())!=-1)
		{
			System.out.print((char)i);
		}
		inst.close();
		fin1.close();
		fin2.close();

	}

}
