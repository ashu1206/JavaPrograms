package inputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteString {

	public static void main(String[] args) 
	{
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\manish\\Desktop\\New Text Document (2).txt");
			String s = "Welcome to javaTpoint.";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success");
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}

}
