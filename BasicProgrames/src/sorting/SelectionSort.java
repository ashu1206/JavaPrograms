package sorting;

public class SelectionSort {

	public static void main(String[] args) 
	{
		int a[] = {95,24,54,6,8,28};
		
		int temp =0;
		
		int n = a.length;
		
		for(int i=0;i<n;i++)
		{
			int min = i;
			
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min]) 
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
