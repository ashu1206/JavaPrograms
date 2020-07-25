package searching;

public class LinearSearch {

	public static void main(String[] args) 
	{
		
		int  i;
		
		int a[] = {6,7,2,1,9,3,5,4};
		
		int n = a.length;
		
		int num = 5;
		
		int temp =0;
		
		for(i=0;i<n;i++)
		{
			if(a[i]==num)
			{
				System.out.println("The number is at position "+i+" index position");
				
				temp = temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Num is not found in the list");
		}

	}
	

}
