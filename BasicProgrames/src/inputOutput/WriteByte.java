package inputOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByte {

	public static void main(String[] args) 
	{
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\manish\\Desktop\\New Text Document (2).txt");
			fout.write(65);
			fout.close();
			
			System.out.println("Success");
		} catch (Exception e) {System.out.println(e);
			
		

	}

}
}
