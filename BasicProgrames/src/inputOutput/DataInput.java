package inputOutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInput {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fin = new FileInputStream("C:\\Users\\manish\\Desktop\\New Text Document (2).txt");
		DataInputStream inst = new DataInputStream(fin);
		int count = fin.available();
		byte[] ary = new byte[count];
		inst.read(ary);
		for(byte bt:ary)
		{
			char k = (char)bt;
			System.out.print(k+"-");
		}

	}

}
