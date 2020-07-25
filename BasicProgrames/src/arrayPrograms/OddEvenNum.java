package arrayPrograms;

public class OddEvenNum {

	public static void main(String[] args) 
	{
		int a[] = {2,5,7,9,3,4,6,8,12,45,68,72};
		
		System.out.println("Odd Numbers");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Even Numbers");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}

	}

}
