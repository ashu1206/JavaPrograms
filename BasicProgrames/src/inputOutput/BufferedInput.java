package inputOutput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInput {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fin = new FileInputStream("C:\\Users\\manish\\Desktop\\IO.txt");
		BufferedInputStream bin = new BufferedInputStream(fin);
		int i;
		while((i=bin.read())!=-1)
		{
			System.out.print((char)i);
		}
		bin.close();
		fin.close();

	}

}
