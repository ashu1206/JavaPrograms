package inputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {

	public static void main(String[] args) throws IOException 
	{
		Writer w = new FileWriter("C:\\Users\\manish\\Desktop\\New Text Document (2).txt"); 
		String c = "I LOVE MY INDIA";
		w.write(c);
		w.close();
		System.out.println("DONE");

	}

}
