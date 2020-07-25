package arrayPrograms;

public class SumElements {

	public static void main(String[] args) 
	{
		int i;
		int a[] = {5,6,2,1,4,7,8,2};
		int sum = 0;
		
		for(i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println(sum);

	}

}
