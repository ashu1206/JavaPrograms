package collectors;

import java.util.ArrayList;

public class ArrayForEach {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Modi");
		list.add("Ram");
		list.add("Mohan");
		list.add("Sunil");
		list.add("Ram");
		
		for(String person:list)
		{
			System.out.println(person);
		}

	}

}
