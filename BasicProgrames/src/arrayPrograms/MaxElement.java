package arrayPrograms;

public class MaxElement {

	public static void main(String[] args) 
	{
		int i;
		int a[] = {25,6,95,32,45,47,2,105};
		int max = a[0];
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max) 
			{
				max = a[i];
			}
		}
		System.out.println("Max Element is "+max);

	}

}
