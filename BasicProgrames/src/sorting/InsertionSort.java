package sorting;

public class InsertionSort {

	public static void main(String[] args) 
	{
		int a[] = {5,8,6,1,9,3};
		
		int temp,j,i;
		
		int n = a.length;
		
		for(i=1;i<n;i++)
		{
			temp = a[i];
			j=i;
			
			while(j>0 && a[j-1]>temp)
			{
				a[j] = a[j-1];
				j = j-1;
			}
			
			a[j] = temp;
		}
		
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
}
