package arrayPrograms;

import java.util.Arrays;

public class ThirdLarArraySort {

	public static void main(String[] args) 
	{
		int a[] = {2,9,8,1,0,25,95,45,62,35,68,69};
		
		Arrays.sort(a);
		
		int third = a[a.length-3];
		
		System.out.println("Third Largest number is = "+third);
		

	}

}
