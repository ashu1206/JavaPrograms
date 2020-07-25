package arrayPrograms;

public class DecendingArray {

	public static void main(String[] args) 
	{
		int i,j,temp =0;
		int a[] = {25,2,8,7,3,1,65,59,63,34,39,32};
		
		System.out.println("Original Elements of the Array");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;					
				}				
			}
			System.out.println();
		}
		System.out.println("Descending Order Array");
		
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
