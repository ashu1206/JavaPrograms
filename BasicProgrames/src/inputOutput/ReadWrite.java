package inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadWrite {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fin1 = new FileInputStream("C:\\Users\\manish\\Desktop\\New Text Document (2).txt");
		FileInputStream fin2 = new FileInputStream("C:\\Users\\manish\\Desktop\\IO.txt");
		FileOutputStream fout = new FileOutputStream("C:\\Users\\manish\\Desktop\\IO2.txt");
		SequenceInputStream sis = new SequenceInputStream(fin1,fin2);	
		int i;
		
		while((i=sis.read())!=-1)
		{
			fout.write(i);
		}
		sis.close();
		fout.close();
		fin1.close();
		fin2.close();
		System.out.println("Success");
	}
}
