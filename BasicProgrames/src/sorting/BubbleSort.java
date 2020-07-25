package sorting;

public class BubbleSort 
{
	public static void main(String args[])
	{
		int a[] = {36,25,95,54,45,65};
		
		int temp ;
		
		int n = a.length;
		
		int flag = 0;
		
		for(int i =0;i<n;i++)
		{
			for(int j = 0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
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
