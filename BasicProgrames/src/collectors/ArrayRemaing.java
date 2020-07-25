package collectors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayRemaing {

	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ashu");
		list.add("Ram");
		list.add("Mohan");
		list.add("Sunil");
		list.add("Ram");
		
		//List Iterator
		
		System.out.println("Traversing list through List Iterator:");
		
		ListIterator<String> list1 = list.listIterator(list.size());
		while(list1.hasPrevious())
		{
			String str = list1.previous();
			System.out.println(str);
		}
		//For Loop
		
		System.out.println("Traversing list through for loop:");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		//For Each
		
		System.out.println("Traversing list through forEach() method:");
		
		list.forEach(a->{
			System.out.println(a);
		});
		//For EachRemaining
		
		System.out.println("Traversing list through forERM:");
		
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);
		});

	}

}
