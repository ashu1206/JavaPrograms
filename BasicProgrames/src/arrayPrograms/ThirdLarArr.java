package arrayPrograms;

public class ThirdLarArr {

	public static void main(String[] args) 
	{
		int i,j,temp = 0;
		int third = 0;
		int a[] = {2,1,3,9,8,7};
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		third = a[a.length-3];
		System.out.println("Third largest number = "+third);

	}

}
