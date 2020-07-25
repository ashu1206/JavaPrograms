package inputOutput;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutput {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fout = new FileOutputStream("C:\\Users\\manish\\Desktop\\IO.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "Welcome To My World.";
		byte b[] = s.getBytes();
		
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success");

	}

}
