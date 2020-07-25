package sorting;

public class BubbleSortString 
{
	public static void main(String args[])
	{
		String a[] = {"rahul","anmol","roshan","ashu","abhi","krish"};
		
		String temp ;
		
		int n = a.length;
		
		int flag = 0;
		
		for(int i =0;i<n;i++)
		{
			for(int j = 0;j<n-1-i;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag=1;
					
				}
			}
			
			if(flag==0)
			{
				break;
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}

}
