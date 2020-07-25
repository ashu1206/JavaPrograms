package sorting;

public class SelectionSortString {

	public static void main(String[] args) 
	{
		String a[] = {"rahul","anmol","roshan","ashu","abhi","krish"};
		
		String temp;
		
		int n = a.length;
		
		for(int i=0;i<n;i++)
		{
			int min = i;
			
			for(int j=i+1;j<n;j++)
			{
				if(a[j].compareTo(a[min])<0) 
				{
					min = j;
				}				
			}
			
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}		
	}
}
