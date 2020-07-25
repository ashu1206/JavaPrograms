package arrayPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdLarCollections 
{
	public static int getThirdLar(Integer[] a,int total)
	{
		List<Integer>list = Arrays.asList(a);
		Collections.sort(list);
		int element = list.get(total-3);
		return element;
	}
	public static void main(String[]args)
	{
		Integer a[] = {25,35,41,2,4,16,98,32,5,6};
		
		System.out.println("Third Largest Number is = "+getThirdLar(a,10));
	}

}
